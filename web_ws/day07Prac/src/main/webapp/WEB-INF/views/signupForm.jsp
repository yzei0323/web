<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
.wrap{
	width:245px;
	margin: 0 auto; 
	text-align: center;
	}
table{
	border-collapse: collapse;
	margin: 20px auto;
	height: 100px;
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
	transform: translateX(60 px);
}
</style>
</head>
<body>

<form action="/day07Prac/signUp2" method="post">
<div class="wrap"> 
<h2>회원가입</h2>
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
<td>닉네임</td>
<td><input type="text" name="nick"></td>
</tr>
</table>
<a href="/day07Prac/main">메인으로</a>
<button>가입</button>
</div>
</form>

</body>
</html>