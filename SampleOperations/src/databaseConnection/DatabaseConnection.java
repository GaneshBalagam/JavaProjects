package databaseConnection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection 
{	
	public String usertable = "",database = "",logintable = "";  //global declaration for allowing access to another classes and also called as class level variables or instance variables
	
	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException
	{
		Properties properties = new Properties();
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("config.properties");
		properties.load(in);
		String Password = properties.getProperty("password");
		String User = properties.getProperty("user");
		String Driver = properties.getProperty("driver");
		String Url = properties.getProperty("url");
		usertable = properties.getProperty("usertable"); 
		logintable = properties.getProperty("logintable"); 
		database = properties.getProperty("database"); 
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(Url,User,Password);
		
		return con;
	}
	
	public static void main(String a[]) throws ClassNotFoundException, IOException, SQLException
	{
		System.out.print(new DatabaseConnection().getConnection().toString());
	}
	
}
