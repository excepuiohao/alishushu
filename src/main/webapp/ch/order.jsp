<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看订单</title>
    <link rel="stylesheet" href="../css/reset.css">
    <link rel="stylesheet" href="../css/cart1.css">
    <script src="../js/jquery.min.js"></script>
    <script src="../js/cart1.js"></script>
<style type="text/css">
#div1{
    margin-top: 100px;
}
.spans{
	font-size:20px;
}
</style>
</head>
<body>
<a href="../selectByPageview" class="spans">点击这里，首页</a>
<div id="div1">
    <section class="cartMain">
    <span class="spans"><a href="../selectOrd">所有订单</a></span>
	<span class="spans"><a href="../selectOrdFirst">待发货</a></span>
	<span class="spans"><a href="../selectOrdSecond">待收货</a></span>
	<span class="spans"><a href="../selectOrdThird">待评价</a></span>
        <div class="cartMain_hd">
            <ul class="order_lists cartTop">
                <li class="list_chk" style="color:#C60">
                <h3>订单信息</h3>
                </li>
                <li class="list_con">商品名称</li>
                 <li class="list_price">单价</li>
                <li class="list_info">店铺</li>
                <li class="list_amount">店铺评价</li>
                <li class="list_sum">宝贝位置</li>
                <li class="list_op">操作</li>
            </ul>
        </div>

<c:forEach var="item" items="${list1}">		
        <div class="cartBox">
            <div class="shop_info">
                <div class="shop_name">
                &nbsp;&nbsp;${item.ordertime}&nbsp;
                    订单编号：<span>${item.orderid}</span>
                &nbsp;&nbsp;<a href="javascript:;">联系客服</a>    
                </div>
            </div>
            <div class="order_content">
                <ul class="order_lists">
                    <li class="list_chk">
                        
                    </li>
                    <li class="list_con">
                        <div class="list_img">
                        <a href="javascript:;"><img src="../${item.itempic}"></a>
                        
                        </div>
                        <div class="list_text">
                        <a href="javascript:;">${item.itemname}</a>
                        <input type="hidden" value="${item.itemid}">
                        </div>
                    </li>
                    <li class="list_price">
                        <p class="price">${item.price}</p>
                    </li>
                   <li class="list_info">
                        <p>${item.shopid}</p>
                      
                    </li>
                    <li class="list_amount">
                        <div class="amount_box">
							<p class="price">5星</p>
                        </div>
                    </li>
                    <li class="list_sum">
                        <p class="sum_price">
                        <a href="../MakeAMap?Shopsid=${item.shopid}">物流信息</a>
                        <input type="hidden" value="${item.shopid}">
                        </p>
                    </li>
                    <li class="list_op">
                 
                        <p class="del"><a href="javascript:;" class="delBtn">确认收货</a>
                        <input type="hidden" value="${item.orderid}">                      
                        </p>
                    
                    </li>
                </ul>
        
            </div>
        </div>
</c:forEach>
<c:forEach var="item" items="${list2}">	
       <div class="cartBox">
            <div class="shop_info">
                <div class="shop_name">
                &nbsp;&nbsp;${item.ordertime}&nbsp;
                    订单编号：<span>${item.orderid}</span>
                &nbsp;&nbsp;<a href="javascript:;">联系客服</a>    
                </div>
            </div>
            <div class="order_content">
                <ul class="order_lists">
                    <li class="list_chk">
                        
                    </li>
                    <li class="list_con">
                        <div class="list_img">
                        <a href="javascript:;"><img src="../${item.itempic}"></a>
                        
                        </div>
                        <div class="list_text">
                        <a href="javascript:;">${item.itemname}</a>
                        <input type="hidden" value="${item.itemid}">
                        </div>
                    </li>
                    <li class="list_price">
                        <p class="price">${item.price}</p>
                    </li>
                   <li class="list_info">
                        <p>${item.shopid}</p>
                      
                    </li>
                    <li class="list_amount">
                        <div class="amount_box">
							<p class="price">5星</p>
                        </div>
                    </li>
                    <li class="list_sum">
                        <p class="sum_price">暂无物流信息</p>
                    </li>
                    <li class="list_op">
                        <p class="del">  - -  </p>
                    </li>
                </ul>
               
            </div>
        </div>
</c:forEach>  
<c:forEach var="item" items="${list3}">    
         <div class="cartBox">
            <div class="shop_info">
                <div class="shop_name">
                &nbsp;&nbsp;${item.ordertime}&nbsp;
                    订单编号：<span>${item.orderid}</span>
                &nbsp;&nbsp;<a href="javascript:;">联系客服</a>    
                </div>
            </div>
            <div class="order_content">
                <ul class="order_lists">
                    <li class="list_chk">
                        
                    </li>
                    <li class="list_con">
                        <div class="list_img">
                        <a href="javascript:;"><img src="../${item.itempic}"></a>
                        
                        </div>
                        <div class="list_text">
                        <a href="javascript:;">${item.itemname}</a>
                        <input type="hidden" value="${item.itemid}">
                        </div>
                    </li>
                    <li class="list_price">
                        <p class="price">${item.price}</p>
                    </li>
                   <li class="list_info">
                        <p>${item.shopid}</p>
                      
                    </li>
                    <li class="list_amount">
                        <div class="amount_box">
							<p class="price">5星</p>
                        </div>
                    </li>
                    <li class="list_sum">
                        <p class="sum_price">本人已签收</p>
                    </li>
                    <li class="list_op">
                        <p class="del">已收货</p>
                    </li>
                </ul>
               
            </div>
        </div>
</c:forEach>  
        <!--底部-->
        <div class="bar-wrapper">
            <div class="bar-right">
 
                <div class="calBtn"><a href="javascript:;">已到底部</a></div>
            </div>
        </div>
    </section>
    <section class="model_bg"></section>
</div>	
</body>
</html>