package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!-- Footer-->\n");
      out.write("        <footer class=\"footer text-center\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Footer Location-->\n");
      out.write("                    <div class=\"col-lg-4 mb-5 mb-lg-0\">\n");
      out.write("                        <h4 class=\"text-uppercase mb-4\">Location</h4>\n");
      out.write("                        <p class=\"lead mb-0\">\n");
      out.write("                            2215 John Daniel Drive\n");
      out.write("                            <br />\n");
      out.write("                            Clark, MO 65243\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Footer Social Icons-->\n");
      out.write("                    <div class=\"col-lg-4 mb-5 mb-lg-0\">\n");
      out.write("                        <h4 class=\"text-uppercase mb-4\">Around the Web</h4>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i class=\"fab fa-fw fa-facebook-f\"></i></a>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i class=\"fab fa-fw fa-twitter\"></i></a>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i class=\"fab fa-fw fa-linkedin-in\"></i></a>\n");
      out.write("                        <a class=\"btn btn-outline-light btn-social mx-1\" href=\"#!\"><i class=\"fab fa-fw fa-dribbble\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Footer About Text-->\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <h4 class=\"text-uppercase mb-4\">About Freelancer</h4>\n");
      out.write("                        <p class=\"lead mb-0\">\n");
      out.write("                            Freelance is a free to use, MIT licensed Bootstrap theme created by\n");
      out.write("                            <a href=\"http://startbootstrap.com\">Start Bootstrap</a>\n");
      out.write("                            .\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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
