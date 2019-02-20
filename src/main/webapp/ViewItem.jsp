<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Title</title>
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

footer {
	margin-top: 50px;
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

.syl {
	margin-top: 150px;
}

.show-img {
	width: 690px;
	height: 490px;
	border: solid 1px #ccc;
	float: left;
	margin-top: 30px;
}

.show-img img {
	height: 99%;
	margin-left: 50%;
	transform: translateX(-50%);
	margin-top: 3px;
}

.ifo-img {
	width: 440px;
	height: 578px;
	float: right;
}

.ifo-img h1 {
	font: 700 16px/24px "Microsoft YaHei";
	font-size: 22px;
	line-height: 31px;
}

.ifo-img p {
	font-size: 17px;
	margin-left: 8px;
	line-height: 25px;
}

.ifo-img p em {
	color: #FF4400;
	font-size: 27px;
}

#add {
	width: 200px;
	height: 40px;
	border: none;
	border-radius: 5px;
	background-color: rgb(255, 218, 68);
	margin: 10px 0 30px 100px;
	color: #000;
	font-size: 16px;
}

.nav1 {
	line-height: 42px;
	width: 680px;
	background: #fff;
	border-radius: 0;
	margin: 30px 10px;
}

.nav1 ul {
	list-style: none;
}

.nav1 a {
	padding: 0 15px;
	height: 40px;
	border-top: solid 1px #ccc;
	border-right: solid 1px #ccc;
	float: left;
	color: black;
}

.nav1 a:hover {
	text-decoration: none;
	color: black;
}

.nav1 .a1 {
	color: white;
	padding: 0 15px;
	background-color: #ffda44;
	border: solid 1px #ffda44;
}

.top {
	margin-top: 50px;
}

.txdx {
	width: 45px;
	height: 45px;
}

.val-two, .val-three {
	display: none;
}

.window {
	border: solid 1px #ccc;
	width: 680px;
	padding: 5px 5px;
	border-radius: 5px;
}

.window, .media {
	margin: 5px;
}

.media-body h4 {
	font-size: 16px;
}

.media-body p {
	font-size: 14px;
	height: 28px;
	line-height: 16px;
}

.huif {
	margin-top: 10px;
}

#textarea1 {
	height: 100px;
	resize: none;
}

.solid {
	border-bottom: solid 1px #ccc;
}

#btn1 {
	height: 100px;
}
</style>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
    function message(usersid,itemid) {
		var  messcontext=document.getElementById('textarea1').value;
		if(messcontext==""||messcontext==null){
			alert('请输入留言内容');
			return false;
		}else{
		    window.location.href='UserMessage?fromid=' + usersid + '&messcontext=' +messcontext+'&itemid='+itemid; 
		 }
		}
    </script>
