<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'storeindex.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
* {
	margin: 0;
	padding: 0;
	font-family: 微软雅黑;
}

a {
	color: black;
	text-decoration: none;
}

a:hover {
	color: rgb(255, 218, 68);
}

#a1 {
	color: black;
	text-decoration: none;
}

#a1:hover {
	color: red;
}
/*头部*/
header {
	padding: 0;
	margin: -15px auto 0;
	width: 100%;
	background-color: rgb(255, 218, 68);
	position: fixed;
	top: 15px;
	z-index: 99;
}

.head-one {
	width: 100%;
	background-color: #fff;
}

.head-one ul {
	list-style: none;
}

.head-one ul li {
	float: right;
	margin-top: 8px;
}

.head-one a {
	text-decoration: none;
	display: inline-block;
	margin: 0 15px 10px;
	padding: 0 10px;
	line-height: 25px;
	border: solid 1px #ccc;
	border-radius: 3px;
	background-color: #fff;
	color: #3c3c3c;
}

.head-one a:hover {
	color: rgb(255, 218, 68);
}

.head-one a span {
	margin-bottom: 2px;
}

.head-two {
	height: 80px;
}

.head-two h1 {
	float: left;
}

#title {
	font-family: 幼圆;
}

.head-two ul li {
	list-style: none;
	display: inline-block;
	padding: 0 20px;
	line-height: 80px;
	font-size: 16px;
}

.head-two ul li a {
	text-decoration: none;
}

.head-two ul li a:hover {
	color: white;
}

.head-two li:first-child {
	margin-left: 150px;
}

.head-two a {
	color: black;
}

#apDiv1 {
	width: 900px;
	height: 115px;
	z-index: 1;
	border: solid #999 2px;
	box-shadow: 10px 10px 10px #888888;
}

#store {
	position: fixed;
	top: 130px;
	left: 220px;
	width: 205px;
	height: 320px;
	padding: 0 20px;
	border: solid #CCC 1px;
	border-radius: 10px;
}

#store h3,#store h4 {
	margin-top: 20px;
}

#star span {
	margin-top: 5px;
	font-size: 20px;
}
</style>

<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/font-awesome.min.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script type="text/javascript">
 /* $(function(){
	 $("#a1").hover(function(){
			$("#a1").css("color","red");		   
					   })
 }) */
 function star(){
	 var n=${myshop.star};
	 $("#star span").each(function(i){
		 if(i<n){
			 $(this).css("color","red");		 
		 }
		 
	 })
 }
 $(function(){
 	var i=1;
 	$("#message").click(function(){
 		var left=$(this).offset().left;
 		var bottom=$(this).offset().top+$(this).outerHeight(); 
 		$("#dropdown").css("position","fixed").css("top",bottom).css("left",left).css("z-index","100");
 		if(i==1){
 	    $(this).css("decoration","none");
 		$(this).css("width",$(this).outerWidth()); 
 		$("#message span").css("display","none");
 		i=2;
 		}
 		else if(i==2){
 			$(this).css("decoration","none");
 			$(this).css("width",""); 
     		$("#message span").css("display","inline-block");
 			i=1;
 		}
 	});
 	
 	$(".additem").click(function(){
 		$.post("additem",function(data){
 			$("#itemall").css("display","none");
 			$("#additem").html(data);
 			
 		});	
 	})
 	
 })
 </script>
</head>

