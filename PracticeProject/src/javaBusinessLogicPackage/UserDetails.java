package javaBusinessLogicPackage;

public class UserDetails {
	public Boolean validateLoginDetails(String table, String UserName, String Password)
	{
		String Query = "SELECT UserName, Passowrd FROM "+table+" where UserName = '"+UserName + "' and Password = '"+Password+"'";
		
		return false;
	}
}
