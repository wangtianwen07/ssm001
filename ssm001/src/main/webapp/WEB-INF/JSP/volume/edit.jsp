<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<title>add volume</title>
</head>
<body>
<form action="<%=basePath%>volume" method="post">
<!-- 实现put提交的隐藏域 -->
<input type="hidden" name="_method" value="put"/>
问卷uuid：<input type="text" name="uuid" id="uuid" value="${volume.uuid}">
问卷名称：<input type="text" name="name" id="name" value="${volume.name }">
<input type="submit" value="更新put问卷">
</form>
</body>
</html>