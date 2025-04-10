<%@page import="시험연습.Acorn"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험연습1</title>
</head>
<body>

<!-- 데이터 꺼내기 -->
<% ArrayList<Acorn> list = (ArrayList<Acorn>)request.getAttribute("memberList"); %>

<table>
	
	<tr>
	<td>아이디</td>
	<td>비밀번호</td>
	<td>이름</td>
	</tr>
	
	 
	<!-- 데이터응답하기 -->
	<% for(Acorn acorn : list) {%>
	<tr>
	<td><%=acorn.getId() %></td>
	<td><%=acorn.getPw() %></td>
	<td><%=acorn.getName() %></td>
	</tr>
	<%} %>

</table>


</body>
</html>