<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ticket Confirmed</title>

</head>
<body>
	<h3>Your reservation is confirmed successfully.</h3>
	<p>Please, re-check the details.</p>
	First Name : ${reservation.firstName}
	<br> Last Name : ${reservation.lastName}
	<br> Gender: ${reservation.gender}
	<br> Meals:
	<ul>
		<c:forEach var="meal" items="${reservation.food}">
			<li>${meal}</li>
		</c:forEach>
	</ul>
	Leaving From : ${reservation.cityFrom}
	<br> Going To : ${reservation.cityTo}
</body>
</html>