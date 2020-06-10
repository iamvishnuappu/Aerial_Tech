<%-- 
    Document   : logout
    Created on : 8 Oct, 2014, 2:06:22 PM
    Author     : WINDOWS 8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("/aerial_login.jsp");
            %>
    </body>
</html>
