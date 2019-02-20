<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sendmessage.jsp' starting page</title>
    
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

  </head>
  
  <body>
  <form action="insertsysmess">
    <div class="bbD">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="font-size:16px">编辑消息内容：</span>
		<div class="btext2" style="position:relative; left:30px;top:-5px">
		<textarea class="text2" name="sysinfocontext" id="sysinfocontext" required></textarea>
   </div>
		</div>
		<div class="bbD">
		<p class="bbDP">
			<input type="submit" value="确定" class="btn_ok btn_yes" style="position:relative; left:320px;width:110px;height:40px"/>
		</p>
   </div> 
</form>
  </body>
</html>
