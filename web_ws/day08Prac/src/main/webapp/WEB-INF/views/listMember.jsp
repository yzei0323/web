<%@page import="day08Prac.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원명단</title>
</head>
<body>

<h2> 회원명단 </h2>

<% ArrayList<Member>list = (ArrayList<Member>)request.getAttribute("list"); %>

<table>
	<tr>
	<td>1</td>	
	<td>2</td>	
	<td>3</td>	
	<td>4</td>	
	<td>5</td>	
	<td>6</td>	
	<td>7</td>	
	</tr>

<% for(Member m : list)  {%>
	<tr>
	<td><%=m.getM_id() %></td>	
	<td><%=m.getM_name() %></td>	
	<td></td>	
	<td></td>	
	<td></td>	
	<td></td>		
	</tr>

<%} %>
</table>


</body>
</html>