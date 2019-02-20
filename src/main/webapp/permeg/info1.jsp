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
<img src="${users.photo}"  style="margin-left: 20px; margin-top:20px;  " width=80%; height=80%/>
</div>
<div id="apDiv4"><ul style="list-style-type:none; margin-left:10px; margin-top:-15px">
<font color="#FF3300">账号管理</font>	
<li><a href="permeg/info2.jsp">个人资料</a></li>
<li><a href="">收货地址</a></li>
<li><a href="">个人交易</a></li>
<li><a href="">网站提醒</a></li>
<li><a href="">个人成长信息</a></li>
</ul></div>
</div>
  <div id="apDiv5">
  <font style="margin-left: 10px">您的基础信息</font>
  <table cellspacing="10px">
  
  <tr><td>会员名</td><td>${users.nickname }</td></tr>
  <tr><td>登录邮箱</td><td>${users.email }</td>
  <td><a href=""><font color="#3399FF">修改邮箱</font></a></td>
  </tr>
  </table>
 <hr color="#b0c4de" width="90%" size="1px">
 <font style="margin-left: 10px">您的安全服务</font>
   <table cellspacing="20px">
   
   <tr>
   <td >身份认证</td>
   <td id="ta1">用于提升账号的安全性和信任级别。认证后的有卖家记录的账号不能修改认证信息。</td>
   <td><a href=""><font color="#3399FF">查看</font></a></td>
   <tr>
   <td>登录密码</td>
   <td id="ta1">安全性高的密码可以使账号更安全。建议您定期更换密码，且设置一个包含数字和字母，并长度超过6位以上的密码。</td>
   <td><a href=""><font color="#3399FF">修改密码</font></a></td>
   <tr>
   <td>密保问题</td><td>是您找回登录密码的方式之一。建议您设置一个容易记住，且最不容易被他人获取的问题及答案，更有效保障您的密码安全。</td><td><a href=""><font color="#3399FF">设置</font></a></td>
   </table>
  </div>
</div>
</body>
</html>