<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
    rel="stylesheet">
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
<div class="container Container">
<form class="form-inline md-form mr-auto mb-4">
<div class="add">
<br>
<br>
<input type="submit" value="Add Hotel" id="add" class="btn btn-success" onclick="form.action='/addhotel'">
<br>
<br>
<br>
<input type="submit" value="Add Dish" id="add" class="btn btn-success" onclick="form.action='/adddish'">
<br>
<br>
<br>
<input type="submit" value="Add Dish in Hotel " id="add" class="btn btn-success" onclick="form.action='/link'">
<br>
<br>
<br>
<input type="submit" value="Delete Dish" id="add" class="btn btn-success" onclick="form.action='/delete'">
<br>
<br>
<br>
<input type="submit" value="Update Dish" id="add" class="btn btn-success" onclick="form.action='/update'">
<br>
<br>
<br>
<input type="submit" value="View Details" id="add" class="btn btn-success" onclick="form.action='/viewdetails'">

</div>
</body>
<style>
  .Container{
  background-image:url('/resources/images/download.jpg');
  height: 600px;
  background-repeat: no-repeat;
  background-position: center;
  background-attachment: fixed;
  background-size: cover;
  }
</style>
</html>