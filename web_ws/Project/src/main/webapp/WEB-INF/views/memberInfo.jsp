<%@page import="Project.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/MemberOne.css" rel="stylesheet">
</head>
<body>

<% Member member = (Member)request.getAttribute("member"); %> 


<h2>회원정보</h2>
<form action="/Project/updateMember" method="post">

	<table>
	
	<tr>
	<td>회원코드</td>
	<td><input type="text" name="code" value="<%=member.getM_CODE()%>"></td>
	</tr>
	
	<tr>
	<td>이름</td>
	<td><input type="text" name="name" value="<%=member.getM_NAME()%>"></td>
	</tr>
	
	<tr>
	<td>아이디</td>
	<td><input type="text" name="id" value="<%=member.getM_ID()%>"></td>
	</tr>
	
	<tr>
	<td>전화번호</td>
	<td><input type="text" name="tel" value="<%=member.getM_TEL()%>"></td>
	</tr>
	
	
	<tr>
	<td>생년월일</td>
	<td><input type="text" name="birth" value="<%=member.getM_BIRTHDAY()%>"></td>
	</tr>
	
	
	<tr>
	<td>대출가능수량</td>
	<td><input type="text" name="rental_left" value="<%=member.getM_RENTAL_LEFT()%>"></td>
	</tr>
	
	<tr>
	<td><button>수정하기</button></td>
	</tr>
	
	</table>
</form>

</body>
</html>