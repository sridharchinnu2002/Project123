package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDAO 
{
   public int updatedata(Bean_Class bc)
   {
	   int rowcount=0;
	   try 
	   {
		  Connection con=DB_Connect.getcon();
		  PreparedStatement pstmt=con.prepareStatement("update registration set firstname=?,lastname=?,mailid=?,phone=? where username=?");
		  pstmt.setString(1,bc.getFname());
		  pstmt.setString(2,bc.getLname());
		  pstmt.setString(3,bc.getMail());
		  pstmt.setString(4,bc.getPhone());
		  pstmt.setString(5,bc.getUname());
		  rowcount=pstmt.executeUpdate();
		  //System.out.println("9");
		  
	   } 
	   catch (Exception e) 
	   { 
		// TODO: handle exception
		   e.printStackTrace();
	   }
	   return rowcount;
   }
	
}
