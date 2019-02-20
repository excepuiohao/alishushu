<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<title>登录</title>
<!-- 此段必须要引入 t为小时级别的时间戳 -->
	<link type="text/css" href="//g.alicdn.com/sd/ncpc/nc.css?t=1510908074584" rel="stylesheet"/>
	<script type="text/javascript" src="//g.alicdn.com/sd/ncpc/nc.js?t=1510908074584"></script>
	<!-- 引入结束 -->
<link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="../js/bootstrap.min.js" type="text/javascript" rel="stylesheet">
<link href="../js/jquery.min.js" rel="stylesheet">

<style>
table{
	  background-color:#FFF; border-collapse:collapse; border:none;
}
.a_td1{
	border-right:none;
}
.a_img1{
	   margin-left:0px;
}
.a_td2{
	   border-left:none;
	
}
input{
	  border:none;
	  width:200px;
	  height:30px;
}

.a_tr1{
	  text-align:center;
}
.a_td5{
	  border:none;
}
button{
	  background-color:#F00; width:300px; height:40px;
	  border:none;
}
/*span{
	  text-align:center; color:#FFF;
	
}*/
.a1{
	text-decoration:none;
	color:#FFF;
}
.a2{
	text-decoration:none;
	color:#999;
	
}
.a3{
	text-decoration:none;
	color:#000;
}
.a_p1{
	margin-left: 200px;
}
.a_sp1{
	margin-left:60px;
}
.a_d5{
	position:absolute;
	top:812px;
	left:596px;
}
	#a1{
    position:fixed;
    width:100%;
    height:100%;
}
</style>
</head>

<body>
<!-- 此段必须要引入 -->
<div id="_umfp" style="display:inline;width:1px;height:1px;overflow:hidden"></div>
<!-- 引入结束 -->


<p><img src="a1.jpg" id="a1"/></p>
<div class="span6" style=" position:absolute;top: 20px; left: 250px; background:pink;" >
<div class="alert alert-error" width="100%">
				 
				<h4>
					提示!
				</h4> <strong>警告!</strong> 为确保您账户的安全及正常使用，依《网络安全法》相关要求，6月1日起会员账户需绑定邮箱。如您还未绑定，请尽快完成，感谢您的理解及支持！.
			</div>
			</div>
<div style="width:350px; height:350px; background: #FBFBFB; position:absolute; top:170px; left:50px;">
<div class="a_d1"><img src="a3.bmp"/></div>
<div class="a_d2" ><img src="a4.bmp" style="float:right; margin-top:-30px"/></div>
<div class="a_d3" style="position: relative; left: 20px; top: 20px">密码登录</div>
<div class="a_d4" style="position: relative; top: 30px">
<div class="container">
<from action="../">
<table border="1" ; width="320px" align="center" style=" border-collapse:collapse; border:none;">
      <tr><td class="a_td1"><img src="a5.bmp" class="a_img1"/></td>
      <td class="a_td2" >
	  <div class="ln"><input type="text" placeholder="输入会员名/邮箱" />
	  </div></td></tr>
      <tr style="100px"><td style="border:none">&nbsp;</td></tr>
      <tr><td class="a_td1" ><img src="a6.bmp" class="a_img1"/></td>
      <td class="a_td2" valign="middle">
	   <td class="a_td2" ><input type="password" placeholder="输入密码" />&nbsp;&nbsp;<img src="a7.bmp"/>
	    </div></td></tr>
      <tr style="100px"><td style="border:none">&nbsp;</td></tr>
	 
		<!-- <input type='hidden' id='csessionid' name='csessionid'/>
		<input type='hidden' id='sig' name='sig'/>
		<input type='hidden' id='token' name='token'/>
		<input type='hidden' id='scene' name='scene'/> -->
     
   
		
        <div class="ln">
			<div id="dom_id"></div>
      <tr class="a_tr1" style="text-align:center">
      <td class="a_td5" class="a_td5" width="100px" height="40px" colspan="2">
	    <div class="ln"><input type="submit" value="登录"  
      style="background-color: #f52b00; width:320px; height:40px; color: white;"/></div></td></tr>
      <tr><td class="a_td5" style=" height:50px; border:none">&nbsp;</td></tr>
      <tr><td class="a_td5" align="right" colspan="2" ><font size="-1" color="#999999"><a class="a2" href="">忘记密码</a><a class="a2" href="天猫注册/天猫注册01.html">&nbsp;免费注册</a></font></td></tr>
</table>
</form>
</div>
</div>


</div>
<script>
	var nc = new noCaptcha();
	var nc_appkey = 'FFFF000000000178E546';  // 应用标识,不可更改
    var nc_scene = 'login';  //场景,不可更改
	var nc_token = [nc_appkey, (new Date()).getTime(), Math.random()].join(':');
	var nc_option = {
		renderTo: '#dom_id',//渲染到该DOM ID指定的Div位置
		appkey: nc_appkey,
        scene: nc_scene,
		token: nc_token,
        //trans: '{"name1":"code100"}',//测试用，特殊nc_appkey时才生效，正式上线时请务必要删除；code0:通过;code100:点击验证码;code200:图形验证码;code300:恶意请求拦截处理
		callback: function (data) {// 校验成功回调
			console.log(data.csessionid);
			console.log(data.sig);
			console.log(nc_token);

			document.getElementById('csessionid').value = data.csessionid;
			document.getElementById('sig').value = data.sig;
			document.getElementById('token').value = nc_token;
            document.getElementById('scene').value = nc_scene;
		}
	};
	nc.init(nc_option);
</script>
</body>
</html>