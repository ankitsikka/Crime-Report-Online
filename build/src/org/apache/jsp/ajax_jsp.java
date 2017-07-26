package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ajax_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    if(request.getParameter("n")!=null)  
{
String name=request.getParameter("n");


    String url="jdbc:mysql://localhost/";
        String place="crimefiledb";
        String username1="root";
        String password1="";
              try
              { Connection myconnection;
                  Class.forName("com.mysql.jdbc.Driver");
                  myconnection=DriverManager.getConnection(url+place,username1,password1);
                  try
                  {
                      String q="select * from  signup where username=?";
                      PreparedStatement mystatement=myconnection.prepareStatement(q);
                      mystatement.setString(1, name);
                      ResultSet myresult= mystatement.executeQuery();
                      
                      
                      if(myresult.next())
                      {
                          out.println("Username not available");
                      }
                      else{
                      String q1="select * from  admintable where username=?";
                      PreparedStatement mystatement1=myconnection.prepareStatement(q1);
                      mystatement1.setString(1, name);
                      ResultSet myresult1= mystatement.executeQuery();
                      
                      
                      if(myresult1.next())
                      {
                          out.println("Username not available");
                      }
                      else
                      {
                          out.println("Username  available");
                      }
                      
                      } 
                  }
                  catch(Exception e)
                  {
                      out.println("Error in query " + e.getMessage());
                  }
                  
                  
              }
              catch(Exception e)
              {
                  out.println("Error in connection " + e.getMessage());
              }





}
    else if(request.getParameter("stateid")!=null)
{   
    String state1id=request.getParameter("stateid");
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
                          String q="select * from citytable where stateid=?";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1, state1id);                      
                          
                          ResultSet myresult=mystatement.executeQuery();
                          out.println("&nbsp;<select name='city1' id='city1'>");
                          if(myresult.next())
                          {
                              
                              out.println("<option>Choose City Now</option>");
                              do
                              {
                                out.println("<option value=" + myresult.getString("cityid") + ">" + myresult.getString("cityname") +"</option>");
                              }
                              while(myresult.next());
                              
                          }
                          else
                          {
                              out.println("<option>No Cities added yet</option>");
                          }
                          out.println("</select>");
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
    
    
    
}
   else if(request.getParameter("cityid")!=null)
{   
    String city1id=request.getParameter("cityid");
    
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
                          String q="select * from addlocation where cityid=?";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1, city1id);                      
                          
                          ResultSet myresult=mystatement.executeQuery();
                          out.println("&nbsp;<select name='location' id='location'>");
                          if(myresult.next())
                          {
                              
                              out.println("<option>Choose Division Now</option>");
                              do
                              {
                                out.println("<option value=" + myresult.getString("locationid") + ">" + myresult.getString("pname") +"</option>");
                              }
                              while(myresult.next());
                              
                          }
                          else
                          {
                              out.println("<option>No divisions added yet</option>");
                          }
                          out.println("</select>");
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
                  
    
    
}


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
