<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="model.MemberVO, java.util.HashMap"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
1. scriptlet�� ȸ������ ����ϱ� <br>
<%MemberVO vo = (MemberVO)session.getAttribute("mvo"); %>
���̵� : <%=vo.getId() %> �̸� : <%=vo.getName() %> �ּ� : <%=vo.getAddress() %><br>

2. el�� ȸ�������� ��� <br>
���̵� : ${sessionScope.mvo.id }
�̸� : ${sessionScope.mvo.name }
�ּ� : ${sessionScope.mvo.address } <br>
<!--  ${mvo.address}�� ������ �ȴ�.�� ? ���� ������ �˻��ϹǷ� -->

<% String[] names=(String[])session.getAttribute("names"); %>

3.�迭 ��� scriptlet<br>
<%=names[0] %>, <%=names[1] %>, <%=names[2] %><br>

4. �迭��� el<br>
${sessionScope.names[0]},${sessionScope.names[1]},${sessionScope.names[2]}<br>

<%
	HashMap map = (HashMap)session.getAttribute("memMap");
	MemberVO vo1=(MemberVO)map.get("mem1");
	MemberVO vo2=(MemberVO)map.get("mem2");
%>

5. HashMap��� scriptlet<br>
map key : mem1 ���� �̸�:<%=vo1.getName() %> �ּ� : <%=vo1.getAddress() %><br>
map key : mem2 ���� �̸�:<%=vo2.getName() %> �ּ� : <%=vo2.getAddress() %><br>

6. HashMap��� el<br>
map key : mem1���� �̸�:${sessionScope.memMap.mem1.name }
map key : mem2���� �̸�:${sessionScope.memMap.mem2.name }
<hr>
</body>
</html>