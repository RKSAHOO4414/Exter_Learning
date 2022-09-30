<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login Page</title>
	<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css">
</head>
<body>
	<h2>${errormsg}</h2>
	<form method="post">	
		<input type="text" name="userId" />
		<br><br>
		<input type="password" name="password" />
		<br><br>
		<button>Submit</button>
	</form>
</body>
</html>