<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문내역</title>
</head>
<body>

<h2> 주문내역 </h2>

<%String item =(String) request.getAttribute("item"); %>

<%=item %>

</body>
</html>