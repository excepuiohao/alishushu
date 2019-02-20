<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
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

<script type="text/javascript" src="<%=path %>/js/ssx.js"></script>
<script type="text/javascript" src="<%=path %>/js/idcard.js"></script>
<script type="text/javascript" src="<%=path %>/js/jquery.min.js"></script>
<style type="text/css">
#apDiv1 {
	position:absolute;
	left:200px;
	width:900px;
	height:600px;
	
	z-index:1;
	border:solid #E7E7E7 1px
}
#apDiv2 {
	position:absolute;
	width:200px;
	height:600px;
	z-index:2;
	border:solid #E7E7E7 1px
}
#apDiv3 {
	position:absolute;
	width:202px;
	height:164px;
	z-index:3;
	left: -1px;
	top: -2px;
}
#apDiv4 {
	position:absolute;
	width:202px;
	height:435px;
	z-index:4;
	top: 164px;
	<!--border:solid #b0c4de 1px;-->
	left: -1px;
}
#apDiv5 {
	position:absolute;
	width:699px;
	height:600px;
	z-index:1;
	left: 202px;
	border:solid  #b0c4de 1px;
}

a:hover {
    color: #F30;
 text-decoration: none;}    /* 鼠标悬浮在上的链接 橙色 */

a:link {
	text-decoration: none}
</style>
<script type="text/javascript">
$(function(){
	$("#ph").click(function(){
		alert("1111");
		$("#pe").removeAttr("readonly");
		$("#un").removeAttr("readonly");
		
	})
	$("a1").click(function(){
		window.location = "../updateImg";
	})
})
</script>
</head>
<body>
<div id="apDiv1">
<div id="apDiv2">
<div id="apDiv3">
<img src="../${users.photo}"  style="margin-left: 20px; margin-top:20px;  " width=80%; height=80%/>
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
  <div id="apDiv5">
  <font style="height: 20px; margin-left: 20px">基本资料</font>

<hr color="#b0c4de" width="100%" size="1px"/>
<form action="../PerfectPersonalInformation" method="post" enctype="multipart/form-data">
<table cellspacing="20px">
<tr><td colspan="2">*亲爱的${users.usersid }，填写真实的资料，有助于好友找到你哦。</td></tr>
<tr><td width="30%">*当前头像：</td><td width="70%">
<img src="../${users.photo}" width=120px; height=120px/>修改:<input type="file" name="uploadFile"/>
</td></tr>
<tr><td width="30%">*昵称：</td><td width="70%"><input type="text" readonly="readonly" value="${users.nickname }"/></td></tr>
<tr>
<td width="30%">*身份证：</td>
<td width="70%">${users.idcard }
<c:if test="${empty users.idcard}">
<input type="text" onblur="IdentityCodeValid()" id="name1" name="idcard"/>
</c:if>
</td>
</tr>
<tr><td width="30%">*姓名：</td>
<td><c:if test="${ empty users.uname}">
<input type="text" name="uname"/>
</c:if>
<c:if test="${not empty users.uname}">
<input type="text" readonly="readonly" id = "un" value="${users.uname }"/>
</c:if>
</td>
</tr>
<tr><td width="30%">*电话：</td>
<c:if test="${ empty users.phone}">
<td><input type="text" name="phone" /></td>
</c:if>
<c:if test="${not empty users.phone}">
<td width="70%">
<input type="text"  readonly="readonly" id = "pe" value="${users.phone }"/></td>
</c:if>
</tr>

<tr><td width="30%">*默认地址：</td>
<c:if test="${users.address!='nullnullnull'}">
<td><input type="text" name="address" value="${users.address}" readonly="readonly"/></td>
</c:if>
<c:if test="${users.address=='nullnullnull'}">
<td>
<select id="cmbProvince" name="cmbProvince"></select>
<select id="cmbCity" name="cmbCity"></select>  +
<select id="cmbArea" name="cmbArea"></select>  
<script type="text/javascript">  
addressInit('cmbProvince', 'cmbCity', 'cmbArea');  
</script>  
</td>
</c:if>
</tr>
</table>
<hr color="#b0c4de" width="90%" size="1px">
<input type="submit" value="保存" style="margin-left: 160px; background: orange; color: white; border: none; border-radius:5px;  height: 21.5px ; width: 60px"/>
 </form>
 <div id="ph"  style="margin-left: 360px; margin-top:-22px; background:orange; width: 50px; height: 21.5px ; width: 60px ;border-radius:5px ;color: white; text-align:center">修改</div>
  </div>

 
</div>
</body>
</html>