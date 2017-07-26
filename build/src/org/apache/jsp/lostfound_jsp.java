package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.io.File;
import java.sql.*;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.util.*;

public final class lostfound_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("         ");
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
      out.write("\t<div class =\"container\" >\r\n");
      out.write("      <form name=\"form1\" id=\"form1\" method=\"post\" action=\"\">\r\n");
      out.write("          <h1>Lost And Found Report</h1>\r\n");
      out.write("          <p>&nbsp;</p>\r\n");
      out.write("        <p>Type(Lost/Found)&nbsp;\r\n");
      out.write("          <label for=\"type\"></label>\r\n");
      out.write("           <input type=\"text\" name=\"type\" id=\"type\" required>\r\n");
      out.write("            </p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("          <table width=\"891\"  cellspacing=\"5\" cellpadding=\"5\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td> <p>Name</p>\r\n");
      out.write("              <p>\r\n");
      out.write("                <label for=\"name\"></label>\r\n");
      out.write("                <input type=\"text\" name=\"name\" id=\"name\" required>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("              <td><p>Father's/Mother's Name</p>\r\n");
      out.write("              <p>\r\n");
      out.write("                <label for=\"fmname\"></label>\r\n");
      out.write("                <input type=\"text\" name=\"fmname\" id=\"fmname\" required>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td> <p>Address</p>\r\n");
      out.write("              <p>\r\n");
      out.write("                <label for=\"address\"></label>\r\n");
      out.write("                <input type=\"text\" name=\"address\" id=\"address\" required>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("              <td><p>Mobile No.</p>\r\n");
      out.write("              <p>\r\n");
      out.write("                <label for=\"phone\"></label>\r\n");
      out.write("                <input type=\"text\" name=\"phone\" id=\"phone\" required onKeyPress=\"return abc(event)\" maxlength=\"10\">\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td> <p>Email ID</p>\r\n");
      out.write("              <p>\r\n");
      out.write("                <label for=\"email\"></label>\r\n");
      out.write("                <input type=\"text\" name=\"email\" id=\"email\" required>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("              <td><p>Place of Loss/Found </p>\r\n");
      out.write("              <p>\r\n");
      out.write("                <label for=\"place\"></label>\r\n");
      out.write("                <input type=\"text\" name=\"place\" id=\"place\" required>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td><p>Identity Proof</p>\r\n");
      out.write("              <p>\r\n");
      out.write("                <label for=\"idproof\"></label>\r\n");
      out.write("                <input type=\"text\" name=\"idproof\" id=\"idproof\" required>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("              <td><p>ID Number</p>\r\n");
      out.write("              <p>\r\n");
      out.write("                <label for=\"idnumber\"></label>\r\n");
      out.write("                <input type=\"text\" name=\"idnumber\" id=\"idnumber\" required>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td><p>Date of Loss/Found(yyyy-MM-dd)</p>\r\n");
      out.write("                <p>\r\n");
      out.write("                  <label for=\"date\"></label>\r\n");
      out.write("                  <input type=\"text\" name=\"date\" id=\"date\" required>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("              <td><p>Time of Loss/Found(HH:MM)</p>\r\n");
      out.write("                <p>\r\n");
      out.write("                  <label for=\"time\"></label>\r\n");
      out.write("                  <input type=\"text\" name=\"time\" id=\"time\" required>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td ><p>Lost/Found Article</p>\r\n");
      out.write("                <p>\r\n");
      out.write("                  <label for=\"article\"></label>\r\n");
      out.write("                  <input type=\"text\" name=\"article\" id=\"article\" required>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>State</p>\r\n");
      out.write("                <p>\r\n");
      out.write("                  <label for=\"state\"></label>\r\n");
      out.write("                  <select name=\"state\" size=\"1\" id=\"state\">\r\n");
      out.write("                    <option>Choose State</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </p>\r\n");
      out.write("              <p></p></td>\r\n");
      out.write("              <td ><p>Description</p>\r\n");
      out.write("                <p>\r\n");
      out.write("                  <label for=\"description\"></label>\r\n");
      out.write("                  <input type=\"text\" name=\"description\" id=\"description\" required>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("              <p></p></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td valign=\"top\"><p> City            </p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("              <p>\r\n");
      out.write("                <label for=\"city\"></label>\r\n");
      out.write("                <select name=\"city\" id=\"city\" required>\r\n");
      out.write("                  <option>Choose City</option>\r\n");
      out.write("                   ");

               String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                  
                  try
                  {
                      Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q="select * from citytable";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          ResultSet myresult=mystatement.executeQuery();
                          if(myresult.next())
                          {
                              do
                              {
                                out.println("<option value=" + myresult.getString("cityid") + ">" + myresult.getString("cityname") +"</option>");
                              }
                              while(myresult.next());
                                 
                          }
                          else
                          {
                              out.println("no city available");
                          }
                          
                      }
                      catch(Exception e)
                      {
                          out.println("error in query" + e.getMessage());
                      }
                      finally
                      {
                          myconnection.close();
                      }
                  }
                  catch(Exception e)
                  {
                      out.println("Error in Connection " + e.getMessage());
                  }  
              
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("              </p></td>\r\n");
      out.write("              <td valign=\"top\"><p>Division Number</p>\r\n");
      out.write("                  \r\n");
      out.write("              <p>\r\n");
      out.write("                <label for=\"location\"></label>\r\n");
      out.write("                <div id=\"selectbox1\">\r\n");
      out.write("                <select name=\"location\" id=\"location\" required>\r\n");
      out.write("                  <option>Choose Division No.</option>\r\n");
      out.write("                </select>\r\n");
      out.write("              </div>\r\n");
      out.write("              </p>\r\n");
      out.write("              <p>&nbsp;</p></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td align=\"center\"><input type=\"submit\" name=\"Submit\" id=\"Submit\" value=\"Submit\"></td>\r\n");
      out.write("              <td align=\"center\"><input type=\"reset\" name=\"reset\" id=\"reset\" value=\"Reset\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"center\">&nbsp;</td>\r\n");
      out.write("              \r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td align=\"center\">");

                  if(request.getParameter("Submit")!= null)
                  {
                      java.util.Date cdate1=new java.util.Date();
                 SimpleDateFormat myformat1=new SimpleDateFormat("yyyy-MM-dd");
        String date=(myformat1.format(cdate1));
                     
  try
                  {
                       Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q="INSERT INTO `lostfound`(`username`, `status`,  `name`, `fmname`, `address`, `phone`, `email`, `place`, `idproof`, `idno`, `date`, `time`, `article`, `description`,`dateofreg`,`type`,`city`,`location`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                           PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1,String.valueOf(session.getAttribute("cuname")) );                      
                          mystatement.setString(2, "Pending");                      
                          mystatement.setString(3, request.getParameter("name"));                      
                          mystatement.setString(4, request.getParameter("fmname"));                      
                          mystatement.setString(5, request.getParameter("address"));                      
                          mystatement.setString(6, request.getParameter("phone")); 
                          mystatement.setString(7, request.getParameter("email"));
                          mystatement.setString(8, request.getParameter("place"));
                          mystatement.setString(9, request.getParameter("idproof"));
                          mystatement.setString(10, request.getParameter("idnumber"));
                          mystatement.setString(11, request.getParameter("date"));
                          mystatement.setString(12, request.getParameter("time"));
                          mystatement.setString(13, request.getParameter("article"));
                          mystatement.setString(14, request.getParameter("description"));
                          mystatement.setString(15, date);
                         mystatement.setString(16, request.getParameter("type"));
                         mystatement.setString(17, request.getParameter("city"));
                         mystatement.setString(18, request.getParameter("location"));

                          if(mystatement.executeUpdate()>0)
                          {
                              out.println("Report filed Successfully");
                          }
                          
                      }
                      catch(Exception e)
                      {
                          out.println("Error to file Report." +e);
                      }
                      finally
                      {
                          myconnection.close();
                      }
                  }
                  catch(Exception e)
                  {
                      out.println("Error in Connection " + e.getMessage());
                  }
                  
                            
                            
                            
		
					
             }
            
	
                  
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("        </form>\r\n");
      out.write("                   <script src=\"js/jquery-1.11.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("       <script src=\"js/jquery.validate.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function abc(evt)\r\n");
      out.write("       {\r\n");
      out.write("\t   \t\r\n");
      out.write("          var charCode = (evt.which) ? evt.which : event.keyCode;\r\n");
      out.write("\t\t   if (charCode >= 48 && charCode<=57 || charCode==8)\r\n");
      out.write("             return true;\r\n");
      out.write("\r\n");
      out.write("          return false; \r\n");
      out.write("          \r\n");
      out.write("       }\r\n");
      out.write("     \r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("             $(\"#form1\").validate();\r\n");
      out.write("           $(\"#city\").change(function() {\r\n");
      out.write("                var b=$(this).val();\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("                $.ajax({\r\n");
      out.write("                        url:'ajax.jsp',\r\n");
      out.write("                        type:'post',\r\n");
      out.write("                        data:{cityid:b},\r\n");
      out.write("                        beforeSend: function () {\r\n");
      out.write("                        $(\"#message1\").html(\"<img src=images/preloader.gif>\")\r\n");
      out.write("                        },\r\n");
      out.write("                        success:function(x) \r\n");
      out.write("                        {\r\n");
      out.write("                        $(\"#message1\").html(\"\")\r\n");
      out.write("                      \t                        \r\n");
      out.write("                        $(\"#selectbox1\").html(x)\t\r\n");
      out.write("                        },\r\n");
      out.write("                        error: function(e) \r\n");
      out.write("                        {\r\n");
      out.write("                        $(\"#message1\").html(\"error\" + e);\r\n");
      out.write("                        }\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("            });    \r\n");
      out.write("             \r\n");
      out.write("             \r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("                      \r\n");
      out.write("                                 \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("          \r\n");
      out.write("                \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\t\r\n");
      out.write("        </script>\r\n");
      out.write("                            \r\n");
      out.write("                             </div>\r\n");
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
      out.write("        <h1>&nbsp;</h1>\r\n");
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
