<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePrac.jsp</title>
</head>
<body>

<h2>메인화면</h2>

<c:if test="${id==null}">
	로그인 안되어 있음
</c:if>

<c:if test="${sessionScope.id != null}">
	<!-- 로그인한 경우 -->
	<p>로그인 되었습니다.</p>
</c:if>
</body>
</html>