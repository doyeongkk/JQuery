<%@page import="vo.MemberVO"%>
<%@page import="vo.ClassVO"%>
<%@page import="vo.LectureVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
	<%!int Lec_title = 0;%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!-- 	<link rel="stylesheet" href="../css/List_lec.css" type=""> -->
	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<style>
	body {
		font: 400 15px/1.8 Lato, sans-serif;
		min-width: 1800px;
	}
	
	.isotope_filters a.active, .isotope_filters a:hover {
		border-color: #ffb20e;
		background-color: #ffb20e;
	}
	
	.isotope_filters a {
		font-weight: 400;
		border: 2px solid #1dbb90;
		color: #fff;
		background-color: #1dbb90;
		webkit-border-radius: 4px;
		moz-border-radius: 4px;
		border-radius: 4px;
	}
	
	.isotope_filters a {
		display: inline-block;
		margin: 0 4px 4px 0;
		text-align: center;
		padding: .75em 1.5em;
		font-size: .75em;
		line-height: 1.3em;
	}
	
	.sc_blogger .isotope_filters {
		margin: 1.5em 0 1em;
	}
	
	.isotope_filters {
		overflow: hidden;
		text-align: center;
		padding-bottom: .5em;
	}
	
	.isotope_wrap .isotope_item .post_featured, .isotope_wrap .isotope_item_courses_1 .post_featured
		{
		border-color: #1eaace;
	}
	
	.isotope_wrap .isotope_item_courses .post_featured, .isotope_wrap .isotope_item_portfolio .post_featured,
		.isotope_wrap .isotope_item_square .post_featured, .isotope_wrap .isotope_item_grid .post_featured
		{
		border-bottom: 0;
	}
	
	.isotope_wrap .isotope_item .post_featured {
		margin-bottom: 0;
		border-bottom: 5px solid #f0f0f0;
	}
	
	h3, h4, h5 {
		/* margin: 10px 0 30px 0; */
		font-size: 20px;
		color: black;
	}
	
	.
	#myNavbar {
		height: 600px;
	}
	
	.navbar {
		font-family: Montserrat, sans-serif;
		padding-top: 10px;
		padding-bottom: 100px;
		background-color: white;
		border: 0;
		font-size: 15px !important;
		height: 130px;
		opacity: 0.9;
	}
	
	.navbar-nav {
		margin-right: 30px;
		float: right;
		text-align: center;
		color: black;
	}
	
	.navbar .navbar-brand {
		color: #339900 !important;
		text-align: center;
		margin: 5px;
		font-size: 70px;
	}
	
	
	.navbar-nav li a:hover {
		color: #339900 !important;
		text-align: center;
	}
	
	.navbar-nav li .{
		color: #339900 !important;
		background-color: #29292c !important;
		text-align: center;
	}
	
	.mySlides {
		color: white;
		font-weight: 400px;
		width: 100%;
		height: 200px;
		background: #343838;
		padding: 1px 40px 10px 320px;
		margin-top: 200px;
	}
	
	.banner {
		font-size: 15px;
		font-family: sans-serif;
		font-weight: 10px;
	}
	
	#band {
		/* margin-top: 135px; */
		height: 1000px;
		margin-left: 200px;
	}
	
	.inited { /*?????? ??????*/
		min-width: 220px;
		height: 120px;
		border: 5px solid white;
		background: white;
		font-size: 1.4em;
	}
	
	#left a:hover {
		color: gray;
		font-size: 1.5em;
		text-decoration: underline;
	}
	
	#cont {
		border: 5px solid red;
		/* text-align: center; */
		float: left;
		height: auto;
		width: 55%;
		/* margin: 60px 60px; */
		margin-left: 500px;
	}
	
	.list {
		position: absolute;
		float: left;
		width: 300px;
		height: 250px;
		padding-left: 30px;
	}
	
	#center {
		min-height: 946px;
		min-width: 90%;
		border: 5px solid green;
		display: inline-block;
		float: left;
		/* margin-left: 100px; */
	}
	
	#reply {
		/* border: 5px solid red; */
		float: left;
		height: auto;
		min-width: 51%;
		margin-top: 30px;
		padding-left: 30px;
	}
	
