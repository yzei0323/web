<%@page import="시험연습.Acorn5"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 데이터 꺼내오기 -->
<% ArrayList<Acorn5> list = (ArrayList<Acorn5>)request.getAttribute("list"); %>


<table>

	<tr>
	<td>아이디</td>
	<td>비밀번호</td>
	<td>이름</td>
	</tr>


<!-- 응답하기?? 이거 뭐더라 -->
	<%for(Acorn5 acorn : list) {%>
	<tr>
	<td><%=acorn.getId() %></td>
	<td><%=acorn.getPw() %></td>
	<td><%=acorn.getName() %></td>
	</tr>
	<%} %>

</table>
</body>
</html>