</head>
<body>
	<header>
		<div class="head-one">
			<div class="container">
				<span style="float: left; margin: 10px 0 0 10px;">Hi~简单烤鱼oso</span>
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
	<div class="container syl">
		<div style="height: 530px;">
			<div class="show-img">
				<a><img src="../img/ypt1.jpg"></a>
			</div>
			<div class="ifo-img">
				<h1>#球衣#全新sw骑士詹姆斯复古之夜球衣s码</h1>
				<p>
					转 卖 价：<b>¥<em>360.00</em></b>
				</p>
				<p>
					原 价：<b>¥</b> 399.00
				</p>
				<hr>
				<p>
					成 色：<span>9</span>成新
				</p>
				<p>
					所 在 地：<span>江苏无锡</span>
				</p>
				<p>
					联系方式：<span>1564347913</span>
				</p>
				<p>
					交易方式：<span>在线交易</span>
				</p>
				<div>
					<button id="add">
						<span class="glyphicon glyphicon-shopping-cart"></span> 加入购物车
					</button>
				</div>
				<div>
					<img width="99%" src="../img/tup2.bmp" />
				</div>
			</div>
		</div>
		<div class="nav1">
			<div style="height: 44px; border-bottom: 5px solid #ffda44;">
				<ul>
					<li><a class="a1">宝贝介绍</a></li>
					<li><a class="a2">留言</a></li>
					<li><a class="a3">安全保障</a></li>
				</ul>
			</div>
			<div class="top val-one">
				<h3>宝贝介绍</h3>
				<p>全新正品带吊阿迪达斯球衣，亚版s码，适合身高175cm左右，体型不是太壮的球友，本人175，130斤穿s合适，可参考。自己收藏的sw球衣出一波，已经出了一些了，留了几件喜欢的自穿，都是单品，所以见到即缘分，本人不碰假，如假白送，鉴别细节图基本都给了，有想法还要细节的可私。所标均为实价，欢迎比价，所以请不要上来就最低价，有诚意就带上自己的价，只小刀谢谢，动辄百八十刀的烦您再看看，可能缘分未到，出不了就继续收着，也不是急需钱。</p>
			</div>
			<div class="top val-two">
				<h3>留言</h3>
				<div class="window">
					<div class="media solid">
						<div class="media-left">
							<img src="../img/touxiang1.jpg" alt="" class="media-object txdx">
						</div>
					</div>
					<c:forEach items="${UserMessage}" var="m">
					<div class="media solid">
						<div class="media-left">
							<img src="../img/touxiang1.jpg" alt="" class="media-object txdx">
						</div>
						<div class="media-body">
							<h4 class="media-heading">${m.uname }</h4>
							<p>${m.messcontext }</p>
						</div>
					</div>
					</c:forEach>
				<div class="huif">
					<div class="input-group input-group-lg">
						<textarea id="textarea1" type="text" class="form-control"></textarea>
						<span class="input-group-btn">
							<button id="btn1"
								onclick="return message(${sessionScope.users.usersid},${sessionScope.items.itemid })"
								type="button" class="btn btn-default">&nbsp;&nbsp;发送&nbsp;&nbsp;</button>
						</span>
					</div>
				</div>
			</div>
			<div class="top val-three">
				<img width="100%" src="../img/aqbz.bmp" />
			</div>
		</div>
	</div>
	<footer id="footer">
		<div class="foot-one">
			<div>
				<img src="../img/footer.bmp" />
			</div>
		</div>
		<div class="foot-two"></div>
	</footer>
	<script>
   $(".a1").click(function(){
       $(".val-one").css("display","block");
       $(".val-two").css("display","none");
       $(".val-three").css("display","none");
       $(this).css("border","solid 1px #ffda44").css("background-color","#ffda44").css("color","#fff");
       $(".a2").css("border-top","solid 1px #ccc").css("border-right","solid 1px #ccc").css("color","black").css("background-color","#fff");
       $(".a3").css("border-top","solid 1px #ccc").css("border-right","solid 1px #ccc").css("color","black").css("background-color","#fff");
   });
   $(".a2").click(function(){
       $(".val-two").css("display","block");
       $(".val-one").css("display","none");
       $(".val-three").css("display","none");
       $(this).css("border","solid 1px #ffda44").css("background-color","#ffda44").css("color","#fff");
       $(".a1").css("border","none").css("border-top","solid 1px #ccc").css("border-left","solid 1px #ccc").css("color","black").css("background-color","#fff");
       $(".a3").css("border","none").css("border-top","solid 1px #ccc").css("border-right","solid 1px #ccc").css("color","black").css("background-color","#fff");

   });
   $(".a3").click(function(){
       $(".val-three").css("display","block");
       $(".val-one").css("display","none");
       $(".val-two").css("display","none");
       $(this).css("border","solid 1px #ffda44").css("background-color","#ffda44").css("color","#fff");
       $(".a1").css("border","none").css("border-top","solid 1px #ccc").css("border-left","solid 1px #ccc").css("color","black").css("background-color","#fff");
       $(".a2").css("border","none").css("border-top","solid 1px #ccc").css("border-left","solid 1px #ccc").css("color","black").css("background-color","#fff");
   });
</script>
</body>
</html>