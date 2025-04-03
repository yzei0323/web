<%@page import="acorn.Acorn"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/acorn.css" rel="stylesheet">
</head>
<body>

<!-- 데이터 꺼내기 -->
<% ArrayList<Acorn> list = (ArrayList<Acorn>)request.getAttribute("이름아무거나해도된대"); %>
<table>

<tr class="menu">
<td>이름</td>
<td>아이디</td>
<td>비밀번호</td>
</tr>


<!-- 데이터 응답하기 -->
<% for(Acorn acorn : list) {%>
<tr>
<td><%=acorn.getName() %></td>
<td><%=acorn.getId() %></td>
<td><%=acorn.getPw() %></td>
</tr>
<%} %>

</table>

</body>
</html>