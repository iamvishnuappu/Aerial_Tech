<%-- 
    Document   : Main_Page
    Created on : Oct 2, 2019, 10:39:54 AM
    Author     : TOMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Vector"%>
<%@page import="java.util.Iterator"%>
<%@page import="DBConnection.DBConnection"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id="con" class="beanfiles.Category"/>
        <jsp:useBean id="con2" class="beanfiles.Product"/>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">                
        <meta http-equiv="X-UA-Compatible" content="IE=edge">       
        
        <link rel="stylesheet" href="css/fontAwesome.css">    
        <link rel="stylesheet" href="css/style_MainPage.css">   
        <link rel="stylesheet" href="css/templatemo-main.css">
        <link rel="stylesheet" href="css/style_Heading.css">
        <link rel="stylesheet" href="css/style_Buttons.css">
        
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800">    
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    
    <body>     
        <% session.getAttribute("uname");%>
        <nav>
            <div class="logo">
                <a href="main.jsp"><img src="img/AerialTech_Logo.png" alt="AerialTech_Logo"></a>
            </div>
            <div class="mini-logo">                                
            </div>
            <ul>
                <li class="wrapper"><a href="main.jsp"><i class="fa fa-home "></i><em>Home</em></a></li>
                <li><a href="category.jsp"><i class="fa fa-list"></i><em>Category</em></a></li>                
                <li><a href="product.jsp"><i class="fa fa-product-hunt"></i><em>Products</em></a></li>                
            </ul>
        </nav>

        <div class="slides">            
            <div class="slide" id="1">                                
                <div class="content first-content">                                                             
                    <div class="wrapper left-half">
                        <h3>INVENTORY DETAILS</h3>
                    </div>                    
                    <div class="outer right-half">
                        <div class="inner">
                              <a href="logout.jsp"><p>Log Out</p></a>
                        </div>
                    </div>                                                      
                    <form style="margin-top: 63px" action="post">                                
                        <div class="left-half" style="width:35%">
                            <span class="bt more-bt" >
                                <a href="category_add.jsp" style="text-decoration: none">
                                    <span class="fl"></span>  
                                    <span class="sfl"></span>
                                    <span class="cross"></span>
                                    <i></i>
                                    add category
                                </a>                        
                            </span>                                    
                            <p style="margin-top: 42px"></p>
                            <table>
                                <caption>Category List</caption>              
                                <thead>
                                    <tr>                                            
                                        <th>Category Name</th>                        
                                        <th>Number of Products</th>
                                    </tr>
                                </thead>
                                <%	
                                    Vector v=null;
                                    Iterator it=con.getData(2).iterator();
                                    while(it.hasNext()){
                                    v=(Vector)it.next();
                                %>
                                <tbody>
                                    <tr>                                            
                                        <td id="c_id"><%out.print(v.get(0));%></td>
                                        <td id="c_name"><%out.print(v.get(1));%></td>                                        
                                    </tr> 
                                </tbody>
                                <%}%>
                            </table>                                                                       
                        </div>
                        <div class="right-half" style="width:56%">                                
                            <span class="bt more-bt">
                                <a href="product_add.jsp" style="text-decoration: none">
                                    <span class="fl"></span>                        
                                    <span class="sfl"></span>
                                    <span class="cross"></span>
                                    <i></i>
                                    add product
                                </a>                        
                            </span>                    
                            <p style="margin-top: 42px"></p>
                            <table>
                                <caption>Product List</caption>
                                <thead>
                                    <tr>                                           
                                        <th>Category Name</th>
                                        <th>Product Name</th>                                                                    
                                        <th>Available Quantity</th>
                                    </tr>
                                </thead>
                                <%	
                                    Vector v2=null;
                                    Iterator it2=con2.getData(2).iterator();
                                    while(it2.hasNext())
                                    {
                                        v2=(Vector)it2.next();
                                %>
                                <%                                                                                                                        
                                    DBConnection ob = new DBConnection();
                                    ResultSet rs = ob.select("SELECT c_id FROM product WHERE c_id='"+v2.get(4)+"'");                                                                
                                    System.out.print(rs);
                                    if (rs.next()) 																
                                    {
                                %>
                                <tbody>
                                    <tr>                                                
                                        <td id="category"><%=rs.getString(1)%></td>
                                        <td id="p_name"><%out.print(v2.get(1));%></td>
                                        <td id="quantity"><%out.print(v2.get(3));%></td> 
                                    </tr> 
                                </tbody>
                                <%}%>
                                <%}%>
                            </table>                                
                        </div>
                    </form>                        
                </div>
            </div>
        </div>        
        
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="js/main.js"></script>                
    </body>
</html>