<body
	style=" background: url(//img.alicdn.com/tps/i1/T1ki_gXnVdXXbiasPg-44-34.gif) repeat 0 0;"
	onload="star()">
	<div class="dropdown" id="dropdown">
		<ul class="dropdown-menu">
			<li><a href="#">系统消息<span style="background-color: red;"
					class="badge">2</span></a></li>
			<li><a href="#">留言消息<span style="background-color: red;"
					class="badge">3</span></a></li>
			<li><a href="#">订单消息<span style="background-color: red;"
					class="badge">5</span></a></li>
		</ul>
	</div>
	<header>
	<div class="head-one">
		<div class="container">
			<c:choose>
				<c:when test="${users!=null }">
					<span style="float: left; margin: 10px 0 0 10px;">Hi~${users.nickname}</span>
					<ul>
						<li><a href="RobotMM.jsp">联系客服</a></li>
						<li><a href="permeg/info2.jsp">完善信息</a></li>
						<li><a href="ch/order.jsp">查看订单</a></li>
						<li><a id="message" data-toggle="dropdown"
							data-target="#dropdown"> 消息 <span
								style="background-color: red;" class="badge">10</span> <span
								class="caret"></span></a></li>
						<li><c:choose>
								<c:when test="${shopcount!=0}">
									<a href="selectallitem">我的店铺</a>
								</c:when>
								<c:otherwise>
									<a href="shop/shop1.jsp">我要开店</a>
								</c:otherwise>
							</c:choose></li>
						<li><a href="shopcar?userid=${userid}"><span
								class="glyphicon glyphicon-shopping-cart"></span> 购物车</a></li>
					</ul>

				</c:when>
				<c:otherwise>
					<a style="float:left;margin-top:8px;" href="login/login.jsp">请登录</a>
					<ul>
						<li><a href="login/login.jsp">联系客服</a></li>
						<li><a href="login/login.jsp">完善信息</a></li>
						<li><a href="login/login.jsp">查看订单</a></li>
						<li><a href="login/login.jsp">消息 <span
								style="background-color: red;" class="badge">10</span></a></li>
						<li><a href="login/login.jsp">我要开店</a></li>
						<li><a href="login/login.jsp"><span
								class="glyphicon glyphicon-shopping-cart"></span> 购物车</a></li>
					</ul>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	<div class="container head-two">
		<h1 id="title">
			<b>阿里叔叔</b>
		</h1>
		<ul>
			<li><a href="#">首页</a></li>
			<li><a href="#">手机二手</a></li>
			<li><a href="https://www.guazi.com">二手车估价</a></li>
			<li><a class="additem">添加商品</a></li>
			<li><a href="#">发布闲置</a></li>
			<li><a href="#">我的闲置</a></li>
		</ul>
	</div>
	</header>
	<div id="store">
		<h3 style="margin-left:-20px">
			<span style="font-family:幼圆; color:red">${myshop.shopname}</span>
		</h3>
		<h4>店主：${username}</h4>
		<h4 id="star">
			店铺星级：<br /> <span class="fa fa-star" style="color:#CCC;" id="s1"></span>
			<span class="fa fa-star" style="color:#CCC;" id="s2"></span> <span
				class="fa fa-star" style="color:#CCC;" id="s3"></span> <span
				class="fa fa-star" style="color:#CCC;" id="s4"></span> <span
				class="fa fa-star" style="color:#CCC;" id="s5"></span>
		</h4>
		<h4>
			地址：<br />${myshop.shopaddr}</h4>
		<h4>
			店主承诺：<br />七天包退，12天包换，12内小时发货，全天在线
		</h4>
	</div>
	<div id="itemall"  style="position:relative;top:145px; left:450px">
		<c:forEach var="allitem" items="${allitem}">
			<div
				style="box-shadow: 10px 10px 5px #888888; border:solid #999 2px;height:150px; width:850px; background-color:white">
				<img src="${allitem.itempic}"
					style="position:relative;top:20px; left:10px;height:100; width:130" />
				<span style="position:relative;top:-20px; left:40px; width:30px"
					id="s1"> <a href="#" id="a1">${allitem.itemname}</a></span> <span
					style="position:relative; left:-10px; top:5px">￥<span
					style=" color:#F00">${allitem.price}</span></span>
				<p style="font-size:12px; position:relative; left:170px;top:-25px">${allitem.iteminfo}</p>
				<span
					style="position:relative; left:170px; top:-25px; font-size:14px">1分钟前
					<span style="color:#666"> 来自</span> <img src="img/xianyu.PNG"
					style="position: relative;" />
				</span> 
				<c:if test="${stateee!=null }">
				<a href=""><img src="img/update.png"
					style="position:relative; left:600px; top:-20px"></a> <a
					href="deleteitem?itemid=${allitem.itemid}"><img
					src="img/delete.png"
					style="position:relative; left:610px; top:-20px" /></a>
					</c:if>
			</div>
			<br />
			<br />
		</c:forEach>
	</div>
	<div id="additem" style="position:relative;top:145px; left:450px"></div>
</body>
</html>