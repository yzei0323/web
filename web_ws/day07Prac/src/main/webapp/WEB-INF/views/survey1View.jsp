<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>좋아하는 동물</title>
</head>
<body>

<h2>좋아하는 동물은?</h2>
<form action="/day07Prac/Survey2" method="get"> <!-- method 생략하면 get이다 -->
<input type="text" name="animal">
<button>제출</button>

</form>

</body>
</html>