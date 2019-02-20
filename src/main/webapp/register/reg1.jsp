<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<style type="text/css">
.ginput1{ width:25px; height:25px; border-radius:20px; background-color:#F00; border:solid #F00 1px; color:#FFF}

.ginput4{ width:25px; height:25px; border-radius:20px; background-color:#CCC; border:solid #CCC 1px; color:#FFF}

.ginput2{ width:100%; height:100%; border:none}

/* .ginput3{ width:70%; height:100%; background-color:#F00; border-color:#F00; color:#FFF; border-radius:5px} */
/*font 的格式设置*/
.font1{ font-weight:800; font-family:"Arial Black", Gadget, sans-serif}

/*hr 的格式设置*/

/*table 的设置格式*/
.table1{ border:solid #EBEBEB 1px}


select::-ms-expand{ display:none;}
#apDiv1 {
	position: absolute;
	width: 100%;
	height: 78px;
	z-index: 1;
}
#apDiv2 {
	position: absolute;
	width: 464px;
	height: 243px;
	z-index: 2;
	left: 600px;
	top: 105px;
}
</style>
<script>
$(function(){
	$("#in1").click(function(){
		
	var email = $("#ema").val();
	
	if(email!=null){
	window.location.href="../emailTest?email="+email;
	}
})
})

  function yfun(){
	  var yemail=$("#ema").val();
	  alert(yemail)
	  if(yemail!=null){
		    $.ajax({
		   
		      url:"queryByYemail",
		      
		      type:"post",
		      
		      contentType:"application/json;charset=utf-8", 
		      
		      dataType : "json",
		      
		      data:JSON.stringify({yemail:yemail}),
		      
		      success:function(data){
		    	  
		    	  //alert(data)
		    	  
		        if (data!=0 ) {
		        	
		        alert("该邮箱已被注册，请重新输入！！！")
		        
		      }
		    	  
		     }
		   
		    });
		    }
		  
	  
  } 
		
		</script>
</head>
<body>
<!--天猫注册标题-->
<div align="center" id="apDiv1">
  <table width="70%" cellpadding="-10px">
    <tr>
      <td width="10%">&nbsp;</td>
      <td width="21%" align="center"><input type="button" value="1"  class="ginput1"/>
        <font class="font1"> 设置用户名</font></td>
      <td width="21%" align="center"><input type="button" value="2"  class="ginput4"/>
        填写账号信息</td>
      <td width="21%" >&nbsp;&nbsp;<input type="button" value="♪"  class="ginput4"/>
      注册成功</td>
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

<!--天猫注册验证码-->
<div id="apDiv2">
  <form action="./emver">
  <table>
    <tr>
      <td  align="left">邮箱号</td>
      <td><input type="email" placeholder="请输入你的邮箱"  required="required" name="email" id="ema" value="${emailed }" onblur="yfun()"/></td>
      <td>
      <input type="button" value="发送验证码" id="in1" style="background:#F00;  border-color:#F00; border-radius:5px"/></td>
      </tr>
    <tr>
      <td align="left" >填写验证码</td>
      <td><input type="text" name="ver"/></td>
      <td><input type="submit" value="下一步" style="background:#F00;  border-color:#F00; border-radius:5px"/></td>
       </tr>
  </table>
  </form>
</div>
</body>
</html>