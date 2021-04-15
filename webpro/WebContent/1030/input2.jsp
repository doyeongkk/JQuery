<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
request.setCharacterEncoding("UTF-8");
String userName = request.getParameter("name");
String content = request.getParameter("addr");
String userEmail = request.getParameter("email");
String userGend = request.getParameter("gender");
%>

이름: <%= userName %><br>
주소: <%= content %><br>
이메일: <br>
<%=userEmail   %> <br>
성별: <%= userGend %><br>
</body>
</html>