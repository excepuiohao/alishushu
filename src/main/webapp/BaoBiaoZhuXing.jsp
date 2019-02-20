<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="icon"
	href="https://static.jianshukeji.com/highcharts/images/favicon.ico">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<title>业绩柱形图</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script src="https://img.hcharts.cn/highcharts/highcharts.js"></script>
<script src="https://img.hcharts.cn/highcharts/modules/exporting.js"></script>
<script src="https://img.hcharts.cn/highcharts/modules/series-label.js"></script>
<script src="https://img.hcharts.cn/highcharts/modules/oldie.js"></script>
<script type="text/javascript" src="js/data.js"></script>
<script
	src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script>
<script type="text/javascript">
	$(function() {
		$('#container').highcharts(
				{
					data : {
						table : 'datatable'
					},
					chart : {
						type : 'column'
					},
					title : {
						text : '本周业绩柱形表'
					},
					yAxis : {
						allowDecimals : false,
						title : {
							text : '元',
							rotation : 0
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.point.y + ' 元';
						}
					}
				});
	});
</script>
<style type="text/css">
#datatable {
/*  	display: none;  */
	border: 1px solid #ccc;
	border-collapse: collapse;
	border-spacing: 0;
	font-size: 12px;
}

td, th {
	border: 1px solid #ccc;
	padding: 4px 20px;
}
</style>

</head>
<body>
    <%
		int a[] = (int[]) request.getAttribute("money");
	%>
	<div id="container"
		style="min-width: 310px; height: 400px; margin: 0 auto"></div>
	<table id="datatable">
		<thead>
			<tr>
				<th></th>
				<th>业绩</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>第一天</th>
				<td><%=a[0] %></td>
			</tr>
			<tr>
				<th>第二天</th>
				<td><%=a[1] %></td>
			</tr>
			<tr>
				<th>第三天</th>
				<td><%=a[2] %></td>
			</tr>
			<tr>
				<th>第四天</th>
				<td><%=a[3] %></td>
			</tr>
			<tr>
				<th>第五天</th>
				<td><%=a[4] %></td>
			</tr>
			<tr>
				<th>第六天</th>
				<td><%=a[5] %></td>
			</tr>
			<tr>
				<th>第七天</th>
				<td><%=a[6] %></td>
			</tr>
		</tbody>
	</table>
</body>

</html>