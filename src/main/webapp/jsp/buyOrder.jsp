<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>阿里叔叔__订单处理</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="description" content="" />
<meta name="format-detection" content="telephone=no" />
<link rel="stylesheet" href="../css/tasp.css" />
<link href="../css/orderconfirm.css" rel="stylesheet" />
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/ssx.js"></script>
<style>
.modal-body .form-control {
	width: 180px;
	height: 30px;
}

#page {
	width: auto;
}

.slt {
	width: 150px;
	height: 30px;
	border: solid 1px #ccc;
	border-radius: 4px;
}

#comm-header-inner, #content {
	width: 950px;
	margin: auto;
}

#logo {
	padding-top: 26px;
	padding-bottom: 12px;
}

#header .wrap-box {
	margin-top: -67px;
}

#logo .logo {
	position: relative;
	overflow: hidden;
	display: inline-block;
	width: 140px;
	height: 35px;
	font-size: 35px;
	line-height: 35px;
	color: #f40;
}

#logo .logo .i {
	position: absolute;
	width: 140px;
	height: 35px;
	top: 0;
	left: 0;
	background: url(http://a.tbcdn.cn/tbsp/img/header/logo.png);
}

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

/*页面主体*/
#page {
	margin-top: 150px;
}

#footer {
	margin-top: 50px;
	width: 100%;
}

.foot-one {
	background-color: #333333;
	width: 100%;
}

.foot-one div {
	width: 723px;
	height: 185px;
	margin: 0 auto;
}

.foot-one img {
	height: 100%;
}
</style>

