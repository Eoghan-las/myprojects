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
			<h1>${game.kname } 游戏库</h1>
		</div>
			<div style="overflow: auto; height: 800px;">
				<table class="table table-hover">
					<thead>
						<tr>
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