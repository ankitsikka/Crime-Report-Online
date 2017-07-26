package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.sql.*;
import java.util.*;

public final class changepersonalinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Change Personal Info</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("             body {\n");
      out.write("\tmargin-bottom: 2cm;\n");
      out.write("\tmargin-left: 2cm;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Crime Report Online</title>\n");
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
      out.write("\t\t\t\t<h1><a href=\"index.jsp\">CRIME REPORT ONLINE</a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"hea-rgt\">\n");
      out.write("\t\t\t\t<a href=\"logout.jsp\">LogOut</a>\n");
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
      out.write("\t\t\t\t\t <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\n");
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
      out.write("                \n");
      out.write("                \n");
      out.write("                 ");
 
                   if((session.getAttribute("auname"))!=null || (session.getAttribute("cuname"))!=null){}
                  else
                  {
                         response.sendRedirect("login.jsp");
                   }
	
      out.write("\n");
      out.write("        ");

    response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
    
      out.write("\n");
      out.write("       ");

    Cookie mycookies[]=request.getCookies();
    if(mycookies!=null)
    {
        for(Cookie mycookie:mycookies)
        {
            if(mycookie.getName().equals("auname"))
            {
                String uname=mycookie.getValue();
                session.setAttribute("auname", uname);
             // if(request.getParameter("uname").equals("admin")){
                         //  response.sendRedirect("adminpanel.jsp");}
                        //else{ response.sendRedirect("stationpanel.jsp");}
                
            }
            else if(mycookie.getName().equals("cuname"))
            {
                String uname1=mycookie.getValue();
                session.setAttribute("cuname", uname1);
                //response.sendRedirect("clientpanel.jsp");
            }
            
        }
    }
    
        
        
      out.write("\n");
      out.write("\t<!-- script-for-menu -->\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("        <div class =\"container\" >\n");
      out.write("        ");
 
            String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                  
            if(request.getParameter("Update") != null) {
               
                  try
                  {
                      Connection myconnection1;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection1=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q1="update signup set name=?,address=?,phone=?,gender=?"+"where username=?";
                          PreparedStatement mystatement1=myconnection1.prepareStatement(q1);
                          mystatement1.setString(1, (request.getParameter("name")));                      
                          mystatement1.setString(2, request.getParameter("address"));                      
                          mystatement1.setString(3, (request.getParameter("phone")));                      
                          mystatement1.setString(4, (request.getParameter("gender")));                      
                         mystatement1.setString(5, String.valueOf(session.getAttribute("cuname")));  
                            // mystatement1.setString(5, String.valueOf(session.getAttribute("cuname"))); 
                          if(mystatement1.executeUpdate()>0)
                          {
                              out.println("Update Successful");
                          }
                          
                      }
                      catch(Exception e)
                      {
                          out.println("Wrong Username" );
                      }
                      finally
                      {
                          myconnection1.close();
                      }
                  }
                  catch(Exception e)
                  {
                      out.println("Error in Connection " + e.getMessage());
                  }
                  
                            
              }
                            
			
              
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
        
        
                  String name="",address = "",phone = "",gender= "";
                  try
                  {
                      Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q="select *  from signup where username = ?";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1, String.valueOf(session.getAttribute("cuname")));                      
                           //mystatement.setString(1, "ankit1");                      
                          ResultSet myres = mystatement.executeQuery();
                          if(myres.next())
                          {
                              name= myres.getString("name");
                              address= myres.getString("address");
                              phone= myres.getString("phone");
                              gender= myres.getString("gender");
                               
                              
      out.write("\n");
      out.write("                             \n");
      out.write("                               \n");
      out.write("         <div class=\"container\">\n");
      out.write("              <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h2>Change personal details</h2> \n");
      out.write("                <p></p> \n");
      out.write("            </div>\n");
      out.write("         <br>\n");
      out.write("    <form  method=\"get\" name=\"form1\" id=\"form1\" action=\"\" >\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("      <table width=\"687\" border=\"0\" cellspacing=\"10\" cellpadding=\"5\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        <tr>\n");
      out.write("          <td>Name</td>\n");
      out.write("          <td colspan=\"2\"><label for=\"name\"></label>\n");
      out.write("              <input type=\"text\" name=\"name\" id=\"name\" value = ");
      out.print( name);
      out.write(" required></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr><p></p></tr><tr><p></p></tr><tr><p></p></tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>Address</td>\n");
      out.write("          <td colspan=\"2\"><label for=\"address\"></label>\n");
      out.write("          <textarea name=\"address\" id=\"address\"  required>");
      out.print( address);
      out.write("</textarea></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr><p></p></tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>Phone</td>\n");
      out.write("          <td colspan=\"2\"><label for=\"phone\"></label>\n");
      out.write("          <input type=\"text\" name=\"phone\" id=\"phone\" required value = ");
      out.print( phone);
      out.write(" onKeyPress=\"return abc(event)\" maxlength=\"10\"></td>\n");
      out.write("        </tr><tr><p></p></tr>\n");
      out.write(" ");
 if(gender.equals("male")) { 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("          <td>Gender</td>\n");
      out.write("          <td colspan=\"2\"><p>\n");
      out.write("            <label>\n");
      out.write("              <input type=\"radio\" name=\"gender\" value=\"male\" id=\"gender_0\" checked required>\n");
      out.write("              Male</label>\n");
      out.write("            <label>\n");
      out.write("              <input type=\"radio\" name=\"gender\" value=\"female\" id=\"gender_1\">\n");
      out.write("              Female</label>\n");
      out.write("<br>\n");
      out.write("          </p></td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("          <td>Gender</td>\n");
      out.write("          <td colspan=\"2\"><p>\n");
      out.write("            <label>\n");
      out.write("              <input type=\"radio\" name=\"gender\" value=\"male\" id=\"gender_0\" >\n");
      out.write("              Male</label>\n");
      out.write("            <label>\n");
      out.write("              <input type=\"radio\" name=\"gender\" value=\"female\" id=\"gender_1\" checked required >\n");
      out.write("              Female</label>\n");
      out.write("<br>\n");
      out.write("          </p></td>\n");
      out.write("        </tr>");
 } 
      out.write("\n");
      out.write("        <tr><p></p></tr>\n");
      out.write("                             \n");
      out.write("                         ");
 }
                    }
                      catch(Exception e)
                      {
                          out.println("Wrong Username" );
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
                  

                            
                            
			     
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <tr><p></p></tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td colspan=\"2\"><input type=\"submit\" name=\"Update\" id=\"Update\" value=\"Update\" >\n");
      out.write("          <input type=\"reset\" name=\"Reset\" id=\"Reset\" value=\"Reset\"></td>\n");
      out.write("        </tr><tr><p></p></tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td colspan=\"2\">\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              </td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery-1.11.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.validate.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("             function abc(evt)\n");
      out.write("       {\n");
      out.write("\t   \t\n");
      out.write("          var charCode = (evt.which) ? evt.which : event.keyCode;\n");
      out.write("\t\t   if (charCode >= 48 && charCode<=57 || charCode==8)\n");
      out.write("             return true;\n");
      out.write("\n");
      out.write("          return false; \n");
      out.write("          \n");
      out.write("       }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("           ");
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
      out.write("\t\t\t\t\t<p>Phone : +1234567890 </p>\n");
      out.write("\t\t\t\t\t<p>Mobile : +91-9876543210 </p>\n");
      out.write("\t\t\t\t\t<p>Fax : +1234567890 </p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-left\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"footer-text\">\n");
      out.write("\t\t\t\t<p>© 2017 Crime Report Online. All Rights Reserved  </p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- footer-end -->\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
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
