<%-- 
    Document   : category_editpr
    Created on : Nov 1, 2019, 9:46:49 AM
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
            if(con.putData(3)>0) {
                response.sendRedirect("../category_edit.jsp");
            }
        %>
    </body>
</html>
