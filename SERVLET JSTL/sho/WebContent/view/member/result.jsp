<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
${sessionScope.id }�� �α��� ����<br>
<a href="${pageContext.request.contextPath }/SearchController">�� ���� ����</a><br>
<a href="${pageContext.request.contextPath }/LogoutController">�α׾ƿ�</a><br>
<a href="${pageContext.request.contextPath }/DelController">Ż��</a><br>
<a href="${pageContext.request.contextPath }/seller/List">���θ�</a><br>
</body>
</html>