<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import = "java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!
	private int count;
%>
<font size=6 color=red>
count : <%=count++ %>, ���� �ð� : <%=new Date().toString() %>
</font>
</body>
</html>