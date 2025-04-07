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
	  width: 850px;
	  position: relative;
	  padding: 30px;
	  z-index: 2;
	  background-color: rgb(255, 255, 255, 0.6);
	  margin: 0px auto;
	  top: 60px;
	 
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

</style>
</head>
<body>
<div class="wrap">
    <div class="content">
	  	<h2>회원정보가 삭제되었습니다</h2>
	    <div class="close"><a class="close_btn" href="/Project/memberHome"></a></div>
    </div>
</div>
</body>
</html>