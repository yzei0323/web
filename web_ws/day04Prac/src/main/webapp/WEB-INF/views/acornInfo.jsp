<%@page import="acorn.Acorn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/acornOne.css" rel="stylesheet">
</head>
<body>

<% Acorn acorn = (Acorn)request.getAttribute("acorn"); %> 


<h2>회원정보</h2>

<form action="/day04Prac/updateAcorn" method="post">
	<table>
	
	<tr>
	<td>아이디</td>
	<td><input type="text" name="id" value="<%=acorn.getId()%>"></td>
	</tr>
	
	<tr>
	<td>비밀번호</td>
	<td><input type="text" name="pw" value="<%=acorn.getPw()%>"></td>
	</tr>
	
	<tr>
	<td>이름</td>
	<td><input type="text" name="name" value="<%=acorn.getName()%>"></td>
	</tr>
	
	<tr>
	<td><button>수정하기</button></td>
	</tr>
	
	</table>
</form>

</body>
</html>