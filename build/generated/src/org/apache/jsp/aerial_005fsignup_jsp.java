package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aerial_005fsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>  \r\n");
      out.write("        <title>Sign_up</title>               \r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("                \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_login.css\">     \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("        <script>                                  \r\n");
      out.write("\r\n");
      out.write("            function validate(){ \r\n");
      out.write("    var fname = document.forms[\"form1\"][\"f_name\"];               \r\n");
      out.write("    var lname = document.forms[\"form1\"][\"l_name\"];    \r\n");
      out.write("    var uname = document.forms[\"form1\"][\"u_name\"];   \r\n");
      out.write("    var password = document.forms[\"form1\"][\"pass\"];  \r\n");
      out.write("    var confirm = document.forms[\"form1\"][\"repass\"];  \r\n");
      out.write("   \r\n");
      out.write("    if (fname.value == \"\")                                  \r\n");
      out.write("    { \r\n");
      out.write("        window.alert(\"Please enter your First name.\"); \r\n");
      out.write("        fname.focus(); \r\n");
      out.write("        return false; \r\n");
      out.write("    } \r\n");
      out.write("   \r\n");
      out.write("    if (lname.value == \"\")                               \r\n");
      out.write("    { \r\n");
      out.write("         window.alert(\"Please enter your Last name.\"); \r\n");
      out.write("        lname.focus(); \r\n");
      out.write("        return false; \r\n");
      out.write("    } \r\n");
      out.write("       \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    if (uname.value == \"\")                           \r\n");
      out.write("    { \r\n");
      out.write("        window.alert(\"Please enter your Username\"); \r\n");
      out.write("        uname.focus(); \r\n");
      out.write("        return false; \r\n");
      out.write("    } \r\n");
      out.write("   \r\n");
      out.write("    if (paasword.value == \"\")                        \r\n");
      out.write("    { \r\n");
      out.write("        window.alert(\"Please enter your password\"); \r\n");
      out.write("        pass.focus(); \r\n");
      out.write("        return false; \r\n");
      out.write("    } \r\n");
      out.write("   \r\n");
      out.write("    if (repass.value==\"\")                  \r\n");
      out.write("    { \r\n");
      out.write("        alert(\"Enter Password\"); \r\n");
      out.write("        repass.focus(); \r\n");
      out.write("        return false; \r\n");
      out.write("    } \r\n");
      out.write("   \r\n");
      out.write("    return true; \r\n");
      out.write("}</script> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body onload=\"createCaptcha()\">   \r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <!-- Sign up form -->\r\n");
      out.write("            <section class=\"signup\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"signup-content\">\r\n");
      out.write("                        <div class=\"signup-form\">\r\n");
      out.write("                            <h2 class=\"form-title\">Sign Up</h2>\r\n");
      out.write("                             <form action=\"process/signup_pr.jsp\" onsubmit=\"return validate()\" method=\"post\" name=\"form1\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"f_name\"><i class=\"zmdi zmdi-account material-icons-name\"></i></label>\r\n");
      out.write("                                    <input type=\"text\" name=\"f_name\" id=\"f_name\" pattern=\"[a-z]{1,15}\" placeholder=\"First Name\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"l_name\"><i class=\"zmdi zmdi-account material-icons-name\"></i></label>\r\n");
      out.write("                                    <input type=\"text\" name=\"l_name\" id=\"l_name\" pattern=\"[a-z]{1,15}\" placeholder=\"Last Name\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"u_name\"><i class=\"zmdi zmdi-account material-icons-name\"></i></label>\r\n");
      out.write("                                    <input type=\"text\" name=\"u_name\" id=\"u_name\" pattern=\"[A-Za-z0-9]+\" placeholder=\"User Name\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"pass\"><i class=\"zmdi zmdi-lock\"></i></label>\r\n");
      out.write("                                    <input type=\"password\" name=\"pass\" pattern=\"[A-Za-z0-9]+\" id=\"pass\" placeholder=\"Password\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"re_pass\"><i class=\"zmdi zmdi-lock-outline\"></i></label>\r\n");
      out.write("                                    <input type=\"password\" name=\"re_pass\" pattern=\"[A-Za-z0-9]+\"id=\"re_pass\" placeholder=\"Confirm Password\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input type=\"checkbox\" name=\"agree-term\" id=\"agree-term\" class=\"agree-term\" />\r\n");
      out.write("                                    <label for=\"agree-term\" class=\"label-agree-term\"><span><span></span></span>I agree all statements in  <a href=\"#\" class=\"term-service\">Terms of service</a></label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group form-button\">\r\n");
      out.write("                                    <input type=\"submit\" name=\"signup\" id=\"signup\" class=\"form-submit\" value=\"Register\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"signup-image\">\r\n");
      out.write("                            <figure><img src=\"img/AerialTech_Logo_Black.png\" alt=\"Logo\"></figure>\r\n");
      out.write("                            \r\n");
      out.write("                            <form onsubmit=\"validateCaptcha()\">\r\n");
      out.write("                                <div id=\"captcha\"></div>\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Type the characters you see.\" id=\"cpatchaTextBox\"/>                                \r\n");
      out.write("                                <br>\r\n");
      out.write("                            </form>\r\n");
      out.write("                            \r\n");
      out.write("                            <form action=\"\" method=\"post\">\r\n");
      out.write("                                <div class=\"g-recaptcha\" data-sitekey=\"6Lc3JLsUAAAAAAB5OmYvKh0aV2yAebBH2Bebd8O3\"></div>\r\n");
      out.write("                                <br>\r\n");
      out.write("                            </form>                            \r\n");
      out.write("                            \r\n");
      out.write("                            <a href=\"aerial_login.jsp\" class=\"signup-image-link\">Already a member.</a>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- JS -->                \r\n");
      out.write("        <script src=\"js/captcha_signup.js\"></script>\r\n");
      out.write("        <script src='https://www.google.com/recaptcha/api.js'></script> \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
