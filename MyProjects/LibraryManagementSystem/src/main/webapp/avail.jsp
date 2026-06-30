
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table align ="center" border="2">
            <tr>
                <td>
                    <b>Book_name</b>
                </td>
                <td>
                    <b>Author</b>
                </td>
                <td>
                    <b>No. of copies</b>
                </td>
            </tr>

            <%          
                        String name = null;
                        String author = null;
                        Connection conn = null;
                        int copies=0;
                        PreparedStatement pstm = null;
                        ResultSet rs = null;
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
//                            out.println("<p>Driver Loaded<p>");
                            conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "bolbona");
  //                          out.println("<p>Driver connected<p>");
                            pstm = conn.prepareStatement("select book_name,author,count(book_id) from ourbook where status=? group by book_name,author");
                            pstm.setString(1, "Yes");
                            rs = pstm.executeQuery();

                            while (rs.next()) {
                                
                                name = rs.getString(1);
                                author = rs.getString(2);
                                copies=rs.getInt(3);
                                out.println("<tr>");
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
        <p align ="center"><b> Be careful name of book and author are case sensitive </b></p>
        <p align="right">
        <a href="login.jsp">Go Back</a><br/>
        <a href="home.html">Logout</a>
        </p>
    </body>
</html>
