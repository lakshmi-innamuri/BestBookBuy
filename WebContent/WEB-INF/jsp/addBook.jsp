<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Add Book Best Book Buy</title>
</head>
<body>

<h2>Add Book</h2>
<form:form method="POST" action="/BestBookBuy/addBook">
   <table>
    <tr>
        <td><form:label path="title">Title</form:label></td>
        <td><form:input path="title" /></td>
    </tr>
    <tr>
        <td><form:label path="isbn">ISBN</form:label></td>
        <td><form:input path="isbn" /></td>
    </tr>
    <tr>
        <td><form:label path="price">Price</form:label></td>
        <td><form:input path="price" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Book"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>