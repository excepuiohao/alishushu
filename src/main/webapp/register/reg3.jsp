<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 70%;
	height: 150px;
	z-index: 1;
	left: 227px;
	top: 1px;
	background-color: #F2FDF4;
}
#apDiv2 {
	position: absolute;
	width: 464px;
	height: 328px;
	z-index: 2;
	left: 228px;
	top: 201px;
}
/*input 的格式设置*/
.ginput1{ width:25px; height:25px; border-radius:20px; background-color:#3FD8D8; border:solid #3FD8D8 1px; color:#FFF}

/*div 的格式设置*/
.div1{ padding-left:10%; padding-top:1%}

/*font 的格式设置*/
.font1{ font-family:"Palatino Linotype", "Book Antiqua", Palatino, serif; font-weight:500}

.font2{ font-size:14px}

.font3{ font-size:14px; font-weight:bold}

</style>
</head>

<body>
<!--注册成功标题-->
<div id="apDiv1" class="div1">
  <input type="button" value="♪"  class="ginput1"/>
  <font class="font1" >恭喜注册成功，你的账户为:${usersid }</font>
  <ul type="none">
    <li><font class="font2">登录名:</font><font  color="#C05730" class="font2"> ${emailed }</font><font class="font2">（你的账号通用于支付宝、天猫、一淘、聚划算、来往、阿里云、阿里巴巴）</font></li><br />
    <li><font class="font2">会员名:</font><font  color="#C05730" class="font2">${nickname }</font></li>
   
  </ul>
  <font color="#C05730" class="font2"><a href="login/login.jsp">登录界面</a></font>
</div>


</body>
</html>