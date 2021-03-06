<%@page import="vo.MemberVO"%>
<%@page import="vo.PostVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="../css/List_com.css">
	<style>

	</style>
	<script>
		var board_no = "";
		$(function() {
			board_no = $("#board_no").val();
			$('#addbtn').on('click', function() {
				console.log($("#board_no").val());
				location.href = "<%=request.getContextPath()%>/board/BoardAddForm.do?board_no=" + board_no;
			})
		})
	</script>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
	<%MemberVO memberVo = (MemberVO)session.getAttribute("mVo");%>
	<input type="hidden" id="board_no" value="<%=request.getAttribute("board_no")%>"></input>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="<%=request.getContextPath() %>/main.do"><strong>Learning Market๐ป</strong></a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar"></div>
			<ul class="nav navbar-nav navbar-center">
				<li><a href="<%=request.getContextPath() %>/main.do">ํ</a></li> <!-- ๋ฉ์ธ์ผ๋ก ์ฌ๋ผ๊ฐ๋ ๋ฒํผ -->
				<li><a href="<%=request.getContextPath() %>/lecture/lectureList.do">๊ฐ์์ค</a></li>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath() %>/board/QnABoard.do">์ปค๋ฎค๋ํฐ<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath() %>/board/QnABoard.do?board_no=2">๋ฌป๊ณ? ๋ตํ๊ธฐ</a></li>
						<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">๊ณต์ง์ฌํญ</a></li>
					</ul>
				</li>
				<%
					if(memberVo == null) {
				%>
				<li><a href="<%=request.getContextPath() %>/member/loginForm.do">๋ง์ดํ์ด์ง</a></li>
				<% 
					} else {
				%>
				<li><a href="<%=request.getContextPath() %>/memberInfo/mypageForm.do">๋ง์ดํ์ด์ง</a></li>
				<%		
					}
				%>
				<li><a href="<%=request.getContextPath() %>/main/List_don.do">์ฌ๋ฅ๊ธฐ๋ถ</a></li>
				<%
					if(memberVo == null) {
				%>
				<li><a href="<%=request.getContextPath()%>/member/loginForm.do">๋ก๊ทธ์ธ</a></li>
				<li><a href="<%=request.getContextPath()%>/member/joinForm.do">ํ์๊ฐ์</a></li>
				<%
					} else {
				%>
				<li><a href="<%=request.getContextPath()%>/member/logoutForm.do">๋ก๊ทธ์์</a></li>
				<li class="dropdown">
					<a class="dropdown-toggle" data-toggle="dropdown" href="<%=request.getContextPath()%>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>">
						<img src = "../images/๋ฐ๊ตฌ๋.png" width = "30px;" height="25px;"/><span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath()%>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>&state=1">์๊ฐ๋ฐ๊ตฌ๋</a></li>
						<li><a href="<%=request.getContextPath() %>/basket/BasketList.do?mem_no=<%=memberVo.getMem_no() %>&state=2">์์๋ฆฌ์คํธ</a></li>
					</ul>
				</li>
				<%		
					}
				%>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">MORE <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1">๊ณต์ง์ฌํญ</a></li>
						<li><a href="<%=request.getContextPath()%>/main/main_intro.do">์๊ฐ</a></li>
						<li><a href="<%=request.getContextPath() %>/main/List_don.do">์ฌ๋ฅ๊ธฐ๋ถ์?์ฒญ</a></li>
						<li><a href="#">๋ฉค๋ฒ์ญ์?์ฒญ</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>



	<!-- Container (The Band Section) -->

	<div id="band"> 
		<div class="mySlides"><br>
	        <span class="dona">๊ณต์ง ์ฌํญ</span><br>
	        <span class="dona">๊ณต์ง</span> 
	        <span class="dona">์ฌํญ</span><br>
    	</div>
 
 
		<div id="left">
			<h2><strong>์ปค๋ฎค๋ํฐ</strong></h2><br>
		   	<a class="com" href="<%=request.getContextPath() %>/board/QnABoard.do?board_no=2" style="color: black">๐ฌ๋ฌป๊ณ? ๋ตํ๊ธฐ</a><br><br>
		   	<a class="com" href="<%=request.getContextPath() %>/board/NoticeBoard.do?board_no=1" style="color: black">๐๊ณต์ง์ฌํญ</a><br><br>
		</div>
	 	<div>
			<form action="<%=request.getContextPath()%>/board/Search.do" class="search">
				<input type="hidden" id="board_no" name = "board_no" value="<%=request.getAttribute("board_no")%>"></input>
				<label for="gsearch"></label>
				
				<input type="search" id="gsearch"  placeholder="๊ฒ์๐" name="gsearch">
				<input type="submit" class="btn btn-info" value="๐">
			</form><br><br>
		</div>
		
		<div id = "center"><br>
			<% if(memberVo != null && memberVo.getAut() == 9) { %>
				<span id = "abc"><input id = "addbtn" type = "button" value = "๋ฑ๋ก" ></span><br>
			<% } %>
			<hr>
			<div id = "cont">
		 		<table class = "BList">
					<tr>
						<th>๊ธ ๋ฒํธ </th>
						<th class = "title">์?๋ชฉ</th>
						<th>์์ฑ์</th>
					</tr>
					<%
						List<PostVO> noticelist = (List<PostVO>)request.getAttribute("list");
						int count = noticelist.size();
						
						for(PostVO postVo : noticelist){
					%>
							<tr>
								<td><%=count %></td>
								<td class = "title">
									<a href="<%=request.getContextPath()%>/board/BoardView.do?board_no=<%=postVo.getBoard_no() %>&post_no=<%=postVo.getPost_no()%>">
										<%=postVo.getPost_title()%>
									</a>
								</td>
								<td><%=postVo.getNick_name() %></td>
							</tr>
					<%
							count--;
						}
					%>
				</table>
			</div>
	 	</div>
	 	<div id="right">
			<img  class="list" src="../images/์ปค๋ฎค๋ํฐ.png" >
		</div>
	</div>

	<!-- Footer -->
	<footer class="footer">
		<div class="ul">
			<ul>
				<li>๋ฌ๋๋ง์ผ</li>
            	<li>LM์๊ฐ</li>

         	</ul>	
      	</div>
      	<div class="ul">
      		<ul>
      			<li><a>๊ณ?๊ฐ์ผํฐ</a></li>
      			<li>์ด์ฉ์ฝ๊ด</li>
      			<li>๊ฐ์ธ์?๋ณด์ทจ๊ธ๋ฐฉ์นจ</li>
         	</ul>
      	</div>

		<div class="ul">
			<ul>
				<li><a>๊ณต์ง์ฌํญ</a></li>
				<li>๋ฌป๊ณ?๋ตํ๊ธฐ</li>
			</ul>
			<hr style="color:white">
		</div>
      	<br> <br> <br> <br>
      	<p class="made">
         Learning Made By <a href="https://www.w3schools.com"
            data-toggle="tooltip" title="Visit w3schools">๋๋์ธ์ฌ๊ฐ๋ฐ์</a>
         (์ฃผ)Learning Market ์ฌ์์ ์?๋ณด<br> (์ฃผ)Learning Market | ๋ํ์ : ์?๋๊ธฐ
         |์ฌ์์๋ฒํธ : 000-0000-0000 ์ฌ์์ ์?๋ณด ํ์ธ | ๊ฐ์ธ์?๋ณด๋ณดํธ์ฑ์์ : ์?๋๊ธฐ | ํต์?ํ๋งค์
         :2020-์ค๊ตฌ๋ํฅ๋ A-0001<br> ์ฃผ์ : ๋์?๊ด์ญ์ ์ค๊ตฌ ๋ํฅ๋ 500 ์๋ฏผ๋น๋ฉ 4์ธต 402ํธ | ์ด๋ฉ์ผ
         : Learning Market@korea.com<br>
      	</p>

   	</footer>

</body>
</html>