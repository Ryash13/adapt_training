<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<h1>Simple Interest Calculator</h1>
	<form action="/SpringMvcQuestion2/calculatedSI.html" method="post">
		<p>
			Principle : <input type="text" name="principle">
		</p>
		
		<p>
			Interest Rate : <input type="text" name="rate">
		</p>
		
		<p>
			Duration : <input type="text" name="time">
		</p>
		
		<input type="submit" value="Calculate SI">
		
	</form>
</body>
</html>