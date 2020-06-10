<%-- 
    Document   : loginpr
    Created on : Oct 7, 2019, 10:14:23 AM
    Author     : VISHNU
--%>


<%@page import="java.util.Iterator"%>
<%@page import="java.util.Vector"%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="con" class="beanfiles.Category"/>
        <jsp:useBean id="con2" class="beanfiles.Product"/>
<%@page import="DBConnection.DBConnection"%>
<%
    DBConnection ob = new DBConnection();
    String type = null;
    String username = request.getParameter("your_name");
    String password = request.getParameter("your_pass");
    ResultSet rs = ob.select("select * from user where u_name='" + username + "' and password='" + password + "'");
    System.out.println("Query="+ username+" "+password);
    
    if (rs.next())  {
        session.setAttribute("u_name", rs.getString(1));
        System.out.println(rs);
        	
                                    Vector v=null;
                                    Iterator it=con.getData(2).iterator();
                                    Iterator it2=con2.getData(2).iterator();
                                    if(it.hasNext()&&it2.hasNext())
        response.sendRedirect("../main.jsp");
                                    else
                                         response.sendRedirect("../main2.jsp");
                                        
    }
    else  {
        %>
        <script>
            alert("Invalid Login.. Try Again.");
            window.location="../aerial_signup.jsp";
        </script>
        <%
    }                             
%>
