<%@page import="vo.ReportVO"%>
<%@page import="vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../css/List_com.css">
<link rel="stylesheet" href="../css/mypage.css">
<link rel="stylesheet" href="../css/out.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<%
	MemberVO memberVo = (MemberVO)session.getAttribute("mVo");
%>
<style>
	.memList td {
		width: 130px;
		padding : 10px;
	}
	.memList th {
		padding : 10px;
	}
	.conten{
	font-size: 10%;
	}
</style>

<script>

</script>
<title>Learning Mark : 관리자페이지</title>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
	
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="<%=request.getContextPath() %>/main.do"><strong>Learning Market💻</strong></a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar"></div>
			<ul class="nav navbar-nav navbar-center">
				<li><a href="<%=request.getContextPath() %>/main.do">홈</a></li> <!-- 메인으로 올라가는 버튼 -->
				<li><a href="<%=request.getContextPath() %>/lecture/lectureList.do">강의실</a></li>
				<li class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath() %>/board/QnABoard.do">커뮤니티<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath() %>/board/QnABoard.do?board_no=2">묻고 답하기</a></li>
						<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">공지사항</a></li>
					</ul>
				</li>
				<li><a href="<%=request.getContextPath() %>/manager/memberList.do">관리페이지</a></li>
				<li><a href="<%=request.getContextPath() %>/main/List_don.do">재능기부</a></li>
				<li><a href="<%=request.getContextPath()%>/member/logoutForm.do">로그아웃</a></li>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">MORE <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">공지사항</a></li>
						<li><a href="<%=request.getContextPath()%>/main/main_intro.do">소개</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>


<!-- Container (The Band Section) 관리자 마이페이지 -->
<div id="band"> 
		<div class="mySlides" style="height: 80px;"><br>
	        <span class="dona">관리자</span><br>
    	</div>
 

<aside id="left">
  <div class="menu_container">
  
    <p class="menu-label">회원관리</p>
    <ul class="menu-list">
      <li>
      <!-- 회원 조회 -->
        <a href="<%=request.getContextPath() %>/manager/memberList.do" class="btn_wrap ">
          <span>회원 조회</span>
        </a>
      </li>
      <li>
      <!-- 처리 -->
        <a href="" class="btn_wrap ">
          <strong><span>신고 처리</span></strong>
        </a>
      </li>
    <li>
      <!-- 재능 기부 -->
        <a href="<%=request.getContextPath() %>/manager/donmemberList.do" class="btn_wrap">
         <span>재능 기부</span>
        </a>
      </li>  
    </ul>
    
    <p class="menu-label">강사 관리</p>
    <ul class="menu-list">
      <li>
      <!-- 강사 조회 -->
        <a href="<%=request.getContextPath() %>/manager/TeacherList.do" class="btn_wrap ">
          <span>강사 조회</span>
        </a>
      </li>
      <li>
        <a href="" class="btn_wrap ">
          <span>강사 등록</span>
        </a>
      </li>
      <li>
      <!-- 강사 실적 -->
        <a href="" class="btn_wrap ">
          <span>강사 실적</span>
        </a>
      </li>
    </ul>
  
  </div>
 </aside>


<div id="center"><br>
	<div class="tabs">
      <ul>
         <li class="is-active"><a href="">신고 조회</a></li>
      </ul>
    </div>

<div class="profile_edit_container">
      <div class="profile_edit">
        <form class="field profile_upload">
          <div class="file is-boxed">
          </div>
           <small class="warning"></small>
        </form>
        <table class = "memList" border="1">
        	<tr>
        		<th>신고번호</th>	
        		<th>회원번호</th>
        		<th>게시글 번호</th>
        		<th>처리상태</th>
        		<th>처리누적횟수</th>
        	</tr>
  		<%
  		if(request.getAttribute("bereportlist")!=null){
  			List<ReportVO> belist = (List<ReportVO>)request.getAttribute("bereportlist"); 
  			for(ReportVO vo1 : belist) {
  		%>	
  			<tr>
  				<td><%=vo1.getReport_no() %></td>
  				<td><%=vo1.getMem_no() %></td>
  				<td><%=vo1.getPost_no() %></td>
  				<td><%=vo1.getReport_status() %></td>
  				<td><%=vo1.getCount() %></td>
  			</tr>
  			<tr>
  			<th>신고내용</th>
        	<th cliss = "conten" colspan="3"><%=vo1.getReason() %></th> 
        	<th><a href="<%=request.getContextPath() %>/manager/updateReport.do?report_no=<%=vo1.getReport_no() %>&mem_no=<%=vo1.getMem_no() %>">신고처리</a>/<a href="<%=request.getContextPath() %>/manager/deleteReport.do?report_no=<%=vo1.getReport_no() %>">삭제</a></th>
        	</tr>
  		<%
  		
  			}
  		}
  		%>
		</table>
	</div>
	
	<div class="button_container"></div>    
   </div>
  
   
   
	<div class="tabs">
      <ul>
         <li class="is-active"><a href="">처리된신고 조회</a></li>
      </ul>
    </div>
   <div class="profile_edit_container">
   <div class="profile_edit">
        <form class="field profile_upload">
          <div class="file is-boxed">
          </div>
           <small class="warning"></small>
        </form>
        <table class = "memList" border="1">
        	<tr>	
        		<th>신고번호</th>	
        		<th>회원번호</th>
        		<th>게시글 번호</th>
        		<th>처리상태</th>
        		<th>처리누적횟수</th>
        	</tr>
  		<%
  		if(request.getAttribute("afreportlist")!=null){
  			List<ReportVO> aflist = (List<ReportVO>)request.getAttribute("afreportlist"); 
  			for(ReportVO vo2 : aflist) {
  		%>	
  			  			<tr>
  				<td><%=vo2.getReport_no() %></td>
  				<td><%=vo2.getMem_no() %></td>
  				<td><%=vo2.getPost_no() %></td>
  				<td><%=vo2.getReport_status() %></td>
  				<td><%=vo2.getCount() %></td>
  			</tr>
  			
  			<tr>
  			<th>신고내용</th>
        	<th cliss = "conten" colspan="4"><%=vo2.getReason() %></th> 
        	</tr>
  			
  		<%
  			}
  			}
  		%>
		</table>
	</div>
</div>    



    
	<div id="right">
<!-- 			<img  class="list" src="../images/커뮤니티.png" > -->
	</div>

</div>
</div>


<!-- Footer -->
	<footer class="footer">
		<div class="ul">
			<ul>
				<li>러닝마켓</li>
				<li>LM소개</li>
			</ul>
		</div>
		<div class="ul">
			<ul>
				<li><a>고객센터</a></li>
				<li>이용약관</li>
				<li>개인정보취급방침</li>
			</ul>
		</div>
		<div class="ul">
			<ul>
				<li><a>공지사항</a></li>
				<li>묻고답하기</li>
			</ul>
			<hr style="color: white">
		</div>
		<br> <br> <br> <br>
		<p class="made">
			Learning Made By <a href="https://www.w3schools.com"
				data-toggle="tooltip" title="Visit w3schools">대덕인재개발원</a>
			(주)Learning Market 사업자 정보<br> (주)Learning Market | 대표자 : 유동기
			|사업자번호 : 000-0000-0000 사업자 정보 확인 | 개인정보보호책임자 : 유동기 | 통신판매업
			:2020-중구대흥동 A-0001<br> 주소 : 대전광역시 중구 대흥동 500 영민빌딩 4층 402호 | 이메일
			: Learning Market@korea.com<br>
		</p>
	</footer>
	
</body>
</html>