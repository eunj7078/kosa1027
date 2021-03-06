<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 상세페이지<br/>
고객 번호 : ${memberDTO.memNum }<br/>
고객 이름 : ${memberDTO.memName }<br/>
고객 가입일 : <fmt:formatDate value="${memberDTO.memRegiDate }" pattern="yyyy-MM-dd"/><br/>
고객 아이디 : ${memberDTO.memId }<br/>
고객 연락처1 : ${memberDTO.memPhone1 }<br/>
고객 연락처2 : ${memberDTO.memPhone2 }<br/>
고객 주소 : ${memberDTO.memAddr }<br/>
고객 이메일: ${memberDTO.memEmail }<br/>
성별 : <c:if test="${memberDTO.memGender =='M'}">남자</c:if>
	  <c:if test="${memberDTO.memGender =='F'}">여자</c:if><br/>
생년월일: <fmt:formatDate value="${memberDTO.memBirth }" pattern="yyyy-MM-dd"/><br/>
<a href="memberList.mem">회원 리스트</a> | 
<a href="memberModify.mem?num=${memberDTO.memNum }">회원 수정</a> | 
<a href="memberDelete.mem?num=${memberDTO.memNum }" >회원 강퇴</a> 
</body>
</html>