<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<h1>View Details</h1>
		<table class="table table-dark table-hover" border="2" width="70%">
			<tr>
				<th class="table-success">Hotel</th>
				<th class="table-success">Average Rating</th>
			</tr>

			<tbody>
				<c:forEach items="${details}" var="details">
					<tr class="table-success">
						<td><c:out value="${details.hotelName}"></c:out></td>
						<td>
						<c:set var="total" value="${0 }" />
						<c:forEach var="b" items="${details.getDishes() }">
						<c:set var="total" value="${total + b.rating}"></c:set>
						</c:forEach>
						<c:if test="${total !=0 }">${total/details.getDishes().size() }</c:if>
						</td>
						
					</tr>
				</c:forEach>
			</tbody>



		<a href="/">
			<button>back</button>
		</a>
</body>
</html>