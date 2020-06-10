package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import java.util.Iterator;

public final class category_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("  ");
      beanfiles.Category con = null;
      synchronized (_jspx_page_context) {
        con = (beanfiles.Category) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new beanfiles.Category();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("      \r\n");
      out.write("        \r\n");
      out.write("        <title>Add_Category</title>        \r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">                \r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">       \r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontAwesome.css\">    \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_MainPage.css\">   \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo-main.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_Heading.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_Buttons.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_input.css\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800\">    \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>        \r\n");
      out.write("        <nav>\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"main.jsp\"><img src=\"img/AerialTech_Logo.png\" alt=\"AerialTech_Logo\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mini-logo\">\r\n");
      out.write("                <img src=\"img/AerialTech_Logo_Mini.png\" alt=\"AerialTech_Logo\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"main.jsp\"><i class=\"fa fa-home\"></i><em>Home</em></a></li>\r\n");
      out.write("                <li class=\"wrapper\"><a href=\"category.jsp\"><i class=\"fa fa-list\"></i><em>Category</em></a></li>                \r\n");
      out.write("                <li><a href=\"product.jsp\"><i class=\"fa fa-product-hunt\"></i><em>Products</em></a></li>                \r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"slides\">\r\n");
      out.write("            <div class=\"slide\" id=\"1\">\r\n");
      out.write("                <div class=\"content first-content\">                    \r\n");
      out.write("                    <div class=\"wrapper left-half\">\r\n");
      out.write("                        <h3>ADD CATEGORY</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"outer right-half\">\r\n");
      out.write("                        <div class=\"inner\">\r\n");
      out.write("                            <a href=\"logout.jsp\"><p>Log Out</p></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>                                                                              \r\n");
      out.write("                    <form style=\"width: 100%; margin-top: 35px\" action=\"process/categoryadd_pr.jsp\" method=\"post\" class=\"go-right\">                        \r\n");
      out.write("                        <div class=\"left-half\" style=\"width: 250px; left: 24.5%\">\r\n");
      out.write("                            <input id=\"category_id\" name=\"c_id\" type=\"text\" required>\r\n");
      out.write("                            <label for=\"category_id\">Category ID</label>\r\n");
      out.write("                        </div> \r\n");
      out.write("                        <div class=\"right-half\" style=\"width: 250px; right: 24.5%\">\r\n");
      out.write("                            <input id=\"category_name\" name=\"c_name\" type=\"text\" required>\r\n");
      out.write("                            <label for=\"category_name\">Category Name</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <button type=\"submit\" class=\"example_add\">Insert</button>\r\n");
      out.write("                        <button type=\"button\" class=\"example_cancel\">Cancel</button>                        \r\n");
      out.write("                        \r\n");
      out.write("                        <table>\r\n");
      out.write("                            <caption>Category List</caption>\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>Category ID</th>\r\n");
      out.write("                                    <th>Category Name</th>                        \r\n");
      out.write("                                    <th>Edit</th>\r\n");
      out.write("                                    <th>Delete</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            ");
	
                                Vector v = null;
                                Iterator it = con.getData(2).iterator();
                                while(it.hasNext()) {
                                    v = (Vector)it.next();
                            
      out.write("         \r\n");
      out.write("                               <input type=\"hidden\" id=\"id\" name=\"id\" value=\"");
out.print(v.get(3)); 
      out.write("\">\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td id=\"c_id\">");
out.print(v.get(0));
      out.write("</td>\r\n");
      out.write("                                    <td id=\"c_name\">");
out.print(v.get(1));
      out.write("</td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <a href=\"category_edit.jsp?&c_id=");
out.print(v.get(0));
      out.write("&c_name=");
out.print(v.get(1));
      out.write("\" class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>                            \r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                       <a href=\"/process/category_delete.jsp?&c_id=");
out.print(v.get(0));
      out.write("\" class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr> \r\n");
      out.write("                            </tbody>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </table>                                                                       \r\n");
      out.write("                    </form>                        \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>        \r\n");
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
