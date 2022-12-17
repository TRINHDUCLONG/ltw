<%-- 
    Document   : Account
    Created on : Dec 13, 2022, 7:48:01 PM
    Author     : trinh
--%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id="acc" class="Dao.AccountDao" scope="request"></jsp:useBean>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <c:forEach items="${acc.listAccount}" var="i">
        username  ${i.username}
        password  ${i.password}
        <br>
    </c:forEach>
    </body>
</html>
