<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="receive.jsp" method="get" name="frm">
	이름: <input type="text" name="userName"/><br/>
	아이디: <input type="text" name="userId"/><br/>
	비밀번호: <input type="password" name="userPw"/><br/>
	자기소개서: <textArea rows="5" cols="30" name="desc"/></textArea><br/>
	<input type="submit" value="전송"/>
</form>
</body>
</html>