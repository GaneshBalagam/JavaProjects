package javaDabaseConnectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaDatabaseConnection {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.print(getConnection());
	}
	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","ganesh");
	
		return conn;
	}

}
