package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class congno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("          TZEV.THANH\n");
      out.write("          <!-- <div class=\"logo-image-big\">\n");
      out.write("            <img src=\"../assets/img/logo-big.png\">\n");
      out.write("          </div> -->\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"sidebar-wrapper\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("<!--          <li> \n");
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
      out.write("          </li>-->\n");
      out.write("           <li class=\"active-pro\">\n");
      out.write("            ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          </li>\n");
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
      out.write("            <a class=\"navbar-brand\" href=\"javascript:;\">Quản lý công nợ</a>\n");
      out.write("          </div>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("            <span class=\"navbar-toggler-bar navbar-kebab\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse justify-content-end\" id=\"navigation\">\n");
      out.write("              \n");
      out.write("            <form action=\"congno2?action=search\" class=\"timkiem\" method=\"post\">\n");
      out.write("              <div class=\"input-group no-border\">\n");
      out.write("                <input type=\"text\" class=\"form-control\"   name=\"macongno\"  placeholder=\"mã công nợ\" list=\"macn\"/>\n");
      out.write("                        <datalist id=\"macn\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </datalist>\n");
      out.write("                <input type=\"text\" class=\"form-control\"   name=\"mahoadon\"  placeholder=\"ma hoa don\" list=\"mahd\"/>\n");
      out.write("                <input type=\"submit\" name=\"timkiem\" value=\"tìm kiếm\" class=\"form-control input-field\" style=\"background-color:#3399CC;color: white;\"/>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("              \n");
      out.write("              \n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link btn-rotate\" href=\"javascript:;\" data-toggle=\"modal\" data-target=\"#myModaleadd\">\n");
      out.write("                    <i class=\"nc-icon ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? \"nc-settings\" : \"nc-simple-add\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
      out.write("                <h4 class=\"card-title\">Bảng công nợ </h4>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                <div class=\"table-responsive\">\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                <table class=\"table table-striped table-hover\" style=\"display: block;overflow-x: auto;white-space: nowrap;\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>CHỨC NĂNG</th>\n");
      out.write("                            <th>MÃ CÔNG NỢ</th>\n");
      out.write("                            <th>NGÀY GHI</th>\n");
      out.write("                            <th>MÃ HÓA ĐƠN</th>\n");
      out.write("                            <th>MÃ KHÁCH HÀNG</th>\n");
      out.write("                            <th>MÃ NHÂN VIÊN LẬP</th>\n");
      out.write("                            <th>DIỄN GIẢI</th>\n");
      out.write("                            <th>SỐ TIỀN</th>\n");
      out.write("                            <th>TÀI KHOẢN CÓ</th>\n");
      out.write("                            <th>TÀI KHOẢN NỢ</th>\n");
      out.write("                            <th>VAT</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
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
      out.write("<!--                    <div class=\"hint-text\">Showing <b>5</b> out of <b>25</b> entries</div>-->\n");
      out.write("                    <ul class=\"pagination\">\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag <= 1?\"hidden\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" href=\"congno?index=1\"> << </a></li>\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag <= 1?\"hidden\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" href=\"congno?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listLui}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> < </a></li>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <li class=\"page-item\"> <a class=\"page-link\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag >= andP?\"hidden\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" href=\"congno?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> > </a></li>\n");
      out.write("                        <li class=\"page-item\"> <a class=\"page-link\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag >= andP?\"hidden\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" href=\"congno?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${andP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> >> </a></li>\n");
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
      out.write("    <!-- Modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"myModaleadd\" role=\"dialog\">\n");
      out.write("      <div class=\"modal-dialog modal-lg\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("            <div class=\"section-txt\" align=center>\n");
      out.write("              <h2 style=\"position:relative; right:200px;\">NHANVIEN ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.makh!=null? \"EDIT\" : \"ADD\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h2>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                       <form action=\"congno?action=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.mahd!=null? \"edit\" : \"add\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  method=\"post\" style=\"color:black;padding-left: 90px;padding-right: 90px;\" >\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <label>Mã công nợ</label>\n");
      out.write("                                        <input name=\"macongno\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.macongno : maxID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" readonly  required  >\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <label>Mã hóa đơn</label>\n");
      out.write("                                        <input oninput=\"searchByName(this)\"  name=\"mahoadon\" type=\"text\" list=\"hoadon\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.mahd : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"  required  >\n");
      out.write("                                        <datalist id=\"hoadon\">\n");
      out.write("                                          ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </datalist>\n");
      out.write("                                    \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <label>Mã khách hàng</label>\n");
      out.write("                                        <input name=\"makhachhang\" type=\"text\" list=\"khachhang\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.makh : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" readonly  required  >\n");
      out.write("                                        <datalist id=\"khachhang\">\n");
      out.write("                                          ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </datalist>\n");
      out.write("                                    \n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <label>Mã nhân viên lập</label>\n");
      out.write("                                        <input name=\"manhanvienlap\" type=\"text\" list=\"nhanvien\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.manv :  sessionScope.acc.manv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" readonly  required  >\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Diễn giai</label>\n");
      out.write("                                <textarea name=\"diengiai\" class=\"form-control\" required style=\"height: 100px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.diengiai : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-4\">\n");
      out.write("                                        <label>Số tiền</label>\n");
      out.write("                                        <input name=\"sotien\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.sotien : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" readonly required  onkeypress='validate(event)'/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-4\">\n");
      out.write("                                        <label>Tài khoản có</label>\n");
      out.write("                                        <input name=\"taikhoanco\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.tkco : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"  required  onkeypress='validate(event)'/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"content\" class=\"col-sm-4\">\n");
      out.write("                                        <label>Tài khoản nợ</label>\n");
      out.write("                                        <input name=\"taikhoanno\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.tkno : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" readonly  required  onkeypress='validate(event)'/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <label>Ngày ghi</label>\n");
      out.write("                                        <input name=\"ngayghi\" type=\"date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.date: \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"  required  >\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <label>VAT</label>\n");
      out.write("                                        <select name=\"vat\"  class=\"form-control\" >\n");
      out.write("                                            <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.vat : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? detail.vat : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.macongno!=null? \"%\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                            <option value=\"10\">10%</option>\n");
      out.write("                                            <option value=\"15\">15%</option>\n");
      out.write("                                            <option value=\"20\">20%</option>\n");
      out.write("                                            <option value=\"25\">25%</option>\n");
      out.write("                                            <option value=\"30\">30%</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                             \n");
      out.write("                            <div class=\"form-group btn-submit-add\" style=\"padding-left: 100px; \">\n");
      out.write("                               <input type=\"submit\" class=\"btn \" value=\"SUBMIT\" >\n");
      out.write("                            </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- End Modal -->\n");
      out.write("      \n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("                         function searchByName(param){\n");
      out.write("                            var txtSearch = param.value;\n");
      out.write("                            $.ajax({\n");
      out.write("                                url: \"/CONGNO2/CongNoAjax\",\n");
      out.write("                                type: \"get\", //send it through get method\n");
      out.write("                                data: {\n");
      out.write("                                    txt: maxID\n");
      out.write("                                },\n");
      out.write("                                success: function (data) {\n");
      out.write("                                    var row = document.getElementById(\"content\");\n");
      out.write("                                    row.innerHTML = data;\n");
      out.write("                                },\n");
      out.write("                                error: function (xhr) {\n");
      out.write("                                    //Do Something to handle error\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("</script>\n");
      out.write("      \n");
      out.write("      \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ sessionScope.acc.phanquyen==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                   <li ><a class=\"nav-link js-scroll-trigger\" href=\"nhanvien\"><i class=\"nc-icon nc-badge\"></i> NHÂN VIÊN</a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.phanquyen==2 || sessionScope.acc.phanquyen==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                   <li ><a class=\"nav-link js-scroll-trigger\" href=\"hanghoa\"> <i class=\"nc-icon nc-box-2\"></i> HANG HOA</a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.phanquyen==1 || sessionScope.acc.phanquyen==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                   <li ><a class=\"nav-link js-scroll-trigger \" href=\"khachhang\"><i class=\"nc-icon nc-single-02\"></i> KHACH HANG</a></li>\n");
        out.write("                   <li ><a class=\"nav-link js-scroll-trigger \" href=\"hoadon\"><i class=\"nc-icon nc-single-copy-04\"></i> HOA DON</a></li>\n");
        out.write("                   <li class=\"active \"><a class=\"nav-link js-scroll-trigger \" href=\"congno\"><i class=\"nc-icon nc-bank\"></i> CONG NO</a></li>\n");
        out.write("                   <li ><a class=\"nav-link js-scroll-trigger\" href=\"phieuthu\"><i class=\"nc-icon nc-paper\"></i> PHIEU THU</a></li>\n");
        out.write("                   <li ><a class=\"nav-link js-scroll-trigger \"  href=\"phieuxuat\"><i class=\"nc-icon nc-paper\"></i> PHIEU XUAT</a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ sessionScope.acc.phanquyen==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                   <li ><a class=\"nav-link js-scroll-trigger \" href=\"thongke\"><i class=\"nc-icon nc-chart-pie-36\"></i> THONG KE</a></li><br>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <a class=\"nav-link js-scroll-trigger\" href=\"Loginout\"><i class=\"nc-icon nc-circle-10\"></i>Đăng nhập</a>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <a href=\"Loginout?action=logout\"><i class=\"nc-icon nc-button-power\"></i><p>Đăng xuất</p></a>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.macongno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            ");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <a href=\"congno?edit=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.macongno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" ><i class=\"nc-icon nc-settings\" style=\"font-size: 25px;\" data-toggle=\"modal\"></i></a>\n");
          out.write("                                    <a href=\"congno2?delete=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.macongno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"nc-icon nc-box\"  onclick=\"if(confirm('Bạn có chắc chắn xóa không?')) return true; else return false;\" style=\"font-size: 25px;color:red;\"></i></a>\n");
          out.write("                                </td>\n");
          out.write("        \n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.macongno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.mahd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.makh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                 <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.manv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.diengiai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sotien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tkco}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tkno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.vat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" %</td>\n");
          out.write("\n");
          out.write("                            </tr>\n");
          out.write("                        ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setBegin(1);
    _jspx_th_c_forEach_2.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${andP}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                           <li class=\"page-item\"><a class=\"page-link ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag == i?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"congno?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                        ");
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
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_2);
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
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lhoadon}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("o");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                             <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.mahd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                          ");
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
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lkhachhang}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("o");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                              <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.makh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tenkh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>>\n");
          out.write("                                          ");
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
}
