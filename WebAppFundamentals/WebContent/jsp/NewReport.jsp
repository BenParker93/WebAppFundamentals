<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Report</title>
<link rel="stylesheet" href="/WebAppFundamentals/css/design.css" />
</head>
<body>

<form action="/WebAppFundamentals/SaveReport" method="POST">
<table style="undefined;table-layout: fixed; width: 121px">
<colgroup>
<col style="width: 30px">;
<col style="width: 150px">
<col style="width: 150px">
<col style="width: 150px">
<col style="width: 150px">
<col style="width: 150px">
<col style="width: 150px">
</colgroup>

<c:forEach items="${AllProducts}" var="item">
 	<tr>
 		<th><input type="checkbox" name="${item.getB_Product_ID()}"/>
   	 	<th>${item.getName()}</th>
    	<th>${item.getPortionType()}</th>
    	<th>${item.getPortionSize()}</th>
    	<th>${item.getPortionType()}</th>
    	<th><input type="text" placeholder="Cost Per Portion" name="CostPerPortion" /></th>
    	<th></th>
 	 </tr>
</c:forEach>
</table>
<button class="submitBut">Save Report</button>
</form>
</body>
</html>