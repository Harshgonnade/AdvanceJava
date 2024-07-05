<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Books</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
    
<body>
	<div class="container">
        <h1>Books List</h1>
        <div class="book-image">
            <img src="${pageContext.request.contextPath}/images/pbooks.jpg" alt="Book Cover">
        </div> <br>
        <table>
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Author</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="book" items="${books}">
                    <tr>
                        <td>${book.title}</td>
                        <td>${book.author}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="${pageContext.request.contextPath}/book">Add New Book</a>
    </div>
	
</body>
</html>