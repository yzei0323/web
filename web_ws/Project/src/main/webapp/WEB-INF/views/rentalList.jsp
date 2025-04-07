<%@page import="Project.Rental"%>
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
    <h2>대출 정보 조회</h2>
    <div class="close"><a class="close_btn" href="/Project/memberHome"></a></div>
		<table>
				<tr>
					<th>대출코드</th>
					<th>회원코드</th>
					<th>도서코드</th>
					<th>대출날짜</th>
					<th>반납기한</th>
					<th>반납날짜</th>
					<th colspan="2"></td>
				</tr>
			<% ArrayList<Rental> list = (ArrayList<Rental>)request.getAttribute("rentalInfo"); %>
				<%for(Rental rental : list ){ %>
					<tr>
						<td><%=rental.getRental_id() %></td>
						<td><%=rental.getMember_id() %></td>
						<td><%=rental.getBook_id() %></td>
						<td><%=rental.getRental_date() %></td>
						<td><%=rental.getReturn_date() %></td>
						<td><%=rental.getReturn_status() %></td>
						<td><a href="/Project/memberOne?rental_id=<%= rental.getRental_id() %>">수정하기</a></td>
						<td><a href="/Project/memberDelete?rental_=<%= rental.getRental_id() %>">삭제하기</a></td>
					</tr>
				<%} %>
			</table>
	</div>
</div>
</body>
</html>