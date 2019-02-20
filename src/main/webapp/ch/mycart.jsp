<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>个人购物车</title>
<style type="text/css">
#div2{
    margin-top: 100px;
}
.card-title{
    font-family: STXingkai;
    font-size: x-large;
    color: #b46536;
}
.spans{
	font-size:20px;
}
</style>
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/carts.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/carts.js"></script>
</head>
<body>
<a href="selectByPageview" class="spans">点击这里，首页</a>
<div id="div2">
<section class="cartMain">
    <span class="card-title">我的购物车-全部商品</span>
    <div class="cartMain_hd">
        <ul class="order_lists cartTop">
            <li class="list_chk">
                <!--所有商品全选-->
                <input type="checkbox" id="all" class="whole_check">
                <label for="all"></label>
                全选
            </li>
            <li class="list_con">商品信息</li>
            <li class="list_info">商品参数</li>
            <li class="list_price">单价</li>
            <li class="list_amount">数量</li>
            <li class="list_sum">金额</li>
            <li class="list_op">操作</li>
        </ul>
    </div>

    <c:forEach var="item" items="${map}" begin="0" varStatus="status">
    <div class="cartBox">
        <div class="shop_info">
            <div class="all_check">
                <!--店铺全选-->
                
                <input type="checkbox" id="${item.value[status.index].getShopid()}" class="shopChoice">
                <label for="${item.value[status.index].getShopid()}" class="shop"></label> 
            </div>
 
            <div class="shop_name">
                店铺：<a href="javascript:;">${item.key}</a>
            </div>
        </div>
        
        <div class="order_content">
            <c:forEach var="itema" items="${item.value}">
            <ul class="order_lists">
                <li class="list_chk">
                    <input type="checkbox" id="${itema.getItemid()}" class="son_check">
                    <label for="${itema.getItemid()}"></label>
                    <input type="hidden" value="${itema.getItemid()}" class="item_name">
                </li>
                <li class="list_con">
                    <div class="list_img"><a href="javascript:;"><img src="${itema.getItempic()}" alt=""></a></div>
                    <div class="list_text"><a href="javascript:;"><span>${itema.getItemname()}<input type="hidden" value="${itema.getUserid()}"></span></a></div>
                    
                </li>
                <li class="list_info">
                    <p>${itema.getIteminfo()}</p>
         
                </li>
                <li class="list_price">
                    <p class="price">￥${itema.getPrice()}</p>
                </li>
                <li class="list_amount">
                    <div class="amount_box">
                        <a href="javascript:;" class="reduce reSty">-</a>
                        <input type="hidden" value="${itema.getItemid()}" class="item_name">
                        <input type="text" value="${itema.getItemcount()}" class="sum">
                        <a href="javascript:;" class="plus">+</a>
                        <input type="hidden" value="${itema.getItemid()}" class="item_name">
                    </div>
                </li>
                <li class="list_sum">
                    <p class="sum_price">￥${itema.getPrice()*itema.getItemcount()}</p>
                </li>
                <li class="list_op">
                    <p class="del"><a href="javascript:;" class="delBtn">移除商品</a>
                    <input type="hidden" value="${itema.getItemid()}" class="order_item"></p>
                </li>
            </ul>
            </c:forEach>
         </div> 
       </div>      
    </c:forEach>
    <!--底部-->
    <div class="bar-wrapper">
        <div class="bar-right">
            <div class="piece">已选商品<strong class="piece_num">0</strong>件</div>
            <div class="totalMoney">共计: <strong class="total_text">0.00</strong></div>
            <div class="calBtn"><a href="javascript:;">结算</a></div>
        </div>
    </div>
</section>
<section class="model_bg"></section>
<section class="my_model">
    <p class="title">删除宝贝<span class="closeModel">X</span></p>
    <p>您确认要删除该宝贝吗？</p>
    <div class="opBtn"><a href="javascript:;" class="dialog-sure">确定</a><a href="javascript:;" class="dialog-close">关闭</a></div>
</section>
</div>
</body>
</html>
