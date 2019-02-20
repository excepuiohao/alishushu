<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        .head-one{
            width: 100%;
            background-color: #fff;
        }
        .head-one ul{
            list-style: none;
        }
        .head-one ul li{
            float: right;
            margin-top: 8px;
        }
        .head-one a{
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
        .head-one a:hover{
            color: rgb(255, 218, 68);
        }
        .head-one a span{
            margin-bottom: 2px;
        }
        .head-two{
            height: 80px;
        }
        .head-two h1 {
            float: left;
        }
        #title{
            font-family: 幼圆;
        }
        .head-two ul li {
            list-style: none;
            display: inline-block;
            padding: 0 20px;
            line-height: 80px;
            font-size: 16px;
        }
        .head-two ul li a{
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
        /*第一部分*/
        .body{
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
        #daxiao{
            width: 420px;
            height: 285px;
            overflow: hidden;
        }
        #lb {
            width: 420px;
            float: left;
        }
        .carousel-control{
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
        /*横条展示*/
        .jrbk{
            border-left: solid 3px rgb(255, 218, 68);
        }
        .hengt{
            list-style: none;
           /* margin-left: 18px;*/
            height: 170px;
            border-top:solid 1px #ccc;
        }
        .hengt li{
            float: left;
            width: 365px;
            position: relative;
            margin: 20px 11px 0 2px;
            font-size: 0;
        }
        .hengt li img{
            width: 100%;
        }
        /*第二部分*/
        .second {
            height: 700px;
        }
        .one, .two {
            width: 566px;
            height: 658px;
            background-color: #fff;
            padding: 5px 11px;

            overflow: hidden;
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
            word-break: brean-all;
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
        /*第三部分*/
        .thr-one {
            float: left;
            padding: 5px 3px;  0 3px;
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
        .thr-one:hover{
            border: solid 1px #FF5000;
        }
        .thr-one div{
            background: #4f4f4f;
			height:220px;
        }
        .thr-one h4{
            margin-top: 7px;
            line-height: 22px;
            height: 44px;
            font-size: 14px;
            color: #666;
            font-weight: normal;
            transition: color 0.3s;
            overflow: hidden;
        }
        .thr-one img{
            height: 100%;
            /*transition: opacity 0.2s;
            opacity: 0.8*/
        }
        .thr-one p{
            margin-top: 22px;
            height: 24px;
            line-height: 24px;
        }
        .thr-one p span:first-child{
            float: left;
            color: #F40;
            font-size: 20px;
        }
        .thr-one p span:last-child{
            float: right;
            color: #9ca0aa;
            margin-top: 3px;
        }
        .dib img{
            width: 100%;
            margin-top: 20px;
        }
        /*底部*/
        footer{
        }
        .foot-one{
            background-color: #333333;
        }
        .foot-one div{
            width: 723px;
            height: 185px;
            margin: 0 auto;
        }
        .foot-one img{
            height: 100%;
        }
        /*侧边栏*/
        .cbl{
            width: 50px;
            height: 120px;
            position: fixed;
            padding-top: 10px;
            top: 450px;
            right: 100px;
            border: solid 1px #ccc;
            border-radius: 8px;
            background-color: rgba(255,255,255,0.3);
            text-align: center;
        }
        .cbl ul{
             list-style: none;
             font-size: 24px;
         }
         
    </style>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
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
    	})
    })
    
    </script>
