package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>MOMA</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/droid_sans_400-droid_sans_700.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/formstyle.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("      <div class=\"slider\">\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"#\"><img src=\"images/slide1.jpg\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"960\" height=\"500\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/slide3.jpg\" width=\"960\" height=\"500\" alt=\"\" /> </a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"menu_nav\">\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"active\"><a href=\"index.html\"><span>Home Page</span></a></li>\n");
      out.write("          <li><a href=\"support.html\"><span>Support</span></a></li>\n");
      out.write("          <li><a href=\"about.html\"><span>About Us</span></a></li>\n");
      out.write("          <li><a href=\"blog.html\"><span>Blog</span></a></li>\n");
      out.write("          <li><a href=\"contact.html\"><span>Contact Us</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"index.html\"><span>m.O.m.A</span> <small>mAy oUr mEmory aLive</small></a></h1>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"login-in\">\n");
      out.write("            <form method=\"post\" id=\"Form\" >\n");
      out.write("                <dl>\n");
      out.write("                    <dt>\n");
      out.write("                        <label for=\"email\"></label>\n");
      out.write("                    </dt>\n");
      out.write("                    <dd style=\"border-top-color: rgb(142,150,161); border-right-color:rgb(142,150,161); \n");
      out.write("                        border-left-color: rgb(142,150,161); border-bottom-color: rgb(142,150,161);\">\n");
      out.write("                        <strong style=\"color: hotpink\">Account: </strong><input type=\"text\" \n");
      out.write("                                            name=\"email\" value=\"Email / User Name\" style=\"color: rgb(136,136,136);\" onfocus=\"accFocus()\" onblur=\"accBlur()\" />\n");
      out.write("                    </dd>\n");
      out.write("                </dl>\n");
      out.write("                \n");
      out.write("                <dl>\n");
      out.write("                    <dt>\n");
      out.write("                        <label for=\"password\"></label>\n");
      out.write("                    </dt>\n");
      out.write("                    <dd style=\"border-top-color: rgb(142,150,161); border-right-color:rgb(142,150,161); \n");
      out.write("                        border-left-color: rgb(142,150,161); border-bottom-color: rgb(142,150,161);\">\n");
      out.write("                        <strong style=\"color: hotpink\">Password:</strong><input type=\"text\" \n");
      out.write("                                            name=\"email\" value=\"Please input password\" style=\"color: rgb(136,136,136);\" onfocus=\"accFocus()\" onblur=\"accBlur()\" />\n");
      out.write("                    </dd>\n");
      out.write("                </dl>\n");
      out.write("                \n");
      out.write("                <dl>\n");
      out.write("                    <dd>\n");
      out.write("                        <input class=\"Submit\" type=\"submit\" value=\"login\" \n");
      out.write("                               style=\"color: #ffffff; background-color: dodgerblue; height: 30px; width: 240px \" onmouseover=\"changeForm()\"  />\n");
      out.write("                    </dd>\n");
      out.write("                </dl>\n");
      out.write("           </form>\n");
      out.write("            <hr style=\"margin-left: 40px\" />\n");
      out.write("            \n");
      out.write("            <input class=\"Submit\" id=\"sub_reg\" type=\"button\" onclick=\"window.location='newReg.jsp'\" value=\"register\" \n");
      out.write("                   style=\"background-color:limegreen ; color: #ffffff; height: 30px; width: 240px; margin-left: 40px; \" />\n");
      out.write("            \n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("  <div class=\"fbg\">\n");
      out.write("    <div class=\"fbg_resize\">\n");
      out.write("      <div class=\"col c1\">\n");
      out.write("        <h2><span>Image</span> Gallery</h2>\n");
      out.write("        <a href=\"#\"><img src=\"images/gal1.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal2.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal3.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal4.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal5.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal6.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> </div>\n");
      out.write("      <div class=\"col c2\">\n");
      out.write("        <h2><span>Services</span> Overview</h2>\n");
      out.write("        <p>Curabitur sed urna id nunc pulvinar semper. Nunc sit amet tortor sit amet lacus sagittis posuere cursus vitae nunc.Etiam venenatis, turpis at eleifend porta, nisl nulla bibendum justo.</p>\n");
      out.write("        <ul class=\"fbg_ul\">\n");
      out.write("          <li><a href=\"#\">Lorem ipsum dolor labore et dolore.</a></li>\n");
      out.write("          <li><a href=\"#\">Excepteur officia deserunt.</a></li>\n");
      out.write("          <li><a href=\"#\">Integer tellus ipsum tempor sed.</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col c3\">\n");
      out.write("        <h2><span>Contact</span> Us</h2>\n");
      out.write("        <p>Nullam quam lorem, tristique non vestibulum nec, consectetur in risus. Aliquam a quam vel leo gravida gravida eu porttitor dui.</p>\n");
      out.write("        <p class=\"contact_info\"> <span>Address:</span> 1458 TemplateAccess, USA<br />\n");
      out.write("          <span>Telephone:</span> +123-1234-5678<br />\n");
      out.write("          <span>FAX:</span> +458-4578<br />\n");
      out.write("          <span>Others:</span> +301 - 0125 - 01258<br />\n");
      out.write("          <span>E-mail:</span> <a href=\"#\">mail@yoursitename.com</a> </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"footer_resize\">\n");
      out.write("      <p class=\"lf\">Copyright &copy; <a href=\"#\">Domain Name</a>. All Rights Reserved</p>\n");
      out.write("      <p class=\"rf\">Get More <a target=\"_blank\" href=\"http://www.ingping.com/\">????</a> By <a target=\"_blank\" href=\"http://www.dreamtemplate.com/\">DreamTemplate</a></p>\n");
      out.write("      <div style=\"clear:both;\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
