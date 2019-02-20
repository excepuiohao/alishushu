<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>阿里叔叔</title>
<style>
* {
	margin: 0;
	padding: 0;
	font-family: 微软雅黑;
}

#body {
	background-color: rgb(244, 244, 244);
}

body a {
	color: black;
	text-decoration: none;
}

body a:hover {
	color: rgb(255, 218, 68);
}
/*å¤´é¨*/
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
/*ç¬¬ä¸é¨å*/
.body {
	margin-top: 140px;
}

aside li {
	line-height: 25px;
}

aside {
	width: 300px;
	float: left;
	color: black;
	margin-left: 0;
	margin-right: 25px;
}

#daxiao {
	width: 420px;
	height: 285px;
	overflow: hidden;
}

#lb {
	width: 420px;
	float: left;
}

.carousel-control {
	line-height: 285px;
}

.list-group-item a {
	color: black;
	text-decoration: none;
}

.list-group-item span a {
	font-size: 12px;
	color: #444;
}

.list-group-item span:first-child {
	font-size: 14px;
	color: black;
}

.lunbo {
	height: 320px;
}

.user {
	margin-left: 25px;
	width: 350px;
	height: 280px;
	border: solid 1px #ccc;
	border-radius: 3px;
	float: left;
}

.user {
	padding: 20px 15px 0 15px;
}

.user ul li {
	list-style: none;
	display: inline-block;
	padding: 0 15px;
	border: none;
	line-height: 25px;
	margin: 5px;
}

.user ul li:hover {
	background-color: rgb(255, 218, 68);
	color: #fff;
}
/*æ¨ªæ¡å±ç¤º*/
.jrbk {
	border-left: solid 3px rgb(255, 218, 68);
}

.hengt {
	list-style: none;
	/* margin-left: 18px;*/
	height: 170px;
	border-top: solid 1px #ccc;
}

.hengt li {
	float: left;
	width: 365px;
	position: relative;
	margin: 20px 11px 0 2px;
	font-size: 0;
}

.hengt li img {
	width: 100%;
}

.second {
	height: 700px;
}

.one, .two {
	width: 566px;
	height: 658px;
	background-color: #fff;
	padding: 5px 11px;
}

.one {
	float: left;
}

.two {
	float: right;
}

.one h3 {
	line-height: 24px;
	height: 24px;
	color: #999;
	font-weight: 400;
}

.com-hd {
	padding-left: 20px;
	margin-top: 20px;
	margin-bottom: 20px;
}

.com-hd p {
	font-size: 14px;
}

.com-hd p span {
	font-size: 24px;
	color: skyblue;
}

.com-bd {
	margin: 0 2px 10px 0;
	float: left;
}

.com-bd p:first-child {
	color: #4d4d4d;
}

.com-bd p:last-child {
	float: right;
	margin-right: 20px;
	color: skyblue;
}

.com-bd h4 a:hover {
	color: red;
	text-decoration: none;
}

.com-bd h4, .com-bd p {
	margin-left: 5px;
}

.tup {
	box-size: border-box;
	width: 179px;
	height: 179px;
	overflow: hidden;
	border: solid 1px #ccc;
	border-radius: 5px;
}

.tup img {
	opacity: .9;
	height: 100%;
	transition: all .3s;
}

.tup:hover {
	opacity: 0.7;
}
/*ç¬¬ä¸é¨å*/
.thr-one {
	float: left;
	padding: 15px 15px 0 15px;
	border: 1px solid transparent;
	color: #6c6c6c;
	width: 228px;
	height: 334px;
	overflow: hidden;
	position: relative;
	transition: border-color 0.3s;
	border-right-color: #f4f4f4;
	border-bottom-color: #f4f4f4;
	background-color: #fff;
}

.thr-one:hover {
	border: solid 1px #FF5000;
}

.thr-one div {
	background: #4f4f4f;
}

.thr-one h4 {
	margin-top: 7px;
	line-height: 22px;
	height: 44px;
	font-size: 14px;
	color: #666;
	font-weight: normal;
	transition: color 0.3s;
	overflow: hidden;
}

.thr-one img {
	height: 100%;
	/*transition: opacity 0.2s;
            opacity: 0.8*/
}

.thr-one p {
	margin-top: 22px;
	height: 24px;
	line-height: 24px;
}

.thr-one p span:first-child {
	float: left;
	color: #F40;
	font-size: 20px;
}

.thr-one p span:last-child {
	float: right;
	color: #9ca0aa;
	margin-top: 3px;
}

.dib img {
	width: 100%;
	margin-top: 20px;
}
/*åºé¨*/
footer {
	
}

.foot-one {
	background-color: #333333;
}

.foot-one div {
	width: 723px;
	height: 185px;
	margin: 0 auto;
}

