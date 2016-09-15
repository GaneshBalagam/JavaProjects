
package javaBusinessLogic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javaBeans.UserDetails;

import databaseConnection.DatabaseConnection;

public class UserBusinessLogic {

	Connection con = null; //intializing the predefined objects of import java.sql.*
	Statement stm = null;
	ResultSet res = null;
	
	public String usertable = "",database = "",logintable = "",query=""; //global declaration for allowing access to another classes and also called as class level variables or instance variables
	
	public UserBusinessLogic()throws ClassNotFoundException,SQLException, IOException
	{
		DatabaseConnection dbConnection = new DatabaseConnection(); // crating a object to access the databaseconnection .java program method
		con = dbConnection.getConnection();// establishing the  connection to the above created object
		stm =con.createStatement(); // creating statement object
		database = dbConnection.database; // creating db connecion to the above declaraed global variables 
		usertable = dbConnection.usertable;
		logintable = dbConnection.logintable;	
		query = "CREATE database IF NOT EXISTS "+database;  // query to create database if not existed in the mysql database
		
		stm.execute(query); //  to run above query
		stm.execute("use "+database); // to use the above created database
		createTables(); // method to create tables in this above used database whatever tables need in this project
	}
	
	public void createTables() throws SQLException
	{
		// to create table to store user registration details
		query="create table IF NOT EXISTS "+usertable+"(FirstName varchar(20),LastName varchar(10),DateOfBirth date,UserId int(5))";
		stm.execute(query);
		
		// to create table to store user login details		
		query="create table IF NOT EXISTS "+logintable+"(UserName varchar(20),Password varchar(20))";
		stm.execute(query);		
	}	
	
	public Boolean registerUser(UserDetails userDetails) throws SQLException
	{
		query = "insert into "+usertable+" values('"+userDetails.getFirstName()+"','"+userDetails.getLastName()+"','"+userDetails.getDateOfBirth()+"',"+userDetails.getUserId()+")";//here we take the input from the servelet page and asign it to database query
		System.out.print("\nInsert Query"+query);
		stm.executeUpdate(query);
	return true;
	}
	
	public Boolean validateUserLogin(UserDetails userDetails) throws SQLException
	{
		query = "select FirstName,UserId from "+usertable;
		System.out.print("\n\nvalidation query = "+query);
		res = stm.executeQuery(query);
		
		while(res.next())
		{
		   if(res.getString("FirstName").equalsIgnoreCase(userDetails.getFirstName()) == true && res.getString("UserId").equalsIgnoreCase(userDetails.getLastName())==true)
		   {
			   System.out.print("user existed");
			   return true;
		   }
		} System.out.print("user not existed");
		return false;
	}
	public static void main(String a[]) throws ClassNotFoundException, SQLException, IOException
	{
		new UserBusinessLogic(); // creating a consturctor to call above 
	}
	
}
