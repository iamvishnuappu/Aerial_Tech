<%-- 
    Document   : Product_List
    Created on : Oct 7, 2019, 8:35:55 AM
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
        <jsp:useBean id="con" class="beanfiles.Product"/>
        
        <title>Product</title>
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
        <nav>
            <div class="logo">
                <a href="main.jsp"><img src="img/AerialTech_Logo.png" alt="AerialTech_Logo"></a>
            </div>
            <div class="mini-logo">
                <img src="img/AerialTech_Logo_Mini.png" alt="AerialTech_Logo">
            </div>
            <ul>
                <li><a href="main.jsp"><i class="fa fa-home"></i><em>Home</em></a></li>
                <li><a href="category.jsp"><i class="fa fa-list"></i><em>Category</em></a></li>                
                <li class="wrapper"><a href="product.jsp"><i class="fa fa-product-hunt"></i><em>Products</em></a></li>                
            </ul>
        </nav>

        <div class="slides">
            <div class="slide" id="1">
                <div class="content first-content">                    
                    <div class="wrapper left-half">
                        <h3>PRODUCTS</h3>
                    </div>
                    <div class="outer right-half">
                        <div class="inner">
                             <a href="logout.jsp"><p>Log Out</p></a>
                        </div>
                    </div>                                                          
                    <form style="margin-top: 35px" action="post">                              
                        <span class="bt more-bt">
                            <a href="product_add.jsp" style="text-decoration: none">
                                <span class="fl"></span>  
                                <span class="sfl"></span>
                                <span class="cross"></span>
                                <i></i>
                                add product
                            </a>                        
                        </span>                    
                        <p style="margin-top: 45px"></p>                         
                        <table>
                            <caption>Product List</caption>
                            <thead>
                                <tr>
                                    <th>Product ID</th>
                                    <th>Category</th>
                                    <th>Product Name</th>                        
                                    <th>Sales Price</th>
                                    <th>Available Quantity</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                            </thead>
                            <%
                                Vector v = null;
                                Iterator it = con.getData(2).iterator();
                                while(it.hasNext()) {
                                v = (Vector)it.next();
                            %>     
                             <input type="hidden" id="id" name="id" value="<%out.print(v.get(6)); %>">
                            <tbody>
                                <tr>
                                    <td id="P_id"><%out.print(v.get(0)); %> </td>
                                    <td id="category"><%out.print(v.get(4)); %> </td>
                                    <td id="p_name"><%out.print(v.get(1)); %></td>
                                    <td id="price"><%out.print(v.get(2)); %></td>                                                
                                    <td id="quantity"><%out.print(v.get(3)); %></td>
                                    <td>
                                         <a href="product_edit.jsp?&p_id=<%out.print(v.get(0)); %>&p_name=<%out.print(v.get(1));%>&category=<%out.print(v.get(1));%>&price=<%out.print(v.get(2));%>&quantity=<%out.print(v.get(3)); %>"  class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>                                                                 
                                    </td>
                                    <td>
                                       <a href="/process/product_delete.jsp?&p_id=<%out.print(v.get(0)); %> " class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                    </td>
                                </tr>                            
                            </tbody>
                            <%}%>
                        </table>                                                                       
                    </form>                        
                </div>
            </div>
        </div>        
    </body>
</html>