/* 	 #right { */
/* 		border: 5px solid red; */
/* 		height: 946px; */
/* 		min-width: 20%; */
/* 		float: left; */
/* 	}  */
	.ul {
		float: left;
		margin-left: 70px;
	}
	
	.made {
		display: inline-block;
		/* text-align: left; */
	}
	
	.footer {
		float: left;
		width: 100%;
		background: #011627;
		color: white;
		padding: 10px;
	}
	
	.mydona {
		background: #EE7785;
	}
	
	.bt {
		display: inline-block;
	}
	
	.lecture {
		display: inline-block;
		margin-left: 100px;
		border: 1px solid black;
		border-radius: 30px;
	}
	
	#lec_img {
		width: 600px;
		height: 400px;
		border-radius: 30px;
		margin-left: 200px;
	}
	.lec_img {
		width: 200px;
		height: 100px;
		border-radius: 30px;
		margin-left: 200px;
	}
	
	#pri {
		font-size: 1.2em;
	}
	
	.title {
		font-size: 1.3em;
		display: inline-block;
	}
	.getDetail_cont{
		border: 1px solid black;
		
	}
	.class{
	display: inline-block;
	}
	#img{
		width: 400px;
		height: 300px;
	
	}
</style>

<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
	<%
		MemberVO memberVo = (MemberVO)session.getAttribute("mVo");
		// ??????????????? ???????????? ?????? ???????????? ????????????. - ?????? ??????
		List<LectureVO> lectureList = (List<LectureVO>)request.getAttribute("lectureList");
		
		// ?????? ??????
		List<ClassVO> lectureList2 = (List<ClassVO>)request.getAttribute("lectureList2");
		
	%>
	<nav class="navbar navbar-default navbar-fixed-top">
	  	<div class="container-fluid">
	    	<div class="navbar-header">
	      		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
		        	<span class="icon-bar"></span>
		        	<span class="icon-bar"></span>
		        	<span class="icon-bar"></span>                        
	      		</button>
	      		<a class="navbar-brand" href="<%=request.getContextPath() %>/main.do"><strong>Learning Market????</strong></a>
	    	</div>
	    	<div class="collapse navbar-collapse" id="myNavbar">
	    	</div>
	      	<ul class="nav navbar-nav navbar-center">
	        	<li><a href="<%=request.getContextPath() %>/main.do">???</a></li>
        		<li><a href="<%=request.getContextPath() %>/lecture/lectureList.do">?????????</a></li>
	        	<li class="dropdown">
	        		<a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath() %>/board/QnABoard.do">????????????<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath() %>/board/QnABoard.do?board_no=2">?????? ?????????</a></li>
						<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">????????????</a></li>
					</ul>
				</li>
	        	<%
					if(memberVo == null) {
				%>
				<li><a href="<%=request.getContextPath() %>/member/loginForm.do">???????????????</a></li>
				<% 
					} else {
				%>
				<li><a href="<%=request.getContextPath() %>/memberInfo/mypageForm.do">???????????????</a></li>
				<%		
					}
				%>
				<li><a href="<%=request.getContextPath() %>/main/List_don.do">????????????</a></li>
				<%
					if(memberVo == null) {
				%>
				<li><a href="<%=request.getContextPath()%>/member/loginForm.do">?????????</a></li>
				<li><a href="<%=request.getContextPath()%>/member/joinForm.do">????????????</a></li>
				<%
					} else {
				%>
				<li><a href="<%=request.getContextPath()%>/member/logoutForm.do">????????????</a></li>
				<li class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath()%>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>">
						<img src = "../images/?????????.png" width = "30px;" height="25px;"/><span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath()%>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>&state=1">???????????????</a></li>
						<li><a href="<%=request.getContextPath() %>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>&state=2">???????????????</a></li>
					</ul>
				</li>
				<%		
					}
				%>
	        	<li class="dropdown">
	        		<a class="dropdown-toggle" data-toggle="dropdown" href="#">MORE <span class="caret"></span></a> 
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">????????????</a></li>
						<li><a href="<%=request.getContextPath()%>/main/main_intro.do">??????</a></li>
						<li><a href="<%=request.getContextPath() %>/main/List_don.do">??????????????????</a></li>
						<li><a href="#">???????????????</a></li>
					</ul>
				</li>
	      	</ul>
	  	</div>
	</nav>

	<!-- Container (The Band Section) -->
	<div class="mySlides">
		<%
			

			for(LectureVO vo : lectureList){
				// ?????? ????????? ????????? ??????
				Lec_title = vo.getLec_title();
		%>
		<br>
 		<img class="lec_img"src="../image/JAVA1.png">
		<br><br><%=vo.getLec_nm() %><br><br>
			
	</div>
 
  	<div class="isotope_filters inited">
		<br>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do" style="color: black">All</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=java"  class="theme_button">??????</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=mysql"  class="theme_button">mysql</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=html"  class="theme_button">HTML</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=javaScript"  class="theme_button">javaScript</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=jquery"  class="theme_button">jquery</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=css"  class="theme_button">css</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=python"  class="theme_button">python</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=spring"  class="theme_button">spring</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=Linux"  class="theme_button">Linux</a>
		<a href="<%=request.getContextPath() %>/lecture/lectureList.do?cate=c"  class="theme_button">C??????</a>
 	</div>
 
 	<div id="center">
		<div class="container">

			<p class="title">?????????</p><br><%=vo.getLec_nm()%><br><br>
  			<ul class="nav nav-tabs">
    			<li class="active"><a href="#">Home</a></li>
    			<li><a href="#lecture"  class="theme_button">????????????</a></li>
    			<li><a href="#class">????????????</a></li>
    			<li><a href="#">????????????</a></li>
  			</ul><br>
		</div>
		<div id="cont">

			<div id="lecture">
<!-- 				<p class="title">????????????:</p> -->
<%-- 				<%=vo.getLec_title()%><br><br> --%>
<%-- 				<br><%=vo.getMem_no        ()%><br><br> --%>
				
				<!-- ?????? ?????? ????????? ?????? ??? -->
 				<img id="img"src="../image/JAVA1.png"><br>
				<%=vo.getCategory ()%><br>
				<%=vo.getIntro()%><br><br>
				<p class="title">????????????</p><br>
				<p id="pri">????<%=vo.getPrice() %>???</p><br><br>

				<div class="getDetail_cont">
					<p class="title">  ???? ???????????? ??????</p><br><%=vo.getDetail_cont   ()%><br><br><br>
				</div>
			<%
			}
			%>
					<br>
					<%
					int cnt=0;
					for(ClassVO vo2 : lectureList2){
						cnt=1;
						if(vo2.getClass_nm().contains(".0.0.")){
							String result = vo2.getClass_nm().substring(vo2.getClass_nm().lastIndexOf(".")+1);
					%>
					<%=cnt+"."+result%>
					<%
						}else{
					%>
						<%=vo2.getClass_nm() %>
						<%=vo2.getLec_title() %>
					<%
						}
					%><br>
					<%
						if(vo2.getVideo()!=null) { 
					%>
						<%=vo2.getVideo() %><br>
					<% 
						}
						cnt++;
					%>


			</div>
			<!-- <P>????????????</P> -->
				
			<div>
				<%
					if( memberVo != null && memberVo.getMem_no() == lectureList.get(0).getMem_no()) {
				%>
				<form class="class" action="<%=request.getContextPath()%>/lecture/classUpdateForm.do" method="post">
					<input type="hidden" name = "Class_list" value="<%=vo2.getClass_list()%>">
					<input type="hidden" name = "Lec_title" value="<%=vo2.getLec_title()%>">
					<input type="hidden" name = "Class_nm" value="<%=vo2.getClass_nm()%>">
					<input type="hidden" name = "Video" value="<%=vo2.getVideo()%>">
					<input type="submit" value="????????????">
				</form><br>
			<%
					}
				}
			%>

			<%
			if(memberVo != null && memberVo.getMem_no() == lectureList.get(0).getMem_no()) {
				if(Lec_title != 0){ 
			%>
			<form action="<%=request.getContextPath()%>/lecture/classInsertForm.do" method="post">
				<input type="hidden" name = "Lec_title" value="<%=Lec_title%>">
				<input type="submit" value="????????????">
			</form>
			<%
			}
			%>
		
			<% 
			for(LectureVO vo : lectureList){	
			%>				
				<form action="<%=request.getContextPath()%>/lecture/lectureUpdateForm.do" method="post">
					<input type="hidden" name = "Lec_title" value="<%=vo.getLec_title()%>">
					<input type="hidden" name = "Mem_no" value="<%=vo.getMem_no()%>">
					<input type="hidden" name = "Intro" value="<%=vo.getIntro()%>">
					<input type="hidden" name = "Lec_nm" value="<%=vo.getLec_nm()%>">
					<input type="hidden" name = "Price" value="<%=vo.getPrice()%>">
					<input type="hidden" name = "Detail_cont" value="<%=vo.getDetail_cont()%>">
					<input type="hidden" name = "Preview_video" value="<%=vo.getPreview_video()%>">
					<input type="submit" value="????????????">
				</form>
			<%
				}
			}
			%>	


			</div>
 
			<script type="text/javascript">
				$(function(){
					// ??????????????? ????????? ??????????????? ???????????? '????????????' ?????? '?????????????????????'????????? ??????????????? Ajax??????	
					$.ajax({
						url: "<%=request.getContextPath()%>/basket/basketCount.do",
						data : { "lec_title" : "<%=lectureList.get(0).getLec_title()%>" ,
								"mem_no" : "<%=memberVo.getMem_no()%>"},
						success : function(res){
			
							if(res.cnt==0){		// ?????????????????? ?????? ????????? ?????? ??????
								$("#basketList").show();
								$("#wishList").show();
							}else{				// ?????????????????? ?????? ????????? ???????????? ?????? ??????
								$("#basketList").hide();
								$("#wishList").hide();
							}
						},
						error : function(xhr){
							alert(xhr.status);
						},
						dataType :'json'
					});
					
					
				});
			</script>

			<%
			
				if(memberVo != null && (memberVo.getAut() == 3 || memberVo.getAut()==2)) {
			%>
			<div id="basketList" style="display:none;">
				<form action="<%=request.getContextPath()%>/basket/basketInsert.do" method="post">
					<input type="hidden" name = "lec_title" value="<%=lectureList.get(0).getLec_title() %>">
					<input type="hidden" name = "mem_no" value="<%=memberVo.getMem_no()%>">
					<input type="hidden" name = "state" value="1">
					<input type="submit" id="btnCart"  value="?????????????????? ??????">
				</form>
			</div>
		
			<div id="wishList"  style="display:none;">
				<form action="<%=request.getContextPath()%>/basket/basketInsert.do" method="post">
					<input type="hidden" name = "lec_title" value="<%=lectureList.get(0).getLec_title() %>">
					<input type="hidden" name = "mem_no" value="<%=memberVo.getMem_no()%>">
					<input type="hidden" name = "state" value="2">
					<input type="submit" id="btnCart"  value="?????????????????? ??????">
				</form>
			</div>
			<%
				}
			%>

		</div>

	</div>
	
	<div id="right">
	
 	</div>

<body>

<!-- Footer -->
	<footer class="footer">
		<div class="ul">
			<ul>
				<li>????????????</li>
				<li>LM??????</li>

			</ul>
		</div>
		<div class="ul">
			<ul>
				<li><a>????????????</a></li>
				<li>????????????</li>
				<li>????????????????????????</li>
			</ul>

		</div>

		<div class="ul">
			<ul>
				<li><a>????????????</a></li>
				<li>???????????????</li>

			</ul>

		</div>

		<br> <br> <br> <br>
		<p class="made">
			Learning Made By <a href="https://www.w3schools.com"
				data-toggle="tooltip" title="Visit w3schools">?????????????????????</a>
			(???)Learning Market ????????? ??????<br> (???)Learning Market | ????????? : ?????????
			|??????????????? : 000-0000-0000 ????????? ?????? ?????? | ??????????????????????????? : ????????? | ???????????????
			:2020-??????????????? A-0001<br> ?????? : ??????????????? ?????? ????????? 500 ???????????? 4??? 402??? | ?????????
			: Learning Market@korea.com<br>
		</p>

	</footer>
	
</body>
</html>