<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Login Success</title>
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
</head>
<body>
	<div class="container">
	<h1>Welcome to Spring Web</h1>   
        <h2>Login Details </h2>
        <p>Username: ${username}</p>
        <p>Password: ${password}</p>
    </div>
	
</body>
</html>