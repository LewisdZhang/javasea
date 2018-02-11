<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<html>
<body>
<h2>Hello World!</h2>

 SessionID:<%=session.getId()%><BR>
 SessionIP:<%=request.getServerName()%> <BR>
 SessionPort:<%=request.getServerPort()%>
 <%     out.println("This is Tomcat Server TEST ！");     %>
</body>
</html>