</head>
<body data-spm="1">
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

	<div id="page">
		<div id="content" class="grid-c">

			<div id="address" class="address" style="margin-top: 20px;"
				data-spm="2">
				<h3>
					确认收货地址 <span class="manage-address"> <a
						href="../address/selectAllAddress" title="管理我的收货地址"
						class="J_MakePoint">更多收货地址</a>
					</span>
				</h3>
				<ul id="address-list" class="address-list">
					<c:if test="${add!=null}">
						<li class="J_Addr J_MakePoint clearfix  J_DefaultAddr ">
							<div class="address-info" style="margin-left: -88px;">
								<span style="color: red;">默认收货地址</span><br> <input
									name="address" class="J_MakePoint " type="radio" checked>
								<label> ${add.address} (${add.name} 收) <em><i
										class="glyphicon glyphicon-phone"></i>${add.phone}</em>
								</label>
							</div>
						</li>
					</c:if>
				</ul>
			</div>
			<form id="J_Form" name="J_Form"
				action="../addorder" method="post">
				<div>
					<h3 class="dib">确认订单信息</h3>
					<table cellspacing="0" cellpadding="0" class="order-table"
						id="J_OrderTable" summary="统一下单订单信息区域">
						<caption style="display: none">统一下单订单信息区域</caption>
						<thead>
							<tr>
								<th class="s-title">店铺宝贝
									<hr />
								</th>
								<th class="s-price">单价(元)
									<hr />
								</th>
								<th class="s-amount">数量
									<hr />
								</th>
								<th class="s-agio">优惠方式(元)
									<hr />
								</th>
								<th class="s-total">小计(元)
									<hr />
								</th>
							</tr>
						</thead>
						<tbody class="J_Shop" >
			<c:if test="${buyOrderList!=null }">
			<c:forEach items="${buyOrderList}" var="item">
							<tr class="shop blue-line">
								<td colspan="5">店铺：<a class="J_ShopName J_MakePoint"
									href="#" title="${item.putdate }">${item.putdate }</a> <span class="seller">卖家：<a
										href="#" class="J_MakePoint" title="${item.userid }">${item.userid}</a></span>
								</td>
							</tr>
							<tr class="item">
								<td class="s-title"><a href="#"
									title="${item.itemname}"
									class="J_MakePoint"> <img src="../${item.itempic}" class="itempic">
									<span class="title J_MakePoint">${item.itemname}</span></a>
									<div class="props">
										<span>${item.iteminfo }</span><input type="hidden" name="itemId" value="${item.itemid }"/>
									</div> <br>
									<div>
										<img
											src="http://img03.taobaocdn.com/tps/i3/T1bnR4XEBhXXcQVo..-14-16.png" /><span
											style="color: gray;">卖家承诺72小时内发货</span>
									</div></td>
								<td class="s-price"><span class='price '> <em
										class="style-normal-small-black J_ItemPrice">${item.price }</em>
								</span> <input type="hidden" name="codeprice" value="${item.price }"
									class="J_CostPrice" /></td>
								<td class="s-amount"><input type="hidden"
									class="J_Quantity" value="${item.itemcount }"
									name="itemcount" />1</td>
								<td class="s-agio">
									<div class="J_Promotion promotion" data-point-url="">无优惠</div>
								</td>
								<td class="s-total"><span class='price '> <em
										class="style-normal-bold-red J_ItemTotal ">${item.price }</em>
								</span> <input id="price" type="hidden"
									name="price" value="${item.price }"/></td>
							</tr>
							<tr><td colspan="5" style="width:50px;"><hr></td></tr>
							</c:forEach></c:if>

							<tr class="blue-line" style="height: 2px;">
								<td colspan="5"></td>
							</tr>
							<tr class="other other-line">
								<td colspan="5">
									<ul class="dib-wrap">
										<li class="dib extra-info" style="float: right;">
											<div class="shoparea">
												<ul class="dib-wrap">
													<li class="dib title"><input type="checkbox" value="3000" name="integral"/>积分抵换：</li>
													<li class="dib sel">
														<div id="integral" class="J_ShopPromo J_Promotion promotion clearfix">${integral}</div>
													</li>
													<li class="dib fee"><span class='price '> -<em id="zekou"
															class="style-normal-bold-black J_ShopPromo_Result">0.00</em>
													</span></li>
												</ul>
											</div>

											<div class="shoppointarea"></div>

											<div class="farearea">
												<ul class="dib-wrap J_farearea">
													<li class="dib title">运送方式：</li>
													<li class="dib sel"><em tabindex="0"
														class="J_FareFree">免邮费</em></li>
													<li class="dib fee"><span class='price '> <em
															class="style-normal-bold-red J_FareSum">0.00</em>
													</span></li>
												</ul>
											</div>
											<div class="extra-area">
												<ul class="dib-wrap">
													<li class="dib title">发货时间：</li>
													<li class="dib content">卖家承诺订单在买家付款后，72小时内<a href="#">发货</a></li>
												</ul>
											</div>

											<div class="servicearea" style="display: none"></div>
										</li>
									</ul>
								</td>
							</tr>

							<tr class="shop-total blue-line">
								<td colspan="5">店铺合计(含运费)： <span
									class='price g_price '> <span>&yen;</span><em
									 class="dphj style-middle-bold-red J_ShopTotal">${total }</em>
								</span> <input id="totalprice" type="hidden" name="totalprice" value="${total }" />
								</td>
							</tr>
						</tbody>
						<tfoot>
							<tr>
								<td colspan="5">
									<div class="order-go" data-spm="4">
										<div class="J_AddressConfirm address-confirm">
											<div class="kd-popup pop-back" style="margin-bottom: 40px;">
												<div class="box">
													<div class="bd">
														<div class="point-in">

															<em class="t">实付款：</em> <span class='price g_price '>
																<span>&yen;</span><em class="sfk style-large-bold-red"
																id="J_ActualFee">${total }</em>
															</span>
														</div>

														<ul>
															<li><em>寄送至:</em><span id="J_AddrConfirm"
																style="word-break: break-all;"> ${add.address}
																	${add.address} ${add.address} ${add.address} </span></li>
															<li><em>收货人:</em><span id="J_AddrNameConfirm">${add.name}
																	${add.phone}</span></li>
														</ul>
													</div>
												</div>
												<a href="#" class="back J_MakePoint">返回购物车</a> <a id="J_Go"
													class=" btn-go" title="点击此按钮，提交订单。" >去支付<b
													class="dpl-button"></b></a>
											</div>
										</div>
										<div class="msg" style="clear: both;">
											<p class="tips naked" style="float: right; padding-right: 0">
												若价格变动，请在提交订单后联系卖家改价，并查看已买到的宝贝</p>
										</div>
									</div>
								</td>
							</tr>
						</tfoot>
					</table>
				</div>
			</form>
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
	$("input[type='checkbox']").click(function(){
		var integral = $("#integral").html();
		var zekou = integral*0.01;
		var zj1 = $(".dphj").html()
		var zj2 = $(".sfk").html()
		if(this.checked){
			$("#zekou").html(zekou);
			$(".dphj").html(zj1-zekou);
			$(".sfk").html(zj1-zekou);
			$("#totalprice").val(zj1-zekou);
		}
		else{
			zj1 = parseFloat(zj1);
			zekou = parseFloat(zekou);
			var total = zj1+zekou;
			$(".dphj").html(total);
			$(".sfk").html(total);
			$("#zekou").html("0.00");
			$("#totalprice").val(total);
		}
	});
	$("#J_Go").click(function(){
		$("#J_Form").submit();
	});
</script>
</body>
</html>
