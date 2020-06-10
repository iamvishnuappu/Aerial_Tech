<%-- 
    Document   : category_delete
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
            String cid = request.getParameter("c_id");
            System.out.println(cid);
        
            DbConnection1 db = new DbConnection1();
            String qry = "delete from category where c_id = '"+cid+"'"; 

            int a = db.putData(qry);
            if(a > 0)
            { %>
                <script>
                    alert('Delete');                        
                    window.location.replace("../category.jsp");
                </script>          
        <%  } 
            else  
            { %>
                <script>
                    alert('Deletion Failed');
                    window.history.back();
                </script>
         <% } %>
    </body>
</html>
