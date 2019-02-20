<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery.min.js"></script>
<link href="css/shop1.css" rel="stylesheet" type="text/css">
<style type="text/css">

</style>
</head>

<body>
<div style="height: 600px; margin-top: 100px;  margin-left: 250px; border: solid #b0c4de 1px; width: 1200px">
<div align="center" id="apDiv1" style="margin-top: 20px; margin-left: -240px">
  <table width="70%" cellpadding="-10px">
    <tr>
      <td width="10%">&nbsp;</td>
      <td width="21%" align="center"><input type="button" value="1"  class="ginput1"/>
        <font class="font1"> 填写申请表</font></td>
      <td width="21%" align="center"><input type="button" value="2"  class="ginput1"/>
       <font class="font1">  待确认</font></td>
      <td width="21%" >&nbsp;&nbsp;<input type="button" value="♪"  class="ginput1"/>
      开店成功</td>
       <td width="10%">&nbsp;</td>
    </tr>
    <tr>
      <td><hr width="100%" /></td>
      <td><hr width="100%" color="#FF0000"/></td>
      <td><hr width="100%"   color="#FF0000"/></td>
      <td><hr width="100%"   color="#FF0000"/></td>

    </tr>
  </table>
 
<div id="apDiv2" style="width: 700px; margin-left:-200px;height: 80px; background: pink; margin-top: 100px">
 <font style="margin-left: 40px;color:red;font-size:24px">恭喜亲开店成功！！！您的店铺编号是：${shopp}</font>
</div>
</div>
</body>
</html>