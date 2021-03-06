/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2020-12-23 10:37:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.Gmail;
import service.MemberServiceImpl;
import util.SHA256;
import service.IMemberService;
import java.io.PrintWriter;
import javax.mail.Authenticator;
import javax.mail.Transport;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.Address;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import java.util.Properties;

public final class mailSend_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("util.SHA256");
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("javax.mail.Message");
    _jspx_imports_classes.add("javax.mail.Address");
    _jspx_imports_classes.add("java.util.Properties");
    _jspx_imports_classes.add("javax.mail.Transport");
    _jspx_imports_classes.add("service.MemberServiceImpl");
    _jspx_imports_classes.add("service.IMemberService");
    _jspx_imports_classes.add("javax.mail.internet.MimeMessage");
    _jspx_imports_classes.add("javax.mail.internet.InternetAddress");
    _jspx_imports_classes.add("javax.mail.Session");
    _jspx_imports_classes.add("util.Gmail");
    _jspx_imports_classes.add("javax.mail.Authenticator");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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

		IMemberService service = MemberServiceImpl.getService();
	
		
		String userID = null;		
		if(session.getAttribute("mem_id") != null) {
			userID = (String) session.getAttribute("mem_id");	
		}
		
		String host = "http://localhost/Test/";		
		String from = "dutlstorgl@gmail.com";
		String to = service.getUserEmail(userID);
		String code = SHA256.getSHA256(to);

		//??????????????? ?????? ?????????
		String subject = "[Learning Market]??????????????? ?????? ????????? ?????? ???????????????.";
		String content = "?????? ????????? ???????????? ????????? ????????? ??????????????????. " 
		        + "<a href='" + host + "member/mailcheck.do?code=" + code
				+ "'>????????? ????????????</a>";

		Properties p = new Properties();
		p.put("mail.smtp.user", from);
		p.put("mail.smtp.host", "smtp.googlemail.com");  // ????????? ????????? ???????????? SMTP??????
		p.put("mail.smtp.port", "465"); 				 //TLS 587, SSL 465 
		p.put("mail.smtp.starttls.enable", "true");     // ???????????? TLS??? ????????? ????????? ??????
		p.put("mail.smtp.auth", "true");   			   //SMTP ????????? ????????? ??????
		p.put("mail.smtp.debug", "true");
		p.put("mail.smtp.socketFactory.port", "465"); 
		p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.sockerFactory.fallback", "false");

		try {
			Authenticator auth = new Gmail();
			Session ses = Session.getInstance(p, auth);
			ses.setDebug(true);
			MimeMessage msg = new MimeMessage(ses);
			msg.setSubject(subject);
			Address fromAddr = new InternetAddress(from);
			msg.setFrom(fromAddr);
			Address toAddr = new InternetAddress(to);
			msg.addRecipient(Message.RecipientType.TO, toAddr);
			msg.setContent(content, "text/html; charset=UTF8");
			Transport.send(msg);
			
		} catch (Exception e) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('????????? ?????? ???????????????.')");
			script.println("history.back();");
			script.println("</script>");
		}
		session.setAttribute("mem_id", session.getAttribute("mem_id"));

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Learning Market</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("    background: black;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("h1{\r\n");
      out.write("   font-size: 50px;\r\n");
      out.write("   color: black;\r\n");
      out.write("   font-weight:400;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height:130px; \r\n");
      out.write("   text-align: center;\r\n");
      out.write("  \r\n");
      out.write("} \r\n");
      out.write("p{\r\n");
      out.write("   font-size: 30px;\r\n");
      out.write("   color: black;\r\n");
      out.write("   font-weight:400;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height:130px; \r\n");
      out.write("   text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#center2{\r\n");
      out.write(" font-size: 20px;\r\n");
      out.write("   color: black;\r\n");
      out.write("   font-weight:400;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height:130px; \r\n");
      out.write("   text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".banner{\r\n");
      out.write("   font-size: 50px;\r\n");
      out.write("   padding:30px; \r\n");
      out.write("   margin:500px; \r\n");
      out.write("  text-align: center;\r\n");
      out.write("   min-width:100% \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#center{\r\n");
      out.write(" min-height: 500px;\r\n");
      out.write(" min-width:  50%;\r\n");
      out.write("/*  padding:50px; */\r\n");
      out.write(" margin:200px 500px 300px 500px;\r\n");
      out.write(" background: white;\r\n");
      out.write("border: 1px solid gray;\r\n");
      out.write(" display: inline-block;\r\n");
      out.write("/*  float: left; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"head1\">\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"center\">\r\n");
      out.write("    \r\n");
      out.write("    <h1>???? ?????? ??????</h1>\r\n");
      out.write("    <p>????????? ?????? ??????????????? ?????????????????????.<br>\r\n");
      out.write("              ??? ????????? ????????? ???????????? ????????? ??????????????????</p><br>\r\n");
      out.write("     <p id=\"center2\">(????????? ?????? ????????? ???????????? ???????????????.)</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
