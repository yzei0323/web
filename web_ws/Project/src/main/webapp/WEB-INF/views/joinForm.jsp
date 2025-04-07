<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에이콘도서관</title>
<style>
 @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap');
    *{
      font-family: "Noto Sans KR", serif;
      font-optical-sizing: auto;
      font-weight: 400;
      font-style: normal;
    }

    html, body {
      margin: 0;
      padding: 0;
      height: 100%;
    }

    .wrap {
      width: 100%;
      min-height: 100%; 
      background-image: url("https://images.unsplash.com/photo-1529148482759-b35b25c5f217?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");
      background-position: center;
      background-size: cover;
      background-attachment: fixed; 


      position: relative;
    }

    .wrap::before {
      content: "";
      position: absolute;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      background-color: white;
      opacity: 0.6;
      z-index: 1; 
    }

    .content {
	  width: 700px;
	  position: relative;
	  padding: 30px;
	  z-index: 2;
	  background-color: rgb(255, 255, 255, 0.6);
	  margin: 0px auto;
	  top: 30px;
	 
	  border-radius: 20px;
	}

	.content h2{
		margin: 0;
		margin-left: 20px;
		font-weight: bold;
	}
	.close_btn{
      width: 35px;
      height: 35px;
      border: 0;
      background: url("https://cdn-icons-png.flaticon.com/512/75/75519.png");
      background-size:cover;
      background-position: center;
      cursor: pointer;
      position: absolute;
      right: 50px;
      top: 30px;
    }
    input{
      width: 270px;
      
      font-size: 20px;
      outline: 0px;
    }

	table{
		border: 1px solid black;
		margin: 30px auto;
		border-collapse: collapse;
		text-align: center;
		width: 500px;
		height: 400px;
	}
	
	a{
		text-decoration: none;
	}
	
	
	th{
		background-color: #c0c0c0;
		border: 1px solid black;
	}
	
	td{
		border: 1px solid black;
	}
	
	
</style>
</head>
<body>


<div class="wrap">
    <div class="content">
	    <h2>회원 등록</h2>
	    <div class="close"><a class="close_btn" href="/Project/memberHome"></a></div>
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
	</div>
</div>

</body>
</html>