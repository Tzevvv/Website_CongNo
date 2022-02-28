package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminSanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"../assets/img/favicon.png\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("  <title>\n");
      out.write("    TZEV-THANH\n");
      out.write("  </title>\n");
      out.write("  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("  <!--     Fonts and icons     -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- CSS Files -->\n");
      out.write("  <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"assets/css/paper-dashboard.css?v=2.0.1\" rel=\"stylesheet\" />\n");
      out.write("  <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("  <link href=\"assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body >\n");
      out.write("  <div class=\"wrapper \">\n");
      out.write("    <div class=\"sidebar\" data-color=\"white\" data-active-color=\"danger\">\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <a href=\"https://www.creative-tim.com\" class=\"simple-text logo-mini\">\n");
      out.write("          <div class=\"logo-image-small\">\n");
      out.write("            <img src=\"assets/img/logo-small.png\">\n");
      out.write("          </div>\n");
      out.write("          <!-- <p>CT</p> -->\n");
      out.write("        </a>\n");
      out.write("        <a href=\"https://www.creative-tim.com\" class=\"simple-text logo-normal\">\n");
      out.write("          TZEV.THANH.ADMIN\n");
      out.write("          <!-- <div class=\"logo-image-big\">\n");
      out.write("            <img src=\"../assets/img/logo-big.png\">\n");
      out.write("          </div> -->\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"sidebar-wrapper\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("            \n");
      out.write("          <li> \n");
      out.write("            <a href=\"./thongke.jsp\">\n");
      out.write("              <i class=\"nc-icon nc-bank\"></i>\n");
      out.write("              <p>Home</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"active \">\n");
      out.write("            <a href=\"./adminSanpham\">\n");
      out.write("              <i class=\"nc-icon nc-box-2\"></i>\n");
      out.write("              <p>Sản phẩm</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("           <li class=\"active-pro\">\n");
      out.write("            <a href=\"./shop\">\n");
      out.write("              <i class=\"nc-icon nc-button-power\"></i>\n");
      out.write("              <p>Out</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("      <!-- Navbar -->\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-absolute fixed-top navbar-transparent\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"navbar-wrapper\">\n");
      out.write("            <div class=\"navbar-toggle\">\n");
      out.write("              <button type=\"button\" class=\"navbar-toggler\">\n");
      out.write("                <span class=\"navbar-toggler-bar bar1\"></span>\n");
      out.write("                <span class=\"navbar-toggler-bar bar2\"></span>\n");
      out.write("                <span class=\"navbar-toggler-bar bar3\"></span>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"navbar-brand\" href=\"javascript:;\">Quản lý sản phẩm</a>\n");
      out.write("          </div>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse justify-content-end\" id=\"navigation\">\n");
      out.write("            <form>\n");
      out.write("              <div class=\"input-group no-border\">\n");
      out.write("                <input type=\"text\" value=\"\" class=\"form-control\" placeholder=\"Tìm kiếm sản phẩm...\">\n");
      out.write("                <div class=\"input-group-append\">\n");
      out.write("                  <div class=\"input-group-text\">\n");
      out.write("                    <i class=\"nc-icon nc-zoom-split\"></i>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link btn-rotate\" href=\"javascript:;\" data-toggle=\"modal\" data-target=\"#myModaleadd\">\n");
      out.write("                    <i class=\"nc-icon ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? \"nc-settings\" : \"nc-simple-add\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"font-size: 25px;margin-left:10px;color: #FF9500;\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <!-- End Navbar -->\n");
      out.write("      <div class=\"content\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <div class=\"card-header\">\n");
      out.write("                <h4 class=\"card-title\">Bảng sản phẩm </h4>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"table-responsive\">\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                <table class=\"table table-striped table-hover\" style=\"display: block;overflow-x: auto;white-space: nowrap;\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            \n");
      out.write("                            <th></th>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>NGÀY LẬP</th>\n");
      out.write("                            <th>NAME</th>\n");
      out.write("                            <th>TIỀN HÀNG</th>\n");
      out.write("                            <th>SOLUONG</th>\n");
      out.write("                            <th>TRẠNG THÁI</th>\n");
      out.write("                            <th>CATEGORIES</th>\n");
      out.write("                            <th>BRANDING</th>\n");
      out.write("                            <th>TAGS</th>\n");
      out.write("                            <th>COLORS</th>\n");
      out.write("                            <th>SIZE</th>\n");
      out.write("                            <th>CONTEN</th>\n");
      out.write("                            <th>REVIEW</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"clearfix\">\n");
      out.write("                    <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>\n");
      out.write("                    <ul class=\"pagination\">\n");
      out.write("                        \n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag <= 1?\"hidden\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" href=\"adminSanpham?index=1\"> << </a></li>\n");
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
      out.write(" href=\"adminSanpham?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> > </a></li>\n");
      out.write("                        <li class=\"page-item\"> <a class=\"page-link\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag >= andP?\"hidden\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" href=\"adminSanpham?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${andP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> >> </a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("           </div>\n");
      out.write("      </div>\n");
      out.write("                \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <!-- Modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"myModaleadd\" role=\"dialog\">\n");
      out.write("      <div class=\"modal-dialog modal-lg\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <div class=\"section-txt\" align=center>\n");
      out.write("              <h2 style=\"text-align: center;\">Sản phẩm  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? \"edit\" : \"add\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h2>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                <form action=\"adminSanpham?action=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? \"edit\" : \"add\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  method=\"post\" >\n");
      out.write("                       \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                   <div class=\"col-sm-6\">\n");
      out.write("                                      <label>Mã hàng</label>\n");
      out.write("                                      <input name=\"id\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.pid : maxID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"  readonly required >\n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"col-sm-6\">\n");
      out.write("                                      <label>Tên hàng</label>\n");
      out.write("                                      <input name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.name :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                   <div class=\"col-sm-6\">\n");
      out.write("                                      <label>Tiền hàng</label>\n");
      out.write("                                      <input name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.tienhang :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"col-sm-6\">\n");
      out.write("                                      <label>Số lượng</label>\n");
      out.write("                                      <input name=\"soluong\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.soluong :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Ngày lập</label>\n");
      out.write("                                <input name=\"ngaylap\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.ngaylap :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"date\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                   <div class=\"col-sm-4\">\n");
      out.write("                                      <label>TrangThai</label>\n");
      out.write("                                      <select name=\"trangthai\"  class=\"form-control\" >\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.trangthai :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.ttname ==0 ?\"Còn hàng\":\"\" or detail.ttname ==1 ?\"New\":\"\" or detail.ttname==2?\"Sale\":\"\" or detail.ttname==3?\"Hết hàng\":\"\" :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                      </select>\n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"col-sm-4\">\n");
      out.write("                                      <label>Loại hàng</label>\n");
      out.write("                                      <select name=\"cate\"  class=\"form-control\" >\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.cid :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.cname :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                      </select>\n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"col-sm-4\">\n");
      out.write("                                      <label>Brading</label>\n");
      out.write("                                      <select name=\"brading\"  class=\"form-control\" >\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.bid :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.bname :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                      </select>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                   <div class=\"col-sm-4\">\n");
      out.write("                                    <label>Tag</label>\n");
      out.write("                                    <select name=\"tag\"  class=\"form-control\" >\n");
      out.write("                                       <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.tid :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.tname :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                       ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"col-sm-4\">\n");
      out.write("                                    <label>Color</label>\n");
      out.write("                                    <select name=\"color\"  class=\"form-control\" >\n");
      out.write("                                       <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.colorid :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.colorname :\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                       ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"col-sm-4\">\n");
      out.write("                                      <label>Size</label>\n");
      out.write("                                      <select name=\"size\"  class=\"form-control\" >\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.sizeid :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.sizename:\"--Choose--\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                      </select>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Conten</label>\n");
      out.write("                                <textarea name=\"conten\" class=\"form-control\" required >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.conten :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"file-upload\">\n");
      out.write("                                <div class=\"image-upload-wrap\">\n");
      out.write("                                    <input class=\"file-upload-input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.pid!=null? detail.img :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"img\" type='file' onchange=\"readURL(this);\" accept=\"image/*\" />\n");
      out.write("                                    <div class=\"drag-text\">\n");
      out.write("                                       <h3>Vui lòng up ảnh tại đây !</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"file-upload-content\">\n");
      out.write("                                   <img class=\"file-upload-image\" src=\"#\" alt=\"your image\" />\n");
      out.write("                                   <div class=\"image-title-wrap\">\n");
      out.write("                                      <button type=\"button\" onclick=\"removeUpload()\" class=\"remove-image\">Remove <span class=\"image-title\">Uploaded Image</span></button>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            <div class=\"form-group btn-submit-add\" >\n");
      out.write("                               <input type=\"submit\" class=\"file-upload-btn\" value=\"SUBMIT\" >\n");
      out.write("                            </div>    \n");
      out.write("                </form>\n");
      out.write("<style>\n");
      out.write(".file-upload {\n");
      out.write("  background-color: #ffffff;\n");
      out.write("  width: 600px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".file-upload-btn {\n");
      out.write("  width: 100%;\n");
      out.write("  margin: 0;\n");
      out.write("  color: #fff;\n");
      out.write("  background: #1FB264;\n");
      out.write("  border: none;\n");
      out.write("  padding: 10px;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  border-bottom: 4px solid #15824B;\n");
      out.write("  transition: all .2s ease;\n");
      out.write("  outline: none;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  font-weight: 700;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".file-upload-btn:hover {\n");
      out.write("  background: #1AA059;\n");
      out.write("  color: #ffffff;\n");
      out.write("  transition: all .2s ease;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".file-upload-btn:active {\n");
      out.write("  border: 0;\n");
      out.write("  transition: all .2s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".file-upload-content {\n");
      out.write("  display: none;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".file-upload-input {\n");
      out.write("  position: absolute;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("  outline: none;\n");
      out.write("  opacity: 0;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".image-upload-wrap {\n");
      out.write("  margin-top: 20px;\n");
      out.write("  border: 4px dashed #1FB264;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".image-dropping,\n");
      out.write(".image-upload-wrap:hover {\n");
      out.write("  background-color: #1FB264;\n");
      out.write("  border: 4px dashed #ffffff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".image-title-wrap {\n");
      out.write("  padding: 0 15px 15px 15px;\n");
      out.write("  color: #222;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".drag-text {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".drag-text h3 {\n");
      out.write("  font-weight: 100;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  color: #15824B;\n");
      out.write("  padding: 60px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".file-upload-image {\n");
      out.write("  max-height: 300px;\n");
      out.write("  max-width: 300px;\n");
      out.write("  margin: auto;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".remove-image {\n");
      out.write("  width: 200px;\n");
      out.write("  margin: 0;\n");
      out.write("  color: #fff;\n");
      out.write("  background: #cd4535;\n");
      out.write("  border: none;\n");
      out.write("  padding: 10px;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  border-bottom: 4px solid #b02818;\n");
      out.write("  transition: all .2s ease;\n");
      out.write("  outline: none;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  font-weight: 700;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".remove-image:hover {\n");
      out.write("  background: #c13b2a;\n");
      out.write("  color: #ffffff;\n");
      out.write("  transition: all .2s ease;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".remove-image:active {\n");
      out.write("  border: 0;\n");
      out.write("  transition: all .2s ease;\n");
      out.write("}\n");
      out.write("</style>                          \n");
      out.write("<script>\n");
      out.write("\n");
      out.write("function readURL(input) {\n");
      out.write("  if (input.files && input.files[0]) {\n");
      out.write("\n");
      out.write("    var reader = new FileReader();\n");
      out.write("\n");
      out.write("    reader.onload = function(e) {\n");
      out.write("      $('.image-upload-wrap').hide();\n");
      out.write("\n");
      out.write("      $('.file-upload-image').attr('src', e.target.result);\n");
      out.write("      $('.file-upload-content').show();\n");
      out.write("\n");
      out.write("      $('.image-title').html(input.files[0].name);\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    reader.readAsDataURL(input.files[0]);\n");
      out.write("\n");
      out.write("  } else {\n");
      out.write("    removeUpload();\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function removeUpload() {\n");
      out.write("  $('.file-upload-input').replaceWith($('.file-upload-input').clone());\n");
      out.write("  $('.file-upload-content').hide();\n");
      out.write("  $('.image-upload-wrap').show();\n");
      out.write("}\n");
      out.write("$('.image-upload-wrap').bind('dragover', function () {\n");
      out.write("    $('.image-upload-wrap').addClass('image-dropping');\n");
      out.write("  });\n");
      out.write("  $('.image-upload-wrap').bind('dragleave', function () {\n");
      out.write("    $('.image-upload-wrap').removeClass('image-dropping');\n");
      out.write("    \n");
      out.write("});\n");
      out.write("</script>            \n");
      out.write("\n");
      out.write("      \n");
      out.write("      <footer class=\"footer footer-black  footer-white \">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <nav class=\"footer-nav\">\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"https://www.creative-tim.com\" target=\"_blank\">Creative Tim</a></li>\n");
      out.write("                <li><a href=\"https://www.creative-tim.com/blog\" target=\"_blank\">Blog</a></li>\n");
      out.write("                <li><a href=\"https://www.creative-tim.com/license\" target=\"_blank\">Licenses</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"credits ml-auto\">\n");
      out.write("              <span class=\"copyright\">\n");
      out.write("                © <script>\n");
      out.write("\n");
      out.write("                  document.write(new Date().getFullYear())\n");
      out.write("                </script>, made with <i class=\"fa fa-heart heart\"></i> by Creative Tim\n");
      out.write("              </span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!--   Core JS Files   -->\n");
      out.write("  <script src=\"assets/js/core/jquery.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/core/popper.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("  <!--  Google Maps Plugin    -->\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("  <!-- Chart JS -->\n");
      out.write("  <script src=\"assets/js/plugins/chartjs.min.js\"></script>\n");
      out.write("  <!--  Notifications Plugin    -->\n");
      out.write("  <script src=\"assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("  <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("  <script src=\"assets/js/paper-dashboard.min.js?v=2.0.1\" type=\"text/javascript\"></script><!-- Paper Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("  <script src=\"assets/demo/demo.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
          out.write("                                    <a href=\"adminSanpham?edit=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" ><i class=\"nc-icon nc-settings\" style=\"font-size: 25px;\" data-toggle=\"modal\"></i></a>\n");
          out.write("                                    <a href=\"adminSanpham2?delete=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"nc-icon nc-box\"  onclick=\"if(confirm('Bạn có chắc chắn xóa không?')) return true; else return false;\" style=\"font-size: 25px;color:red;\"></i></a>\n");
          out.write("                                </td>\n");
          out.write("        \n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ngaylap}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tienhang}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" vnd</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.soluong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.trangthai ==0 ?\"Còn hàng\":\"\" or o.trangthai ==1 ?\"New\":\"\" or o.trangthai==2?\"Sale\":\"\" or o.trangthai==3?\"Hết hàng\":\"\"  }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
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
          out.write("                                <td><textarea class=\"form-control\" style=\"width:200px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.conten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</textarea></td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.review}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("*</td>\n");
          out.write("\n");
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
          out.write("\" href=\"adminSanpham?index=");
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
          out.write("                                          <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ttid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.ttname ==0 ?\"Còn hàng\":\"\" or o.ttname ==1 ?\"New\":\"\" or o.ttname==2?\"Sale\":\"\" or o.ttname==3?\"Hết hàng\":\"\"  }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
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
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("o");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                          <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
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
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listBra}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("o");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                          <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.bid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.bname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
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
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tagid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tagname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                       ");
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
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.colorid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.colorname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                       ");
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
          out.write("                                         <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sizeid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sizename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
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
