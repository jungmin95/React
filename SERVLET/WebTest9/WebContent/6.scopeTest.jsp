<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<%
	
	String myPage = (String)pageContext.getAttribute("pageScope");
	String myRequest = (String)request.getAttribute("requestScope");
	String mySession = (String)session.getAttribute("sessionScope");
	String myApplication = (String)application.getAttribute("applicationScope");
	
	%>
	
	pageScope = <%=myPage %><br>
	requestScope = <%=myRequest %><br>
	sessiontScope = <%=mySession %><br>
	applicationScpoe = <%=myApplication %><br>
	<a href="7.scopeTest.jsp">���� �������� �̵�</a>
</body>
</html>