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
<h2>
<%
   String data=(String)request.getAttribute("msg");
   out.println(data);
   

%>
</h2>

</div>
<br>

<div class="div">
<h2>
<jsp:include page="index.html"/>


<br> <br>
</h2>
</div>
</center>
</body>
</html>