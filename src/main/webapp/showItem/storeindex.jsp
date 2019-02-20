<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
 #apDiv1 {
	width:900px;
	height:115px;
	z-index:1;
	border:solid #999 2px;
	box-shadow: 10px 10px 10px #888888;
}
    </style>
    
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
 <script type="text/javascript">
 /* $(function(){
	 $("#a1").hover(function(){
			$("#a1").css("color","red");		   
					   })
 }) */
 
 </script>
  </head>
  
  <body>
<header>
    <div class="head-one">
        <div class="container">
            <span style="float: left; margin: 10px 0 0 10px;" >Hi~简单烤鱼oso</span>
            <ul>
                <li><a href="#">联系客服</a></li>
                <li><a href="#">江苏无锡</a></li>
                <li><a href="#">消息 <span style="background-color: red;" class="badge">${messcount}</span></a></li>
                <li><a href="#">我要开店</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> 购物车</a></li>
            </ul></div>
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
<div style="position:relative;top:200px; left:350px; border-radius:5px;">
 <c:forEach var="allitem" items="${NewPutdate}">
<div style="box-shadow: 10px 10px 5px #888888; border:solid #999 2px;height:150px; width:850px">
<img src="${allitem.itempic}" style="position:relative;top:20px; left:10px;height:100; width:130"/>
<span style="position:relative;top:-40px; left:40px; width:30px" id="s1">
<a href="#" id="a1">${allitem.itemname}</a></span>
<span style="position:relative; left:-10px; top:-15px">￥<span style=" color:#F00">${allitem.price}</span></span>
<p style="font-size:12px; position:relative; left:170px;top:-25px">${allitem.iteminfo}</p>
<span style="position:relative; left:170px; top:-25px; font-size:14px">1分钟前 <span style="color:#666"> 来自</span>
<img src="img/xianyu.PNG" style="position: relative;"/></span>
<img src="img/update.png" style="position:relative; left:600px; top:-20px">
<a href="deleteitem?itemid=${allitem.itemid}"><img src="img/delete.png" style="position:relative; left:610px; top:-20px"/></a>
<div style="position: relative; left: 650px; top: -120px; z-index: 10px">
    <table>
    <tr><td><a  href="">店铺:${allitem.shopname }</a></td></tr>
    <tr><td>地点:${allitem.shopaddr }</td></tr>
    <tr><td>等级:${allitem.star }</td></tr>
    <tr><td>  <a href=""><font color="ffcc00">更多卖家闲置</font></a></td></tr>
    </table>
  </div>
 
</div>
<br/><br/>
</c:forEach>
</div>
</body>
</html>