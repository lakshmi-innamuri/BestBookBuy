<%@page import="java.util.*"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page session="true"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%!HttpSession session;
	String userName;
	int userId;%>
<%
/* 	session = request.getSession();
	userName = (String) session.getAttribute("userName");
	userId = ((Integer) session.getAttribute("userId")).intValue(); */
%>

${testVariable}

<ul id='menu-nav'>
   <li><a href='${pageContext.request.contextPath}/home'>Home</a></li>
   <li><a href='${pageContext.request.contextPath}/profile'>Profile</a></li>
   <li><a href='${pageContext.request.contextPath}/addBook'>Add Books</a></li>
   <li><a href='${pageContext.request.contextPath}/bookList'>Book List</a></li>
</ul>


<c:forEach var="i" begin="1" end="5">
   Item <c:out value="${i}"/><p>
</c:forEach>

<%-- <ul id="menu">
    <c:forEach items="${menu}" var="item">
        <li>
            <c:choose>
                <c:when test="${pageContext.request.servletPath == item.value}">
                    <b>${item.key}</b>
                </c:when>
                <c:otherwise>
                    <a href="${item.value}">${item.key}</a>
                </c:otherwise>
            </c:choose>
        </li>
    </c:forEach>
</ul> --%>