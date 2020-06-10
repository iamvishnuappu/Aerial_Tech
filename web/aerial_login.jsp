<%-- 
    Document   : Login
    Created on : Sep 30, 2019, 8:50:10 AM
    Author     : TOMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title> 
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">                
        <meta http-equiv="X-UA-Compatible" content="IE=edge">                             
                
        <link rel="stylesheet" href="css/style_login.css">   
        <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
    </head>
    
    <body>
        <div class="main">
            <!-- Login  Form -->
            <section class="sign-in">
                <div class="container">
                    <div class="signin-content">
                        <div class="signin-image">
                            <figure><img src="img/AerialTech_Logo_Black.png" alt="Logo"></figure>
                            <a href="aerial_signup.jsp" class="signup-image-link">Don't have an Account?</a>                            
                        </div>

                        <div class="signin-form">
                            <h2 class="form-title">Log In</h2>
                           <form action="process/loginpr.jsp" method="post" name="form1">
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="your_name" id="your_name" placeholder="Username"/>
                                </div>
                                <div class="form-group">
                                    <label for="your_pass"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="password" name="your_pass" id="your_pass" placeholder="Password"/>
                                </div>
                                <div class="form-group">
                                    <input type="checkbox" name="remember-me" id="remember-me" class="agree-term"/>
                                    <label for="remember-me" class="label-agree-term"><span></span>Remember me.</label>
                                    &nbsp;
                                    <a href="#" class="label-agree-term">Forgot password?</a>
                                </div>                                
                                <div class="form-group form-button">
                                    <input type="submit" name="signin" id="signin" class="form-submit" value="Log in"/>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        
        <!-- JS -->        
        <script src="js/main.js"></script>
    </body>    
</html>
