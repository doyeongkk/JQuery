/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2020-12-21 02:06:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.MemberVO;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("vo.MemberVO");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/main.css\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t// Initialize Tooltip\r\n");
      out.write("\t\t\t$('[data-toggle=\"tooltip\"]').tooltip(); \r\n");
      out.write("\t\t\t// Add smooth scrolling to all links in navbar + footer link\r\n");
      out.write("\t\t\t$(\".navbar a, footer a[href='#myPage']\").on('click', function(event) {\r\n");
      out.write("\t\t\t\t// Make sure this.hash has a value before overriding default behavior\r\n");
      out.write("\t\t\t\tif (this.hash !== \"\") {\r\n");
      out.write("\t\t\t\t\t// Prevent default anchor click behavior\r\n");
      out.write("\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t// Store hash\r\n");
      out.write("\t\t\t\t\tvar hash = this.hash;\r\n");
      out.write("\t\t\t\t\t// Using jQuery's animate() method to add smooth page scroll\r\n");
      out.write("\t\t\t\t\t// The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area\r\n");
      out.write("\t\t\t\t\t$('html, .contents').animate({\r\n");
      out.write("\t\t\t\t\t\tscrollTop: $(hash).offset().top\r\n");
      out.write("\t\t\t\t\t\t}, 900, function(){\r\n");
      out.write("\t\t\t\t\t\t\t// Add hash (#) to URL when done scrolling (default click behavior)\r\n");
      out.write("\t\t\t\t\t\t\twindow.location.hash = hash;\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t} // End if\r\n");
      out.write("\t\t\t});\r\n");
      out.write("// \t\t\t$('#dapplybtn').on('click' , function() {\r\n");
      out.write("\r\n");
      out.write("// \t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\r\n");
      out.write("\t");
 MemberVO memberVo = (MemberVO)session.getAttribute("mVo"); 
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"");
      out.print(request.getContextPath() );
      out.write("/main.do\"><strong>Learning Market💻</strong></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\"></div>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-center\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/main.do\">홈</a></li> <!-- 메인으로 올라가는 버튼 -->\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/lecture/lectureList.do\">강의실</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"");
      out.print(request.getContextPath() );
      out.write("/board/QnABoard.do\">커뮤니티<span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/board/QnABoard.do?board_no=2\">묻고 답하기</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/board/NoticeBoard.do?board_no=1\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t");

					if(memberVo == null) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/member/loginForm.do\">마이페이지</a></li>\r\n");
      out.write("\t\t\t\t");
 
					} else if(memberVo.getAut() == 1){       //강사로 로그인 할 때 -> 강사 마이페이지 이동
				
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/teacherInfo/teacherform.do\">마이페이지</a></li>\r\n");
      out.write("\t\t\t\t");

					} else if (memberVo.getAut() == 9){
				
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/manager/memberList.do\">관리페이지</a></li>\r\n");
      out.write("\t\t\t\t");
 
					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/memberInfo/mypageForm.do\">마이페이지</a></li>\r\n");
      out.write("\t\t\t\t");
		
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/main/List_don.do\">재능기부</a></li>\r\n");
      out.write("\t\t\t\t");

					if(memberVo == null) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/member/loginForm.do\">로그인</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/member/joinForm.do\">회원가입</a></li>\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/member/logoutForm.do\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"");
      out.print(request.getContextPath());
      out.write("/basket/BasketList.do?mem_no=");
      out.print(memberVo.getMem_no() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<img src = \"./images/바구니.png\" width = \"30px;\" height=\"25px;\"/><span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/basket/BasketList.do?mem_no=");
      out.print(memberVo.getMem_no() );
      out.write("&state=1\">수강바구니</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/basket/BasketList.do?mem_no=");
      out.print(memberVo.getMem_no() );
      out.write("&state=2\">위시리스트</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t");
		
					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">MORE <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/board/NoticeBoard.do?board_no=1\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/main/main_intro.do\">소개</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/main/List_don.do\">재능기부신청</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">멤버십신청</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- <li><a href=\"#\"><span class=\"glyphicon glyphicon-search\"></span></a></li> -->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<!-- Container (The Band Section) -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"band\">\r\n");
      out.write("\t<!--   --------------------------------------------------------------------------------------------------- -->\r\n");
      out.write("\t<!-- 롤링베너  -->\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\tvar $banner = $(\".banner\").find(\"ul\");\r\n");
      out.write("\t\t\t\tvar $bannerWidth = $banner.children().outerWidth();//이미지의 폭\r\n");
      out.write("\t\t\t\tvar $bannerHeight = $banner.children().outerHeight(); // 높이\r\n");
      out.write("\t\t\t\tvar $length = $banner.children().length;//이미지의 갯수\r\n");
      out.write("\t\t\t\tvar rollingId;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//정해진 초마다 함수 실행\r\n");
      out.write("\t\t\t\trollingId = setInterval(function() {\r\n");
      out.write("\t\t\t\t\trollingStart();\r\n");
      out.write("\t\t\t\t}, 4000);//다음 이미지로 롤링 애니메이션 할 시간차\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfunction rollingStart() {\r\n");
      out.write("\t\t\t\t\t$banner.css(\"width\", $bannerWidth * $length + \"px\");\r\n");
      out.write("\t\t\t\t\t$banner.css(\"height\", $bannerHeight + \"px\");\r\n");
      out.write("\t\t\t\t\t//alert(bannerHeight);\r\n");
      out.write("\t\t\t\t\t//배너의 좌측 위치를 옮겨 준다.\r\n");
      out.write("\t\t\t\t\t$banner.animate({\r\n");
      out.write("\t\t\t\t\t\tleft : -$bannerWidth + \"px\"\r\n");
      out.write("\t\t\t\t\t\t}, 1500, function() { //숫자는 롤링 진행되는 시간이다.\r\n");
      out.write("\t\t\t\t\t\t\t//첫번째 이미지를 마지막 끝에 복사(이동이 아니라 복사)해서 추가한다.\r\n");
      out.write("\t\t\t\t\t\t\t$(this).append(\"<li>\" + $(this).find(\"li:first\").html() + \"</li>\");\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//뒤로 복사된 첫번재 이미지는 필요 없으니 삭제한다.\r\n");
      out.write("\t\t\t\t\t\t\t$(this).find(\"li:first\").remove();\r\n");
      out.write("\t\t\t\t\t\t\t//다음 움직임을 위해서 배너 좌측의 위치값을 초기화 한다.\r\n");
      out.write("\t\t\t\t\t\t\t$(this).css(\"left\", 0);\r\n");
      out.write("\t\t\t\t\t\t\t//이 과정을 반복하면서 계속 롤링하는 배너를 만들 수 있다.\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"./images/베너1.png\" width=\"340\" height=\"210px\"></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"./images/베너2.png\" width=\"340\" height=\"210px\"></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"./images/베너3.png\" width=\"340\" height=\"210px\"></li>\r\n");
      out.write("\t\t\t\t\t<li><img src=\"./images/베너4.png\" width=\"340\" height=\"210px\"></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!--   --------------------------------------------------------------------------------------------------- -->\r\n");
      out.write("\t<!-- 강좌목록 -->\r\n");
      out.write("\t<div id=\"category\">\r\n");
      out.write("\t\t<h3><strong>여기서 시작해보세요!</strong> <sub style=\"color: red\">ready!! </sub></h3>\r\n");
      out.write("\t\t \t<img class=\"list\" src=\"./images/목록1.png\" width=\"270\" height=\"450px\">\r\n");
      out.write("\t\t \t<img  class=\"list\" src=\"./images/목록2.png\" width=\"270\" height=\"450px\">\r\n");
      out.write("\t\t \t<img  class=\"list\" src=\"./images/목록3.png\" width=\"270\" height=\"450px\">\r\n");
      out.write("\t\t \t<img  class=\"list\" src=\"./images/목록4.png\" width=\"270\" height=\"450px\">\r\n");
      out.write("\t\t \t<img  class=\"list\" src=\"./images/목록5.png\" width=\"270\" height=\"450px\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"catagory2\">\r\n");
      out.write("          <h3><strong>읽어보기!</strong> <sub style=\"color:blue\">read me!!</sub></h3> \r\n");
      out.write("          <a href=\"");
      out.print(request.getContextPath() );
      out.write("/main/Read.do?no=1\"><img class=\"list2\" src=\"./images/읽어보기1.png\"></a>\r\n");
      out.write("          <a href=\"");
      out.print(request.getContextPath() );
      out.write("/main/Read.do?no=2\"><img class=\"list2\" src=\"./images/읽어보기2.png\"></a>\r\n");
      out.write("   \t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!--   --------------------------------------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"intro\">\r\n");
      out.write("\t\t<h6>\r\n");
      out.write("\t\t\t<strong>370,170명이 러닝 마켓과 함께합니다.</strong>\r\n");
      out.write("\t\t</h6>\r\n");
      out.write("\t\t\t학교에서 배우기 어렵거나 큰 비용을 <br> 지불해야만 배울 수 있는 전문적인 지식들을 제공합니다. <br>\r\n");
      out.write("\t\t\t오픈 플랫폼의 이점을 통해 다양성과 경제성을 모두 높입니다.\r\n");
      out.write("\t\t<input type='button' value='수강평 더보기' id=\"@\" style=\"color: black\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"outro\">\r\n");
      out.write("          <img class=\"list3\" src=\"./images/베너5.png\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"w3-content\" style=\"max-height: 190px\">\r\n");
      out.write("\t\t<div class=\"mySlides\" style=\"width: 100%\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h2 >나의 지식에 가치를 기부하세요</h2>\r\n");
      out.write("\t\t\t<div class=\"dona\">온라인 강의로만 3억원!(1년간 실 수령액)<br> \r\n");
      out.write("\t\t\t나의 지식을 나눠 사람들에게 배움의 기회를 주고, 의미있는 대가를 가져가세요<br>\r\n");
      out.write("\t\t\tLearning Market은 지식으로 의미있는 수익과 공유가 가능한 한국 유일한 플랫폼입니다.<br> \r\n");
      out.write("\t\t\t\t<div class=\"w3-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"w3-section\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"w3-btn btn-secondary\" onclick=\"plusDivs(-1)\">❮ Prev</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"w3-btn btn-primary\" onclick=\"plusDivs(1)\">Next ❯</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/main/List_don.do\"><input type='button' value='재능기부 신청하기' id=\"dapplybtn\" style=\"color:black\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"mySlides mydona\" style=\"width: 100%\">\r\n");
      out.write("\t\t\t<h2>멤버십 할인 혜택을 누려보세요</h2>\r\n");
      out.write("\t\t\t<div class=\"dona\">러닝 마켓 멤버십 활용하기!<br> \r\n");
      out.write("\t\t\t당신의 주머니가 가벼워지는 지름길<br>\r\n");
      out.write("\t\t\t멤버십을 통해 당신이 누릴 수 있는 더 많은 혜택을 받아가세요<br> \r\n");
      out.write("\t\t\t\t<div class=\"w3-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"w3-section\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"w3-btn btn-secondary\" onclick=\"plusDivs(-1)\">❮ Prev</button>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"w3-btn btn-primary\" onclick=\"plusDivs(1)\">Next ❯</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type='button' value='멤버십 신청하기' id=\"mapplybtn\" style=\"color:black\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--   --------------------------------------------------------------------------------------------------- -->\r\n");
      out.write("\t<!-- 재능기부, 멤버십 베너 -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tvar slideIndex = 1;\r\n");
      out.write("\t\tshowDivs(slideIndex);\r\n");
      out.write("\r\n");
      out.write("\t\tfunction plusDivs(n) {\r\n");
      out.write("\t\t\tshowDivs(slideIndex += n);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction currentDiv(n) {\r\n");
      out.write("\t\t\tshowDivs(slideIndex = n);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction showDivs(n) {\r\n");
      out.write("\t\t\tvar i;\r\n");
      out.write("\t\t\tvar x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("\t\t\tvar dots = document.getElementsByClassName(\"demo\");\r\n");
      out.write("\t\t\tif (n > x.length) {\r\n");
      out.write("\t\t\t\tslideIndex = 1\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (n < 1) {\r\n");
      out.write("\t\t\t\tslideIndex = x.length\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t;\r\n");
      out.write("\t\t\tfor (i = 0; i < x.length; i++) {\r\n");
      out.write("\t\t\t\tx[i].style.display = \"none\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfor (i = 0; i < dots.length; i++) {\r\n");
      out.write("\t\t\t\tdots[i].className = dots[i].className.replace(\" w3-red\", \"\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tx[slideIndex - 1].style.display = \"block\";\r\n");
      out.write("// \t\t\tdots[slideIndex-1].className += \" w3-red\"; // 오류나서 주석처리했는데 아무런 이상이 없음\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!--   --------------------------------------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Footer -->\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<footer class=\"footer\">\r\n");
      out.write("\t\t<div class=\"ul\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>러닝마켓</li>\r\n");
      out.write("\t\t\t\t<li>LM소개</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"ul\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a>고객센터</a></li>\r\n");
      out.write("\t\t\t\t<li>이용약관</li>\r\n");
      out.write("\t\t\t\t<li>개인정보취급방침</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"ul\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a>커뮤니티</a></li>\r\n");
      out.write("\t\t\t\t<li>묻고답하기</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br> <br> <br> <br>\r\n");
      out.write("\t\t<p class=\"made\">\r\n");
      out.write("\t\t\tLearning Made By <a href=\"https://www.w3schools.com\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"tooltip\" title=\"Visit w3schools\">대덕인재개발원</a>\r\n");
      out.write("\t\t\t(주)Learning Market 사업자 정보<br> (주)Learning Market | 대표자 : 유동기\r\n");
      out.write("\t\t\t|사업자번호 : 000-0000-0000 사업자 정보 확인 | 개인정보보호책임자 : 유동기 | 통신판매업\r\n");
      out.write("\t\t\t:2020-중구대흥동 A-0001<br> 주소 : 대전광역시 중구 대흥동 500 영민빌딩 4층 402호 | 이메일\r\n");
      out.write("\t\t\t: Learning Market@korea.com<br>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!--   --------------------------------------------------------------------------------------------------- -->\r\n");
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
