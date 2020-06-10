package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import java.util.Iterator;
import DBConnection.DBConnection;
import java.sql.ResultSet;

public final class main2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      beanfiles.Category con = null;
      synchronized (_jspx_page_context) {
        con = (beanfiles.Category) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new beanfiles.Category();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      beanfiles.Product con2 = null;
      synchronized (_jspx_page_context) {
        con2 = (beanfiles.Product) _jspx_page_context.getAttribute("con2", PageContext.PAGE_SCOPE);
        if (con2 == null){
          con2 = new beanfiles.Product();
          _jspx_page_context.setAttribute("con2", con2, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <title>Home</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">                \n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">       \n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontAwesome.css\">    \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_MainPage.css\">   \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo-main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_Heading.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_Buttons.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800\">    \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>     \n");
      out.write("        ");
 session.getAttribute("uname");
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"main.jsp\"><img src=\"img/AerialTech_Logo.png\" alt=\"AerialTech_Logo\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mini-logo\">                                \n");
      out.write("            </div>\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"wrapper\"><a href=\"main.jsp\"><i class=\"fa fa-home \"></i><em>Home</em></a></li>\n");
      out.write("                <li><a href=\"category.jsp\"><i class=\"fa fa-list\"></i><em>Category</em></a></li>                \n");
      out.write("                <li><a href=\"product.jsp\"><i class=\"fa fa-product-hunt\"></i><em>Products</em></a></li>                \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"slides\">            \n");
      out.write("            <div class=\"slide\" id=\"1\">                                \n");
      out.write("                <div class=\"content first-content\">                                                             \n");
      out.write("                    <div class=\"wrapper left-half\">\n");
      out.write("                        <h3>INVENTORY DETAILS</h3>\n");
      out.write("                    </div>                    \n");
      out.write("                    <div class=\"outer right-half\">\n");
      out.write("                        <div class=\"inner\">\n");
      out.write("                              <a href=\"logout.jsp\"><p>Log Out</p></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>                                                      \n");
      out.write("                    <form style=\"margin-top: 63px\" action=\"post\">                                \n");
      out.write("                        <div class=\"left-half\" style=\"width:35%\">\n");
      out.write("                            <span class=\"bt more-bt\" >\n");
      out.write("                                <a href=\"category_add.jsp\" style=\"text-decoration: none\">\n");
      out.write("                                    <span class=\"fl\"></span>  \n");
      out.write("                                    <span class=\"sfl\"></span>\n");
      out.write("                                    <span class=\"cross\"></span>\n");
      out.write("                                    <i></i>\n");
      out.write("                                    add category\n");
      out.write("                                </a>                        \n");
      out.write("                            </span>                                    \n");
      out.write("                            <p style=\"margin-top: 42px\"></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"right-half\" style=\"width:56%\">                                \n");
      out.write("                            <span class=\"bt more-bt\">\n");
      out.write("                                <a href=\"product_add.jsp\" style=\"text-decoration: none\">\n");
      out.write("                                    <span class=\"fl\"></span>                        \n");
      out.write("                                    <span class=\"sfl\"></span>\n");
      out.write("                                    <span class=\"cross\"></span>\n");
      out.write("                                    <i></i>\n");
      out.write("                                    add product\n");
      out.write("                                </a>                        \n");
      out.write("                            </span>                    \n");
      out.write("                            <p style=\"margin-top: 42px\"></p>\n");
      out.write("                        </div>\n");
      out.write("                    </form>                        \n");
      out.write("                    <h3><i>Inventory has no data. Please add categories and products.</i></h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("        \n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>                \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
