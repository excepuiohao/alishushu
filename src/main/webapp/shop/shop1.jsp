<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery.min.js"></script>
<link href="../css/shop1.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../js/idcard.js"></script>
<script type="text/javascript" src="../js/ssx.js"></script>
</head>
<body>
<div style="height: 600px; margin-top: 100px;  margin-left: 250px; border: solid #b0c4de 1px; width: 1500px">
<div align="center" id="apDiv1" style="margin-top: 20px; margin-left: -240px">
  <table width="70%" cellpadding="-10px">
    <tr>
      <td width="10%">&nbsp;</td>
      <td width="21%" align="center"><input type="button" value="1"  class="ginput1"/>
        <font class="font1"> 填写申请表</font></td>
      <td width="21%" align="center"><input type="button" value="2"  class="ginput4"/>
        待确认</td>
      <td width="21%" >&nbsp;&nbsp;<input type="button" value="♪"  class="ginput4"/>
      开店成功</td>
       <td width="10%">&nbsp;</td>
    </tr>
    <tr>
      <td><hr width="100%" /></td>
      <td><hr width="100%" color="#FF0000"/></td>
      <td><hr width="100%" /></td>
      <td><hr width="100%" /></td>
      <td><hr width="100%" /></td>
    </tr>
  </table>
</div>
<div id="apDiv2" style="margin-top: 100px; margin-left: 50px">
  <form action="../insertshop" onsubmit="return IdentityCodeValid()">
  <table cellspacing="20px" >
        <!-- <tr><td>店铺id：</td><td><input type="text"/></td></tr> -->
        <tr><td>店铺名称：</td><td><input type="text" name="shopname" required/></td></tr>
        <!-- <tr><td>店铺所属人：</td><td><input type="text" name="userid" required placeholder="请输入邮箱或者昵称"/></td></tr> -->
        <tr><td>所属人身份证：</td>
        <td>
        <c:choose>
        <c:when test="${users.idcard!=null}">
        <input type="text" id="idcard" value="${users.idcard}" readonly name="idcard"/>
        </c:when>
        <c:otherwise>
         <input type="text" id="idcard" name="idcard" required onblur="IdentityCodeValid()"/>
        
        </c:otherwise>
        </c:choose></td></tr>
 <tr><td>店铺地址：</td><td><select id="cmbProvince" name="cmbProvince"></select>  
                        <select id="cmbCity" name="cmbCity"></select>  
                        <select id="cmbArea" name="cmbArea"></select>  
               <script type="text/javascript">  
                    addressInit('cmbProvince', 'cmbCity', 'cmbArea');  
               </script>  </td></tr>
               <tr><td><input type="submit" value="下一步" style="background:#F00;  border-color:#F00; border-radius:5px"/></td>
		
<td><font color="#b0c4de">还不是会员？<a href="../register/reg1.jsp" ><font color="#b0c4de">请先注册</font></a></font></td></tr>
</table>
</form>
</div>
</div>
</body>
</html>