<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Uploaded Result</title>
</head>
<body>

<h1>${msg }</h1>

<div class="container p-5">
<img alt="profile image" src="<c:url value="/resources/image/${filename }" />">
</div>

</body>
</html>