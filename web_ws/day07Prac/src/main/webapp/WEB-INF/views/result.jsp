<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>


<%
String animal = (String) session.getAttribute("animal");
String flower = (String) session.getAttribute("flower");
%>


<h2> 설문결과 안내 </h2>

<%=animal %>, 
<%=flower %> 를 좋아하시는 군요!

</body>
</html>