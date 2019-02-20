<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
<!-- <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script> -->
<!-- <script type="text/javascript" src="js/page.js" ></script> -->
<script type="text/javascript">
	$(function() {
		$("#b1").click(function(){
		var con=$("#condition").val();
		alert(con); 
		$.ajax({
			type : "POST",
			dataType: "json",
			async: false,
			url : "selectuser1",
			data : JSON.stringify({
		    	con1:con,
		    }),
			contentType:"application/json;charset=utf-8",   
			success : function(msg) {
				alert(msg)
			},
			error: function (XMLHttpRequest, textStatus, errorThrown) {
			    // 通常 textStatus 和 errorThrown 之中
			    // 只有一个会包含信息
			    // 调用本次AJAX请求时传递的options参数
			    alert(XMLHttpRequest.readyState);
			    alert(XMLHttpRequest.status);
			    alert(textStatus);
			    alert(errorThrown);
			}

		})
		}); 
		
	});
	 function confirmAct() 
     { 
         if(confirm('确定要刪除这条消息吗嗎?')) 
         { 
             return true; 
         } 
         return false; 
     } 
</script>
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
			<!-- vip页面样式 -->
			<div class="vip">
				<div class="conform">
					<form>
						<div class="cfD">
							<input class="addUser" type="text" placeholder="输入用户名/ID/手机号/城市"
								name="condition" id="condition" />
							<button class="button" id="b1">搜索</button>
						</div>
					</form>
				</div>
				<!-- vip 表格 显示 -->
				<div class="conShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tbody id="tb">
							 <tr><!-- <td width="250px" class="tdColor">bianhao</td> -->
							
								<td width="250px" class="tdColor">头像</td>
								<td width="188px" class="tdColor">姓名</td>
								<td width="282px" class="tdColor">昵称</td>
								<td width="188px" class="tdColor">密码</td>
								<td width="235px" class="tdColor">手机号码</td>
								<td width="235px" class="tdColor">身份证号</td>
								<td width="235px" class="tdColor">邮箱</td>
								<td width="220px" class="tdColor">地址</td>
								<td width="290px" class="tdColor">积分</td>
								<td width="130px" class="tdColor">操作</td>
							</tr>
						</tbody>
						<c:forEach var="user" items="${selectuser}">
							<tr style="height:40px">
							<%-- <td>${user.usersid }</td> --%>
								<td><img src="${user.photo}" style="width:60px;height:50px;"></td>
								<td>${user.uname }</td>
								<td>${user.nickname }</td>
								<td>${user.upwd }</td>
								<td>${user.phone }</td>
								<td>${user.idcard }</td>
								<td>${user.email }</td>
								<td>${user.address }</td>
								<td>${user.integral }</td>
								<td><a href="deleteuser?usersid=${user.usersid}" onclick="return confirmAct();"><img class="operation delban" src="img/delete.png"></a></td>
							</tr>
						</c:forEach>
						<!-- <tr><td> <img class="operation delban"
								src="img/delete.png"></td></tr> -->
					</table>
				</div>
				<!-- vip 表格 显示 end-->
			</div>
			<!-- vip页面样式end -->
		</div>

	</div>


	 <!-- 删除弹出框 -->
	<!-- <div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="img/shanchu.png" /></a>
			</div>
			<p class="delP1">你确定要删除此条记录吗？</p>
			<p class="delP2">
				<a href="#" class="ok yes">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div> -->
	<!-- 删除弹出框  end -->
</body>

<script type="text/javascript">
	// 广告弹出框
	$(".delban").click(function() {
		$(".banDel").show();
	});
	$(".close").click(function() {
		$(".banDel").hide();
	});
	$(".no").click(function() {
		$(".banDel").hide();
	});
	// 广告弹出框 end
</script>