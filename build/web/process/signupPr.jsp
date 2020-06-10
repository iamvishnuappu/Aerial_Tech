<%-- 
    Document   : UpdateRateSupport
    Created on : 26 Sep, 2014, 9:28:18 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="con" class="beanfiles.Signup"/>
        <jsp:setProperty name="con" property="*"/>
    </head>
    <body>
        <%
            if(con.putData(1)>0){
                if(con.putData(2)>0){
                    if(con.putData(3)>0){
                        response.sendRedirect("../index.jsp");
                    }
                }
            }
        %>
    </body>
</html>
