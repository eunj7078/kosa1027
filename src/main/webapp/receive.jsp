<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String userName = request.getParameter("userName"); //단일값
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String desc = request.getParameter("desc");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>receive.jsp</title>
</head>
<body>
이름 : <%= userName %><br/>
아이디 : <%= userId %><br/>
비밀번호 : <%= userPw %><br/>
자기소개서 : <%= desc %><br/>
</body>
</html>