<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty m }">
<form action="${pageContext.request.contextPath }/EditController" method="post">
	<table border="1">
		<tr>
			<td>id</td>
			<td><input type="text" name="id" value="${m.id }" readonly></td>
			<c:if test="${m.type==1 }">�Ǹ���</c:if>
			<c:if test="${m.type==2 }">������</c:if>
		</tr>
		<tr>
			<td>pwd</td>
			<td><input type="text" name="pwd" value="${m.pwd }"></td>
		</tr>
		<tr>
			<td>name</td>
			<td><input type="text" name="name" value="${m.name }"></td>
		</tr>
		<tr>
			<td>email</td>
			<td><input type="text" name="email" value="${m.email }"></td>
		</tr><tr>
			<td>address</td>
			<td><input type="text" name="addr" value="${m.addr }"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="����"></td>
		</tr>
	</table>
</form>
</c:if>

</body>
</html>