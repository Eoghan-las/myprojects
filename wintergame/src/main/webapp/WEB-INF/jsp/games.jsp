<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js">

<head>
<meta charset="utf-8" />
<title>游戏列表页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />

<c:import url="basepath.jsp"></c:import>
<script type="text/javascript">
	$(function(){
		$("#qx").click(function() {
			var xz = $(this).prop("checked");//判断全选按钮的选中状态
			var ck = $(".ids").prop("checked", xz); //让class名为qx的选项的选中状态和全选按钮的选中状态一致。 
		});
		$("#kind").change(function() {
					var kid = $("#kind").val();
					$.ajax({
						type:"post",
						url:"gamekind.action",
						contentType:'application/json;charset=utf-8',
						data:kid,
						success : function(data){
							$("#tb").html("");
							var html = "";
							$(data).each(function(i,game){
								html+="<tr><td><input type='checkbox' class='ids' name='ids'value='"+game.gid+"'></td><td>"+game.gid+"</td><td>"+game.gname+"</td><td>"+game.gameKind.kname+"</td><td>"+game.gamespace+"</td><td>"+game.saler+"</td><td>"+game.commingtime+"</td><td><a href='touploadgame.action?gid="+game.gid+"'>游戏资源</a>//<a href='touploadimg.action?gid="+game.gid+"'>游戏图片</a></td></tr>";
							}); 
							$("#tb").html(html);
						}
					});
				});
	});
	
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
td a {
	cursor: pointer;
}
</style>

</head>

<body lang="en">
	
	<!-- 头部导航栏 -->
	<c:import url="header.jsp"></c:import>

	<!-- 内容 -->
	<div style="width: 100%; text-align: center;">
		<div style="margin: 20px auto;">
			<div style="width: 100px; float: right;">
				<div>
					<form action="search.action">
						<span>游戏类型：</span><select name="kid" id="kind"
							style="display: inline-block;" class="form-control">
							<option value="0">- -</option>
							<c:forEach items="${kinds }" var="kind">
								<option value="${kind.kid }">${kind.kname }</option>
							</c:forEach>
						</select> <input style="display: inline-block;" type="text" name="gname">
						<button style="display: inline-block;" type="submit" value="搜索"
							class="btn-primary">搜索</button>
					</form>
				</div>
			</div>
			<h1>WINTERGAME游戏库</h1>
		</div>
		<button class="btn btn-success btn-sm" type="button"
							onclick="javascript:window.location.href='toaddgame.action'">添加游戏</button>
		<form id="form1" action="deletegames.action">
			<button class="btn btn-danger btn-sm" type="button"
				onclick="deletei()" value="删除">删除</button>
			<div style="overflow: auto; height: 800px;">
				<table class="table table-hover">
					<thead>
						<tr>
							<td>全选<br> <input type="checkbox" id="qx"></td>
							<td>游戏编号</td>
							<td>名称</td>
							<td>类型</td>
							<td>平台</td>
							<td>厂商</td>
							<td>上市时间</td>
							<td>上传</td>
						</tr>
					</thead>
					<tbody id="tb" style="overflow: auto; height: 800px;">
						<c:forEach items="${games }" var="game">
							<tr>
								<td><input type="checkbox" class="ids" name="ids"
									value="${game.gid }"></td>
								<td>${game.gid }</td>
								<td>${game.gname }</td>
								<td>${game.gameKind.kname }</td>
								<td>${game.gamespace }</td>
								<td>${game.saler }</td>
								<td>${game.commingtime }</td>
								<td>
								<a href="touploadgame.action?gid=${game.gid }">游戏资源</a>/
								<a href="touploadimg.action?gid=${game.gid }">游戏图片</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</form>
	</div>
	
	<!-- 尾部 -->
	<footer style="text-align: center;">
		<c:import url="foot.jsp"></c:import>
	</footer>
	
</body>
<c:if test="${curuser!=null }">

</c:if>
<c:if test="${curuser==null }">

</c:if>

</html>