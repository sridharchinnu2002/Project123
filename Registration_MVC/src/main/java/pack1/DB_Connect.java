package pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connect 
{
	
	private static Connection conn=null;
	private DB_Connect()  {}
	static
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection(DB_Info.dburl, DB_Info.dbuname, DB_Info.dbpwd);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static Connection getcon()
	{
		return conn;
	}

}
