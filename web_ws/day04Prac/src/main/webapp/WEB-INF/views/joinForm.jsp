<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/acornReg.css" rel="stylesheet">
</head>
<body>

<form action="/day04Prac/regAcorn" method="post">
<table>

<tr>
<td>아이디</td>
<td><input type="text" name="id"></td>
</tr>

<tr>
<td>비밀번호</td>
<td><input type="text" name="pw"></td>
</tr>

<tr>
<td>이름</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td colspan="2"><button>가입</button></td>
</tr>


</table>
</form>

</body>
</html>