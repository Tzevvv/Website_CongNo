package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dshop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Resume - Start Bootstrap Theme</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\" />\n");
      out.write("        <!-- Font Awesome icons (free version)-->\n");
      out.write("        <script src=\"https://use.fontawesome.com/releases/v5.15.3/js/all.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Google fonts-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Muli:400,400i,800,800i\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/styles2.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        <!-- Navigation-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary fixed-top\" id=\"sideNav\">\n");
      out.write("            <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">\n");
      out.write("                <span class=\"d-block d-lg-none\">Clarence Taylor</span>\n");
      out.write("                <span class=\"d-none d-lg-block\"><img class=\"img-fluid img-profile rounded-circle mx-auto mb-2\" src=\"assets/img/profile.jpg\" alt=\"...\" /></span>\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"admin-home.jsp\">Home</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link js-scroll-trigger\" href=\"admin-shop\">Shop</a></li>\n");
      out.write("                    <br>\n");
      out.write("                    <li class=\"nav-item active\"><a class=\"nav-link js-scroll-trigger\" href=\"Loginout?action=logout\">Sign out</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Page Content-->\n");
      out.write("        <div class=\"container-fluid p-0\">\n");
      out.write("            <!-- About-->\n");
      out.write("           \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("             <section class=\"resume-section\" >\n");
      out.write("             <div class=\"resume-section-content\">     \n");
      out.write("              <div class=\"table-wrapper\">\n");
      out.write("                <div class=\"table-title\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <h2>Manage <b>Product</b></h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\" >\n");
      out.write("                            <a href=\"#add\"  class=\"btn \" style=\"margin-left: 250px;background-color: #CC3300;;padding:10px;padding-bottom: 15px;color: white\"><i class=\"material-icons\" style=\"position: relative;top:5px;\">&#xE147;</i> <span>Add New Product</span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("<!--                //hiện thị-->\n");
      out.write("                <table class=\"table table-striped table-hover\" style=\"display: block;overflow-x: auto;white-space: nowrap;\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>\n");
      out.write("                            </th>\n");
      out.write("                            <th></th>\n");
      out.write("                            <th>IMG</th>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>PRICE</th>\n");
      out.write("                            <th>SOLUONG</th>\n");
      out.write("                            <th>TRANGTHAI</th>\n");
      out.write("                            <th>REVIEW</th>\n");
      out.write("                            <th>CATEGORIES</th>\n");
      out.write("                            <th>BRANDING</th>\n");
      out.write("                            <th>TAGS</th>\n");
      out.write("                            <th>COLORS</th>\n");
      out.write("                            <th>SIZE</th>\n");
      out.write("                            <th>CONTEN</th>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        \n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("<!--             phân trang-->\n");
      out.write("                <div class=\"clearfix\">\n");
      out.write("                    <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\n");
      out.write("                    <ul class=\"pagination\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag <= 1?\"hidden\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" href=\"admin-shop?index=1\"> << </a></li>\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag <= 1?\"hidden\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" href=\"admin-shop?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listLui}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> < </a></li>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <li class=\"page-item\"> <a class=\"page-link\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag >= andP?\"hidden\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" href=\"admin-shop?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> > </a></li>\n");
      out.write("                        <li class=\"page-item\"> <a class=\"page-link\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag >= andP?\"hidden\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" href=\"admin-shop?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${andP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> >> </a></li>\n");
      out.write("                        \n");
      out.write("                        <style>\n");
      out.write("                            .page-link{\n");
      out.write("                                font-weight: bold;\n");
      out.write("                            }\n");
      out.write("                            .active{\n");
      out.write("                                background-color: #CC3300;\n");
      out.write("                                color: white;\n");
      out.write("                            }\n");
      out.write("                        </style>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                                \n");
      out.write("                 \n");
      out.write("                                \n");
      out.write("                </div>\n");
      out.write("             </section>\n");
      out.write("         \n");
      out.write("                                \n");
      out.write("            <!-- Experience-->\n");
      out.write("            <section class=\"resume-section\" id=\"add\">\n");
      out.write("                <div class=\"resume-section-content\">\n");
      out.write("                    <h2 class=\"mb-5 \" style=\"text-align: center; padding: 0px;\">ADD & EDIT PRODUCT</h2>\n");
      out.write("                    <form action=\"admin-shop?action=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? \"editshopproduct\" : \"addshopproduct\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  method=\"post\" style=\"padding-left: 90px;padding-right: 90px;\" >\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>ID</label>\n");
      out.write("                                <input name=\"id\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detail.pid : maxID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"  readonly required >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <input name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detail.name :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Price</label>\n");
      out.write("                                <input name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detail.price :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Soluong</label>\n");
      out.write("                                <input name=\"soluong\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detail.soluong :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>TrangThai</label>\n");
      out.write("                                <select name=\"trangthai\"  class=\"form-control\" >\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detail.trangthai :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detailselect.trangthai ==0 ?\"Còn hàng\":\"\" or detail.trangthai ==1 ?\"New\":\"\" or detail.trangthai==2?\"Sale\":\"\" or detail.trangthai==3?\"Hết hàng\":\"\" :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                   ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Category</label>\n");
      out.write("                                <select name=\"cate\"  class=\"form-control\" >\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detail.trangthai :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detailselect.cid :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                   ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Brading</label>\n");
      out.write("                                <select name=\"brading\"  class=\"form-control\" >\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detail.bid :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detailselect.bid :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Tag</label>\n");
      out.write("                                <select name=\"tag\"  class=\"form-control\" >\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detail.tid :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detailselect.tid :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Color</label>\n");
      out.write("                                <select name=\"color\"  class=\"form-control\" >\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detail.colorid :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detailselect.colorid :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Size</label>\n");
      out.write("                                <select name=\"size\"  class=\"form-control\" >\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detail.sizeid :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detailselect.sizeid :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Image</label></br>\n");
      out.write("                                <input type=\"file\" name=\"img\" size=\"60\"  />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Conten</label>\n");
      out.write("                                <textarea name=\"conten\" class=\"form-control\" required style=\"height: 100px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid>0? detailselect.conten :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                            </div>\n");
      out.write("                                <br><h5 class=\"mb-5 \" style=\"text-align: left; padding: 0px;\">Thông báo: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtthongbao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                        <div class=\"form-group\" style=\"padding-left: 310px; \">\n");
      out.write("                              <input type=\"submit\" class=\"btn \" value=\"Thêm Mới\" style=\"background-color: #CC3300 ;color: white;width: 200px;padding-bottom: 10px;\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <hr class=\"m-0\" />\n");
      out.write("            <!-- Education-->\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <span class=\"custom-checkbox\">\n");
          out.write("                                        <input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\n");
          out.write("                                        <label for=\"checkbox1\"></label>\n");
          out.write("                                    </span>\n");
          out.write("                                </td>\n");
          out.write("                                \n");
          out.write("                                \n");
          out.write("                                <td>\n");
          out.write("                                    <a href=\"admin-shop?editpid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" & #add\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"edit\">&#xE254;</i></a>\n");
          out.write("                                    <a href=\"admin-shop?deletepid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
          out.write("                                </td>\n");
          out.write("                                <td><img src=\"img/product/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 100px;height: 100px;\" ></td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.soluong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.trangthai ==0 ?\"Còn hàng\":\"\" or o.trangthai ==1 ?\"New\":\"\" or o.trangthai==2?\"Sale\":\"\" or o.trangthai==3?\"Hết hàng\":\"\"  }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.review}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("*</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> b\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.bid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.colorid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sizeid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                <td><textarea>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.conten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</textarea></td>\n");
          out.write("                                \n");
          out.write("                            </tr>\n");
          out.write("                        ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${andP}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                             <li class=\"page-item\"><a class=\"page-link ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag == i?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"admin-shop?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTT}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                     <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ttid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ttname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                   ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("o");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                     <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                   ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listB}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("o");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                     <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.bid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.bname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                   ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTag}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("o");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                     <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tagid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tagname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                   ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listcolor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_6.setVar("o");
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                     <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.colorid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.colorname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                   ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent(null);
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSize}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_7.setVar("o");
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                     <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sizeid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sizename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                   ");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }
}
