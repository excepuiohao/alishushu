<%@page import="com.alishushu.bean.Users"%>
<%@page import="com.alishushu.bean.Items"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form action="SelectAllmess">
		<input type="submit" value="查看系统消息">
	</form>
	
	<form action="ViewMessage">
		<input type="submit" value="查看留言">
	</form>
	
	<form action="ViewPerformanceByLine">
		<input type="submit" value="查看销售报表">
	</form>
	
	<form action="../jsp/RobotMM.jsp">
		<input type="submit" value="查看智能客服">
	</form>
	
    <form action="MakeAMap" method="post">

		<input type="text" placeholder="请输入起点" name="Shopsid"> <input
			type="submit" value="查看">
	</form>
	
	<form action="ViewItem">
     <% Items i= new Items();
     i.setItemid("234567");
     session.setAttribute("items", i);
     Users u=new Users();
     u.setUsersid("4444");
     session.setAttribute("users", u);
     %>
     <input
			type="text" palceholder="请输入商品id 模拟程序" name="itemid" >
		<input
			type="submit" value="查看商品展示">
	</form>
	
</body>
</html>