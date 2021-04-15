<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="../css/Member_Ship.css" type="">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
 
  </style>
  
</head>


<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">

<nav class="navbar navbar-default navbar-fixed-top">
      <a class="navbar-brand" href="#myPage"><strong>Learning Market</strong></a>
      
    <div class="collapse navbar-collapse" id="myNavbar">
    </div>
      <ul class="nav navbar-nav navbar-center">
        <li><a href="main.jsp">홈</a></li>
        <li><a href="#mylecture">강의실</a></li>
        <li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="List_com.jsp">커뮤니티<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="../main/List_com.jsp">묻고 답하기</a></li>
						<li><a href="../main/List_com.jsp">공지사항</a></li>
					</ul>
				</li>
        <li><a href="#mypage">마이페이지</a></li>
        <li><a href="List_don.jsp">재능기부</a></li>
        <li><a href="#login">로그인</a></li>
        <li><a href="#contact">회원가입</a></li>
        <li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">MORE <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="../main/List_com.jsp">공지사항</a></li>
						<li><a href="../main/List_don.jsp">재능기부신청</a></li>
						<li><a href="#">멤버십신청</a></li>
					</ul>
				</li>
				 <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
      </ul>
</nav>



<!-- Container (The Band Section) -->

 <div id="band"> 
 

 	<div class="mySlides">
			<h2><span><strong>멤버십 할인 혜택을 누려보세요</strong></span></h2><br>
			<span class="banner">러닝 마켓 멤버십 활용하기! </span><br>
			<span class="banner">당신의 주머니가 가벼워지는 지름길 </span><br>
			<span class="banner">멤버십을 통해 당신이 누릴 수 있는 더 많은 혜택을 받아가세요 </span><br> 
		</div>
 

 <div> 

 </div>
 

 
 
 <div id="center">
 <!--  이미지 넣기  -->
   
   <input class="bu btn-success" type="button" value="멤버십 신청하기">
   <img id="image" alt="" src="../images/멤버십페이지2.png"><br>
 
 	<div class="careful">
	
			<h6><span><strong>유의사항</strong></span></h6>
			
	</div>	
		
 <div id="alert">

 <h1>멤버십 구매정책</h1>
 
 <ul>
 <br>
 <li> 러닝마켓 아이디로 로그인 후 구매해주셔야 합니다.</li>
 <li> 해당 멤버십 이벤트는 불시 마감될 수 있습니다.</li>
 <li> 멤버십은 지급 후 1년 동안 사용 가능합니다.</li>
 <li> 멤버십을 구매하신 회원들은 모든 강의를 무료로 수강 가능합니다.</li>
 <br>
 </ul>
 <br><br><br>
 <h1>멤버십 취소/환불</h1>
 <ul>
 <br>
 <li> 본인이 결제한 결제 수단으로만 취소/환불이 가능합니다.</li>
 <li> 환불 시, 구매 시 지급된 멤버십 구매 혜택은 함께 회수 됩니다.</li>
 <li> 멤버십 충전 후 7일 이내 환불하는 경우, 전액 취소 및 환불이 진행됩니다.</li>
 <li> 멤버십 충전 후 7일 이후에 환불하는 경우, 남은 캐시 내에서 10% 차감합니다.</li>
 <li> 모든 취소 신청은 문의 게시판을 통해 접수 가능합니다.</li>
 <br>
 </ul>
 
 
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
			<li><a>커뮤니티</a></li>
			<li>묻고답하기</li>

		</ul>

	</div>
	<br>
	<br>
	<br>
	<hr id="hr">

	<p class="made">
		Learning Made By <a href="https://www.w3schools.com"
			data-toggle="tooltip" title="Visit w3schools">대덕인재개발원</a> (주)Learning
		Market 사업자 정보<br> (주)Learning Market | 대표자 : 유동기 |사업자번호 :
		000-0000-0000 사업자 정보 확인 | 개인정보보호책임자 : 유동기 | 통신판매업 :2020-중구대흥동 A-0001<br>
		주소 : 대전광역시 중구 대흥동 500 영민빌딩 4층 402호 | 이메일 : Learning Market@korea.com<br>
	</p>

	</footer>



</body>
</html>