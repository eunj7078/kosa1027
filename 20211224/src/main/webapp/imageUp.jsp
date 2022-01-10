<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.io.*" %>
<%
	//upload라는 폴더가 있는 절대 경로를 가져 온다.
	String savePath=application.getRealPath("upload");
	int sizeLimit = 1024*1024*5; //5MB
	MultipartRequest multi = new MultipartRequest(
		request, savePath, sizeLimit, "utf-8", new DefaultFileRenamePolicy()
	);
	File file = multi.getFile("imgFile");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>imageUp.jsp</title>
</head>
<body>
전송한 사람의 ip주소 : <%= request.getRemoteAddr() %><br/>
제목 : <%=multi.getParameter("subject") %><br/>
파일명 : <%= multi.getOriginalFileName("imgFile") %><br/>
파일 크기 : <%= file.length() %><br/>
이미지 : <br/>
<img src="upload/<%= multi.getFilesystemName("imgFile")%>"/>

</body>
</html>