<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문자열</title>
</head>
<body>
<%
	String str = "jsp 웹 애플리케이션";
	String str1 = new String("jsp 웹 애플리케이션");
	String str2 = "jsp 웹 애플리케이션";
%>
str : <%= str %><br/>
str1 : <%= str1 %><br/>
<%
	if(str1==str2) out.print("같다 <br/>");
	else out.print("다르다 <br/>");

	if(str==str2) out.print("같다 <br/>"); //주소가 같으니까 같음
	else out.print("다르다 <br/>");
	
	//문자열 비교인 경우 equals를 사용해야 한다.
	if (str.equals(str1))out.print("같다 <br/>"); 
	else out.print("다르다 <br/>");
	
	if (str.equals(str2))out.print("같다 <br/>"); 
	else out.print("다르다 <br/>");
%>
<%
	String str3 = "first string";
	String str4 = "second string";
	String str5 = "JSP 프로그래밍!";
	String str6 = "first string/second-string:JSP#프로그래밍!";
%>
	str3 : <%= str3 %><br/>
	str4 : <%= str4 %><br/>
	str5 : <%= str5 %><br/>
	
	str3의 길이: <%= str3.length() %> <br/>
	str4의 길이: <%= str4.length() %> <br/>
	str5의 길이: <%= str5.length() %> <br/>
	str3의 4번째 index에 있는 문자 : <%= str3.charAt(3)%> <br/>
	str3에서 "ing"가 있는 index : <%= str3.indexOf("ing")%> <br/>
	str3에서 index가 4이후에 있는 st은 몇번째 index인가 <%= str3.indexOf("st", 4)%> <br/>
	str5에서 "프로그래밍"의 index는 <%= str5.indexOf("프로그래밍")%> <br/>
	
	str3에서 6번째 index부터 출력 : <%= str3.substring(6) %><br/>
	str4에서 index가 4부터 5글자만 가져오기 : <%= str4.substring(4,9) %><br/>
	str5에서 4번째 index부터 출력 <%= str5.substring(4) %><br/>
	
	str3을 공백문자를 구분자로 문자열을 잘라 변수에 저장하시고 자른 문자열을 저장한 변수를 이용하여 값을 출력<br/>
<%	
	String [] s = str3.split(" ");
	for(int i = 0; i < s.length; i++){%>
		s[<%= i%>] = <%=s[i] %><br/>
<%	}
%>

	str6에 있는 문자열을 각각의 단어로 잘라 저장한 후 저장된 변수의 값을 출력<br/>
<%
	s = str6.split(" |/|-|:|#");
	for(int i = 0; i < s.length; i++){%>
		s[<%= i%>] = <%=s[i] %><br/>
<%	}
%>
<%
	int arratInt[] = {1,2,3,4,5};
	int intArray[];
	
	//intArray에 arrayInt를 대입하자.
	
	intArray = arratInt;
	for(int i = 0; i < intArray.length ; i++){%>
		intArray[<%=i%>] = <%=intArray[i] %><br/>
<%	}
%>
<hr/>
<%
	int matrix[][] = {{1,2,3,4}, {5,6,7,8}};
	//					  0			  1
	//				   0 1 2 3    0 1 2 3
	//matrix에 있는 값을 출력
	out.println(matrix.length + "</br>");
	out.println(matrix[0].length + "</br>");
	out.println(matrix[1].length + "</br>");
	for(int i = 0; i < matrix.length ; i++){
		for(int k = 0; k < matrix[i].length ; k++){
		out.print("matrix["+i+"]["+k+"]=" + matrix[i][k]+"<br/>");
		}
	}
%>
<%
	String strMatrix[][] = {{"이숭무","김찬중","백승찬"},{"이상범","이장범","이상무","이충무"}};
	String strMatrix1[][];
	
	//strMatrix1에 strMatrix를 대입하고 strMatrix1에 있는 문자열을 각각 출력
	//strMatrix1의 배열의 크기를 출력
	//strMatrix1의 각 1차원 배열의 크기를 출력
	strMatrix1 = strMatrix;
	out.print("strMaxtrix1의 배열의 크기 : " + strMatrix1.length +"<br/>");
	out.print("strMaxtrix1[0]의 배열의 크기 : " + strMatrix1[0].length +"<br/>");
	out.print("strMaxtrix1[1]의 배열의 크기 : " + strMatrix1[1].length +"<br/>");
	for(int i = 0; i < strMatrix1.length ; i++){
		for(int k = 0; k < strMatrix1[i].length ; k++){
		out.print("strMatrix1["+i+"]["+k+"]=" + strMatrix1[i][k]+"<br/>");
		}
	}
	
%>
</body>
</html>