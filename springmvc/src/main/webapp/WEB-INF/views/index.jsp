<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>

<h1>This is the Home Page</h1>
<h1>Called by HomeController</h1>
<h1>URL/home</h1>
<%
String name = (String) request.getAttribute("name");
%>
<h1> Name is <%=name %></h1>
 <a href="http://localhost:8080/springmvc/about">
    <button>About</button>
  </a> 
  <br>
  <br>
  <a href="http://localhost:8080/springmvc/services">
    <button>Services</button>
  </a> 
  <br>
  <br>
  <a href="http://localhost:8080/springmvc/help">
    <button>Help</button>
  </a> 

</body>
</html>