</head>
<body id="body">
	  <c:if test="${listPageview==null}">
		<%response.sendRedirect("../selectByPageview"); %>
	</c:if>
	 <%-- <c:if test="${NewPutdate==null}">
		<%response.sendRedirect("selectNew"); %>
	</c:if> --%>
	<%-- <c:if test="${listPrice==null}">
		<%response.sendRedirect("selectByPrice"); %>
	</c:if> --%>
	 <div class="dropdown" id="dropdown">
					<ul class="dropdown-menu">
					<li><a href="SelectAllmess">系统消息<span style="background-color: red;" class="badge">2</span></a></li>
					<li><a href="#">留言消息<span style="background-color: red;" class="badge">3</span></a></li>
					<li><a href="#">订单消息<span style="background-color: red;" class="badge">5</span></a></li>
					</ul>
					</div>
    <header>
    <div class="head-one">
        <div class="container">
        <c:choose>
        	<c:when test="${users!=null }">
            	<span style="float: left; margin: 10px 0 0 10px;" >Hi~${users.nickname}</span>
            <ul>
            <li><a href="RobotMM.jsp">联系客服</a></li>
            <li><a href="permeg/info2.jsp">完善信息</a></li>
            <li><a href="selectOrd">查看订单</a></li>
            <li><a id="message" data-toggle="dropdown" data-target="#dropdown">
			消息 <span style="background-color: red;" class="badge">10</span><span class="caret"></span></a></li>
            <li>
            	<c:choose>
            	<c:when test="${shopcount!=0}">
            	<a href="selectallitem">我的店铺</a>
            	</c:when>
            	<c:otherwise>
                <a href="shop/shop1.jsp">我要开店</a>
                </c:otherwise>
                </c:choose>
            </li>
            <li><a href="shopcar?userid=${userid}"><span class="glyphicon glyphicon-shopping-cart"></span> 购物车</a></li>
        </ul>
           
            </c:when>
            <c:otherwise>
            	<a style="float:left;margin-top:8px;" href="login/login.jsp">请登录</a>
            	 <ul>
            <li><a href="login/login.jsp">联系客服</a></li>
            <li><a href="login/login.jsp">完善信息</a></li>
            <li><a href="login/login.jsp">查看订单</a></li>
            <li><a href="login/login.jsp">消息 <span style="background-color: red;" class="badge">10</span></a></li>
            <li><a href="login/login.jsp">我要开店</a></li>
            <li><a href="login/login.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> 购物车</a></li>
        </ul>
            </c:otherwise>
            </c:choose>
       </div>
    </div>
    <div class="container head-two">
        <h1 id="title"><b>阿里叔叔</b></h1>
        <ul>
            <li><a href="#">首页</a></li>
            <li><a href="#">手机二手</a></li>
            <li><a href="https://www.guazi.com">二手车估价</a></li>
            <li><a href="#">将降降</a></li>
            <li><a href="#">发布闲置</a></li>
            <li><a href="#">我的闲置</a></li>
        </ul>
    </div>
