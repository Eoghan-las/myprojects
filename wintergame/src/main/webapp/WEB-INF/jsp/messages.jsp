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
	});
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
							
						</select> <input style="display: inline-block;" type="text" name="gname">
						<button style="display: inline-block;" type="submit" value="搜索"
							class="btn-primary">搜索</button>
					</form>
				</div>
			</div>
			<h1>WINTERGAME游戏资讯库</h1>
		</div>
		<form id="form1" action="deletegames.action">
			<button class="btn btn-danger btn-sm" type="button"
				onclick="deletei()" value="删除">删除</button>
			<div style="overflow: auto; height: 800px;">
				<table class="table table-hover">
					<thead>
						<tr>
							<td style="width:100px"><span>勾选项</span></td>
							<td style="width:100px"><span>咨讯编号</span></td>
							<td style="width:100px"><span>资讯标题</span></td>
							<td style="width:100px"><span>用户名</span></td>
							<td><span style="width: 150px">资讯内容</span></td>
							<td style="width:120px"><span>游戏名称</span></td>
							<td style="width:200px"><span>资讯发表时间</span></td>
							<td style="width:100px"><span>操作</span></td>
						</tr>
					</thead>
					<tbody id="tb" style="overflow: auto; height: 800px;">
						<c:forEach items="${list }" var="message">
							<tr>
								<td><input type="checkbox" name="zids"></td>
								<td>${message.zid }</td>
								<td>${message.ztitle }</td>
								<td>${message.user.uname }</td>
								<td>${message.zcontent }</td>
								<td>${message.games }</td>
								<td>${message.messagetime }</td>
								<td><a href="deletemessage.action?zid=${message.zid}">删除</a>|<a
									href="ReadyUpdatemessage.action?zid=${message.zid}">修改</a></td>
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