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
        Bean_Class ub=(Bean_Class)application.getAttribute("bean");
        out.println("welcome :"+ub.getUname()+"<br> <br>");


     %>
    <a href="View"> View Profile</a><br> <br>
    <a href="Logout">Logout</a>

      <br> <br>
</h3>
</div>
</center>


</body>
</html>