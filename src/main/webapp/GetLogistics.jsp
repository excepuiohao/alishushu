<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!-- 重点参数：changeNavgContent -->
<!doctype html>
<html lang="zh-CN">

<head>
    <!-- 原始地址：//webapi.amap.com/ui/1.0/ui/misc/PathSimplifier/examples/chang-navg-content.html -->
    <base href="//webapi.amap.com/ui/1.0/ui/misc/PathSimplifier/examples/" />
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>物流信息</title>
    <style>
    html,
    body,
    #container {
        width: 100%;
        height: 100%;
        margin: 0px;
    }

    #loadingTip {
        position: absolute;
        z-index: 9999;
        top: 0;
        left: 0;
        padding: 3px 10px;
        background: red;
        color: #fff;
        font-size: 14px;
    }
    </style>
</head>

<body>
    <input id="i1" type="hidden" value="<%=request.getAttribute("startLongitude")%>">
	<input id="i2"  type="hidden" value="<%=request.getAttribute("startLatitude")%>">
	<input id="i3" type="hidden"  value="<%=request.getAttribute("endLongitude")%>">
	<input id="i4"   type="hidden" value="<%=request.getAttribute("endLatitude")%>">
    <div id="container"></div>
    <script type="text/javascript" src='//webapi.amap.com/maps?v=1.4.1&key=您申请的key值'></script>
    <!-- UI组件库 1.0 -->
    <script src="//webapi.amap.com/ui/1.0/main.js?v=1.0.11"></script>
    <script type="text/javascript">
    var a = document.getElementById("i1").value;
	var b = document.getElementById("i2").value;
	var c = document.getElementById("i3").value;
	var d = document.getElementById("i4").value;
    //创建地图
    var map = new AMap.Map('container', {
        zoom: 17
    });


    function initPage(PathSimplifier, $) {

        var emptyLineStyle = {
            lineWidth: 0,
            fillStyle: null,
            strokeStyle: null,
            borderStyle: null
        };

        var pathSimplifierIns = new PathSimplifier({
            zIndex: 100,
            //autoSetFitView:false,
            map: map, //所属的地图实例

            getPath: function(pathData, pathIndex) {

                return pathData.path;
            },
            getHoverTitle: function(pathData, pathIndex, pointIndex) {

                return null;
            }
        });

        window.pathSimplifierIns = pathSimplifierIns;

        pathSimplifierIns.setData([{
            name: '测试',
            path: [
                [a,b],
                
                [c,d]
              
            ]
        }]);

        //initRoutesContainer(d);

        function onload() {
            pathSimplifierIns.renderLater();
        }

        function onerror(e) {
            alert('图片加载失败！');
        }

        var pathNavigatorStyles = [{
                width: 16,
                height: 24,
                content: 'defaultPathNavigator',
            },
            {
                content: 'none',
            },
            {
                width: 24,
                height: 24,
                //使用图片
                content: PathSimplifier.Render.Canvas.getImageContent('./imgs/plane.png', onload, onerror),
            },
            {
                width: 16,
                height: 32,
                //使用图片
                content: PathSimplifier.Render.Canvas.getImageContent('./imgs/car.png', onload, onerror),
            }
        ]


        function extend(dst) {
            if (!dst) {
                dst = {};
            }

            var slist = Array.prototype.slice.call(arguments, 1);

            for (var i = 0, len = slist.length; i < len; i++) {
                var source = slist[i];

                if (!source) {
                    continue;
                }

                for (var prop in source) {
                    if (source.hasOwnProperty(prop)) {
                        dst[prop] = source[prop];
                    }
                }
            }
            return dst;
        }

        var idx = 0;

        var navg1 = pathSimplifierIns.createPathNavigator(0, {
            loop: true,
            speed: 500000,
            pathNavigatorStyle: extend({}, pathNavigatorStyles[0])
        });

        navg1.start();

        function changeNavgContent() {

            //获取到pathNavigatorStyle的引用
            var pathNavigatorStyle = navg1.getStyleOptions();

            //覆盖修改
            extend(pathNavigatorStyle, pathNavigatorStyles[(++idx) % pathNavigatorStyles.length]);

            //重新绘制
            pathSimplifierIns.renderLater();
        }

        setInterval(changeNavgContent, 500);
    }

    AMapUI.load(['ui/misc/PathSimplifier', 'lib/$'], function(PathSimplifier, $) {

        if (!PathSimplifier.supportCanvas) {
            alert('当前环境不支持 Canvas！');
            return;
        }

        initPage(PathSimplifier, $);
        
    });

    </script>
</body>

</html>