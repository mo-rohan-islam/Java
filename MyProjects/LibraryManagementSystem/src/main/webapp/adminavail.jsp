
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.sql.*"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Available Books</title>
</head>
<body>
	<table align="center" border="2">
		<tr>
			<td><b>Book_id</b></td>
			<td><b>Book_name</b></td>
			<td><b>Author</b></td>
			<td><b>No. of copies</b></td>
		</tr>

		<%
		String bid = null;
		String name = null;
		String author = null;
		Connection conn = null;
		int copies = 0;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//out.println("<p>Driver Loaded<p>");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "bolbona");
			//out.println("<p>Driver connected<p>");
			pstm = conn.prepareStatement(
			"select book_id,book_name,author,count(book_id) from ourbook where status=? group by book_name,author");
			pstm.setString(1, "Yes");
			rs = pstm.executeQuery();

			while (rs.next()) {
				bid = rs.getString(1);
				name = rs.getString(2);
				author = rs.getString(3);
				copies = rs.getInt(4);
				out.println("<tr>");
				out.println("<td>");
				out.println(bid);
				out.println("</td>");
				out.println("<td>");
				out.println(name);
				out.println("</td>");
				out.println("<td>");
				out.println(author);
				out.println("</td>");
				out.println("<td>");
				out.println(copies);
				out.println("</td>");
				out.println("</tr>");
			}
		} catch (Exception e) {
		}
		%>
	</table>
	<p align="right">
		<a href="home.html">Logout</a>
	</p>
</body>
</html>
