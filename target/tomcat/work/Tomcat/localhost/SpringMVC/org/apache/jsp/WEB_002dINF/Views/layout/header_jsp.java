/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-27 07:00:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Views.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar - Brand -->\r\n");
      out.write("      <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"\">\r\n");
      out.write("        <!-- <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("          <i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("        </div> -->\r\n");
      out.write("        <!-- <img src=\"img/logo.jpg\" height=\"60px\">  -->\r\n");
      out.write("        <div class=\"sidebar-brand-text mx-3\">Administrator</div>\r\n");
      out.write("      </a>\r\n");
      out.write("\r\n");
      out.write("      <!-- Divider -->\r\n");
      out.write("      <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Nav Item - Dashboard -->\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${urlIndex}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("          <i class=\"fas fa-fw fa-tachometer-alt\"></i>\r\n");
      out.write("          <span>Dashboard</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <!-- Divider -->\r\n");
      out.write("      <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Heading -->\r\n");
      out.write("      <div class=\"sidebar-heading\">\r\n");
      out.write("        Management\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("          \r\n");
      out.write("          <i class=\"fas fa-fw fa-user\"></i>\r\n");
      out.write("          <span>User</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("          <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("            <!-- <h6 class=\"collapse-header\">Custom Components:</h6> -->\r\n");
      out.write("            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${urlShowUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">All user</a>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${urlAddUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">Add new user</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <!-- Nav Item - Utilities Collapse Menu -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("          <i class=\"fas fa-fw fa-box-open\"></i>\r\n");
      out.write("          <span>Merchandise</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("          <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("            <!-- <h6 class=\"collapse-header\">Custom Utilities:</h6> -->\r\n");
      out.write("            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${urlShowMerchandise}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">All merchandise</a>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${urlShowMerchandise_type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">All type of merchandise</a>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${urlShowSupplier}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">All Supplier</a>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"utilities-other.html\">Other</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <!-- Divider -->\r\n");
      out.write("      <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Heading -->\r\n");
      out.write("      <div class=\"sidebar-heading\">\r\n");
      out.write("        Addons\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\" aria-expanded=\"true\" aria-controls=\"collapsePages\">\r\n");
      out.write("          <i class=\"fas fa-fw fa-folder\"></i>\r\n");
      out.write("          <span>Pages</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("          <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("            <h6 class=\"collapse-header\">Login Screens:</h6>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"login.html\">Login</a>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"register.html\">Register</a>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"forgot-password.html\">Forgot Password</a>\r\n");
      out.write("            <div class=\"collapse-divider\"></div>\r\n");
      out.write("            <h6 class=\"collapse-header\">Other Pages:</h6>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"404.html\">404 Page</a>\r\n");
      out.write("            <a class=\"collapse-item\" href=\"blank.html\">Blank Page</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <!-- Nav Item - Charts -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"charts.html\">\r\n");
      out.write("          <i class=\"fas fa-fw fa-chart-area\"></i>\r\n");
      out.write("          <span>Charts</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <!-- Nav Item - Tables -->\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"tables.html\">\r\n");
      out.write("          <i class=\"fas fa-fw fa-table\"></i>\r\n");
      out.write("          <span>Tables</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <!-- Divider -->\r\n");
      out.write("      <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("      <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("        <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- End of Sidebar -->\r\n");
      out.write("    \r\n");
      out.write("        <!-- Content Wrapper -->\r\n");
      out.write("    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Main Content -->\r\n");
      out.write("      <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Topbar -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("          <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("          </button>\r\n");
      out.write("\r\n");
      out.write("          <!-- Topbar Search -->\r\n");
      out.write("          <form class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\r\n");
      out.write("            <div class=\"input-group\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("              <div class=\"input-group-append\">\r\n");
      out.write("                <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                  <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("\r\n");
      out.write("          <!-- Topbar Navbar -->\r\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Search Dropdown (Visible Only XS) -->\r\n");
      out.write("            <li class=\"nav-item dropdown no-arrow d-sm-none\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                <i class=\"fas fa-search fa-fw\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("              <!-- Dropdown - Messages -->\r\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\" aria-labelledby=\"searchDropdown\">\r\n");
      out.write("                <form class=\"form-inline mr-auto w-100 navbar-search\">\r\n");
      out.write("                  <div class=\"input-group\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("                    <div class=\"input-group-append\">\r\n");
      out.write("                      <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                        <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                      </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Alerts -->\r\n");
      out.write("            <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                <i class=\"fas fa-bell fa-fw\"></i>\r\n");
      out.write("                <!-- Counter - Alerts -->\r\n");
      out.write("                <span class=\"badge badge-danger badge-counter\">3+</span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <!-- Dropdown - Alerts -->\r\n");
      out.write("              <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"alertsDropdown\">\r\n");
      out.write("                <h6 class=\"dropdown-header\">\r\n");
      out.write("                  Alerts Center\r\n");
      out.write("                </h6>\r\n");
      out.write("                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                  <div class=\"mr-3\">\r\n");
      out.write("                    <div class=\"icon-circle bg-primary\">\r\n");
      out.write("                      <i class=\"fas fa-file-alt text-white\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div class=\"small text-gray-500\">December 12, 2019</div>\r\n");
      out.write("                    <span class=\"font-weight-bold\">A new monthly report is ready to download!</span>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                  <div class=\"mr-3\">\r\n");
      out.write("                    <div class=\"icon-circle bg-success\">\r\n");
      out.write("                      <i class=\"fas fa-donate text-white\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div class=\"small text-gray-500\">December 7, 2019</div>\r\n");
      out.write("                    $290.29 has been deposited into your account!\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                  <div class=\"mr-3\">\r\n");
      out.write("                    <div class=\"icon-circle bg-warning\">\r\n");
      out.write("                      <i class=\"fas fa-exclamation-triangle text-white\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div class=\"small text-gray-500\">December 2, 2019</div>\r\n");
      out.write("                    Spending Alert: We've noticed unusually high spending for your account.\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Messages -->\r\n");
      out.write("            <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                <i class=\"fas fa-envelope fa-fw\"></i>\r\n");
      out.write("                <!-- Counter - Messages -->\r\n");
      out.write("                <span class=\"badge badge-danger badge-counter\">7</span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <!-- Dropdown - Messages -->\r\n");
      out.write("              <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"messagesDropdown\">\r\n");
      out.write("                <h6 class=\"dropdown-header\">\r\n");
      out.write("                  Message Center\r\n");
      out.write("                </h6>\r\n");
      out.write("                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                  <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                    <img class=\"rounded-circle\" src=\"https://source.unsplash.com/fn_BT9fwg_E/60x60\" alt=\"\">\r\n");
      out.write("                    <div class=\"status-indicator bg-success\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"font-weight-bold\">\r\n");
      out.write("                    <div class=\"text-truncate\">Hi there! I am wondering if you can help me with a problem I've been having.</div>\r\n");
      out.write("                    <div class=\"small text-gray-500\">Emily Fowler Â· 58m</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                  <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                    <img class=\"rounded-circle\" src=\"https://source.unsplash.com/AU4VPcFN4LE/60x60\" alt=\"\">\r\n");
      out.write("                    <div class=\"status-indicator\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div class=\"text-truncate\">I have the photos that you ordered last month, how would you like them sent to you?</div>\r\n");
      out.write("                    <div class=\"small text-gray-500\">Jae Chun Â· 1d</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                  <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                    <img class=\"rounded-circle\" src=\"https://source.unsplash.com/CS2uCrpNzJY/60x60\" alt=\"\">\r\n");
      out.write("                    <div class=\"status-indicator bg-warning\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div class=\"text-truncate\">Last month's report looks great, I am very happy with the progress so far, keep up the good work!</div>\r\n");
      out.write("                    <div class=\"small text-gray-500\">Morgan Alvarez Â· 2d</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                  <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                    <img class=\"rounded-circle\" src=\"https://source.unsplash.com/Mv9hjnEUHR4/60x60\" alt=\"\">\r\n");
      out.write("                    <div class=\"status-indicator bg-success\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <div class=\"text-truncate\">Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</div>\r\n");
      out.write("                    <div class=\"small text-gray-500\">Chicken the Dog Â· 2w</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"topbar-divider d-none d-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - User Information -->\r\n");
      out.write("            <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Valerie Luna</span>\r\n");
      out.write("                <img class=\"img-profile rounded-circle\" src=\"https://source.unsplash.com/QAB-WJcbgJk/60x60\">\r\n");
      out.write("              </a>\r\n");
      out.write("              <!-- Dropdown - User Information -->\r\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                  <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                  Profile\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                  <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                  Settings\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                  <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                  Activity Log\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("                  <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                  Logout\r\n");
      out.write("                </a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("          </ul>\r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- End of Topbar -->\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/Views/layout/header.jsp(2,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/");
    // /WEB-INF/Views/layout/header.jsp(2,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("urlIndex");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/Views/layout/header.jsp(3,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/addUser");
    // /WEB-INF/Views/layout/header.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setVar("urlAddUser");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/Views/layout/header.jsp(4,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/showUser");
    // /WEB-INF/Views/layout/header.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setVar("urlShowUser");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/Views/layout/header.jsp(5,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/showMerchandise");
    // /WEB-INF/Views/layout/header.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setVar("urlShowMerchandise");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/Views/layout/header.jsp(6,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/showMerchandise_type");
    // /WEB-INF/Views/layout/header.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setVar("urlShowMerchandise_type");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/Views/layout/header.jsp(7,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/showSupplier");
    // /WEB-INF/Views/layout/header.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setVar("urlShowSupplier");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }
}
