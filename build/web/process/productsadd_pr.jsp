<%-- 
    Document   : products_add
    Created on : Oct 25, 2019, 9:29:23 AM
    Author     : mrvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="con" class="beanfiles.Product"/>
        <jsp:setProperty name="con" property="*"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(con.putData(1)>0) {
                response.sendRedirect("../product_add.jsp");
            }
        %>
    </body>
</html>
