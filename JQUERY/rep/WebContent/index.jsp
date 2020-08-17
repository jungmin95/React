<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/httpRequest.js"></script>
<script type="text/javascript">
//������ �ε�(����)���� ���� ����� �Լ� ���
//�������� ���۵��ڸ��� db�� �ִ� ��� ���� �о�� ȭ�鿡 ����ϴ� ���� ����
//ajax�� controller�� articleList��û
	window.onload=function(){
		var param = "type=articleList";
		sendRequest("${pageContext.request.contextPath}/Controller", 
				param, listResult, "POST");
	}
	
	//�� ajax��û�� ���ó�� �Լ�
	function listResult(){
		if(httpRequest.readyState==4){
			if(httpRequest.status==200){
				//ajax ����� json�� �޾ƿ´�.
				//����� []������ �迭�� eval()�� �̸� �迭�� ��ȯ����. �� commentList�� ��� ���� ����� �迭
				var commentList = eval("(" + httpRequest.responseText + ")");
				//��� �۵��� ����� ������ id�� commentList�� div ��ü�� �о��
				var listDiv = document.getElementById('commentList');
				//�迭 commentList�� ���̸�ŭ �ݺ���
				for(i=0;i<commentList.length;i++){
					//�Լ� makeCommentView()�� ȣ���Ͽ� �� �ϳ��� ����� div�� �����Ͽ� �� ������ �����
					var commentDiv = makeCommentView(commentList[i]);
					//������ �� �ϳ� ����� div�� id�� commentList�� div�� �ڽ����� �߰�
					listDiv.appendChild(commentDiv);
				}
			}
		}
	}
	
	//������ ����Ѵ� �Լ�
	//�ۼ����� �Է��� �̸�, ������ �Ķ���ͷ��Ͽ� ������ �񵿱� ��û
	function addComment() {
		var name = document.addForm.name.value;
		var content = document.addForm.content.value;
		var param = "type=addArticle&name="+encodeURIComponent(name)
		+"&content="+encodeURIComponent(content);
		sendRequest("${pageContext.request.contextPath}/Controller", 
				param, addResult, "POST");
	}
	
	//���� ����� ��� �Լ�
	function addResult(){	
		if(httpRequest.readyState==4){
			if(httpRequest.status==200){
				
				//���� �߰��� ���� json��ü�� ����. �̸� eval() �Լ��� ��ü�� ��ȯ�Ͽ� comment�� ����
				var comment = eval("(" + httpRequest.responseText + ")");
				//��� �۵��� ����� ������ id�� commentList�� div ��ü�� �о��
				var listDiv = document.getElementById('commentList');
				//�Լ� makeCommentView()�� ȣ���Ͽ� �� �ϳ��� ����� div�� �����Ͽ� �� ������ �����
				var commentDiv = makeCommentView(comment);
				//������ �� �ϳ� ����� div�� id�� commentList�� div�� �ڽ����� �߰�
				listDiv.appendChild(commentDiv);
				
				//���� ������� �ʱ�ȭ
				document.addForm.name.value = '';
				document.addForm.content.value = '';
				
				alert("����߽��ϴ�!["+comment.num+"]");
			}
		}
	}
	
	//�� �ϳ��� ����� div�� �����Ͽ� �����ϴ� �Լ�
	function makeCommentView(comment) {
		//div�� �ϳ� �����Ѵ�.
		var commentDiv = document.createElement('div');
		
		//������ div�� id�� c�۹�ȣ�� �����Ѵ�.
		commentDiv.setAttribute('id', 'c'+comment.num);
		
		//������ div�� ����� ������ �����. �ۼ���/�۳���/������ư/������ư
		//������ư�� Ŭ���ϸ� viewUpdateForm()�� ȣ���ϰ� ���� ��ư�� Ŭ���ϸ� confirmDeletion()�� ȣ���Ѵ�.
		var html = '<strong>'+comment.name+'</strong><br/>'+
			comment.content.replace(/\n/g, '\n<br/>')+'<br/>'+
			'<input type="button" value="����" '+
			'onclick="viewUpdateForm('+comment.num+')"/>'+
			'<input type="button" value="����" '+
			'onclick="confirmDeletion('+comment.num+')"/>' ;	
			
		//������ �ۼ��� ������ div�� ����Ѵ�.
		commentDiv.innerHTML = html;
		//div�� css Ŭ������ comment�� ����
		commentDiv.className = "comment";
		//������ div ����
		return commentDiv;
	}
	
	//�������� ����ϱ����� ������ ���� ���� ������ �񵿱�� ��û
	function viewUpdateForm(num){
		var param = "type=editForm&num="+num;
		sendRequest("${pageContext.request.contextPath}/Controller", 
				param, viewUpdateForm2, "POST");
	}
	
	//������ ��û�� ����Լ�
	function viewUpdateForm2() {
		if(httpRequest.readyState==4){
			if(httpRequest.status==200){
				//���� ���� ���� json���� �޾ƿ� eval()�Լ��� ��ü�� ��ȯ�ϰ� �̸� comment�� ����
				var comment = eval("(" + httpRequest.responseText + ")");
				//���� ���� ����ϴ� div��ü�� �о��
				var commentDiv = document.getElementById('c'+comment.num);
				//�������� ����ϴ� div��ü�� �о��
				var updateFormDiv = document.getElementById('commentUpdate');
				//�������� ������ ��ġ �� ���۵�� �� �ؿ��� �߶� ������ div�� �ڽ����� �߰�
				if (updateFormDiv.parentNode != commentDiv) {
					updateFormDiv.parentNode.removeChild(updateFormDiv);
					commentDiv.appendChild(updateFormDiv);
				}

				//�������� ����Ʈ�� ����� ������ �������� ������ ����Ѵ�.
		 		document.updateForm.id.value = comment.num;
		 		document.updateForm.name.value = comment.name;
		 		document.updateForm.content.value = comment.content;
		 		//�������� ���̰� ����
				updateFormDiv.style.display = '';
			}
		}
	}
	
	//������ҹ�ư�� ������ ȣ��Ǵ� �Լ�
	//�������� �ڽ����� �Ǿ��ִ� ������ div ��ü�� �߶� ���� ��ġ�� �ǵ����� �ٽ� �Ⱥ��̰� ����
	function cancelUpdate() {
		var updateFormDiv = document.getElementById('commentUpdate');
		updateFormDiv.style.display = 'none';
		updateFormDiv.parentNode.removeChild(updateFormDiv);
		document.documentElement.appendChild(updateFormDiv);
	}
	
	//������ư�� ������ ȣ��Ǵ� �Լ��� �����ϷḦ ����
	function updateComment(){
		//�������� ���� �� �۹�ȣ, �̸�, ������ �Ķ���ͷ� �����Ͽ� ��Ʈ�ѷ��� �����ϷḦ ��û
		var num = document.updateForm.id.value;
		var name = encodeURIComponent(document.updateForm.name.value);
		var content = encodeURIComponent(document.updateForm.content.value);
		var params = "type=edit&num="+num+"&name="+name+"&content="+content;
		sendRequest("${pageContext.request.contextPath}/Controller", 
				params, updateResult, "POST");
	}
	
	//�����Ϸ��û�� ����Լ�
	function updateResult(){
		if(httpRequest.readyState==4){
			if(httpRequest.status==200){
				//������ ���� json���� ����. �̸� eval()�� ��ü�� ��ȯ�Ͽ� comment�� ����
				var comment = eval("(" + httpRequest.responseText + ")");
				//��� �۵��� ����� ������ id�� commentList�� div ��ü�� �о��
				var listDiv = document.getElementById('commentList');
				//�Լ� makeCommentView()�� ȣ���Ͽ� ������ �� �ϳ��� ����� div�� �����Ͽ� �� ������ �����
				var newCommentDiv = makeCommentView(comment);
				//�����Ǳ� ���� �۳����� ����ߴ� div�� ���� ����� �۳����� �����div�� ��ü
				var oldCommentDiv = 
				        document.getElementById('c'+comment.num);
				listDiv.replaceChild(newCommentDiv, oldCommentDiv);
			}
		}
	}
	
	//������ư�� ����� ȣ��Ǵ� �Լ��� �����ǻ縦 �����. Ȯ���� ������ del()�� ȣ��
	function confirmDeletion(num){
		var flag = confirm("���� �����ϰڽ��ϱ�?");
		if(flag){
			del(num);
		}else{
			alert("��ҵǾ����ϴ�.");
		}
	}
	
	//��Ʈ�ѷ��� �� �ϳ� ���� ��û. �Ķ���ͷ� �۹�ȣ ����
	function del(num){
		var params = "type=del&num="+num;
		sendRequest("${pageContext.request.contextPath}/Controller", 
				params, delResult, "POST");
	}
	
	//������û ��� �Լ�
	function delResult(){
		if(httpRequest.readyState==4){
			if(httpRequest.status==200){
				//������ ���� �۹�ȣ�� json���·� �޾ƿ�
				var obj = eval("(" + httpRequest.responseText + ")");
				var num = obj.num;
				//�ϳ��� ���� ����ϴ� div�� id�� c�۹�ȣ�� �Ǿ� �����Ƿ� ������ ���� ��ȣ�� �ش� ���� ��µ� div�� ã�� �����Ѵ�.
				var delDiv = document.getElementById('c'+num);
				delDiv.parentNode.removeChild(delDiv);
			}
		}
	}
</script>
<style>
	div.comment {
		border: 1px solid #000;
		padding-bottom: 3px;
	}
</style>
</head>
<body>
<div id="commentList"></div>
<div id="commentAdd">
	<form action="" name="addForm">
	�̸�: <input type="text" name="name" size="10"><br/>
	����: <textarea name="content" cols="20" rows="2"></textarea><br/>
	<input type="button" value="���" onclick="addComment()"/>
	</form>
</div>

<!-- ������ ����Ʈ�� �Ⱥ��̰� ���� -->
<div id="commentUpdate" style="display: none">
	<form action="" name="updateForm">
	<input type="hidden" name="id" value=""/>
	�̸�: <input type="text" name="name" size="10"><br/>
	����: <textarea name="content" cols="20" rows="2"></textarea><br/>
	<input type="button" value="���" onclick="updateComment()"/>
	<input type="button" value="���" onclick="cancelUpdate()"/>
	</form>
</div>

</body>
</html>


