<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Welcome to Best Book Buy</title>
</head>
<body>

<h2>Submitted Student Information</h2>
   <table>
    <tr>
        <td>First Name</td>
        <td>${fname}</td>
    </tr>
    <tr>
        <td>Last Name</td>
        <td>${lname}</td>
    </tr>
    <tr>
        <td>EMail</td>
        <td>${email}</td>
    </tr>
</table>  
</body>
</html>