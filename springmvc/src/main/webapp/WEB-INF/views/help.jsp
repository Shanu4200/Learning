<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="java.time.LocalDateTime" %>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<style>
body{
margin:0;
padding:0;
background-color:#000;
}
.help {
      font-family: cursive, sans-serif;
      background-color: #2ecc71;
      color: white;
      padding: 10px;
      border-radius: 4px;
      box-shadow: 2px 2px 20px 23px #7fecad;
    }
    
    .welp {
      font-family: cursive, sans-serif;
      background-color: #0000FF;
      color: white;
      padding: 10px;
      border-radius: 4px;
      box-shadow: 2px 2px 20px 23px #0000CD;
    }
    
    .kelp {
      font-family: cursive, sans-serif;
      background-color: #2ecc71;
      color: white;
      padding: 10px;
      border-radius: 4px;
      box-shadow: 2px 2px 20px 23px #7fecad;
    }
    
 .btn {
  color: #15f4ee;
  border: 5px solid #15f4ee;
  padding: 15px 30px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 30px;
  float: lef;
  margin:5px;
  width:250px;
  font-family: poppins;
  font-weight: 400;
  text-transform: uppercase;
  letter-spacing: 10px;
  cursor: pointer;
  border-radius:100px;
  transition:1.5%;
}   

.btn:hover{
box-shadow: 0 5px 50px 0 #15f4ee inset, 0 5px 50px 0 #15f4ee, 0 5px 50px 0 #15f4ee inset, 0 5px 50px 0 #15f4ee ;
text-shadow: 0 0 5px #15f4ee, 0 0 5px #15f4ee;
}
</style>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

<div class="help">
<h1>This is help page</h1>
</div>
<%
//Integer name = (Integer) request.getAttribute("rollnumber");
//LocalDateTime time = (LocalDateTime) request.getAttribute("time");
%>
<div class="welp">
<h1> RollNumber is : ${rollnumber }</h1>
<h1>Date and time is:${time }</h1>
</div>
<div class="kelp">
<hr>
<h1>The marks of the Student are: ${marks }</h1>
</div>
<br>
<br>
<br>
<br>

<a href="http://localhost:8080/springmvc/home"><button class="btn">Home</button></a>


<a href="http://localhost:8080/springmvc/about"><button class="btn">About</button></a>


<a href="http://localhost:8080/springmvc/services"><button class="btn">Service</button></a> 


</body>
</html>