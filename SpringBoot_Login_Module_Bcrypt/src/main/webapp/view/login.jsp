<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<h1>Wel Come</h1>
				<form action="/login" method="post">
				
					<div class="form-group">
						<label class="control-label" for="username">Username</label>
						<input id="username" name="username" class="form-control" required autofocus="autofocus" />
					</div>
					
					<div class="form-group">
						<label class="control-label" for="username">Password</label>
						<input id="password" name="password" class="form-control" required autofocus="autofocus" />
					</div>
					
					<div class="form-group">
						<button type="submit" class="btn btn-success">Login</button>
					</div>
					${SPRING_SECURITY_LAST_EXCEPTION.message}
				</form>
			</div>
		</div>
	</div>
</body>
</html>