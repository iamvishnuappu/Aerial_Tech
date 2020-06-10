<%-- 
    Document   : category_add
    Created on : Oct 7, 2019, 10:15:27 AM
    Author     : TOMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Vector"%>
  <jsp:useBean id="con" class="beanfiles.Category"/>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
    <head>
      
        
        <title>Add_Category</title>        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">                
        <meta http-equiv="X-UA-Compatible" content="IE=edge">       
        
        <link rel="stylesheet" href="css/fontAwesome.css">    
        <link rel="stylesheet" href="css/style_MainPage.css">   
        <link rel="stylesheet" href="css/templatemo-main.css">
        <link rel="stylesheet" href="css/style_Heading.css">
        <link rel="stylesheet" href="css/style_Buttons.css">
        <link rel="stylesheet" href="css/style_input.css">
        
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
                <li class="wrapper"><a href="category.jsp"><i class="fa fa-list"></i><em>Category</em></a></li>                
                <li><a href="product.jsp"><i class="fa fa-product-hunt"></i><em>Products</em></a></li>                
            </ul>
        </nav>

        <div class="slides">
            <div class="slide" id="1">
                <div class="content first-content">                    
                    <div class="wrapper left-half">
                        <h3>ADD CATEGORY</h3>
                    </div>
                    <div class="outer right-half">
                        <div class="inner">
                            <a href="logout.jsp"><p>Log Out</p></a>
                        </div>
                    </div>                                                                              
                    <form style="width: 100%; margin-top: 35px" action="process/categoryadd_pr.jsp" method="post" class="go-right">                        
                        <div class="left-half" style="width: 250px; left: 24.5%">
                            <input id="category_id" name="c_id" type="text" required>
                            <label for="category_id">Category ID</label>
                              <div class="right-half" style="width: 250px; right: 24.5%">
                            <input id="category_id" name="id" type="text" value="<%out.print(request.getParameter("id")); %>" required>
                            <label for="category_id">ID</label>
                        </div>   
                        </div> 
                        <div class="right-half" style="width: 250px; right: 24.5%">
                            <input id="category_name" name="c_name" type="text" required>
                            <label for="category_name">Category Name</label>
                        </div>
                        <br><br><br>
                        <button type="submit" class="example_add">Insert</button>
                        <button type="button" class="example_cancel">Cancel</button>                        
                        
                        <table>
                            <caption>Category List</caption>
                            <thead>
                                <tr>
                                    <th>Category ID</th>
                                    <th>Category Name</th>                        
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
                               <input type="hidden" id="id" name="id" value="<%out.print(v.get(3)); %>">
                            <tbody>
                                <tr>
                                    <td id="c_id"><%out.print(v.get(0));%></td>
                                    <td id="c_name"><%out.print(v.get(1));%></td>
                                    <td>
                                        <a href="category_edit.jsp?&c_id=<%out.print(v.get(0));%>&c_name=<%out.print(v.get(1));%>&id=<%out.print(v.get(3));%>"class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>                                                   
                                </td>
                                    <td>
                                       <a href="/process/category_delete.jsp?&c_id=<%out.print(v.get(0));%>" class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
                                    </td>
                                </tr> 
                            </tbody>
                            <%}%>
                        </table>                                                                       
                    </form>                        
                </div>
            </div>
        </div>
        
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="js/main.js"></script>        
    </body>
</html>
