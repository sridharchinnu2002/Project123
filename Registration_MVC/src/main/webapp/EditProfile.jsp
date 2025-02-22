<%@page import="pack1.Bean_Class"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	div{
		height:auto;
		width:400px;
		border-radius: 5px;
		background-color: #fff;
		box-shadow: 3px 3px 8px 8px rgb(76, 76, 76);
		background-color:rgb(247, 215, 245);
		border-color: rgb(0, 0, 0);
	   }
	   body{
		   background-color:rgb(81, 81, 81);
		   background-size: cover;
		   height: 100vh;
		   background-position: center;
		      background-image: linear-gradient(135deg,rgb(0, 0, 160),rgb(128, 255, 128));
	   }
	 
</style>
</head>
<body>
<center>
<div>
<h3>

  <%
     String data=(String)request.getAttribute("uname");
     Bean_Class bc=(Bean_Class)application.getAttribute("bean");
     
     out.println("This session belongs to  "+data+"...!!!"+"<br> <br>");
     out.println("-----Edit Profile Details------"+"<br> <br>");
     
     
     
  %>
   <form action="Update" method="post">
   First_Name :<input type="text" name="fname" value="<%=bc.getFname() %>"> <br> <br>
   Last_Name :<input type="text" name="lname" value="<%=bc.getLname() %>"> <br> <br>
   Mail_ID :<input type="email" name="mail" value="<%=bc.getMail() %>"> <br> <br>
   Phone_NO :<input type="text" name="phone" value="<%=bc.getPhone() %>"> <br> <br>
   <input type="submit" value="update">
  
  
  </form>
</h3>
<br> <br>
</div>
</body>
</html>