<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'allsysmess.jsp' starting page</title>
    
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
     <script type="text/javascript">
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
					href="#">系统消息</a>&nbsp;-</span>&nbsp;查看历史消息
			</div>
		</div>
		</div>
   <div class="conShow" style="position:relative; left:80px">
					<table border="1" cellspacing="0" cellpadding="0">
						<tbody id="tb">
							 <tr><!-- <td width="250px" class="tdColor">bianhao</td> -->
							
								<td width="250px" class="tdColor">发送人</td>
								<td width="188px" class="tdColor">消息内容</td>
								<td width="282px" class="tdColor">消息时间</td>
								<td width="130px" class="tdColor">操作</td>
							</tr>
						</tbody>
						<c:forEach var="allmess" items="${allmess}">
							<tr style="height:40px">
							<%-- <td>${user.usersid }</td> --%>
								<td>${allmess.mname }</td>
								<td>${allmess.sysinfocontext}</td>
								<td>${allmess.releasedate }</td>
								 <td><a href="deletesysmess?systeminfoid=${allmess.systeminfoid}" onclick="return confirmAct();"><img class="operation delban" src="img/delete.png"></a></td>
							</tr>
						</c:forEach>
						<!-- <tr><td> <img class="operation delban"
								src="img/delete.png"></td></tr> -->
					</table>
				</div>
			<div style="margin-top:20px;position:relative;left:-30px">
             <jsp:include page="../panigation.jsp">
               <jsp:param name="formUrl" value="selectmesspage"/>
             </jsp:include>
            </div>
  </body>
</html>
