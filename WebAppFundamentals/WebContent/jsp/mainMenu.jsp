<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/WebAppFundamentals/css/design.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main menu</title>
</head>
<body>
<h1>Menu Page</h1>
	<form action="/WebAppFundamentals/NewReportServlet" method="GET">
		<button>Create New Report</button>
	</form>
	<form action="/WebAppFundamentals/StoredReportServlet" method="GET"> 
		<button>View Previous Reports</button>
	</form>
</body>
</html>