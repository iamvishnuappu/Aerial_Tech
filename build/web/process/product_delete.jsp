<%-- 
    Document   : product_delete
    Created on : Nov 8, 2019, 8:42:15 AM
    Author     : mrvis
--%>

<%@page import="DBConnection.DbConnection1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String pid = request.getParameter("p_id");
            System.out.println(pid);  
            
            DbConnection1 db = new DbConnection1();
            String qry = "delete from product where p_id = '"+pid+"'"; 
            
            int a = db.putData(qry);
            if(a > 0)
            { %>
                <script>
                    alert('Delete');
                    window.location.replace("../product.jsp");
                </script>          
         <% } 
            else  
            { %>
                <script>
                    alert('Deletion Failed');
                    window.history.back();
                </script>
            <% } %>
    </body>
</html>
