<%@page import="시험연습.Acorn2"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험연습2</title>
</head>
<body>
<!-- 데이터 꺼내기 -->
<% ArrayList<Acorn2> list = (ArrayList<Acorn2>)request.getAttribute("acornList"); %>


<table>
	
	<tr>
	<td>이름</td>
	<td>아이디</td>
	<td>비밀번호</td>
	</tr>

	<!-- 데이터 응답하기 -->
	<% for(Acorn2 acorn2 : list) { %>
	<tr>
	<td><%=acorn2.getName() %></td>
	<td><%=acorn2.getId() %></td>
	<td><%=acorn2.getPw() %></td>
	</tr>
	<%} %>
	
</table>

</body>
</html>