<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>�̹��� �ø���</h3>
	<%-- <form action="${pageContext.request.contextPath }/WriteController" method="post" enctype="multipart/form-data"> --%>
	<!-- 	���� : <input type="text" name="title"><br> -->
	<!-- 	�Խ��� : <input type="text" name="writer"><br> -->
	<!-- 	�̹��� : <input type="file" name="path"><br> -->
	<!-- 	<input type="submit" value="�ø���"> -->
	<!-- </form> -->

	<form action="${pageContext.request.contextPath }/WriteController"
		method="post" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<td>����</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>�Խ���</td>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<td>�̹���</td>
				<td><input type="file" name="path"></td>
			</tr>
			<tr>
				<td><input type="submit" value="�ø���"></td>
			</tr>

		</table>
	</form>

</body>
</html>