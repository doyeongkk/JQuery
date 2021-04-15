<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/main_admin.css" type="">
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
</style>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="50">

	<nav class="navbar navbar-default navbar-fixed-top">
		<a class="navbar-brand" href="#myPage"><strong>Learning
				Market</strong></a>

		<div class="collapse navbar-collapse" id="myNavbar"></div>
		<ul class="nav navbar-nav navbar-center">
			<li><a href="#home">홈</a></li>
			<li><a href="#mylecture">강의실</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="List_com.jsp">커뮤니티<span
					class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="../main/List_com.jsp">묻고 답하기</a></li>
					<li><a href="../main/List_com.jsp">공지사항</a></li>
				</ul></li>
			<li><a href="#mypage">마이페이지</a></li>
			<li><a href="#donation">재능기부</a></li>
			<li><a href="#login">로그인</a></li>
			<li><a href="#contact">회원가입</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">MORE <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="../main/List_com.jsp">공지사항</a></li>
					<li><a href="../main/List_don.jsp">재능기부신청</a></li>
					<li><a href="#">멤버십신청</a></li>
				</ul></li>
			<li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
		</ul>
	</nav>



	<!-- Container (The Band Section) -->

	<div id="band">


		<div class="mySlides">
			<h2>
				<span>관리자 Page</span>
			</h2>
		</div>


		<div id="left1">
			<br>

			<h2>👨‍💻회원관리</h2>
			<br> <a class="com" href=""> - 모든 회원조회</a><br>
			<br> <a class="com" href=""> - 재능기부 승인 여부</a><br>
			<br> <a class="com" href=""> - 블랙리스트 관리</a><br>
			<br>

		</div>
		<div id="left">
			<br>
			<h2>👨‍🏫강사관리</h2>
			<br> <a class="com" href=""> - 강사 등록</a><br>
			<br> <a class="com" href=""> - 강사실적도</a><br>
			<br> <a class="com" href=""> - 모든 강사 조회</a><br>
			<br>
		</div>
		<div id="left">
			<br>
			<h2>💷강의관리</h2>
			<br> <a class="com" href=""> - 강의 목록 조회</a><br>
			<br>
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
		<br> <br> <br>
		<hr id="hr">

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