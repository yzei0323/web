<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.box{
		border: 1px solid black;
		text-align: center;
		margin: 0 auto;
		line-height: 200px;
	}
</style>
</head>
<body>
<% ArrayList<String> list = (ArrayList<String>) request.getAttribute("gugudan"); %>

<h2>구구단 출력</h2>
<div class="box">
<%=list %>
</div>


</body>
</html>