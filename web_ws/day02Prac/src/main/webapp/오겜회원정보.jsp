<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	 @import url('https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap');
	 *{
	 	font-family: "Nanum Gothic", serif;
	 	font-weight: 400;
	 	font-style: normal;
	 }

	table{
		width: 700px;
		height: 500px;
		border: 1px solid black;
		margin: 0 auto;
		border-collapse: collapse;
		text-align: center;
	}
	
	.column td{
		font-weight: 800;
		background-color: #d3d3d3;
	}
	
	td{
		border: 1px solid black;
	}

</style>
</head>
<body>

<table>
	
	<tr class="column">
 	<td>아이디</td>
	<td>비밀번호</td>
	<td>이름</td>
	<td>전화번호</td>
	<td>생년월일</td>
	<td>포인트</td>
	<td>등급</td>
	</tr>
		
<%
Connection con = null;
Statement st = null;
ResultSet rs = null;

String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:testdb";
String user="scott";
String password="tiger";


try {
	Class.forName(driver);
	
	con=DriverManager.getConnection(url,user,password);
	
	String sql="select * from member_tbl_11";
	
	st=con.createStatement();
	
	rs=st.executeQuery(sql);
	
	while(rs.next()) {
%>

	<tr>
 	<td><%=rs.getString(1)%></td>
	<td><%=rs.getString(2)%></td>
	<td><%=rs.getString(3)%></td>
	<td><%=rs.getString(4)%></td>
	<td><%=rs.getDate(5)%></td>
	<td><%=rs.getString(6)%></td>
	<td><%=rs.getString(7)%></td>
	</tr>

<%
	}
	rs.close();
	st.close();
	con.close(); 
	
	}catch (Exception e) {
	System.out.println(e.getMessage());
	}
%>

</table>

</body>
</html>