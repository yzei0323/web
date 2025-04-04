<%@page import="Project.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/member.css" rel="stylesheet">

</head>
<body>

<table>
		<tr>
			<th>회원코드</th>
			<th>이름</th>
			<th>아이디</th>
			<th>전화번호</th>
			<th>생년월일</th>
			<th>대출가능수량</th>
			<th></td>
			<th></th>
		</tr>
	<% ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("memberInfo"); %>
		<%for(Member member : list){ %>
			<tr>
				<td><%=member.getM_CODE() %></td>
				<td><%=member.getM_NAME() %></td>
				<td><%=member.getM_ID() %></td>
				<td><%=member.getM_TEL() %></td>
				<td><%=member.getM_BIRTHDAY() %></td>
				<td><%=member.getM_RENTAL_LEFT() %></td>
				<td><a href="/Project/memberOne?m_code=<%= member.getM_CODE() %>">수정하기</a></td>
				<td><a href="/Project/memberDelete?m_code=<%= member.getM_CODE() %>">삭제하기</a></td>
			</tr>
		<%} %>
	</table>

</body>
</html>