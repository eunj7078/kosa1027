<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
수정페이지<br/>
<form action="empUpdate.emp" method="get" name="frm" id="frm">
	직원번호 : <input type="text" value="${EmployeeDTO.empNum }" name="empNum" required="required"><br />
	직원이름 : <input type="text" value="${EmployeeDTO.empName }" name="empName" required="required" /><br />
	직원아이디: <input type="text" value="${EmployeeDTO.empId }" name="empId" required="required"/><br />
	<!-- 입사일 : <input type="date" value="${EmployeeDTO.empHireDate }" name="empHireDate" required="required"/><br /> -->
	입사일 : <input type="date" value="<fmt:formatDate value='${EmployeeDTO.empHireDate }' pattern='yyyy-MM-dd'/>" name="empHireDate" 
			required="required"/><br />
	직원이메일 : <input type="email" value="${EmployeeDTO.empEmail }" name="empEmail" /><br />
	직원 급여 : <input type="number" min="100"  value="${EmployeeDTO.empSalary }" name="empSalary" required="required"/><br />
	직원연락처 : <input type="tel" value="${EmployeeDTO.empPhone }" name="empPhone" placeholder="031-1234-1234" required="required"/><br />
<input type="submit" value="직원 수정"/>
</form>
</body>
</html>