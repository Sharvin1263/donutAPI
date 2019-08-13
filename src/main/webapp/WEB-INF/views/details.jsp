<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Donut</h1>

		
		<p>Name: ${results.name}</p>
		<p>Calories: ${results.calories }</p>
		<p></p>
		<p>Extras:</p>
		
	<ul>
		<c:forEach items="${results.extras}" var="stuff">
		<li> ${stuff}</li>
		</c:forEach>
	</ul>
	
	<a href="/">Home</a>

</body>