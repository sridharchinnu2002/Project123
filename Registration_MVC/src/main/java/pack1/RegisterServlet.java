package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rs")
public class RegisterServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
    	Bean_Class bc=new Bean_Class();
    	
    	bc.setUname(req.getParameter("uname"));
    	bc.setPass(req.getParameter("pass"));
    	bc.setFname(req.getParameter("fname"));
    	bc.setLname(req.getParameter("lname"));
    	bc.setMail(req.getParameter("mail"));
    	bc.setPhone(req.getParameter("phone"));
    	
    	Register_DAO rdao=new Register_DAO();
    	int rowcount=rdao.insertuserdata(bc);
    	if(rowcount>0)
    	{
    		req.setAttribute("msg","Registration successfully completed");
			RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
    	}
    	else
    	{
    		req.setAttribute("msg","Registration Failed..!!");
			RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
    	}
    }
}
