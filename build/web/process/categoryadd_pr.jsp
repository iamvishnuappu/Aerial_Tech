<%-- 
    Document   : categoryadd_pr
    Created on : Nov 1, 2019, 12:56:00 PM
    Author     : mrvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:useBean id="con" class="beanfiles.Category"/>
        <jsp:setProperty name="con" property="*"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(con.putData(1)>0) {
                response.sendRedirect("../category_add.jsp");
            }
        %>
    </body>
</html>
