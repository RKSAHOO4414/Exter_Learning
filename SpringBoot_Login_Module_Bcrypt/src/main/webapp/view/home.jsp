<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	welcome Home!
	<a href="/logout">Logout</a><br><br>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<h1>New User</h1>
				<form action="/saveData" method="post">
				
					<div class="form-group">
						<label class="control-label" for="username">Username</label>
						<input id="username" name="username" class="form-control" />
					</div>
					
					<div class="form-group">
						<label class="control-label" for="username">Password</label>
						<input id="password" name="password" class="form-control" />
					</div>
					
					<div class="form-group">
						<button type="submit" class="btn btn-success">save</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>