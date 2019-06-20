<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery.js"></script>
<title>帖子列表展示</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#qx").click(function() {
			var xz = $(this).prop("checked");//判断全选按钮的选中状态
			var ck = $(".ids").prop("checked", xz); //让class名为qx的选项的选中状态和全选按钮的选中状态一致。 
		});
		var tx = $("#st").val();//获取搜索关键字
		if (tx != "") {//判断关键字是否为“”，如果为“”则表示进入了查询页面。如果不为空则表示进入模糊查询页面
			$(".content").each(
					function(k, v) {//遍历所有帖子的标题、概要、作者
						var html = $(this).html() + "";//得到遍历元素的html内容
						if (html.indexOf(tx) != -1) {//判断关键字是否存在于遍历元素中
							var regx = new RegExp(tx, "g");//创建正则表达式（用于replace方法参数）
							var str = "<span style='background-color:yellow;'>"
									+ tx + "</span>";//标黄html语句
							html = html.replace(regx, str);//将关键字标黄
							$(this).html(html);
						}
					});
		}
	});
	//删除帖子判断
	function deletei() {

		var flag = true;
		$(".ids").each(function(k, v) {
			var flag1 = $(this).prop("checked");
			if (flag1) {
				flag = false;
			}
		});
		if (flag) {
			alert("请选择您要删除的帖子！");
			return false;
		} else {
			if (confirm("确定要删除这些帖子吗？")) {
				document.getElementById("form1").submit();
			}
		}

	}
</script>
<style type="text/css">
div {
	float: right;
}

td {
	vertical-align: middle;
}
</style>
</head>
<body>
	<input type="hidden" id="st" value="${text }">
	
	<div>
		<form class="form-inline" action="search.action" method="post">
			<input class="form-control" type="text" placeholder="热搜" name="text">
			<button class="btn btn-info" type="submit">搜索</button>
		</form>
	</div>
	<div style="padding: 20px 100px;" class="center-block">
		<form id="form1" action="delete.action" method="post">
			<table class="table">
				<tr style="border-top: 0;">
					<th colspan="7"><h1>帖子列表展示</h1></th>
				</tr>
				<tr>
					<th>全选<br> <input type="checkbox" id="qx"></th>
					<th>编号</th>
					<th>标题</th>
					<th>概要</th>
					<th>作者</th>
					<th>创建时间</th>
					<th></th>
				</tr>
				<c:forEach items="${list }" var="inv">
					<tr>
						<td><input type="checkbox" class="ids" name="ids"
							value="${inv.id }"></td>
						<td>${inv.id }</td>
						<td style="width: 18%" class="content">${inv.title }</td>
						<td class="content" style="width: 30%;">${inv.summary }</td>
						<td class="content">${inv.author }</td>
						<td><fmt:formatDate value="${inv.createdate }"
								pattern="yyyy/MM/dd HH:mm:ss" /></td>
						<td><button class="btn btn-default btn-sm" type="button"
								onclick="javascript:window.location.href='toedit.action?id='+${inv.id }">修改</button></td>
					</tr>
				</c:forEach>
				<tr>
					<td><button class="btn btn-danger btn-sm" type="button"
							onclick="deletei()" value="删除">删除</button></td>
					<td><button class="btn btn-success btn-sm" type="button"
							onclick="javascript:window.location.href='tofatie.action'">发帖</button></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>