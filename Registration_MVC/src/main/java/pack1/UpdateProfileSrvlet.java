package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Update")
public class UpdateProfileSrvlet extends HttpServlet
{ 
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		Cookie arr[]=req.getCookies();
		String uname=null;
		
		if(arr==null)
		{
			req.setAttribute("msg","Session Exepired..!!");
			RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
			
		}
		else
		{
			ServletContext context=req.getServletContext();
			Bean_Class bc=(Bean_Class)context.getAttribute("bean");
			
			UpdateProfileDAO updateDAo=new UpdateProfileDAO();
			
			bc.setFname(req.getParameter("fname"));
			bc.setLname(req.getParameter("lname"));
			bc.setMail(req.getParameter("mail"));
			bc.setPhone(req.getParameter("phone"));
			
		   int rowcount=updateDAo.updatedata(bc);
		   
		   if(rowcount>0)
		   {
		        req.setAttribute("msg","Data Updated..!!");
		   }
			for(Cookie ck:arr)
			{
				if("cName".equals(ck.getName()))
			{
				uname=ck.getValue();
			}
			req.setAttribute("uname",uname);
			RequestDispatcher rd=req.getRequestDispatcher("UpdateProfile.jsp");
			rd.forward(req, res);
			
			}
		}
	}

}
