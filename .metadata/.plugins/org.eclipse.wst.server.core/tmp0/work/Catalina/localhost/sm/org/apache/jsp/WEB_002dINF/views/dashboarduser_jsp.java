/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-10-17 16:01:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import entities.AllCourses;
import entities.SmSignUp;
import java.util.List;

public final class dashboarduser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("entities.AllCourses");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("entities.SmSignUp");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

    SmSignUp data = (SmSignUp) session.getAttribute("data");
 List<AllCourses> list=(List<AllCourses>) session.getAttribute("cource");
 System.out.print(list);
     if(data==null) {
      out.write("\r\n");
      out.write("    ");
      if (true) {
        _jspx_page_context.forward("/login-sm");
        return;
      }
      out.write(" \r\n");
      out.write("     ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Student Dashboard</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Basic CSS styles */\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-color: #f4f4f4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            max-width: 1200px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dashboard {\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile img {\r\n");
      out.write("            width: 80px;\r\n");
      out.write("            height: 80px;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            margin-right: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .profile-info {\r\n");
      out.write("            flex-grow: 1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .courses {\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .course {\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .logout-btn {\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            background-color: #ff4d4d;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            transition: background-color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .logout-btn:hover {\r\n");
      out.write("            background-color: #e60000;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write("        <div class=\"dashboard\">\r\n");
      out.write("            <div class=\"profile\">\r\n");
      out.write("                <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhmsLNKvHCGfEIVp_EHilrMquqemRKtV7m5CT4CqXPxg&s\" alt=\"Profile Picture\">\r\n");
      out.write("                <div class=\"profile-info\">\r\n");
      out.write("                    <h2>ID: ");
      out.print(data.getId() );
      out.write("</h2> \r\n");
      out.write("                    <h2>Full Name:");
      out.print(data.getFname()+" "+data.getLname() );
      out.write(" </h2>\r\n");
      out.write("                    <p>Email: ");
      out.print(data.getEmail() );
      out.write("</p>\r\n");
      out.write("                    <p>Number: ");
      out.print(data.getMob() );
      out.write("\r\n");
      out.write("                    <p>Register date:");
      out.print(data.getCreatedAt() );
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            ");
if(list==null){
      out.write("\r\n");
      out.write("            	<div class=\"courses\">\r\n");
      out.write("                <h3>No Purchased Courses</h3>	\r\n");
      out.write("            	\r\n");
      out.write("           ");
 } else{
      out.write("\r\n");
      out.write("           \r\n");
      out.write("             ");
 for(AllCourses ac:list) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("          	   <div class=\"courses\">\r\n");
      out.write("                 <h3>Your Purchased Courses</h3>\r\n");
      out.write("                 <div class=\"course\">\r\n");
      out.write("                     <h4>Course Name : ");
      out.print(ac.getcName() );
      out.write("</h4>\r\n");
      out.write("                     <p>Description of Course: ");
      out.print(ac.getcDescription() );
      out.write("</p>\r\n");
      out.write("                     <p>Price: ");
      out.print(ac.getPrice() );
      out.write("</p>\r\n");
      out.write("                 <a href=\"watch-course\"><button class=\"logout-btn\">Watch</button></a>\r\n");
      out.write("            	 \r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("             \r\n");
      out.write("           </div>\r\n");
      out.write("        	   \r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("             </div> 	\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("                 \r\n");
      out.write("           <a href=\"logout\"><button class=\"logout-btn\">Logout</button></a>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
