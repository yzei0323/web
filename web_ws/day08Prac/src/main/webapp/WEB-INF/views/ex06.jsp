<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex06</title>
</head>
<body>

<h2>1~10 출력하기</h2>

<!-- out.println()  -->

<% 
	for(int i=1; i<=10; i++){
%>
	<p><%=i%></p>
<%
}
%>

<h2> JSTL 반복하기 </h2>
<c:forEach var="i" begin="1" end="10">
<p>${i}</p>
</c:forEach>


<h2>구구단 2단 출력</h2>
<c:forEach var="i" begin="1" end="9">
	2 * ${i} = ${2*i} <br>
</c:forEach>


</body>
</html>
