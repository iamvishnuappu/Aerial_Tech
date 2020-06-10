<%-- 
    Document   : Signup
    Created on : Sep 30, 2019, 8:36:58 AM
    Author     : TOMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <title>Sign_up</title>               
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
                
        <link rel="stylesheet" href="css/style_login.css">     
        <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
    </head>
     <script>                                  

            function validate(){ 
    var fname = document.forms["form1"]["f_name"];               
    var lname = document.forms["form1"]["l_name"];    
    var uname = document.forms["form1"]["u_name"];   
    var password = document.forms["form1"]["pass"];  
    var confirm = document.forms["form1"]["re_pass"];  
   
    if (fname.value == "")                                  
    { 
        window.alert("Please enter your First name."); 
        fname.focus(); 
        return false; 
    } 
   
    if (lname.value == "")                               
    { 
         window.alert("Please enter your Last name."); 
        lname.focus(); 
        return false; 
    } 
       
   
   
    if (uname.value == "")                           
    { 
        window.alert("Please enter your Username"); 
        uname.focus(); 
        return false; 
    } 
   
    if (password.value == "")                        
    { 
        window.alert("Please enter your password"); 
        password.focus(); 
        return false; 
    } 
   
    if (confirm.value=="")                  
    { 
        alert("Enter Password"); 
        Confirm.focus(); 
        return false; 
    } 
   
    return true; 
}</script> 
    <body onload="createCaptcha()">   
        <div class="main">
            <!-- Sign up form -->
            <section class="signup">
                <div class="container">
                    <div class="signup-content">
                        <div class="signup-form">
                            <h2 class="form-title">Sign Up</h2>
                             <form action="process/signup_pr.jsp" onsubmit="return validate()" method="post" name="form1">
                                <div class="form-group">
                                    <label for="f_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                  <input type="text" name="f_name" id="f_name" pattern="[a-z]{1,15}" placeholder="First Name"/>
                                </div>
                                <div class="form-group">
                                    <label for="l_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="l_name" id="l_name" pattern="[a-z]{1,15}" placeholder="Last Name"/>
                                </div>
                                <div class="form-group">
                                    <label for="u_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                  <input type="text" name="u_name" id="u_name" pattern="[A-Za-z0-9]+" placeholder="User Name"/>
                                </div>
                                <div class="form-group">
                                    <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                                      <input type="password" name="pass" pattern="[A-Za-z0-9]+" id="pass" placeholder="Password"/>
                                </div>
                                <div class="form-group">
                                    <label for="re_pass"><i class="zmdi zmdi-lock-outline"></i></label>
                                   <input type="password" name="re_pass" pattern="[A-Za-z0-9]+"id="re_pass" placeholder="Confirm Password"/>
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
                            <figure><img src="img/AerialTech_Logo_Black.png" alt="Logo"></figure>
                            
                            <form onsubmit="validateCaptcha()">
                                <div id="captcha"></div>
                                <input type="text" placeholder="Type the characters you see." id="cpatchaTextBox"/>                                
                                <br>
                            </form>
                            
                            <form action="" method="post">
                                <div class="g-recaptcha" data-sitekey="6Lc3JLsUAAAAAAB5OmYvKh0aV2yAebBH2Bebd8O3"></div>
                                <br>
                            </form>                            
                            
                            <a href="aerial_login.jsp" class="signup-image-link">Already a member.</a>
                            
                        </div>
                    </div>
                </div>
            </section>
        </div>
        
        <!-- JS -->                
        <script src="js/captcha_signup.js"></script>
        <script src='https://www.google.com/recaptcha/api.js'></script> 
    </body>
</html>
