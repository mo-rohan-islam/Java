
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ page import="java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Work</title>
    </head>
    <body>
        
      <form action="AdminWorkSelect.jsp" method ="post">
           <table align="center" border="2">
                <tr>
                    <td>
                        Select
                    </td>
                    <td colspan="2">
                        <select name="worktype">
                            <option >
                                Book Insert
                            </option>
                            <option>
                                Book View
                            </option>  
                        </select>
                    </td>
                </tr>
                <tr>
                   <td colspan="2" align="center"> 
                        <input type="submit" value="Enter">
                   </td>                   
                </tr>
            </table>
        </form>
         <p align="right">
        <a href="home.html"><u>Logout</u></a>
        </p>
    </body>
</html>
