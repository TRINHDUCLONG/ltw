package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>JSP Page</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n");
      out.write("\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("\t<div class=\"shopping-cart\">\n");
      out.write("\t\t<div class=\"px-4 px-lg-0\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"pb-5\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-12 p-5 bg-white rounded shadow-sm mb-5\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Shopping cart table -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"table-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"p-2 px-3 text-uppercase\">Sản Phẩm</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"py-2 text-uppercase\">Đơn Giá</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"py-2 text-uppercase\">Số Lượng</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"py-2 text-uppercase\">Xóa</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<!-- End -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row py-5 p-4 bg-white rounded shadow-sm\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold\">Thông\n");
      out.write("\t\t\t\t\t\t\t\ttin khách hàng</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"p-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled mb-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"d-flex justify-content-between py-3 border-bottom\"><input\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" type=\"text\" placeholder=\"Họ tên\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"d-flex justify-content-between py-3 border-bottom\"><input\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" type=\"text\" placeholder=\"Email\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"d-flex justify-content-between py-3 border-bottom\"><input\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" type=\"text\" placeholder=\"SDT\"></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"d-flex justify-content-between py-3 border-bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" placeholder=\"Địa chỉ\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"d-flex justify-content-between py-3 border-bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" placeholder=\"key\" id=\"keyCheck\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold\">Thành\n");
      out.write("\t\t\t\t\t\t\t\ttiền</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"p-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"list-unstyled mb-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"d-flex justify-content-between py-3 border-bottom\"><strong\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"text-muted\">Tổng tiền hàng</strong><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"d-flex justify-content-between py-3 border-bottom\"><strong\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"text-muted\">Phí vận chuyển</strong><strong>Free\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tship</strong></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"d-flex justify-content-between py-3 border-bottom\"><strong\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"text-muted\">Tổng thanh toán</strong>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h5 class=\"font-weight-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("₫</h5></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-dark rounded-pill py-2 btn-block order\">Mua\n");
      out.write("\t\t\t\t\t\t\t\t\thàng</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("\t\tintegrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\n");
      out.write("\t\tintegrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\n");
      out.write("\t\tintegrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th scope=\"row\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"p-2\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"70\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"img-fluid rounded shadow-sm\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"ml-3 d-inline-block align-middle\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h5 class=\"mb-0\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"text-dark d-inline-block\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</h5>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-muted font-weight-normal font-italic\"></span>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</th>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"align-middle\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"align-middle\"><a href=\"sub?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"btnSub\">-</button></a> <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong> <a\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"addCart?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button class=\"btnAdd\">+</button></a>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"align-middle\"><a\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\thref=\"removeCart?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"text-dark\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a></td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
