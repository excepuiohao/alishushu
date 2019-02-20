
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#apDiv1 {
	position:absolute;
	width:902px;
	height:510px;
	z-index:1;
	border:solid 1px;
	background: #FCFCFC
}
#apDiv2 {
	position:absolute;
	width:413px;
	height:263px;
	z-index:2;
	left: 66px;
	top: 69px;
	
}
#apDiv3 {
	position:absolute;
	width:902px;
	height:68px;
	z-index:3;
	
}
#apDiv4 {
	position:absolute;
	width:357px;
	height:262px;
	z-index:4;
	left: 479px;
	top: 69px;

}
#apDiv5 {
	position:absolute;
	width:901px;
	height:87px;
	z-index:1;
	left: 0px;
	top: 332px;
	
}
#apDiv6 {
	position:absolute;
	width:900px;
	height:89px;
	z-index:5;
	top: 421px;
	
}

*{
		margin: 0;
	}
	.box{
		width: 80%;
		margin:20px auto;
	}
	.list{
		margin: 0 50px;
		width: 30%;
		float: left;
	}
	a{
		font-size: 50px;
		text-decoration: none;
		color: lightgray;
	}
	span{
		font-size: 10px;
		padding-top: 10px;
		margin-left: 10px;
	}
	.c1{
		color: crimson;
	}
	.c2{
		color: goldenrod;
	}
	.c3{
		color: yellow;
	}
	.c4{
		color: orange;
	}
	.c5{
		color: limegreen;
	}
</style>
<script src="../js/my.js"></script>
<script type="text/javascript" src="../js/jquery.min.js" ></script>
</head>

<body>
<div id="apDiv1">

<div id="apDiv3" >

其他买家需要你的建议哦！！！

</div>
<div id="apDiv2">
<table style="width:100%; height:100%">
<tr>
<td style="background:#E5E5E5; border:solid #E5E5E5 1px; width:30%" align="center">评价商品</td><td style="background:#FFF;  border:solid #FFF 1px; width:70%">
<textarea name="a" style="width:100%;height:100%;"></textarea></td>
</tr>
<tr><td style="background:#E5E5E5; width:30%" align="center">评价服务</td>
<td style="background:#FFF;  border:solid #FFF 1px; width:70%">
<textarea name="a" style="width:100%;height:100%;"></textarea></td></tr>
</table>
</div>
<div id="apDiv4">
<div class="box">
	<div class="list">
		 描述相符<a href="#" class="star1">★</a><a href="#" class="star2">★</a><a href="#" class="star3">★</a><a href="#" class="star4">★</a><a href="#" class="star5">★</a>
	</div>
	<span class="remark">亲，请客观给出评价~</span>
</div>
<div class="box">
	<div class="list">
		  卖家服务<a href="#" class="star1">★</a><a href="#" class="star2">★</a><a href="#" class="star3">★</a><a href="#" class="star4">★</a><a href="#" class="star5">★</a>
	</div>
	<span class="remark">亲，请客观给出评价~</span>
</div>
<div class="box">
	<div class="list">
		  物流服务<a href="#" class="star1">★</a><a href="#" class="star2">★</a><a href="#" class="star3">★</a><a href="#" class="star4">★</a><a href="#" class="star5">★</a>
	</div>
	<span class="remark">亲，请客观给出评价~</span>
</div>
<div style="text-align:center;margin:150px 0; font:normal 14px/24px 'MicroSoft YaHei';">
</div>
<div id="apDiv5"></div>
<div id="apDiv6"></div>
</div>


</body>
</html>