<%@page import="day08Prac.PageHandler"%>
<%@page import="day08Prac.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<style>
a{
	text-decoration: none;
}
</style>
</head>
<body>


<%
	ArrayList<Member> list = (ArrayList<Member>) request.getAttribute("list");
%>

<% for(Member m : list) { %>
<p> <%=m.getM_id() %>
	<%=m.getM_name() %> </p>
<%} %>
	
	


<%  PageHandler paging = (PageHandler) request.getAttribute("paging"); %>

<!-- 이전 -->

<!-- 	  1  2  3  4   5 -->
<!-- [이전] 6  7  8  9  10 -->
<!-- [이전] 11 12 13 14 15 -->
<% if( paging.getCurrentGrp() > 1)  {%>
	<a href="/day08Prac/list?p=<%=paging.getGrpStartPage()-1 %>"> [이전] </a> 
<%} %>


<!-- [1] -->
<% for( int i=paging.getGrpStartPage() ; i<= paging.getGrpEndPage(); i++) {%>
	<a href="/day08Prac/list?p=<%=i%>"> [<%=i %>]   </a> 
<%} %>


<!-- 다음 -->
<%
   if( paging.getGrpEndPage() < paging.getTotalPage()  ){
%>
	<a href="/day08Prac/list?p=<%=paging.getGrpEndPage()+1%>">  [다음]   </a>
<% 
  }
%>



</body>
</html>