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

<form action="/Project/regMember" method="post">
<table>

<tr>
<td>회원코드</td>
<td><input type="text" name="code"></td>
</tr>

<tr>
<td>이름</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>아이디</td>
<td><input type="text" name="id"></td>
</tr>

<tr>
<td>전화번호</td>
<td><input type="text" name="tel"></td>
</tr>

<tr>
<td>생년월일</td>
<td><input type="text" name="birth"></td>
</tr>

<tr>
<td>대출가능수량</td>
<td><input type="text" name="l_rental"></td>
</tr>

<tr>
<td colspan="2"><button>가입</button></td>
</tr>


</table>
</form>

</body>
</html>