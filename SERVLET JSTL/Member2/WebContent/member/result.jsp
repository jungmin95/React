<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>�޴�</h3>
	<c:if test="${not empty sessionScope.id }">
	${sessionScope.id }�� �α���<br>
		
	</c:if>
</body>
</html>