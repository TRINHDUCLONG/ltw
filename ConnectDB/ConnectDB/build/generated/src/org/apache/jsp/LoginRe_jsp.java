package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginRe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"js/LoginRe.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/LoginRe.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   <div class=\"container right-panel-active\">\n");
      out.write("\t<!-- Sign Up -->\n");
      out.write("\t<div class=\"container__form container--signup\">\n");
      out.write("\t\t<form action=\"#\" class=\"form\" id=\"form1\">\n");
      out.write("\t\t\t<h2 class=\"form__title\">Sign Up</h2>\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"User\" class=\"input\" />\n");
      out.write("\t\t\t<input type=\"email\" placeholder=\"Email\" class=\"input\" />\n");
      out.write("\t\t\t<input type=\"password\" placeholder=\"Password\" class=\"input\" />\n");
      out.write("\t\t\t<button class=\"btn\">Sign Up</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Sign In -->\n");
      out.write("\t<div class=\"container__form container--signin\">\n");
      out.write("\t\t<form action=\"#\" class=\"form\" id=\"form2\">\n");
      out.write("\t\t\t<h2 class=\"form__title\">Sign In</h2>\n");
      out.write("\t\t\t<input type=\"email\" placeholder=\"Email\" class=\"input\" />\n");
      out.write("\t\t\t<input type=\"password\" placeholder=\"Password\" class=\"input\" />\n");
      out.write("\t\t\t<a href=\"#\" class=\"link\">Forgot your password?</a>\n");
      out.write("\t\t\t<button class=\"btn\">Sign In</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Overlay -->\n");
      out.write("\t<div class=\"container__overlay\">\n");
      out.write("\t\t<div class=\"overlay\">\n");
      out.write("\t\t\t<div class=\"overlay__panel overlay--left\">\n");
      out.write("\t\t\t\t<button class=\"btn\" id=\"signIn\">Sign In</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"overlay__panel overlay--right\">\n");
      out.write("\t\t\t\t<button class=\"btn\" id=\"signUp\">Sign Up</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
