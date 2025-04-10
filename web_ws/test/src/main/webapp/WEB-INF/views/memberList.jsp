<%@page import="시험연습.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member_tbl_11 조회</title>
</head>
<body>

<!-- request에 저장한 데이터 꺼내기 -->
<% ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("list"); %>


<table>
	<tr>
	<td>아이디</td>
	<td>비밀번호</td>
	<td>이름</td>
	</tr>
	
	
	<% for(Member member : list) {%>
	<tr>
	<td><%=member.getM_id() %></td>
	<td><%=member.getM_pw() %></td>
	<td><%=member.getM_name() %></td>
	</tr>
	<%} %>

</table>

</body>
</html>