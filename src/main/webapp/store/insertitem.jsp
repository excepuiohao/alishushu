<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insertitem.jsp' starting page</title>
    
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
    <style type="text/css">
.file {
    position: relative;
    display: inline-block;
    background: #D0EEFF;
    border: 1px solid #99D3F5;
    border-radius: 4px;
    padding: 4px 12px;
    overflow: hidden;
    color: #1E88C7;
    text-decoration: none;
    text-indent: 0;
    line-height: 20px;
}
.file input {
    position: absolute;
    font-size: 100px;
    right: 0;
    top: 0;
    opacity: 0;
}
.file:hover {
    background: #AADFFD;
    border-color: #78C3F3;
    color: #004974;
    text-decoration: none;
}

      </style>
      <script type="text/javascript">
      var n=0;
      $(function(){
    	  $("#itemname").blur(function(){
    		  //alert("ds");
    		  var names=$("#itemname").val();
    		  //alert(names);
              if(names==null||names==""){
    			  $("#itemname1").text("商品名称不能为空！");
    			  n=0;
    			  //alert("111111111")
    		 }else{
    			 $("#itemname1").text("");
    			 n=1;
    		 }   
    	  });
    	  $("#price").blur(function(){
    		  //alert("ds");
    		  var reg = /(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/;
    		  var price=$("#price").val();
    		 // alert(names);
    		  if (reg.test(price)) {
    			  $("#price1").text("");
    	          n=1;
    	     }else{
    	    	 $("#price1").text("价格格式有误！");
    	          n=0;
    	     }
    	  });
    	  $("#itemcount").blur(function(){
    		  alert("ds");
    		  var reg = new RegExp("^[0-9]*$");
    		  var count=$("#itemcount").val();
    		 // alert(names);
    		  if (reg.test(count)&&count!="") {
    			  $("#itemcount1").text("");
    	          n=1;
    	     }else{
    	    	 $("#itemcount1").text("请输入合理库存！");
    	          n=0;
    	     }
    	  });	  
    	  
      });
      function check(){
		  if(n==1){
			  return true;
		  }
		  else{
			  alert("请正确填写！！！！");
			  return false;
		  }
		  
	  }
      
      
      //图片上传预览    IE是用了滤镜。
        function previewImage(file)
        {
          var MAXWIDTH  = 150; 
          var MAXHEIGHT = 150;
          var div = document.getElementById('preview');
          if (file.files && file.files[0])
          {
              div.innerHTML ='<img id=imghead onclick=$("#previewImg").click()>';
              var img = document.getElementById('imghead');
              img.onload = function(){
                var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
                img.width  =  rect.width;
                img.height =  rect.height;
//                 img.style.marginLeft = rect.left+'px';
                img.style.marginTop = rect.top+'px';
              }
              var reader = new FileReader();
              reader.onload = function(evt){img.src = evt.target.result;}
              reader.readAsDataURL(file.files[0]);
          }
          else //兼容IE
          {
            var sFilter='filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="';
            file.select();
            var src = document.selection.createRange().text;
            div.innerHTML = '<img id=imghead>';
            var img = document.getElementById('imghead');
            img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;
            var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
            status =('rect:'+rect.top+','+rect.left+','+rect.width+','+rect.height);
            div.innerHTML = "<div id=divhead style='width:"+rect.width+"px;height:"+rect.height+"px;margin-top:"+rect.top+"px;"+sFilter+src+"\"'></div>";
          }
        }
        function clacImgZoomParam( maxWidth, maxHeight, width, height ){
            var param = {top:0, left:0, width:width, height:height};
            if( width>maxWidth || height>maxHeight ){
                rateWidth = width / maxWidth;
                rateHeight = height / maxHeight;
                
                if( rateWidth > rateHeight ){
                    param.width =  maxWidth;
                    param.height = Math.round(height / rateWidth);
                }else{
                    param.width = Math.round(width / rateHeight);
                    param.height = maxHeight;
                }
            }
            param.left = Math.round((maxWidth - param.width) / 2);
            param.top = Math.round((maxHeight - param.height) / 2);
            return param;
        }
    </script>
  </head>
  
  <body>
  <div id="preview"></div>
  <form action="insertitem" method="post" onsubmit="return check()" enctype="multipart/form-data">
    <div><fieldset style="border:solid #CCC 1px; width:900px; height:600px">
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						商品名称：<input type="text" class="input3" name="itemname" id="itemname" required>
						      <span style="color:red" id="itemname1"></span>
					</div>
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品价格：<input type="text"
							class="input3" name="price" id="price" required/>
							 <span style="color:red" id="price1"></span>
					</div>
					<!-- <div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品成色：<input type="text"
							class="input3" name="levels" id="levels"/>
					</div> -->
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品成色：
						<select class="input3" name="levels">
						<option value="5">5成新</option>
						<option value="6">6成新</option>
						<option value="7">7成新</option>
						<option value="8">8成新</option>
						<option value="9">9成新</option>
						<option value="10">10成新</option>
						</select>
					</div>
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品库存：<input type="text"
							class="input3" name="itemcount" id="itemcount" required/>
							<span style="color:red" id="itemcount1"></span>
					</div>
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品描述：
						<div class="btext2">
							<textarea class="text2" name="iteminfo" id="iteminfo" required></textarea>
						</div>
					</div>
					<div>
					<p id="text"></p>
					<div class="file"  style="position:relative; left:100px;top:20px; width:100px; height:30px;">
                  <span style="color:black; font-size:14px;padding-top:10px">上传商品图片</span>
                   <input type="file" name="uploadFile" onchange="previewImage(this)" id="previewImg"/><br/><br/>
                     </div>
                  </div>
					<div class="bbD">
						<p class="bbDP">
						<input type="submit" value="确定" class="btn_ok btn_yes" style="position:relative; left:320px;width:110px;height:40px"/>
							<!-- <button class="btn_ok btn_yes" href="#">提交</button>
							<a class="btn_ok btn_no" href="#">取消</a> -->
						</p>
					</div> 
					</fieldset>
				</div>
</form>
</body>
</html>
