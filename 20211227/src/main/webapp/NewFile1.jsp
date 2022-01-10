<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="java.io.*" %>
<%
	String savePath = request.getServletContext().getRealPath("/upload");
	int sizeLimit = 5 * 1024 * 1024;
	MultipartRequest multi = new MultipartRequest(
			request, savePath, sizeLimit, "utf-8", new DefaultFileRenamePolicy()
	);
	String fullName[] = multi.getParameterValues("userName");//String fullName[] = request.getParameterValues("userName");multi를 쓰는 순간 request는 사용 불가
	String userid = multi.getParameter("userid");
	String userPw = multi.getParameter("userPw");
	String ra = multi.getParameter("ra");
	String cp[] = multi.getParameterValues("cp");
	String like[] = multi.getParameterValues("like");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.print("성: " + fullName[0] + "<br/>");
	out.print("이름: " + fullName[1] + "<br/>");
	out.print("아이디: " + userid + "<br/>");
	out.print("비밀번호: " + userPw + "<br/>");
	for(int i = 0; i < cp.length; i++){
		out.print("취미: "+cp[i] + ",");
	}
	out.print("<br/>");
	out.print("수신 여부 : " + ra+ "<br/>");
	out.print("관심분야 <br/>");
	for(int i = 0; i < like.length; i++){
		out.print(like[i] + ",");
	}
%>
<br/>
파일명 : <%= multi.getOriginalFileName("upFile") %><br/>
파일 사이즈 : <% File file = multi.getFile("upFile");
	out.print(file.length());%><br/>
<img src="upload/<%= multi.getFilesystemName("upFile") %>" alt="그림"
width = "300px"/>
</body>
</html>