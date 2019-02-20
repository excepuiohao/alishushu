<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'item.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <link rel="stylesheet" type="text/css" href="css/css.css" />
<link rel="stylesheet" type="text/css" href="css/manhuaDate.1.0.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/manhuaDate.1.0.js"></script>
	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="js/ssx.js"></script>
	<!-- <script type="text/javascript" src="js/page.js" ></script> -->
	<script type="text/javascript">
$(function (){
  $("#b1").click(function(){
		var itemtype=$("#itemtype").val(); 
		var cmbProvince=$("#cmbProvince").val();  
		var cmbCity=$("#cmbCity").val(); 
		var cmbArea=$("#cmbArea").val();
		var startdate=$("#startdate").val(); 
		var statue=$("#statue").val(); 
		alert(itemtype);
		$.ajax({
			type : "POST",
			dataType: "json",
			async: false,
			url : "rulerSelectItems",
			data : JSON.stringify({
		    	cmbProvince1:cmbProvince,
		    	cmbCity1:cmbCity,
		    	cmbArea1:cmbArea,
		    	startdate1:startdate,
		    	statue1:statue,
		    	itemtype1:itemtype
		    }),
			contentType:"application/json;charset=utf-8",   
			success : function(msg) {
				alert("11111111111111");
			}		
			});
	
});
});  
</script>
<style type="text/css">
.sele{ position:relative;
   top:-30px;
   left:500px;
    width:150px;
    height:30px;

}

.selec{
position:relative;
left:-200px;
top:20px;
width:150px;
height:30px;
}
.selec2{
position:relative;
left:-500px;
top:20px;
width:150px;
height:30px;
}
</style>
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">用户管理</a>&nbsp;-</span>&nbsp;用户管理
			</div>
		</div>

		<div class="page">
		<div class="vip">
			<div class="conform">
				<form>
					<div class="cfD">
						时间段：<input  type="date" readonly="true" name="startdate"/>&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;
					<input  type="date" readonly="true" />
						</div>
						<span style="position:relative;top:-30px;left:500px">地        区：</span>
						<select id="cmbProvince" name="cmbProvince" class="sele"></select>  
                        <select id="cmbCity" name="cmbCity" class="sele"></select>  
                        <select id="cmbArea" name="cmbArea" class="sele"></select>  
               <script type="text/javascript">  
                    addressInit('cmbProvince', 'cmbCity', 'cmbArea');  
               </script>
               <span style="position:relative;top:20px;left:-510px">状 态：</span><select id="statue" id="statue" class="selec2">
               <option value="在售">在售</option>
               <option value="下架">下架</option>
               </select>
               
             <span style="position:relative;top:20px;left:-210px">类   别：</span><select id="itemtype" name="itemtype" class="selec">
               <option value="家具">家具</option>
               <option value="上衣">上衣</option>
               <option value="靴子">靴子</option>
               <option value="家电">家电</option>
               <option value="生活">生活</option>
               <option value="电子">电子</option>
               </select>           
						<div class="cfD">
							<!-- <input class="addUser" type="text" placeholder="输入用户名/ID/手机号/城市" /> -->
							<button class="button" style="position:relative;left:850px;top:-25px" id="b1">搜索</button>
							<!-- <a class="addA addA1" href="vipadd.html">新增会员+</a> <a
								class="addA addA1 addA2" href="vipadd.html">密码重置</a> -->
						</div>
					</form>
				</div>
				<!-- vip 表格 显示 -->
				<div class="conShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td width="250px" class="tdColor">商品图片</td>
							<td width="188px" class="tdColor">商品名称</td>
							<td width="235px" class="tdColor">所属店铺</td>
							<td width="220px" class="tdColor">价格</td>
							<td width="290px" class="tdColor">上架时间</td>
							<td width="282px" class="tdColor">状态</td>
							<td width="282px" class="tdColor">库存</td>
							<td width="130px" class="tdColor">操作</td>
						</tr>
						<c:forEach var="item" items="${list}">
							<tr style="height:40px">
								<td><img src="${item.itempic}" style="width:60px;height:50px;"></td>
								<td>${item.itemname }</td>
								<td>${item.shopid}</td>
								<td>${item.price}</td>
								<td>${item.putdate }</td>
								<td>${item.status}</td>
								<td>${item.itemcount}</td>

								<td><a href="deleteuser?usersid=${user.usersid}" onclick="return confirmAct();"><img class="operation delban" src="img/delete.png"></a></td>
							</tr>
						</c:forEach>
					</table>
					<div class="paging">此处是分页</div>
				</div>
			</div>
		</div>
	</div>


	<!-- 删除弹出框 -->
	<div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="img/shanchu.png" /></a>
			</div>
			<p class="delP1">你确定要删除此条记录吗？</p>
			<p class="delP2">
				<a href="#" class="ok yes">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div>
	<!-- 删除弹出框  end-->
</body>

<script type="text/javascript">
// 广告弹出框
$(".delban").click(function(){
  $(".banDel").show();
});
$(".close").click(function(){
  $(".banDel").hide();
});
$(".no").click(function(){
  $(".banDel").hide();
});
// 广告弹出框 end
</script>
</html>