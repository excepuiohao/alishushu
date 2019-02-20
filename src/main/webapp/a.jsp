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
    
    <title>My JSP 'a.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="css/css.css" />
    <script type="text/javascript" src="js/jquery.min.js"></script>
     <link rel="stylesheet" href="css/font-awesome.min.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/star.js"> </script>
    <style type="text/css">
    .ss{
    font-size:26px;
    font-family:微软雅黑
    }
    
    </style>
  </head>
  
  <body>
  <form action="insertcomm">
   <div>
        <div class="bbD">
	         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="font-size:20px; position:relative;top:180px;left:130px">店铺评价：</span>
		<div class="btext2">
		<textarea name="commcontext" id="commcontext" style="width:500px; height:200px; position:relative;left:50px; top:200px" required></textarea>						</div>
	    </div>
   </div>
   <div style="position:relative; top:250px;left:170px">
    <span class="ss">描述相符：</span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s1"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s2"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s3"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s4"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s5"></span>
    <input type="hidden" name="levels" id="levels"/>
    <br/>
<span class="ss">卖家服务：</span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s6"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s7"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s8"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s9"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s10"></span>
    <br/>
 <span class="ss">物流服务：</span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s11"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s12"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s13"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s14"></span>
    <span class="fa fa-star" style="color:#CCC; font-size:40px" id="s15"></span>
    <br/>
    </div>
    <div class="bbD">
						<p class="bbDP">
						<input type="submit" value="确定" class="btn_ok btn_yes" onmouseover="check()" style="position:relative; left:320px;width:110px;height:40px; top:200px"/>
							<!-- <button class="btn_ok btn_yes" href="#">提交</button>
							<a class="btn_ok btn_no" href="#">取消</a> -->
						</p>
					</div> 
    </form>
  </body>
</html>
