package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aerial_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <title>Login</title> \r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">                \r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">                             \r\n");
      out.write("                \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_login.css\">   \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <!-- Login  Form -->\r\n");
      out.write("            <section class=\"sign-in\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"signin-content\">\r\n");
      out.write("                        <div class=\"signin-image\">\r\n");
      out.write("                            <figure><img src=\"img/AerialTech_Logo_Black.png\" alt=\"Logo\"></figure>\r\n");
      out.write("                            <a href=\"aerial_signup.jsp\" class=\"signup-image-link\">Don't have an Account?</a>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"signin-form\">\r\n");
      out.write("                            <h2 class=\"form-title\">Log In</h2>\r\n");
      out.write("                           <form action=\"process/loginpr.jsp\" method=\"post\" name=\"form1\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"your_name\"><i class=\"zmdi zmdi-account material-icons-name\"></i></label>\r\n");
      out.write("                                    <input type=\"text\" name=\"your_name\" id=\"your_name\" placeholder=\"Username\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"your_pass\"><i class=\"zmdi zmdi-lock\"></i></label>\r\n");
      out.write("                                    <input type=\"password\" name=\"your_pass\" id=\"your_pass\" placeholder=\"Password\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input type=\"checkbox\" name=\"remember-me\" id=\"remember-me\" class=\"agree-term\"/>\r\n");
      out.write("                                    <label for=\"remember-me\" class=\"label-agree-term\"><span></span>Remember me.</label>\r\n");
      out.write("                                    &nbsp;\r\n");
      out.write("                                    <a href=\"#\" class=\"label-agree-term\">Forgot password?</a>\r\n");
      out.write("                                </div>                                \r\n");
      out.write("                                <div class=\"form-group form-button\">\r\n");
      out.write("                                    <input type=\"submit\" name=\"signin\" id=\"signin\" class=\"form-submit\" value=\"Log in\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- JS -->        \r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>    \r\n");
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
