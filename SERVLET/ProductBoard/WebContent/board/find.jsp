<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/conrol?type=update">
	��ǰ��ȣ : <input type="text" name="pno">
</form>

<form method="post" action="<%=request.getContextPath()%>/control?type=delete">

	������ ��ǰ��ȣ: <input type="text" name="pno">
	<input type="submit" value="����">
</form>
</body>
</html>