<%@page import="Project.Book"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookInfo</title>

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
	  width: 900px;
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
	}

    .searchTable{
    	width: 860px;
	    margin : 0 auto;
	    margin-top: 30px;
	    border-collapse: collapse;
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

<script>

function searchBook() {
	
	let search  = document.getElementById("search").value;	
	window.location.href="/Project/SearchServlet?search="+search;
	
}
</script>
</head>
<body>

<% ArrayList<Book> list = (ArrayList<Book>)request.getAttribute("bookinfo"); %>


<div class="search-bar">
          <input type="text" name ="search"  id="search" placeholder = "검색을 원하시는 책의 이름을 입력 해 주세요">
          <button onclick="searchBook()" class="search_btn"></button>
        </div>
<% for( Book book : list){ %>
<div class="book_info">
<h2> 책 정보 </h2>
 <img  src="<%=book.getB_IMG() %>"  alt=""> 
<div>제목 : <%=book.getB_TITLE() %></div>
<div>작가 : <%=book.getB_AUTHOR() %></div>
<div>출판사 : <%=book.getB_PUBLISHER() %></div>
<div>대여가능 : <%=book.getB_RENTAL_STATUS() %></div>
<div>코드 : <%=book.getB_ID() %></div>

</div>
<%} %>
</body>
</html>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 