/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-10-12 13:30:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero-image {\r\n");
      out.write("  background-image: url(\"img/banner-9.jpg\");\r\n");
      out.write("  top:30px;\r\n");
      out.write("  background-color: #cccccc;\r\n");
      out.write("  height: 500px;\r\n");
      out.write("  background-position: center;\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("  position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero-text {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  left: 50%;\r\n");
      out.write("  transform: translate(-50%, -50%);\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".logo{\r\n");
      out.write(" \r\n");
      out.write("      position: relative;\r\n");
      out.write("    height:100px;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("    margin-left: 35px;\r\n");
      out.write("    width: 20%;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("header>.container{\r\n");
      out.write("    height: 23vh;\r\n");
      out.write("    background: rgba(0,0,0,0.7);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginButton{\r\n");
      out.write("    float: right;\r\n");
      out.write("    height:5vh;\r\n");
      out.write("    margin: 20px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button{\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    border: 2px solid #ff9d00;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    padding:5px 20px;\r\n");
      out.write("    color: #ff9d00;\r\n");
      out.write("    transition: 0.5s ease;\r\n");
      out.write("}\r\n");
      out.write(".button:hover{\r\n");
      out.write("    background-color:#ff9d00;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height: 7vh;\r\n");
      out.write("    margin-right: 150px;\r\n");
      out.write("    margin-top: 80px;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    float: right;\r\n");
      out.write("    list-style-type: none;  \r\n");
      out.write("}\r\n");
      out.write("ul li.nav{\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul li.nav a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    padding: 4px 30px;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    transition: 0.5s ease;\r\n");
      out.write("}    \r\n");
      out.write("\r\n");
      out.write("ul li.nav a:hover{\r\n");
      out.write("    background-color:#ff9d00;\r\n");
      out.write("    color:#fff;\r\n");
      out.write("}\r\n");
      out.write("ul li .active {\r\n");
      out.write("    background-color: #ff9d00;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".contents{\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navigationBar{\r\n");
      out.write("	background: #aeb6bf;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}	\r\n");
      out.write(".navigationBar{\r\n");
      out.write("	background: #aeb6bf;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}	\r\n");
      out.write("	\r\n");
      out.write("nav{\r\n");
      out.write("    flex: 1;\r\n");
      out.write("    text-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav ul{\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav ul li{\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    margin-right: 20px;\r\n");
      out.write("	font-family: 'Montserrat', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a{\r\n");
      out.write("   text-decoration: none;\r\n");
      out.write("   color: #000000;\r\n");
      out.write("}\r\n");
      out.write("p{\r\n");
      out.write("   color: #000000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footerContent{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    background:rgba(71, 71, 71, 0.589);\r\n");
      out.write("    height: 160px;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write(".socialTags{\r\n");
      out.write("\r\n");
      out.write("    margin: 50px 530px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("}\r\n");
      out.write(".socialmedia a{\r\n");
      out.write("    display: inline-block;    \r\n");
      out.write("    height: 45px;\r\n");
      out.write("    width: 45px;\r\n");
      out.write("    background-color: rgba(15, 14, 14, 0.719);\r\n");
      out.write("    margin: 30px 20px 20px 0;\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    line-height:30px;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    transition: all 0.5s ease;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write(".socialmedia a i{\r\n");
      out.write("    margin: 15px;\r\n");
      out.write("    color:#ffffff;\r\n");
      out.write("}\r\n");
      out.write(".socialmedia a:hover{\r\n");
      out.write("    color:#ffffff;\r\n");
      out.write("    background-color:#ff9d00;\r\n");
      out.write("}\r\n");
      out.write(".footer-about{\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write(".contact{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top:-30px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    margin-left: 70px;\r\n");
      out.write("    color:0000000;\r\n");
      out.write("}\r\n");
      out.write("h4{\r\n");
      out.write("    font-family: 'Segoe UI', Tahoma, Verdana, sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".text{\r\n");
      out.write("    font-family: 'Segoe UI', Tahoma, Verdana, sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".footerBottom{\r\n");
      out.write("    color: #F1C40F;\r\n");
      out.write("    background-color: black;\r\n");
      out.write("    font-size:12.5px;\r\n");
      out.write("    text-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("        <title>Vistit Lanka Online Tour Guied</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"> \r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\r\n");
      out.write("    </head>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" <header>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"loginButton\">\r\n");
      out.write("                    <a href=\"login.jsp\" class=\"button\">Login</a>\r\n");
      out.write("                    <a href=\"register.html\" class=\"button\">Register</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                    <img class=\"logo\" src=\"img/logonew.jpg\">\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"menu\">\r\n");
      out.write("                    <li class=\"nav\"><a class=\"active\" href=\"#\">Home</a></li>\r\n");
      out.write("                    <li class=\"nav\"><a href=\"admLogin.jsp\">Admin</a></li>\r\n");
      out.write("                    <li class=\"nav\"><a href=\"login.jsp\">Packages</a></li>\r\n");
      out.write("                    <li class=\"nav\"><a href=\"AgentLogin.jsp\">Agent</a></li>\r\n");
      out.write("              \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("<div class=\"hero-image\">\r\n");
      out.write("  <div class=\"hero-text\">\r\n");
      out.write("    <h1 style=\"font-size:50px\">Visit Sri Lanka</h1>\r\n");
      out.write("    <h3>Welcome to VisitLanka.com</h3>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <footer>\r\n");
      out.write("          <div class=\"footerContent\">\r\n");
      out.write("            <div class=\"socialTags\">\r\n");
      out.write("                <div class=\"socialmedia\">\r\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-about\">\r\n");
      out.write("                <div class=\"contact\">\r\n");
      out.write("                    <h4>Contact Us</h4>\r\n");
      out.write("                    <div class=\"phone\">\r\n");
      out.write("                        <span class=\"fas fa-phone\"></span>\r\n");
      out.write("                        <span class=\"text\">+94 71 258 8935</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"email\">\r\n");
      out.write("                        <span class=\"fas fa-envelope\"></span>\r\n");
      out.write("                        <span class=\"text\">vistlanka99@gmail.com</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"footerBottom\">\r\n");
      out.write("                &copy; UMawards.com (All Rights Reserved) | Designed by MLB02.01.09 team\r\n");
      out.write("            </div>    \r\n");
      out.write("          </div> \r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}