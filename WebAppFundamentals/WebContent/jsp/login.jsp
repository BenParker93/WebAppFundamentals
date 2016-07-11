<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/WebAppFundamentals/css/design.css" />
<title>First Version Control</title>
</head>
<body>
<div class="mainContainer">
	<div class ="loginBox">
		<div class="innerLogin">
			<form action="/WebAppFundamentals/LoginServlet" method = "POST" >
					<input type="text" placeholder="Username" name="Username" required>
					<input type="password" placeholder="Password" name="Password" required>
					<button class="submitBut">Submit</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>