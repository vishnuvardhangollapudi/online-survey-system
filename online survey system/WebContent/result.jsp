<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>


<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<%
System.out.println("welcome");
try{
	Connection con=null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ep","ep");
	PreparedStatement psmt=con.prepareStatement("select * from questions");
	PreparedStatement psmt1=con.prepareStatement("select * from result");
	ResultSet rs=psmt.executeQuery();
	ResultSet rs1=psmt1.executeQuery();
	int i=1;
		System.out.println("entered into loop--"+rs);
		int c=1;
		%>
		<center><h1>SURVEY RESULTS</h1></center>
		<center><table cellpadding="15" boarder="1" style="background-color:#ffffcc;" text-align="center">
		<tr>
		<td>QUESTION-ID</td>
		<td>OPTION1</td>
		<td>OPTION2</td>
		<td>OPTION3</td>
		<td>OPTION4</td>
		<%
		while(rs.next() && rs1.next()) {
		%>
		<tr>
		<td><%=rs.getInt(1) %></td>
		<td><%=rs.getString(3) %></td>
		<td><%=rs.getString(4) %></td>
		<td><%=rs.getString(5) %></td>
		<td><%=rs.getString(6) %></td>
		
		<tr>
		<td><%=rs1.getInt(1) %></td>
		<td><%=rs1.getString(2) %></td>
		<td><%=rs1.getString(3) %></td>
		<td><%=rs1.getString(4) %></td>
		<td><%=rs1.getString(5) %></td>
		</tr>
		<%
}
		%>
		</table></center>
		<%
}
catch(Exception e){
	System.out.println(e);
	
}


     %>
     