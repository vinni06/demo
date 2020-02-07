<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<h1>Add Dish</h1>
	</center>
	<form action="/submitdish">

		<div class="form-group">
			<label for="dishName">Dish Name:</label> <input type="text"
				class="form-control" id="dishName" placeholder="Enter Dish name"
				name="dishName">
		</div>
		<div class="form-group">
			<label for="rating">Rating:</label> <input type="text" class="form-control"
				id="rating" placeholder="Enter Rating" name="rating">
		</div>
		<div class="form-group">
			<label for="price">Price:</label> <input type="text" class="form-control"
				id="price" placeholder="Enter price" name="price">
		</div>
		<button type="submit" id="submit" class="btn btn-primary">Submit</button>
	</form>

</body>
<script >
$('form').validate({
	rules : {
		rating : {
			required : true,
			range:[1,10]
		},
		price:{
			required:true,
			min:1
		}
		
		
	},
});
</script>
</html>