<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
 <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
</head>
<body>
	<div class="container">
		<h2>Login Form</h2>
		<form action="login-success" method="post">
			<label for="username">Username:</label> <input type="text"
				id="username" name="username" /><br /> <label for="password">Password:</label>
			<input type="password" id="password" name="password" /><br /> <input
				type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>