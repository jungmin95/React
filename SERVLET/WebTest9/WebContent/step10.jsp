<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//��û�� ���۹��
		String method = request.getMethod();
		out.print("���۹��: " + method + "<br");
		//��û ����� ����� ��� ������ �̸��� Enumeration���·� ��ȯ
		Enumeration<String> e = request.getHeaderNames();
		while(e.hasMoreElements()) {
			String name = e.nextElement();
		//��û�� ����� ����� �Ķ���� ������ �д´� �Ķ���ʹ� ������ �̸��� �����Ѵ�
		String value = request.getHeader(name);
		out.print("name : " + name + ", value : " + value + "<br");
		}
	%>
</body>
</html>