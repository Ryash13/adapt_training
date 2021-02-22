<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Spring MVC Registration Form</h1>
	<form action="/SpringMvcQuestion6/submitButton">
	<p>
		UserName: <input type="text" name="username" id="username">
	</p>
	
	<p>
		Password: <input type="text" name="password" id="password">
	</p>
	
	<p>
		Email: <input type="text" name="email" id="email">
	</p>
	
	<p>
		Contact: <input type="text" name="contact" id="contact">
	</p>
	
	<p>
		City: <select name="city" id="city">
				<option value="null">Select</option>
				<option value="Pune">Pune</option>
				<option value="Delhi">Delhi</option>
				<option value="Punjab">Punjab</option>
			  </select>
	</p>
	
	<p>
		ZipCode: <input type="text" name="zipcode" id="zipcode">
	</p>
	
	<input type ="submit" value = "Register">
	
	</form>
</body>
</html>