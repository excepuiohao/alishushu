<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <meta http-equiv="refresh" content="1;url='../refresh'"> -->
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>

</head>
<body>
<%-- 当前未读消息
<c:choose>
	<c:when test="${xiaoxi!=null}">${xiaoxi }</c:when>
	<c:otherwise>0</c:otherwise>
</c:choose>
条。 --%>

<a href="../orderShow">走！</a>

<!--<button>发送</button>
 <script>
	setTimeout('myrefresh()',3000);
	function myrefresh()
	{
	   window.location.reload();
	   setTimeout('myrefresh()',3000);
	}
	 //指定1秒刷新一次
</script> -->
<!-- <script>
	$("button").click(function(){
		alert("123");
		window.location = "../controller1/123";
	})
</script> -->
</body>
</html>