<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

div{
    margin: 50px 100px 50px 300px;
}

form{
   margin-left: 30px;
   margin: 100px 50px 20px 30px;
}

label {
	display: inline-block;
	width: 200px;
	height: 30px;
	font-size: 20px;
	font-weight: bold;
}

textarea {
	height: 800px;
}

select{
    margin-left: 5px;
}

#sub{
margin-left: 200px;

}


</style>
</head>
<body>
    <div>
	<form action="<%=request.getContextPath()%>/lecture/lectureInsert.do" method="post" enctype="multipart/form-data">
		<input type="hidden" name="mem_no" value="<%=request.getAttribute("mem_no") %>">
		<div>
		<label>분류:</label><select name="category" >
			  <option value="JAVA" selected>JAVA</option>
			  <option value="HTML" >HTML</option>
			  <option value="mysql">mysql</option>
			  <option value="javaScript">javaScript</option>
			  <option value="JQuery">JQuery</option>
			</select><br>
		<label>강좌명:</label> <input type="text" name="lec_nm"><br>
		<label>소개:</label> <input type="text" name="intro"><br>
		<label>결제금액:</label> <input type="text" name="price"><br>
		<label>강의상세내용:</label><br><br>
		<textarea id="story" name="detail_cont" rows="300" cols="100"></textarea><br><br>
		<label>소개영상 :</label> <input id="fi" type="file" name="file"><br><br>
		<input id="sub" type="submit" value="파일올리기">
		</div>
	</form>
	
	</div>
</body>
</html>