<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 기본객체 
	request, reponse, application, session:로그인, 장바구니
	out: out.print(), out.write() jsp코드 중, html로 변환해야 하는 것들이 out 객체로 들어간다.
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- request -->
클라이언트 IP 주소: <%= request.getRemoteAddr() %><br/>
요청 메서드: <%= request.getMethod() %><br/>
요청 프로토콜: <%= request.getProtocol() %><br/>
요청 서버네임: <%= request.getServerName() %><br/>
서버 포트 : <%= request.getServerPort() %><br/>
요청 URI: <%= request.getRequestURI() %><br/>
요청 URL: <%= request.getRequestURL() %><br/>
요청 ContextPath: <%= request.getContextPath() %><br/> <!-- 프로젝트명: ContextPath -->
요청 쿼리스트링: <%= request.getQueryString() %><br/> <!-- ?뒤에 있는 내용 -->
문제 : /NewFile2.jsp만 가지고 오시오<br/>
ContextPath의 길이 : <%= request.getContextPath().length() %><br/>
<%=request.getRequestURI().substring(request.getContextPath().length()) %><br/>
<!-- <%= request.getServletPath() %> -->
<%
	String stridx = "abcd";
	String str = "abcdefghi";
	out.print(str.substring(4, 4+2)+"<br/>"); //ef
	out.print(str.substring(4)+"<br/>"); //efghi
	out.print("stridx.length() : " + stridx.length() + "<br/>");
	out.print(str.substring(stridx.length())+"<br/>");
%>
<%
	String str1 = "경기도 성남시 분당구 운중로 160";
	String sido = "경기도 성남시";
	//문제: 시도를 뺀 나머지 주소를 가지고 오시오.
	out.print(str1.substring(sido.length()+1)+"<br/>");
%>

</body>
</html>