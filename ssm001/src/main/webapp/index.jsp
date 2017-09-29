<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<body>
  <a href="<%=basePath %>volume/8a4082025e6578f5015e65834c800004">查看问卷</a>
  <a href="<%=basePath %>volume/add">新建问卷</a>
  <a href="<%=basePath %>volume">问卷列表</a>
  <hr>
</body>
</html>
