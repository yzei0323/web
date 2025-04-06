<%@page import="Project.Member"%>
<%@page import="java.util.ArrayList"%>
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

	table{
		border: 1px solid black;
		margin: 30px auto;
		border-collapse: collapse;
		text-align: center;
		width: 800px;
		height: 500px;
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
    <h2>전체 회원 조회</h2>
    <div class="close"><a class="close_btn" href="/Project/memberHome"></a></div>
		<table>
				<tr>
					<th>회원코드</th>
					<th>이름</th>
					<th>아이디</th>
					<th>전화번호</th>
					<th>생년월일</th>
					<th>대출가능수량</th>
					<th colspan="2"></td>
				</tr>
			<% ArrayList<Member> list = (ArrayList<Member>)request.getAttribute("memberInfo"); %>
				<%for(Member member : list){ %>
					<tr>
						<td><%=member.getM_CODE() %></td>
						<td><%=member.getM_NAME() %></td>
						<td><%=member.getM_ID() %></td>
						<td><%=member.getM_TEL() %></td>
						<td><%=member.getM_BIRTHDAY() %></td>
						<td><%=member.getM_RENTAL_LEFT() %></td>
						<td><a href="/Project/memberOne?m_code=<%= member.getM_CODE() %>">수정하기</a></td>
						<td><a href="/Project/memberDelete?m_code=<%= member.getM_CODE() %>">삭제하기</a></td>
					</tr>
				<%} %>
			</table>
	</div>
</div>
</body>
</html>