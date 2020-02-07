<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
	integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
	crossorigin="anonymous"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<center>
		<h1>Add Dish With Hotel</h1>
	</center>
	<form action="/addHotelDish" method=post>
		<div class="container">
			<div>
				<label>Select Hotel :</label> <select name="hotelId">
					<c:forEach var="hotels" items="${hotels}">
						<option value="${hotels.hotelId}">${hotels.hotelName}</option>
					</c:forEach>
				</select>
			</div>
				<div>
				<label>Select Dish :</label> <select name="dishId">
					<c:forEach var="dishes" items="${dishes}">
						<option value="${dishes.dishId}">${dishes.dishName}</option>
					</c:forEach>
				</select>
			</div>
			<div>
				<button type="submit" class="btn-success create button">Link</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/">Back</a><br>
			</div>
</html>