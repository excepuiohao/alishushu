<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<base href="basePath">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/css/info.css"/>

</head>

<body>
<div id="apDiv1">
<div id="apDiv2">
<div id="apDiv3">
<img src="123.jpg" style="margin-left: 50px; margin-top:20px"/>
</div>
<div id="apDiv4"><ul style="list-style-type:none; margin-left:10px; margin-top:-15px">
<font color="#FF3300">账号管理</font>	
<li><a href="info2.jsp">个人资料</a></li>
<li><a href="">收货地址</a></li>
<li><a href="">个人交易</a></li>
<li><a href="">网站提醒</a></li>
<li><a href="">个人成长信息</a></li>
</ul></div>
</div>

<div id="apDiv5"></div>
</div>

</body>
</html>