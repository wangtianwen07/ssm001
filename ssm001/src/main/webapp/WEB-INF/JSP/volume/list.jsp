<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list volume</title>
<script type="text/javascript" src="<%=basePath%>resources/jquery-3.2.1.js"></script>
<script>
function deleteVolume(volumeId) {
	$.ajax({
		type: 'delete',
		url: '<%=basePath%>volume/'+volumeId,
		dataType:'text',
		success:function(data) {
			if(data=='success') {
				alert("删除成功!");
				location.reload();
			}
		},
		error:function(data) {
			console.log(data);
		}
	});
}
</script>
</head>
<body>
<a href="<%=basePath%>volume/add">新增问卷</a>
<table>
	<tr>
		<th>问卷uuid</th>
		<th>问卷名称</th>
		<th>操作</th>
	</tr>
	<c:forEach var="volume" items="${list }">
		<tr>
			<td>${volume.uuid }</td>
			<td>${volume.name }</td>
			<td>
				<a href="<%=basePath%>volume/${volume.uuid}">查看问卷</a>
				<a href="<%=basePath%>volume/${volume.uuid}/edit">编辑问卷</a>
				<a href="javascript:void(0);" onclick="deleteVolume(${volume.uuid})">删除问卷</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>