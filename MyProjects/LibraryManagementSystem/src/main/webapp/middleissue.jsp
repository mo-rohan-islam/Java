
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
         <%  String user = request.getParameter("user");
                    String bookName = request.getParameter("name");
                    String author = request.getParameter("author");
                    String bookId="";
                    Connection conn = null;
                    PreparedStatement pstm = null;
                    ResultSet rs = null;
                    int availcopy=0;
                    int issuedcopy=0;
                    int flag1 = 0;
                    int flag2 = 1;
                    Date today = new Date(System.currentTimeMillis());
                    
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
//                        out.println("Driver Loaded");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "bolbona");
  //                      out.println("Driver connected");
                        pstm=conn.prepareStatement("select count(book_id) from ourbook where status=? group by book_name,author having book_name=? and author=?");
                        pstm.setString(1, "Yes");
                        pstm.setString(2,bookName);
                        pstm.setString(3, author);
                        rs=pstm.executeQuery();
                        while(rs.next()){
                            availcopy=rs.getInt(1);
                           //out.println("Available: " + availcopy);
                            if (availcopy > 0) {
                                flag1 = 1;
    //                           out.println("flag1: "+flag1);
                            }
                        }
                        
                        pstm=conn.prepareStatement("select count(book_id) from ourbook_issue group by username having username=?");
                        pstm.setString(1,user);
                        rs=pstm.executeQuery();
                        while(rs.next()) {
                            issuedcopy=rs.getInt(1);
                            out.println("Issued: " + issuedcopy);
                            if (issuedcopy >= 6) {
                                 flag2=0;
      //                           out.println("flag2: "+flag2);
                            }
                        }
                        
        //                out.println("flag1 & flag2 " + flag1 + " " + flag2);

                        if (flag1 == 1 && flag2==1) {
                            //conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
                            //out.println(" Driver connected");
                            pstm = conn.prepareStatement("select book_id from ourbook where status=? and book_name=? and author=?");
                            pstm.setString(1, "Yes");
                            pstm.setString(2,bookName);
                            //out.println("<p>col1 set</p>");
                            pstm.setString(3, author);
                            //out.println("<p>col2 set</p>");
                            rs=pstm.executeQuery();
                            //out.println("<p>Query executed</p>");
                            while(rs.next()){
                               //out.println("Inside loop");
                               bookId=rs.getString(1);
                               //out.println(bookId);
                            }
                            //out.println("<p>   BookId retrieved....it is" + bookId + "</p>");
                            conn.setAutoCommit(false);
                            pstm=conn.prepareStatement("insert into ourbook_issue values(?,?,?)");
                            pstm.setString(1,user);
                            pstm.setString(2, bookId);
                            pstm.setDate(3, today);
                            pstm.executeUpdate();
                            //out.println("<p>Book inserted in ourbook_issue table</p>");
                            pstm.close();
                            pstm=conn.prepareStatement("update ourbook set status=? where book_id=?");
                            //out.println("After Update prepare statement  " + pstm);
                            pstm.setString(1, "No");
                            pstm.setString(2,bookId);
                            //out.println("<p> After setting col1</p>");
                            pstm.executeUpdate();
                            //out.println("<p>Status updated in ourbook table </p>");
                            conn.commit();
                            conn.setAutoCommit(true);
                            out.println("<p>Succesfully book issued... your bookid is: " + bookId +"</p>");
                            out.println("<b>Be careful to remember this bookid as you will need it during submission</b>");
                        }
                         
                         else {
                            out.println("Book is unavailable or you have already issued more than 6 books");
                            }
                       } catch (Exception e) {
                    }
          %>
          <p align="right">
          <a href="Issue.jsp">Issue Another Book</a><br/>
          <a href="home.html">Logout</a>
          </p>
    </body>
</html>
