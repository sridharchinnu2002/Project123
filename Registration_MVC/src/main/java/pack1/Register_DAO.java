package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Register_DAO 
{
	
	public int insertuserdata(Bean_Class bc)
	{
		int rowcount=0;
		try 
		{
			Connection con=DB_Connect.getcon();
			PreparedStatement pstmt=con.prepareStatement("insert into registration values(?,?,?,?,?,?)");
			System.out.println("Connection created");
			pstmt.setString(1,bc.getUname());
			pstmt.setString(2,bc.getPass());
			pstmt.setString(3,bc.getFname());
			pstmt.setString(4,bc.getLname());
			pstmt.setString(5,bc.getMail());
			pstmt.setString(6,bc.getPhone());
			
			rowcount=pstmt.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		return rowcount;
	}

}
