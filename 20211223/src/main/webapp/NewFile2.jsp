<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="point.Point" %>
<% 
	Point p1 = new Point();
	Point p2 = new Point(10,20);
	int [] ii = new int[3];
	ii[0] = 10;
	ii[1] = 20;
	ii[2] = 30;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>point</title>
<script>
	//3단 : while
	var k = 1;
	while(k <= 9){
		document.write("3 * " + k + " = " + (3*k) +  "<br/>");
		k++;
	}
	var sdan = 2;
	var edan = 4;
	var sgop = 5;
	var egop = 7;
	var dan = sdan;
	while (dan<=edan){
		var gop = sgop;
		while (gop <= egop){
			document.write(dan+" * " + gop + " = " + (dan*gop) +  "<br/>");
			gop++;
		}
		dan++;
	}
	
</script>
</head>
<body>

<%	int k = 1;%>
<%	while(k <= 9){%>
3 * <%= k %>  =  <%=(3*k)%> <br/>
<%		k++;%>
<%	}%>

<%	int sdan = 2;
	int edan = 4;
	int sgop = 5;
	int egop = 7;
	int dan = sdan;
	while (dan<=edan){
		int gop = sgop;
		while (gop <= egop){%>
<%=	dan %> *  <%=gop%>  = <%= (dan*gop)%><br/>
<%			gop++;
		}
		dan++;
	}%>
	
	
<%// do ~ while %>
<%	sdan = 3;
	edan = 4;
	sgop = 3;
	egop = 9;
	dan = sdan;
	do{
		int gop = sgop;
		do{%>
<%=	dan %> *  <%=gop%>  = <%= (dan*gop)%><br/>
<%			gop++;
		}while (gop <= egop);
		dan++;
	}while (dan<=edan);%>

<!-- 1단부터 9단 중 짝수단만 출력하세요. 단 증가는 1씩 증가한다. -->
<%
	dan = 1;
	int gop = 1;
	for (dan = 1;dan<=9; dan++){
		if(dan%2 == 0){
		for (gop = 1; gop<=9; gop++){%>
			<%= dan%> * <%=gop%> = <%=dan*gop%><br/>
<%		}
		}
	}
%>

<!-- break -->
<!-- 1부터 9까지 구구단을 출력할 때 임의의 값 j를 만나면 구구단을 중지하시요. -->

<% int j = 5; %>
<%	gop = 1;
	for (dan = 1;dan<=9; dan++){
		if(dan == j) break;{
			for (gop = 1; gop<=9; gop++){%>
			<%= dan%> * <%=gop%> = <%=dan*gop%><br/>
<%		}
		}
	}
%>

p1's x = <%= p1.getX() %> <br/>
p1's y = <%= p1.getY() %> <br/>
p2's x = <%= p2.getX() %> <br/>
p2's y = <%= p2.getY() %> <br/>
ii[0] = <%= ii[0] %> <br/>
ii[1] = <%= ii[1] %> <br/>
ii[2] = <%= ii[2] %> <br/>
ii[0] + ii[1] = <%= ii[0] + ii[1] %>
<table border=1 width="640">
<colgroup>
	<col width = 20%>
	<col width = 50%>
	<col width = 30%>
</colgroup>
<tbody>
	<tr><th>이름</th><th>주소</th><th>전화번호</th></tr>
<% for(int i = 1; i<=10; i++){%>
	<tr><td>이숭무</td><td>성남시 분당구</td><td>010-7146-1970</td></tr>
<% }%>	

</tbody>
</table>
<% for(int i = 0; i<ii.length; i++){%>
	ii[<%=i %>] = <%=ii[i] %><br/>
<% }%>	
<%
	String location = "서울";
	switch(location){
	case "서울": out.print("02 <br/>"); break;
	case "경기도": out.print("031 <br/>"); break;
	case "인천": out.print("032 <br/>"); break;
	default : out.print("경인 지역이 아닙니다.");
	}
%>
</body>
</html>