package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLogin_DAO 
{
	public Bean_Class retriveData(String uname,String pass)
	{
		Bean_Class bean=null;
		try 
		{
			Connection con=DB_Connect.getcon();
			PreparedStatement pstmt=con.prepareStatement("select * from registration where username=? and password=?");
			pstmt.setString(1,uname);
			pstmt.setString(2,pass);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				bean=new Bean_Class();
				bean.setUname(rs.getString(1));
				bean.setPass(rs.getString(2));
				bean.setFname(rs.getString(3));
				bean.setLname(rs.getString(4));
				bean.setMail(rs.getString(5));
				bean.setPhone(rs.getString(6));
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return bean;
	}

}
