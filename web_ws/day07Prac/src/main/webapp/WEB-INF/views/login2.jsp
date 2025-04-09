<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>
.wrap{
	width: 600px;
	margin: 0 auto; 
	text-align: center;
	}
table{
	border-collapse: collapse;
	margin: 20px auto;
	height: 80px;
}
table, td, tr{
	border: 1px solid black;
}
input{
	border: none;
	outline: none;
}
a{
	text-decoration: none;
}
button{
	transform: translateX(60px);
}
</style>
</head>
<body>


<form action="/day07Prac/login2" method="post">

<div class="wrap"> 
<h2>로그인</h2>
<table>

<tr>
<td>아이디</td>
<td><input type="text" name="id"></td>
</tr>

<tr>
<td>비밀번호</td>
<td><input type="text" name="pw"></td>
</tr>

</table>
<a href="/day07Prac/signUp2">회원가입</a>
<button>로그인</button>
</div>

</form>

<% String message = (String)request.getAttribute("message"); %>

<script>
var message = "<%=message%>";

if (message != null) {
	alert(message);
}

</script>

</body>
</html>