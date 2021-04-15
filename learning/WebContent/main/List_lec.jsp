<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/List_lec.css" type="">
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#myPage"><strong>Learning Market</strong></a>
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
    </div>
      <ul class="nav navbar-nav navbar-center">
        <li><a href="main.jsp">홈</a></li>
        <li><a href="#mylecture">강의실</a></li>
        <li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="List_com.jsp">커뮤니티<span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="../main/List_com.jsp">묻고 답하기</a></li>
						<li><a href="../main/List_com.jsp">공지사항</a></li>
					</ul></li>
        <li><a href="#mypage">마이페이지</a></li>
        <li><a href="List_don.jsp">재능기부</a></li>
        <li><a href="#login">로그인</a></li>
        <li><a href="#contact">회원가입</a></li>
        <li class="dropdown">
					 <a class="dropdown-toggle" data-toggle="dropdown" href="#">MORE
         				 <span class="caret"></span></a> 
					<ul class="dropdown-menu">
						<li><a href="#">공지사항</a></li>
						<li><a href="#">재능기부신청</a></li>
						<li><a href="#">멤버십신청</a></li>
					</ul>
				</li>
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
      </ul>
  </div>
</nav>



<!-- Container (The Band Section) -->

 <div class="mySlides">
			<h2>
				<span>코딩, 체계적인 구조화로 끝낸다.</span>
			</h2>
			<span class="banner">강좌 관련자료 이외에도 다양한 자료 및 정보를 제공해 드립니다. </span><br> <span
				class="banner">* 게시판 성격에 맞지 않는 글은 1:1 문의로 이동될 수 있으며, 욕설,비방글은 삭제될 수 있습니다. </span><br>
		</div>
 
 <div id="band">	
 
<div id="left">
<h2><strong>카테고리</strong></h2><br>
	<a href="computer.html"  style="color: black">JAVA</a><br><br>
	<a href="clothing.html" style="color: black">MySQL</a><br><br>
	<a href="sports.html"  style="color: black">HTML</a><br><br>
	<a href="movie.html" style="color: black">JavaScript</a><br><br>
	<a href="music.html"  style="color: black">JQuery</a><br><br>
	<a href="furniture.html"  style="color: black">CSS</a><br><br>
	<a href="food.html" style="color: black">Python</a><br><br>
	<a href="food.html" style="color: black">Spring</a><br><br>
	<a href="food.html" style="color: black">Linux</a><br><br>
	<a href="food.html" style="color: black">C언어</a><br><br>
</div>

 
 <div id="center">
<div id="cont">

강의목록  
<hr>

자바 스크립트 <br>
1 			안녕 					2020-12-11			000<br>
<hr>


</div>



<div id="reply">
답글목록
<hr>

글번호 		글제목  				작성일 				작성자<br>
1 			안녕 					2020-12-11			000<br>




</div>
 </div>

<div id="right">
	
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
				<li><a>커뮤니티</a></li>
				<li>묻고답하기</li>

			</ul>

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