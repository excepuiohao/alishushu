<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#apDiv1 {
	position:relative;
	width:763px;
	height:155px;
	z-index:1;
	border-radius:5px;
	border:solid 1px;
	top:100px;
	left:400px;
}
#apDiv2 {
	position:relative;
	width:175px;
	height:157px;
	z-index:1;
	left: 1px;
	
}
#apDiv3 {
	position:relative;
	width:408px;
	height:155px;
	z-index:2;
	left: 178px;
    top: -160px
}
#apDiv4 {
	position:relative;
	width:178px;
	height:156px;
	z-index:2;
	left: 586px;
	top: -400px;
}
#apDiv5 {
	position:relative;
	width:84px;
	height:98px;
	z-index:2;
	left: 2px;
	top: 0px;
}
#apDiv6 {
	position:relative;
	width:93px;
	height:97px;
	z-index:3;
	left: 86px;
	top: 1px;
}
#apDiv7 {
	position:relative;
	width:178px;
	height:58px;
	z-index:1;
	top: 98px;
	left: -2px;
}
a:link {
	text-decoration: none}
	
	
#apDiv2 img{width:80%;height:80%;margin-top: 15px; margin-left: 10px}
#apDiv5 img{width:80%;height:80%;margin-top: 150px; margin-left: 10px}
#apDiv3 table{margin-top: 15px;}
#apDiv6 table{margin-top: 15px;}
</style>
</head>

<body>
<c:if test="${not empty NewPutdate}">
<c:forEach items="${NewPutdate}" var="np">
<div id="apDiv1">

  <div id="apDiv2">
  <img src="${np.itempic }"/>
  </div>
  <div id="apDiv3">
  
  <table width="100%" cellspacing="10px">
  <tr><td colspan="2"><a href="">${np.itemname}</a></td></tr>
   <tr><td colspan="2">¥${np.price}</td></tr>
    <tr><td colspan="2">${np.iteminfo}</td></tr>
     <tr><td>1分钟前 来自<a  href=""><font style="background: #FF8000">宝宝</font></a></td><td><a  href=""><font color="ffcc00">留言</font></a></td></tr>
  
  </table>
  </div>
  <div id="apDiv4">
 
  <div id="apDiv5"> <img src="../img/e.jpg"/></div>
  <div id="apDiv6">
    <table>
    <tr><td><a  href="">店铺:${np.shopname }</a></td></tr>
    <tr><td>地点:${np.shopaddr }</td></tr>
    <tr><td>等级:${np.star }</td></tr>
    </table>
  </div>
  <div id="apDiv7" style="text-align:center">
  <a href=""><font color="ffcc00">更多卖家闲置</font></a>
  </div>
  </div>
  
</div>
</c:forEach>
  </c:if>
</body>
</html>