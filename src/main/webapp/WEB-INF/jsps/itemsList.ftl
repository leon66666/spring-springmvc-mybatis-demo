<#assign picPath="http://localhost:8998/ImageServer" />
<#assign projectName="Spring_4.1.9_SpringMVC_Mybatis_3.2.7" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>��ѯ��Ʒ�б�</title>
</head>
<body> 
<form action="${projectName }/items/deleteByIds.do" method="post">
��ѯ������
<table width="100%" border=1>
<tr>
<td><input type="submit" value="��ѯ"/></td>
<td><input type="submit" value="����ɾ��"/></td>
</tr>
</table>
��Ʒ�б�
<table width="100%" border=1>
<tr>
	<td>ID</td>
	<td>��Ʒ����</td>
	<td>��ƷͼƬ</td>
	<td>��Ʒ�۸�</td>
	<td>��������</td>
	<td>��Ʒ����</td>
	<td>����</td>
</tr>

<#list itemsList as item>
<tr>
	<td>
	<input type="checkbox" name="id" value="${item.id }">
	</td>
	<td>${item.name }</td>
	<td>
	<img id='imgSize1ImgSrc' src='${picPath }${item.pic }'  height="100" width="100" />
	</td>
	<td>${item.price }</td>
	<td></td>
	<td>${item.detail }</td>
	
	<td><a href="${projectName }/items/edit.do?id=${item.id}">�޸�</a>
	<a href="${projectName }/items/deleteByID.do?id=${item.id}">ɾ��</a>
	</td>

</tr>
</#list>


</table>
</form>
</body>

</html>