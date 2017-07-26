package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.*;
import java.util.*;
import com.sun.syndication.feed.synd.*;
import com.sun.syndication.io.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!--A Design by W3layouts\r\n");
      out.write("Author: W3layout\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Crime Report Online</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Law Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,400,300,600,700|Six+Caps' rel='stylesheet' type='text/css' />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--header-top-starts-->\r\n");
      out.write("\t<div class=\"header-top\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"head-main\">\r\n");
      out.write("\t\t\t\t<h1><a href=\"index.jsp\">CRIME REPORT ONLINE</a></h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"hea-rgt\" id=\"logt\" >\r\n");
      out.write("                            <ul style=\"list-style-type:none\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                                     \r\n");
      out.write("                                 <li><a href=\"logout.jsp\">LogOut</a><li>\r\n");
      out.write("                                       \r\n");
      out.write("                                \r\n");
      out.write("                            </ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"hea-rgt\">\r\n");
      out.write("\t\t\t\t<a href=\"whichcomplaint.jsp\">File Complaint</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"navigation\">\r\n");
      out.write("\t\t\t\t <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--/.navbar-header-->\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"signup.jsp\">Signup</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--/.navbar-collapse-->\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--header-top-end-->\r\n");
      out.write("\t<!--start-header-->\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"head\">\r\n");
      out.write("\t\t\t\t<div class=\"soc\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fb\"> </span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"twit\"> </span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"pin\"> </span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"rss\"> </span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"drbl\"> </span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"header-right\">\r\n");
      out.write("\t\t\t\t\t<div class=\"search-bar\">\r\n");
      out.write("\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<!-- script-for-menu -->\r\n");
      out.write("\t<!-- script-for-menu -->\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$(\"span.menu\").click(function(){\r\n");
      out.write("\t\t\t\t$(\" ul.navig\").slideToggle(\"slow\" , function(){\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t<!-- script-for-menu -->\r\n");
      out.write("        ");
 
                   if((session.getAttribute("auname"))!=null || (session.getAttribute("cuname"))!=null){
                  
	
      out.write("\r\n");
      out.write("           \r\n");
      out.write("              <script type=\"text/javascript\">\r\n");
      out.write("                       $(\"#logt\").fadeIn();               \r\n");
      out.write("                   \r\n");
      out.write("                </script>\r\n");
      out.write("                                    ");

                                }
                                
                                 else {
      out.write("\r\n");
      out.write("                                 <script type=\"text/javascript\">\r\n");
      out.write("                                 $(\"#logt\").fadeOut();       \r\n");
      out.write("                \r\n");
      out.write("               </script>\r\n");
      out.write("               ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t<!-- banner-starts -->\r\n");
      out.write("\t<div class=\"banner\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"banner-top\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--banner-end-->\r\n");
      out.write("\t<!-- welcome -->\r\n");
      out.write("\t<div class=\"welcome\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-8 welcome-left\">\r\n");
      out.write("\t\t\t\t<h3>Welcome</h3>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 wel-lft\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/20.jpg\" alt=\" \" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4 welcome-right\">\r\n");
      out.write("\t\t\t\t<h3>Quick Links</h3>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"signup.jsp\"><span></span> SignUp</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.jsp\"><span></span>Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"viewcomplaints.jsp\"><span></span>View Complaints</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- welcome -->\r\n");
      out.write("        <div class=\"welcome\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t<h3>Latest News</h3>\r\n");
      out.write("        \r\n");
      out.write("         ");

	
			String rssFeedUrl="http://feeds.feedburner.com/ndtvnews-top-stories";
			try
			{
				URLConnection feedUrl = new URL(rssFeedUrl).openConnection();
				SyndFeedInput input = new SyndFeedInput();
				SyndFeed feed =null;
				feed=input.build(new XmlReader(feedUrl));
			
				List list = feed.getEntries();
				
				for (int i=0 ; i < 5; i++)
				{
					SyndEntry entry = (SyndEntry)list.get(i);
					StringBuilder display =new StringBuilder();
					display.append("<a href=" + entry.getLink() +">" 
                                                + entry.getTitle() +"</a><br>");
					SyndContent mycontent=entry.getDescription();
					display.append(mycontent.getValue());
					out.println(display.toString()+"<br><br>");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t<!-- footer-starts -->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-left\">\r\n");
      out.write("\t\t\t\t<h4>Address</h4>\r\n");
      out.write("\t\t\t\t\t<div class=\"cont-tp\">\r\n");
      out.write(" \t\t\t\t\t\t<span class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t</span></div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<address>\r\n");
      out.write("\t\t\t\t\t\t  Jalandhar<br>\r\n");
      out.write("\t\t\t\t\t\t  Punjab, India 144001<br>\r\n");
      out.write("\t\t\t\t\t\t  <abbr title=\"Phone\">P :</abbr> +91-9876543210\r\n");
      out.write("\t\t\t\t\t\t</address>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-left\">\r\n");
      out.write("\t\t\t\t<h4>Phone/Fax</h4>\r\n");
      out.write("\t\t\t\t\t<div class=\"cont-tp\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-phone\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t</span></div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<p>Phone : +1234567890 </p>\r\n");
      out.write("\t\t\t\t\t<p>Mobile : +91-9876543210 </p>\r\n");
      out.write("\t\t\t\t\t<p>Fax : +1234567890 </p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-left\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"footer-text\">\r\n");
      out.write("\t\t\t\t<p>Â© 2017 Crime Report Online. All Rights Reserved  </p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- footer-end -->\r\n");
      out.write("         ");

    response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("     ");

    Cookie mycookies[]=request.getCookies();
    if(mycookies!=null)
    {
        for(Cookie mycookie:mycookies)
        {
            if(mycookie.getName().equals("auname"))
            {
                String uname=mycookie.getValue();
                session.setAttribute("auname", uname);
              //if(request.getParameter("uname").equals("admin")){
                          // response.sendRedirect("adminpanel.jsp");}
                  //      else{ response.sendRedirect("stationpanel.jsp");}
                
            }
            else if(mycookie.getName().equals("cuname"))
            {
                String uname1=mycookie.getValue();
                session.setAttribute("cuname", uname1);
                //response.sendRedirect("clientpanel.jsp");
            }
            
        }
    }
    
        
        
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
