package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.sql.*;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.util.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/headerlogin.jsp");
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Crime Report Online</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("    body {\r\n");
      out.write("\tmargin-bottom: 2cm;\r\n");
      out.write("\tmargin-left: 2cm;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
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
      out.write("\t\t\t\t<a href=\"whichcomplaint.jsp\">File Complaint</a>\n");
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
      out.write("\t\t\t\t\t\t<li><a href=\"signup.jsp\">Signup</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.jsp\">Login</a></li>\n");
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
      out.write("                  ");
 
                   if((session.getAttribute("auname"))!=null) {
                       if((session.getAttribute("auname")).equals("admin")){response.sendRedirect("adminpanel.jsp");}
                   else
                       {response.sendRedirect("stationpanel.jsp");}}
                  if((session.getAttribute("cuname"))!=null)
                  {response.sendRedirect("clientpanel.jsp");}
	
      out.write("\n");
      out.write("         ");

    response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
    
      out.write("\n");
      out.write("  \n");
      out.write("                \n");
      out.write("\t<!-- script-for-menu -->\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t");
      out.write("\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("         <h1>Signup</h1><br>\r\n");
      out.write("    <form action=\"\" method=\"post\" enctype=\"multipart/form-data\" name=\"form1\" id=\"form1\">\r\n");
      out.write("      <table width=\"687\" border=\"0\" cellspacing=\"10\" cellpadding=\"5\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"191\" height=\"42\">Username (Emailid)</td>\r\n");
      out.write("         <td width=\"190\"><label for=\"username\"></label>\r\n");
      out.write("             <input type=\"text\" name=\"username\" id=\"username\" required ></td>\r\n");
      out.write("          <td width=\"236\"><div id=\"message\"></div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Password</td>\r\n");
      out.write("          <td colspan=\"2\"><label for=\"password\"></label>\r\n");
      out.write("          <input type=\"password\" name=\"password\" id=\"password\" required></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Confirm Password</td>\r\n");
      out.write("        <td colspan=\"2\">&nbsp<input type=\"password\" name=\"password2\" id=\"password2\" required></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Name</td>\r\n");
      out.write("          <td colspan=\"2\"><label for=\"name\"></label>\r\n");
      out.write("          <input type=\"text\" name=\"name\" id=\"name\" required></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Address</td>\r\n");
      out.write("          <td colspan=\"2\"><label for=\"address\"></label>\r\n");
      out.write("          <textarea name=\"address\" id=\"address\" required></textarea></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Phone</td>\r\n");
      out.write("          <td colspan=\"2\"><label for=\"phone\"></label>\r\n");
      out.write("          <input type=\"text\" name=\"phone\" id=\"phone\" required onKeyPress=\"return abc(event)\" maxlength=\"10\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Gender</td>\r\n");
      out.write("          <td colspan=\"2\"><p>\r\n");
      out.write("            <label>\r\n");
      out.write("              <input type=\"radio\" name=\"gender\" value=\"male\" id=\"gender_0\" checked required>\r\n");
      out.write("              Male</label>\r\n");
      out.write("            <label>\r\n");
      out.write("              <input type=\"radio\" name=\"gender\" value=\"female\" id=\"gender_1\">\r\n");
      out.write("              Female</label>\r\n");
      out.write("<br>\r\n");
      out.write("          </p></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Image</td>\r\n");
      out.write("          <td colspan=\"2\"><label for=\"userimage\"></label>\r\n");
      out.write("          <input type=\"file\" name=\"userimage\" id=\"userimage\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>&nbsp;</td>\r\n");
      out.write("          <td colspan=\"2\"><input type=\"submit\" name=\"Submit\" id=\"Submit\" value=\"Signup\" onclick=\"return Validate()\">\r\n");
      out.write("          <input type=\"reset\" name=\"Reset\" id=\"Reset\" value=\"Reset\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>&nbsp;</td>\r\n");
      out.write("          <td colspan=\"2\">");

             
  boolean isMultipart = ServletFileUpload.isMultipartContent(request);
  boolean flag=false;
      String username="",password="",name="",address="",phone="",gender="",path,i="";
    if(isMultipart)
    {
        FileItem item=null;
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
			
        List items = null;
        try
        {
            items = upload.parseRequest(request);
        }
        catch(FileUploadException e)
        {
            e.printStackTrace();
        }
          Iterator itr = items.iterator();
		    
		  
          while (itr.hasNext())
            {

                    item = (FileItem) itr.next();
     
                if (item.isFormField())
                {
                    String itemName1 = item.getFieldName();
                    String value=item.getString();
          
                    if(itemName1.equals("username")) //control's name - textbox name
                    {
                            username=value;//variable name                
                    }
                     else if(itemName1.equals("password")) //control's name - textbox name
                    {
                            password=value;//variable name               
                    }
                      else if(itemName1.equals("name")) //control's name - textbox name
                    {
                            name=value;//variable name               
                    }
                       else if(itemName1.equals("address")) //control's name - textbox name
                    {
                            address=value;//variable name               
                    }
                        else if(itemName1.equals("phone")) //control's name - textbox name
                    {
                            phone=value;//variable name               
                    }
                    else if(itemName1.equals("gender")) //control's name - textbox name
                    {
                            gender=value;//variable name               
                    }
                }
                else
                {
                    String type=item.getContentType();
                    long size=item.getSize()/1024; //bytes
                    if(size==0)
                    {
                        i="default.gif";
			flag=true;
                    }
                    else if(type.equals("image/pjpeg") || type.equals("image/jpeg")
                        || type.equals("image/png") || type.equals("image/x-png")
                        || type.equals("image/gif") && size<400)
                    {
                      
                        i=new java.util.Date().getTime()+item.getName();
 path=config.getServletContext().getRealPath("/") + "uploads\\" + i;
                        File savefile=new File(path);
                        item.write(savefile);    
			flag=true;
                    }
		    else
		    {
			out.println("Please upload image files with size less than 400 kbs");
		    }
                    
                }
              
            } 
			if(flag)
			{
		   
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
                          String q="insert into signup values(?,?,?,?,?,?,?)";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1, username);                      
                          mystatement.setString(2, password);                      
                          mystatement.setString(3, name);                      
                          mystatement.setString(4, address);                      
                          mystatement.setString(5, phone);                      
                          mystatement.setString(6, gender); 
                          mystatement.setString(7, i);
                          if(mystatement.executeUpdate()>0)
                          {
                              out.println("Signup Successful");
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
                  
                            
                            
                            
			}
					
            } 
           
              
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"js/jquery-1.11.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/jquery.validate.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("             function abc(evt)\r\n");
      out.write("       {\r\n");
      out.write("\t   \t\r\n");
      out.write("          var charCode = (evt.which) ? evt.which : event.keyCode;\r\n");
      out.write("\t\t   if (charCode >= 48 && charCode<=57 || charCode==8)\r\n");
      out.write("             return true;\r\n");
      out.write("\r\n");
      out.write("          return false; \r\n");
      out.write("          \r\n");
      out.write("       }\r\n");
      out.write("            function Validate() {\r\n");
      out.write("        var password = document.getElementById(\"password\").value;\r\n");
      out.write("        var confirmPassword = document.getElementById(\"password2\").value;\r\n");
      out.write("        if (password != confirmPassword) {\r\n");
      out.write("            alert(\"Passwords do not match.\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("            $(\"#form1\").validate();\r\n");
      out.write("             $(\"#username\").blur(function(){\r\n");
      out.write("                var a=$(this).val();\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                        url:'ajax.jsp',\r\n");
      out.write("                        type:'post',\r\n");
      out.write("                        data:{n:a},\r\n");
      out.write("                        beforeSend: function () {\r\n");
      out.write("                        $(\"#message\").html(\"<img src=images/preloader.gif>\")\r\n");
      out.write("                        },\r\n");
      out.write("                        success:function(x) \r\n");
      out.write("                        {\r\n");
      out.write("                        $(\"#message\").html(x)\t\r\n");
      out.write("                        },\r\n");
      out.write("                        error: function(e) \r\n");
      out.write("                        {\r\n");
      out.write("                        $(\"#message\").html(\"error\" + e);\r\n");
      out.write("                        }\r\n");
      out.write("                });\r\n");
      out.write("             });   \r\n");
      out.write("        });\r\n");
      out.write("        </script>\r\n");
      out.write("        </div>\r\n");
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
