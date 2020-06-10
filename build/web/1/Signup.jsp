<%-- 
    Document   : Signup
    Created on : Sep 30, 2019, 8:36:58 AM
    Author     : TOMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Signup</title>               

        <!-- Font Icon -->
        <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

        <!-- Main css -->
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body onload="createCaptcha()">   
        <div class="main">
            <!-- Sign up form -->
            <section class="signup">
                <div class="container">
                    <div class="signup-content">
                        <div class="signup-form">
                            <h2 class="form-title">Sign Up</h2>
                            <form method="POST" class="register-form" id="register-form">
                                <div class="form-group">
                                    <label for="f_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="f_name" id="f_name" placeholder="First Name"/>
                                </div>
                                <div class="form-group">
                                    <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="l_name" id="l_name" placeholder="Last Name"/>
                                </div>
                                <div class="form-group">
                                    <label for="u_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="u_name" id="u_name" placeholder="User Name"/>
                                </div>
                                <div class="form-group">
                                    <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="password" name="pass" id="pass" placeholder="Password"/>
                                </div>
                                <div class="form-group">
                                    <label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
                                    <input type="password" name="re_pass" id="re_pass" placeholder="Confirm Password"/>
                                </div>
                                <div class="form-group">
                                    <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                                    <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all statements in  <a href="#" class="term-service">Terms of service</a></label>
                                </div>
                                <div class="form-group form-button">
                                    <input type="submit" name="signup" id="signup" class="form-submit" value="Register"/>
                                </div>
                            </form>
                        </div>
                        <div class="signup-image">
                            <figure><img src="images/AerialTech_Logo.png" alt="sing up image"></figure>
                            
                            <form onsubmit="validateCaptcha()">
                                <div id="captcha"></div>
                                <input type="text" placeholder="Type the characters you see." id="cpatchaTextBox"/>                                
                                </br>
                            </form>
                            
                            <form action="" method="post">
                                <div class="g-recaptcha" data-sitekey="6Lc3JLsUAAAAAAB5OmYvKh0aV2yAebBH2Bebd8O3"></div>
                                </br>
                            </form>
 
                            <!--js-->
                            <script src='https://www.google.com/recaptcha/api.js'></script>
                            
                            <a href="Login.jsp" class="signup-image-link">I am already member</a>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        <!-- JS -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>