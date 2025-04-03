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

<!-- request 저장소에서 데이터꺼내기 -->
<% ArrayList<Acorn> list = (ArrayList<Acorn>)request.getAttribute("list"); %>

<table>

<tr class="menu">
<td>아이디</td>
<td>비번</td>
<td>이름</td>
<td>수정</td>
<td>삭제</td>
</tr>


<!-- 데이터 응답하기 -->
<% for( Acorn acorn : list ) {%>
<tr>
<td><%= acorn.getId() %></td>
<td><%= acorn.getPw() %></td>
<td><%= acorn.getName() %></td>
<td> <a href="/day04Prac/acornOne?id=<%= acorn.getId() %>">수정</a></td>
<td> <a href="/day04Prac/acornDelete?id=<%= acorn.getId() %>">삭제</a></td>
</tr>

<% } %>

</table>
</body>
</html>