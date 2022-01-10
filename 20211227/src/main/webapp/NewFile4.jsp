<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function send(){
		location.href="https://www.daum.net"; //location.href: 자바스크립트에서 제어하는 흐름제어
	}
</script>
</head>
<body>
	<!-- response : 흐름제어 -->
	<a href= "https://www.naver.com">네이버</a>
	<button type="button" onclick="send()">다음</button>
	<%
		response.sendRedirect("https://www.nate.com"); //이벤트 발생이 아닌 바로 다른 페이지로 연결
		//sendRedirect: jsp에서 사용하는 흐름제어
	%>
</body>
</html>