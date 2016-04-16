<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>User Registration</h2>
<form:form method="POST" action="/BestBookBuy/addUser">
   <table>
    <tr>
        <td><form:label path="fname">Name</form:label></td>
        <td><form:input path="fname" /></td>
    </tr>
    <tr>
        <td><form:label path="lname">Age</form:label></td>
        <td><form:input path="lname" /></td>
    </tr>
    <tr>
        <td><form:label path="email">id</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>