.foot-one img {
	height: 100%;
}
/*ä¾§è¾¹æ */
.cbl {
	width: 50px;
	height: 120px;
	position: fixed;
	padding-top: 10px;
	top: 450px;
	right: 100px;
	border: solid 1px #ccc;
	border-radius: 8px;
	background-color: rgba(255, 255, 255, 0.3);
	text-align: center;
}

.cbl ul {
	list-style: none;
	font-size: 24px;
}
</style>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/amazeui.min.css">
<link rel="stylesheet" href="css/app.css">
<link rel="stylesheet" type="text/css" href="css/css.css" />
<link rel="stylesheet" type="text/css" href="css/manhuaDate.1.0.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script src="js/amazeui.min.js"></script>
<script type="text/javascript">
	
		function reply(fromid,messageid,itemid) {
			$('#my-prompt').modal({
				relatedTarget : this,
				onConfirm : function(e) {
					window.location.href='ReplyMessage?fromid=' + fromid + '&messcontext=' + e.data+'&messageid='+messageid+'&itemid='+itemid; 
				},
				onCancel : function(e) {
					alert('不想说!');
				}
			});
		};

	function confirmAct() {
		if (confirm('确定要忽略这条消息吗嗎?')) {
			return true;
		}
		return false;
	}
</script>
</head>
<body id="body">
	<header>
		<div class="head-one">
			<div class="container">
				<span style="float: left; margin: 10px 0 0 10px;">${sessionScope.users.uname }</span>
				<ul>
					<li><a href="#">联系客服</a></li>
					<li><a href="#">江苏无锡</a></li>
					<li><a href="#">消息 <span style="background-color: red;"
							class="badge">10</span></a></li>
					<li><a href="#">我要开店</a></li>
					<li><a href="#"><span
							class="glyphicon glyphicon-shopping-cart"></span> 购物车</a></li>
				</ul>
			</div>
		</div>
		<div class="container head-two">
			<h1 id="title">
				<b>阿里叔叔</b>
			</h1>
			<ul>
				<li><a href="#">首页</a></li>
				<li><a href="#">手机二手</a></li>
				<li><a href="#">二手车估价</a></li>
				<li><a href="#">降降降</a></li>
				<li><a href="#">发布闲置</a></li>
				<li><a href="#">我的闲置</a></li>
			</ul>
		</div>
	</header>

	<!-- ---------------------------------------------------- -->

	<div style="margin-top: 146px;"></div>

	<div class="conShow" style="position: relative; left: 370px">
		<table border="1" cellspacing="0" cellpadding="0">
			<tbody id="tb">
				<tr>
					<!-- <td width="250px" class="tdColor">bianhao</td> -->

					<td width="250px" class="tdColor">发送人</td>
					<td width="188px" class="tdColor">消息内容</td>
					<td width="282px" class="tdColor">发送时间</td>
					<td width="130px" class="tdColor" colspan="2">操作</td>
				</tr>
			</tbody>
			<c:forEach items="${message}" var="m">
				<tr style="height: 40px">
					<td>${m.fromid }</td>
					<td>${m.messcontext}</td>
					<td>${m.messtime }</td>
					<td><a
						onclick="return reply(${m.fromid},${m.messageid },${m.itemid });"><span
							class="glyphicon glyphicon-pencil"></span></a></td>
					<td><a href="DeleteMessage?messageid=${m.messageid}"
						onclick="return confirmAct();"><span
							class="glyphicon glyphicon-trash"></span></a></td>
				</tr>
			</c:forEach>
			<!-- <tr><td> <img class="operation delban"
								src="img/delete.png"></td></tr> -->
		</table>
	</div>
	<div>
		<div class="am-modal am-modal-prompt" tabindex="-1" id="my-prompt">
			<div class="am-modal-dialog">
				<div class="am-modal-bd">
					输入你的内容 <input type="text" class="am-modal-prompt-input">
				</div>
				<div class="am-modal-footer">
					<span class="am-modal-btn" data-am-modal-cancel>取消</span> <span
						class="am-modal-btn" data-am-modal-confirm>回复</span>
				</div>
			</div>
		</div>
	</div>
	<!-- ---------------------------------------------------- -->
	<!--     加内容 -->
	<div class="dib">
		<img src="../img/dibu1.bmp" />
	</div>
	</div>
	<nav>
		<div class="cbl">
			<ul>
				<li><a href="#_one"><span
						class="glyphicon glyphicon-hand-up"></span></a></li>
				<li><a href="#_two"><span
						class="glyphicon glyphicon-heart-empty"></span></a></li>
				<li><a href="#_five"><span class="glyphicon glyphicon-fire"></span></a></li>
			</ul>
		</div>
	</nav>
	<footer id="footer">
		<div class="foot-one">
			<div>
				<img src="../img/footer.bmp" />
			</div>
		</div>
		<div class="foot-two"></div>
	</footer>
	<script>
		$('#myCarousel').carousel({
			//è®¾ç½®èªå¨æ­æ¾/2 ç§
			interval : 3000,
		});
	</script>
</body>
</html>