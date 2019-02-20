<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 100%;
	height: 78px;
	z-index: 1;
}
#apDiv2 {
	position: absolute;
	width: 464px;
	height: 328px;
	z-index: 2;
	left: 600px;
	top: 86px;
}
#apDiv3 {
	position: absolute;
	width: 200px;
	height: 115px;
	z-index: 3;
	left: 366px;
	top: 67px;
}
#apDiv4 {
	position: absolute;
	width: 199px;
	height: 115px;
	z-index: 3;
	left: 378px;
	top: 196px;
}
#apDiv5 {
	position: absolute;
	width: 200px;
	height: 115px;
	z-index: 3;
	left: 376px;
	top: 322px;
}
.ginput1{ width:25px; height:25px; border-radius:20px; background-color:#F00; border:solid #F00 1px; color:#FFF}

.ginput2{ width:70%; height:100%}

/* .ginput3{ width:50%; height:100%; background-color:#F00; border-color:#F00; color:#FFF; border-radius:5px} */

.ginput4{ width:25px; height:25px; border-radius:20px; background-color:#CCC; border:solid #CCC 1px; color:#FFF}

/*font 的格式设置*/
.gfont1{ font-weight:bold; font-family:"Arial Black", Gadget, sans-serif}

.gfont2{ font-weight:bold}

.gfont3{ font-size:14px; color:#999}

.gfont4{ font-size:10px}

/*div 的格式设置*/
td .gdiv1{ display:none}

td:hover .gdiv1{ display:block}

</style>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
function fun(){
	var pwd = document.getElementById("pw").value;
	
	var repwd =  document.getElementById("rpw").value;

	if(pwd!=repwd){
		alert("两次密码不一致，请重新输入！！！")
	}
	
}

function checkUser(){
	
    var nikname1=$("#nik").val();

    
    if(nikname1!=null){
    	
    $.ajax({
    	
      url:"../queryByNikname",
      
      type:"post",
      
      contentType:"application/json;charset=utf-8", 
      
      dataType : "json",
      
      data:JSON.stringify({nikname:nikname1}),
      
      success:function(data){
    	  
    	  //alert(data)
    	  
        if (data!=0 ) {
        	
        alert("该昵称已被占用")
        
      }else {
    	  
    	  alert("用户名可用");
    	  
       }
    	  
     }
   
    });
    }
  }
  
  function yfun1(){
	  alert("邀请人邮箱")
	  var yemail=$("#yf").val();
	 
	  
		    $.ajax({
		      url:"../queryByYemail",
		      
		      type:"post",
		      
		      contentType:"application/json;charset=utf-8", 
		      
		      dataType : "json",
		      
		      data:JSON.stringify({yemail:yemail}),
		      
		      success:function(data){
		    	  
		    	  //alert(data)
		    	  
		        if (data==0 ) {
		        	
		        alert("用户还未注册账号，邀请无效！！！")
		        
		      }
		    	  
		     }
		   
		    });
		   
		  
	  
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
      <td width="21%" align="center"><input type="button" value="2"  class="ginput1"/>
        <font class="font1">填写账号信息</font></td>
     <!--  <td width="21%" align="center"><input type="button" value="3"  class="ginput4"/>
        <font class="font1">设置支付方式</font></td> -->
      <td width="21%" >&nbsp;&nbsp;
       
        <input type="button" value="♪"  class="ginput4"/>
        <font class="font1">注册成功</font></td>
        <td width="10%">&nbsp;</td>
    </tr>
    <tr>
      <td><hr width="100%" /></td>
      <td><hr width="100%" color="#FF0000"/></td>
      <td><hr width="100%" color="#FF0000"/></td>
      <td><hr width="100%" /></td>
      <td><hr width="100%" /></td>
    </tr>
  </table>
</div>

<!--天猫用户注册-->
<div id="apDiv2">
  <form action="regUsers">
  <table cellspacing="20px" width="100%">
    <tr>
      <td  width="30%" align="right"><font class="gfont2">登录名</font></td>
      <td><font class="gfont3"><input type="text" value="${usersid }" name="usersid" readonly="readonly"/></font></td>
    </tr>
    
    <tr></tr>

    <tr>
      <td width="30%" align="right"><font class="gfont2">设置登录密码</font></td>
      <td><font class="gfont3">登录时验证，保护账号信息</font></td>
    </tr>
    <tr>
      <td width="30%" height="40px" align="right"><font class="gfont4">登录密码</font></td>
      <td width="">
      <input type="password" 
      placeholder="设置你的登录密码" 
      required="required" class="ginput2" 
      name="upwd" id="pw"/>
     
      </td>
    </tr>
    <tr>
      <td width="30%" height="40px" align="right">
      <font class="gfont4">密码确认</font></td>
      <td>
      <font>
      <input type="password" 
      placeholder="请再次输入你的密码" 
      required="required" class="ginput2" name="reupwd" id="rpw" onblur="fun()"/></font>
       <div id="apDiv4" class="gdiv1"><font class="gfont4">请再次输入你的密码</font></div>
      </td>
    </tr>
    
    <tr></tr>

    <tr>
      <td width="30%" align="right"><font class="gfont2">设置会员名</font></td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td width="30%" height="40px"align="right"><font class="gfont4">登录名</font></td>
      <td ><input type="text"  placeholder="会员名一旦设置成功，无法修改" required="required"  class="ginput2" name="nickname" id="nik" onblur="checkUser()"/>
      <div id="apDiv5" class="gdiv1"><font class="gfont4">建议会员使用简体中文，方便好记</font></div></td>
    </tr>
    
    <tr>
     <td width="30%" height="40px"align="right"><font class="gfont4">邀请人邮箱</font></td>
     <td><input type="email"  placeholder="邀请人邮箱" required="required"  class="ginput2" name="yemail" 
     id="yf" onblur="yfun1()"/></td>
    </tr>

    <tr>
      <td width="30%">&nbsp;</td>
      <td width="70%" height="40px"><input type="submit" value="提交"  class="ginput3"/></td>
    </tr>
  </table>
  </form>
</div>
</body>
</html>