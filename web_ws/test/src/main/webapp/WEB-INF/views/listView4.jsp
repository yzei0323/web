<%@page import="시험연습.Acorn4"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험연습4</title>
</head>
<body>
<!-- 데이터 꺼내기 -->
<% ArrayList<Acorn4> list = (ArrayList<Acorn4>)request.getAttribute("list"); %>

<table>

	<tr>
	<td>아이디</td>
	<td>비밀번호</td>
	<td>이름</td>
	</tr>
	
	<% for(Acorn4 acorn : list) {%>
	<tr>
	<td><%=acorn.getId() %></td>
	<td><%=acorn.getPw() %></td>
	<td><%=acorn.getName() %></td>
	</tr>
	<%} %>
	
</table>

</body>
</html>