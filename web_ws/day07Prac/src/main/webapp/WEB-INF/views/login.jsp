<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

<h2>로그인</h2>

<form action="/day07Prac/login" method="post"> <!-- method 안쓰면 get이 기본 -->
아이디<input type="text" name="id"><br>
비밀번호<input type="text" name="pw"><br>
<button>로그인</button>
</form>


</body>
</html>