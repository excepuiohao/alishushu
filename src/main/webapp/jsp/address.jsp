<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/ssx.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<style>
* {
	margin: 0;
	padding: 0;
	outline: 0;
}
.table tbody{
	display: block;
	max-height: 500px;
	overflow: auto;
}
.modal-body label textarea{
        	border: solid 1px #ccc;
			border-radius: 4px;
			width: 182px;
			heigt: 60px;
}
        
.table td {
	min-width: 100px;
}

.slt {
	width: 150px;
	height: 25px;
	border: solid 1px #ccc;
	border-radius: 4px;
}

.modal-body .form-control {
	width: 180px;
	height: 30px;
}

modal-body label textarea {
	border: solid 1px #ccc;
	border-radius: 4px;
	width: 182px;
	heigt: 60px;
}
/* 头   */
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
/* 尾   */
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
<body>
<header>
    <div class="head-one">
        <div class="container">
            <span style="float: left; margin: 10px 0 0 10px;">Hi~简单烤鱼oso</span>
            <ul>
                <li><a href="#">联系客服</a></li>
                <li><a href="#">江苏无锡</a></li>
                <li><a href="#">消息 <span style="background-color: red;" class="badge">10</span></a></li>
                <li><a href="#">我要开店</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> 购物车</a></li>
            </ul>
        </div>
    </div>
    <div class="container head-two">
        <h1 id="title"><b>阿里叔叔</b></h1>
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
	<!-- 模态声明，show 表示显示 -->
	<div class="modal " tabindex="-1"  id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span>&times;</span>
					</button>
					<h4 class="modal-title">添加收货地址:</h4>
				</div>
				<div class="modal-body">
				<div style="margin-left: 200px;">
					姓名：<input id="name" type="text" class="form-control"/><br>
					电话：<input id="phone" type="text" class="form-control"/><br>
					地址：<br>
					省：<select id="province" name="province" class="slt"></select><br><br>
					市：<select id="city" name="city" class="slt"></select> <br><br>
					县：<select id="area" name="area"class="slt"></select><br><br>
					<script type="text/javascript">
						addressInit('province', 'city', 'area');
					</script>
					<label> <span>详细地址：</span><br> <textarea id="other"></textarea>
					</label><br><br>
				</div>
				</div>
				<div class="modal-footer">
					<input type="button" id="submit" class="btn btn-default" value="确认添加">
				</div>
			</div>
		</div>
	</div>
	<div style="margin: 150px auto 0;width: 800px;">
	<h3>管理收货地址</h3>
		<table class="table table-bordered  table-hover">
		<tbody>
			<tr>
				<td>姓名</td>
				<td>电话</td>
				<td>地址</td>
				<td>修改</td>
				<td>删除</td>
				<td>设为默认</td>
			</tr>
			<c:if test="${addlist!=null}">
			<c:forEach  items="${addlist}" var="item">
			<tr>
				<td>${item.name}</td>
				<td>${item.phone}</td>
				<td>${item.address}</td>
				<td><input type="hidden" value="${item.addid}" /><button class="btn btn-xs btn-default update"
						data-toggle="modal" data-target="#myModal">修改</button></td>
				<td><input type="hidden" value="${item.addid}" /><button class="btn btn-xs btn-default shanchu">删除</button></td>
				<td><input type="hidden" value="${item.addid}" /><button class="btn btn-xs btn-default moren">设为默认</button></td>
			</tr>
			</c:forEach>
			</c:if>
			<tr>
				<td colspan="6" align="right"><button class="btn btn-default address-add"
						data-toggle="modal" data-target="#myModal">
						<span class="glyphicon glyphicon-plus"></span>添加新地址
					</button>&nbsp;&nbsp;&nbsp;
					<a href="../address/selectAllAddress1" class="btn btn-default" style="margin-right: 80px;"><span class="glyphicon glyphicon-share-alt"></span>返回</a></td>
			</tr>
			</tbody>
		</table>
	</div>
<footer id="footer">
    <div class="foot-one">
        <div><img src="../img/footer.bmp"/></div>
    </div>
    <div class="foot-two"></div>
</footer>


	<script>
		var aid;
		$(".update").click(function() {
			var name = $(this).parent().prev().prev().prev().html();
			var phone = $(this).parent().prev().prev().html();
			$("#name").val(name);
			$("#phone").val(phone);
			$("#submit").val("确认修改");
			aid = $(this).prev().val();
		});
		$(".address-add").click(function(){
			$("#name").val('');
			$("#phone").val('');
			$("#submit").val("确认添加");
		});
		$(".shanchu").click(function(){
			var addid = $(this).prev().val();
			alert(addid);
			$(this).parent().parent().css("display","none");
			$.post("../address/deleteAdd/"+addid);
		})
		$("#submit").click(function(){
			if($(this).val() == "确认添加"){
				var name = $("#name").val();
				var phone = $("#phone").val();
				var address = $("#province").val()+$("#city").val()+$("#area").val()+$("#other").val();
				window.location = "../address/insertAddress?name="+name+"&phone="+phone+"&address="+address;
			}
			if($(this).val() == "确认修改"){
				var name = $("#name").val();
				var phone = $("#phone").val();
				var address = $("#province").val()+$("#city").val()+$("#area").val()+$("#other").val();
				location = "../address/updateAddress/"+aid+"/"+name+"/"+phone+"/"+address;
			}
		});
		$(".moren").click(function(){
			var addid = $(this).prev().val();
			alert(addid);
			$.post("../address/updateMoren/"+addid);
			alert("设置成功！");
		});
</script>
</body>
</html>