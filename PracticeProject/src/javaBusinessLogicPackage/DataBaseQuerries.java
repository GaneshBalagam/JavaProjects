package javaBusinessLogicPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBeans.ColumnBean;
import javaDabaseConnectionPackage.JavaDatabaseConnection;

public class DataBaseQuerries {

	String DataBaseName = "", Query;
	Connection conn = null;
	Statement stm = null;
	ResultSet res = null;
	
	public DataBaseQuerries(String DataBaseName) throws ClassNotFoundException, SQLException
	{
		this.DataBaseName = DataBaseName;
		conn = new JavaDatabaseConnection().getConnection();
		stm = conn.createStatement();
	}
	
	public static void main(String[] a) throws ClassNotFoundException, SQLException
	{
		
		ArrayList<ColumnBean> Columns = new ArrayList<ColumnBean>();
		ColumnBean bean1 = new ColumnBean();
		bean1.setColumn_Name("UserName1");
		bean1.setData_Type("varchar");
		bean1.setSize(15);
		ColumnBean bean2 = new ColumnBean();
		bean2.setColumn_Name("UserName2");
		bean2.setData_Type("varchar");
		bean2.setSize(15);
		ColumnBean bean3 = new ColumnBean();
		bean3.setColumn_Name("UserName3");
		bean3.setData_Type("varchar");
		bean3.setSize(15);
		ColumnBean bean4 = new ColumnBean();
		bean4.setColumn_Name("myid");
		bean4.setData_Type("int");
		bean4.setSize(5);
		Columns.add(bean1);
		Columns.add(bean2);
		Columns.add(bean3);
		Columns.add(bean4);
		
		new DataBaseQuerries("Sample").addColumns("test2", Columns);
		System.out.print("Is Database Sample , the table text existed :"+new DataBaseQuerries("Sample").createTable("test2"));
	}
	
	public void selectDataBase() throws SQLException
	{
		Query = "use "+DataBaseName;
		stm.execute(Query);
	}
	
	public void closeAllDataBaseConnections() throws SQLException
	{
		conn.close();
		stm.close();
		res.close();
	}
	
	public Boolean checkIsDatabaseExistedOrNot() throws SQLException
	{
		Query = "SHOW DATABASES";
		res = stm.executeQuery(Query);
		while(res.next())
		{
			if(res.getString("Database").toUpperCase().equalsIgnoreCase(DataBaseName.toUpperCase()) == true)
			{
				return true;
			}
		}
		res.close();
		return false;
	}
	
	public Boolean checkIsTableExistedOrNot(String table) throws SQLException
	{
		selectDataBase();
		Query = "SHOW TABLES";
		res = stm.executeQuery(Query);
		while(res.next())
		{
			if(res.getString("Tables_in_"+DataBaseName).toUpperCase().equalsIgnoreCase(table.toUpperCase()) == true)
			{
				return true;
			}
		}
		return false;
		
	}
	
	public Boolean createTable(String table) throws SQLException
	{
		if(checkIsTableExistedOrNot(table) == true)
		{
			return false;
		}
		Query = "CREATE TABLE "+table+"(ID int AUTO_INCREMENT PRIMARY KEY)";
		stm.execute(Query);
		return true;
	}
	
	public Boolean validateLoginDetails(String table, String UserName, String Password) throws SQLException
	{
		selectDataBase();
		Query = "SELECT UserName, Password FROM "+table+" where UserName = '"+UserName + "' and Password = '"+Password+"'";
		res  = stm.executeQuery(Query);
		if(res.next())
		{
			return true;
		}
		return false;
	}
	
	public void addColumns(String table, ArrayList<ColumnBean> Columns) throws SQLException
	{
		selectDataBase();
		for(int i = 0; i < Columns.size(); i++)
		{
			ColumnBean Column = Columns.get(i);	
			Query = "ALTER TABLE "+table+ " ADD "+ Column.getColumn_Name() + " "+Column.getData_Type() + "("+Column.getSize()+")";
			stm.executeUpdate(Query);
		}
	}
}
