<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원명단2</title>
</head>
<body>

<c:forEach var="item" items="${list}">
	${item.m_id} ${item.m_name} <br>
</c:forEach>
</body>
</html>