<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!--  ���� ��ü�� ������ �ƴϸ� �α��� ����� result�Ӽ����� ����Ǿ� �����Ƿ� �� ���� �д´� -->
	<!--  ���� ������ �����̸� result�Ӽ��� ���� -->
	<%
		boolean result = false;
	if (!session.isNew()) {
		result = (boolean) session.getAttribute("result");

	}
	//result�� true�̸� �������� �α��� ���� �޼����� ����ϰ� ���ǿ� ����� id�� �о ����Ѵ�.
	//<a href="loginForm.jsp"> �α��� ��</a>�� �α׾ƿ� �������� �̵��Ҽ� �ֵ��� ��ũ�� �������.
	// ���� ������ �����̶�� result�� boolean result = false;�� �ʱ�ȭ �߱� ������ false�̴�.
	String id = "";
	if (result) {
		id = (String) session.getAttribute("id");
	%>
	�α��� ����
	<br>
	<%=id%>�� �ݰ����ϴ�.
	<br>
	<a href="logout.jsp">�α׾ƿ�</a>
	<%
		} else {
	%>
	<!--  result�� false�̸� �α��� ���� �޼����� ����Ѵ�. �α��� �� �� �ִ� ������ �̵��� �� �ִ� ��ũ�� ���� -->
	�α��� ����
	<br>
	<a href="loginForm.jsp">�α��� ��</a>
	<%
		}
	%>
</body>
</html>