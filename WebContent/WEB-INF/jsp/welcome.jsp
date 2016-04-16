<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Welcome to Best Book Buy</title>
</head>
<body>

	<h2>${fname}is Registered!!</h2>

	<div>
		<form:form method="GET" action="/BestBookBuy/addBook">
			<input type="submit" value="Add Book" />
		</form:form>
	</div>
</body>
</html>