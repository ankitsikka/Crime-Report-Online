package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("             ");
      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Law a Society & People Category Flat Bootstrap responsive Website Template | Home :: w3layouts</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Law Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,400,300,600,700|Six+Caps' rel='stylesheet' type='text/css' />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--header-top-starts-->\n");
      out.write("\t<div class=\"header-top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"head-main\">\n");
      out.write("\t\t\t\t<h1><a href=\"index.html\">CRIME REPORT</a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"hea-rgt\">\n");
      out.write("\t\t\t\t<a href=\"#\">File Complaint</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"navigation\">\n");
      out.write("\t\t\t\t <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--/.navbar-header-->\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"practice.html\">Signup</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"practice.html\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--/.navbar-collapse-->\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--header-top-end-->\n");
      out.write("\t<!--start-header-->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t<div class=\"soc\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fb\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"twit\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"pin\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"rss\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"drbl\"> </span></a></li>\n");
      out.write("                                                <!--<div class=\"clearfix\"></div>-->\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t\t\t<div class=\"search-bar\">\n");
      out.write("\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\n");
      out.write("\t<!-- script-for-menu -->\n");
      out.write("\t<!-- script-for-menu -->\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(\"span.menu\").click(function(){\n");
      out.write("\t\t\t\t$(\" ul.navig\").slideToggle(\"slow\" , function(){\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t<!-- script-for-menu -->\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t");
      out.write("\r\n");
      out.write("        <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("                <br/>\r\n");
      out.write("                    <br/>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class =\"container\" >\r\n");
      out.write("        <h1>Hello Admin !</h1>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("    <table width=\"946\"   cellpadding=\"5\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"109\" height=\"140\" align =\"center\"><a href=\"addstate.jsp\"><img src=\"images/Data-Add-Row-icon.png\" alt=\"Add State\" width=\"100\" height=\"100\"></a></td>\r\n");
      out.write("            <td width=\"135\" align =\"center\"><a href=\"addcity.jsp\"><img src=\"images/Files-Add-File-icon.png\" width=\"100\" height=\"100\" alt=\"Add City\"></a></td>\r\n");
      out.write("            <td width=\"136\" align =\"center\"><a href=\"addlocation.jsp\"><img src=\"images/Folders-Add-Folder-icon.png\" width=\"100\" height=\"100\" alt=\"Add Police Station\"></a></td>\r\n");
      out.write("            <td width=\"150\" align =\"center\"><a href=\"adminpanel.jsp\"><img src=\"images/Data-View-Details-icon.png\" width=\"100\" height=\"100\" alt=\"View all complaints\"></a></td>\r\n");
      out.write("            <td width=\"171\" align =\"center\"><a href=\"adminpanel.jsp\"><img src=\"images/Files-View-File-icon.png\" width=\"100\" height=\"100\" alt=\"view all police stations\"></a></td>\r\n");
      out.write("            <td width=\"169\" align =\"center\"><a href=\"changepass.jsp\"><img src=\"images/cngs.png\" width=\"100\" height=\"100\" alt=\"change password\"></a></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align =\"center\"><a href=\"addstate.jsp\">Add State</a></td>\r\n");
      out.write("            <td align =\"center\"><a href=\"addcity.jsp\">Add City</a></td>\r\n");
      out.write("            <td align =\"center\"><a href=\"addlocation.jsp\">Add Police Station</a></td>\r\n");
      out.write("            <td align =\"center\"><a href=\"adminpanel.jsp\">View All Complaints</a></td>\r\n");
      out.write("            <td align =\"center\"><a href=\"adminpanel.jsp\">View All Police Stations</a></td>\r\n");
      out.write("            <td align =\"center\"><a href=\"changepass.jsp\">Change Password</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("        \r\n");
      out.write("            </div>\r\n");
      out.write("                                                <br/>\r\n");
      out.write("                                                <br/>\r\n");
      out.write("                                                <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");
      out.write("<!-- footer-starts -->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-left\">\n");
      out.write("\t\t\t\t<h4>Address</h4>\n");
      out.write("\t\t\t\t\t<div class=\"cont-tp\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\">\n");
      out.write("\t\t\t\t\t</span></div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<address>\n");
      out.write("\t\t\t\t\t\t  Jalandhar<br>\n");
      out.write("\t\t\t\t\t\t  Punjab, India 144001<br>\n");
      out.write("\t\t\t\t\t\t  <abbr title=\"Phone\">P :</abbr> +91-9876543210\n");
      out.write("\t\t\t\t\t\t</address>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-left\">\n");
      out.write("\t\t\t\t<h4>Phone/Fax</h4>\n");
      out.write("\t\t\t\t\t<div class=\"cont-tp\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-phone\" aria-hidden=\"true\">\n");
      out.write("\t\t\t\t\t</span></div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>Phone : +91-9876543210 </p>\n");
      out.write("\t\t\t\t\t<p>Phone : +1234567890 </p>\n");
      out.write("\t\t\t\t\t<p>Fax : +1234567890 </p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-left\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"footer-text\">\n");
      out.write("\t\t\t\t<p>© 2017 Crime Report. All Rights Reserved  </p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- footer-end -->\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