</header>
    <span id="_one">11</span>
    <div id="cont" class="container body">
    <!--第一部分-->
    <div class="lunbo">
        <!--侧边栏-->
        <aside>
            <ul class="list-group">
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-home"></span> 闲置数码</a> <span><a
                        href="#">手机</a></span> <span><a href="#">相机</a></span> <span><a href="#">笔记本</a></span></li>
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-fire"></span> 闲置母婴</a> <span><a
                        href="#">童装</a></span> <span><a href="#">宝宝用品</a></span> <span><a href="#">玩具</a></span></li>
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-list"></span> 家居日用</a> <span><a
                        href="#">家具</a></span> <span><a href="#">家纺</a></span> <span><a href="#">日用</a></span></li>
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-music"></span> 影音家电</a>
                    <span><a href="#">大家电</a></span> <span><a href="#">小家电</a></span> <span><a href="#">料理</a></span>
                </li>
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-camera"></span> 服装配饰</a> <span><a
                        href="#">鞋装</a></span> <span><a href="#">箱包</a></span> <span><a href="#">配饰</a></span></li>
                <li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-briefcase"></span> 珠宝收藏</a>
                    <span><a href="#">珠宝</a></span> <span><a href="#">饰品</a></span> <span><a href="#">艺术收藏</a></span>
                </li>
            </ul>
        </aside>
        <!--图片轮播-->
        <div id="lb">
            <div id="myCarousel" class="carousel slide">

                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0"
                        class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <div id="daxiao" class="carousel-inner ">
                    <div class="item active">
                        <a href="#"><img src="img/123.jpg" alt="第一张"></a>
                    </div>
                    <div class="item">
                        <a href="#"><img src="img/234.jpg" alt="第二张"></a>
                    </div>
                    <div class="item">
                        <a href="#"><img src="img/345.jpg" alt="第三张"></a>
                    </div>
                </div>
                <a href="#myCarousel" data-slide="prev" class="carousel-control left">&lsaquo;</a>
                <a href="#myCarousel" data-slide="next" class="carousel-control right">&rsaquo;</a>
            </div>
        </div>
        <!--猜你喜欢-->
        <div class="user">
        <c:choose>
        <c:when test="${users!=null}">
        <div class="media">
                <div  class="media-left">
                    <img src="${users.photo}" alt="" class="media-object" style="width: 80px;">
                </div>
                <div class="media-body">
                    <h4 class="media-heading">Hi ${users.nickname}</h4>
                    <p>
                    <h3>你可能感兴趣：</h3>
                    </p>
                </div>
            </div>
        </c:when>
        <c:otherwise>
            <div class="media">
                <div  class="media-left">
                    <img src="img/touxiang1.jpg" alt="" class="media-object" style="width: 80px;">
                </div>
                <div class="media-body">
                    <h4 class="media-heading">Hi 阿里叔叔</h4>
                    <p>
                    <h3>你可能感兴趣：</h3>
                    </p>
                </div>
            </div>
            </c:otherwise>
            </c:choose>
            <ul>
                <li>数码</li>
                <li>psp</li>
                <li>机械表</li>
                <li>kindel</li>
                <li>手机</li>
                <li>平板</li>
            </ul>
        </div>
    </div>
    <!--横条展示-->
    <h3 id="_two" class="jrbk">&nbsp;<span class="glyphicon glyphicon-heart"></span>&nbsp;今日爆款</h3>
    <div class="hengt">
        <ul>
            <li><a href="#"><img src="img/hs1.jpg" alt=""></a></li>
            <li><a href="#"><img src="img/hs3.jpg" alt=""></a></li>
            <li><a href="#"><img src="img/hs2.jpg" alt=""></a></li>
        </ul>
    </div>
    <br><br><br>
    <!--第二部分-->
    <h3 id="_three" class="jrbk">&nbsp;<span class="glyphicon glyphicon-heart-empty"></span>&nbsp;精选好货</h3>
    <div class="second">
        <div class="one">
            <div class="com-hd">
                <h3><p><span>有好货</span> 与品质生活不期而遇</p></h3>
            </div>
            <c:forEach var="NewPutdate" items="${listPageview}">
            <a href="selectitembyid?itemsid=${NewPutdate.itemid}">
                <div class="com-bd">
                    <div class="tup"><img src="${NewPutdate.itempic}"/></div>
                    <h4><a href="#">${NewPutdate.itemname}</a></h4>
                    <p>${NewPutdate.iteminfo}</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>${NewPutdate.pageview}</span>
                    </p>
                </div>
            </a>
            
            </c:forEach>
            
           <!--  <a href="#">
                <div class="com-bd">
                    <div class="tup"><img src="../img/yifu.jpg"/></div>
                    <h4><a href="#">KENZO雄鹰运动衫</a></h4>
                    <p>霸气凌空的雄鹰</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>99</span>
                    </p>
                </div>
            </a>
            <a href="#">
                <div class="com-bd">
                    <div class="tup"><img src="../img/yifu.jpg"/></div>
                    <h4><a href="#">KENZO雄鹰运动衫</a></h4>
                    <p>霸气凌空的雄鹰</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>99</span>
                    </p>
                </div>
            </a>
            <a href="#">
                <div id="_five" class="com-bd">
                    <div class="tup"><img src="../img/yifu.jpg"/></div>
                    <h4><a href="#">KENZO雄鹰运动衫</a></h4>
                    <p>霸气凌空的雄鹰</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>99</span>
                    </p>
                </div>
            </a>
            <a href="#">
                <div class="com-bd">
                    <div class="tup"><img src="../img/yifu.jpg"/></div>
                    <h4><a href="#">KENZO雄鹰运动衫</a></h4>
                    <p>霸气凌空的雄鹰</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>99</span>
                    </p>
                </div>
            </a>
            <a href="#">
                <div class="com-bd">
                    <div class="tup"><img src="../img/yifu.jpg"/></div>
                    <h4><a href="#">KENZO雄鹰运动衫</a></h4>
                    <p>霸气凌空的雄鹰</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>99</span>
                    </p>
                </div>
            </a> -->

        </div>
        <div class="two">
            <div class="com-hd">
                <h3><p><span>有好货</span> 与品质生活不期而遇</p></h3>
            </div>
            <c:forEach var="NewPutdate" items="${NewPutdate}">
            <a href="#">
                <div class="com-bd">
                    <div class="tup"><img src="${NewPutdate.itempic}"/></div>
                    <h4><a href="#">${NewPutdate.itemname}</a></h4>
                    <p style="width:">${NewPutdate.iteminfo}</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>${NewPutdate.pageview}</span>
                    </p>
                </div>
            </a>
             </c:forEach>
            <!-- <a href="#">
                <div class="com-bd">
                    <div class="tup"><img src="../img/yifu.jpg"/></div>
                    <h4><a href="#">KENZO雄鹰运动衫</a></h4>
                    <p>霸气凌空的雄鹰</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>99</span>
                    </p>
                </div>
            </a>
            <a href="#">
                <div class="com-bd">
                    <div class="tup"><img src="../img/yifu.jpg"/></div>
                    <h4><a href="#">KENZO雄鹰运动衫</a></h4>
                    <p>霸气凌空的雄鹰</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>99</span>
                    </p>
                </div>
            </a>
            <a href="#">
                <div class="com-bd">
                    <div class="tup"><img src="../img/yifu.jpg"/></div>
                    <h4><a href="#">KENZO雄鹰运动衫</a></h4>
                    <p>霸气凌空的雄鹰</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>99</span>
                    </p>
                </div>
            </a>
            <a href="#">
                <div class="com-bd">
                    <div class="tup"><img src="../img/yifu.jpg"/></div>
                    <h4><a href="#">KENZO雄鹰运动衫</a></h4>
                    <p>霸气凌空的雄鹰</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>99</span>
                    </p>
                </div>
            </a>
            <a href="#">
                <div class="com-bd">
                    <div class="tup"><img src="../img/yifu.jpg"/></div>
                    <h4><a href="#">KENZO雄鹰运动衫</a></h4>
                    <p>霸气凌空的雄鹰</p>
                    <p>浏览量 <span style="font-size: 12px;" class="glyphicon glyphicon-eye-open"></span> <span>99</span>
                    </p>
                </div>
            </a> -->
        </div>
    </div>
    <!--第三部分-->
    <h3  class="jrbk">&nbsp;<span class="glyphicon glyphicon-fire"></span>&nbsp;热卖单品</h3>
		<div id="_four" class="third">
		<c:forEach var="ll" items="${listPrice}">
			<div class="thr-one">
				<a>
					<div>
						<img src="${ll.itempic}">
					</div>
					<h4>${ll.itemname }</h4>
					<p>
						<span>￥${ll.price }</span><span>浏览量： ${ll.pageview }</span>
					</p>
				</a>
			</div>
			</c:forEach>
			<!-- <div class="thr-one">
				<a>
					<div>
						<img src="../img/zs1.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div>
			<div class="thr-one">
				<a>
					<div>
						<img src="../img/zs2.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div>
			<div class="thr-one">
				<a>
					<div>
						<img src="../img/zs3.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div>
			<div class="thr-one">
				<a>
					<div>
						<img src="../img/333.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div>
			<div class="thr-one">
				<a>
					<div>
						<img src="../img/zs1.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div>
			<div class="thr-one">
				<a>
					<div>
						<img src="../img/zs2.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div>
			<div class="thr-one">
				<a>
					<div>
						<img src="../img/zs3.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div>
			<div class="thr-one">
				<a>
					<div>
						<img src="../img/333.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div>
			<div class="thr-one">
				<a>
					<div>
						<img src="../img/zs1.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div>
			<div class="thr-one">
				<a>
					<div>
						<img src="../img/zs2.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div>
			<div class="thr-one">
				<a href="#">
					<div>
						<img src="../img/zs3.jpg">
					</div>
					<h4>二棉鞋女冬季学生保暖加绒韩版百搭雪地棉2017新款潮面包女鞋冬鞋</h4>
					<p>
						<span>￥85</span><span>销量 25174</span>
					</p>
				</a>
			</div> -->
		</div>
		<!--底部-->
    <div class="dib"><img src="img/dibu1.bmp"/></div>
</div>
    <nav>
    <div class="cbl">
    <ul>
        <li><a href="#_one"><span class="glyphicon glyphicon-hand-up"></span></a></li>
        <li><a href="#_two"><span class="glyphicon glyphicon-heart-empty"></span></a></li>
        <li><a href="#_five"><span class="glyphicon glyphicon-fire"></span></a></li>
    </ul>
    </div>
</nav>
    <footer id="footer">
    <div class="foot-one"><div><img src="img/footer.bmp"/></div></div>
    <div class="foot-two"></div>
</footer>
<script>
    $('#myCarousel').carousel({
//设置自动播放/2 秒
        interval: 2000,
    });
</script>
</body>
</html>