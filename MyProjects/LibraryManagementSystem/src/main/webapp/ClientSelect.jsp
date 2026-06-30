
<%@page language="java" import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

	<c:set var="clitype" value="${param.clitype}" scope="session" />
	<c:if test="${clitype eq 'MEMBERS-LOGIN'}">
		<b> Hello user </b>
		<c:import url="userhome.jsp"></c:import>
	</c:if>
	<c:if test="${clitype eq 'ADMINISTRATORS-LOGIN'}">
		<b> Hello administrator </b>
		<c:import url="adminhome.jsp"></c:import>
	</c:if>
</body>
</html>














































































