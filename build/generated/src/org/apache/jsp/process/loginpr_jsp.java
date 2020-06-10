package org.apache.jsp.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.Vector;
import java.sql.ResultSet;
import DBConnection.DBConnection;

public final class loginpr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      beanfiles.Category con = null;
      synchronized (_jspx_page_context) {
        con = (beanfiles.Category) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new beanfiles.Category();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");
      beanfiles.Product con2 = null;
      synchronized (_jspx_page_context) {
        con2 = (beanfiles.Product) _jspx_page_context.getAttribute("con2", PageContext.PAGE_SCOPE);
        if (con2 == null){
          con2 = new beanfiles.Product();
          _jspx_page_context.setAttribute("con2", con2, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");

    DBConnection ob = new DBConnection();
    String type = null;
    String username = request.getParameter("your_name");
    String password = request.getParameter("your_pass");
    ResultSet rs = ob.select("select * from user where u_name='" + username + "' and password='" + password + "'");
    System.out.println("Query="+ username+" "+password);
    
    if (rs.next())  {
        session.setAttribute("u_name", rs.getString(1));
        System.out.println(rs);
        	
                                    Vector v=null;
                                    Iterator it=con.getData(2).iterator();
                                    if(it.hasNext())
        response.sendRedirect("../main.jsp");
                                    else
                                         response.sendRedirect("../main2.jsp");
                                        
    }
    else  {
        
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            alert(\"Invalid Login.. Try Again.\");\r\n");
      out.write("            window.location=\"../aerial_signup.jsp\";\r\n");
      out.write("        </script>\r\n");
      out.write("        ");

    }                             

      out.write('\r');
      out.write('\n');
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
