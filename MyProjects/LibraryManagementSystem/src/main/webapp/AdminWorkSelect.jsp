
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Work</title>
</head>
<body>
	<c:set var="worktype" value="${param.worktype}" scope="session" />
	<c:if test="${worktype eq 'Book Insert'}">
		<b> Book Insert </b>
		<c:import url="bookinsert.jsp" />
	</c:if>
	<c:if test="${worktype eq 'Book View'}">
		<b> Book View </b>
		<c:import url="adminavail.jsp" />
	</c:if>
</body>

</html>
