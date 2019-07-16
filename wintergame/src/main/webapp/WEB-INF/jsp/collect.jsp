<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="bp" value="<%=basePath%>"></c:set>
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
			<h1 style="margin: 40px auto;">已购游戏库</h1>
		</div>
		<form id="form1" action="deletegames.action">
			<div style="overflow: auto; height: 800px;">
				<table class="table table-hover">
					<thead>
						<tr>
							<td style="padding-left: 50px;">游戏编号</td>
							<td>图片</td>
							<td>名称</td>
							<td>类型</td>
							<td>平台</td>
							<td>厂商</td>
							<td>上市时间</td>
							<td>下载</td>
						</tr>
					</thead>
					<tbody id="tb" style="overflow: auto; height: 800px;">
						<c:forEach items="${list }" var="list">
							<tr>
								<td style="padding-left: 70px;">${list.gid }</td>
								<td ><img style="height: 50px; width:50px; " src="${bp}/img/bg/${list.gid }.jpg" ></img></td>
								<td>${list.gname }</td>
								<td>${list.gameKind.kname }</td>
								<td>${list.gamespace }</td>
								<td>${list.saler }</td>
								<td>${list.commingtime }</td>
								<td>
								<a href="${game.url }" download="${list.gname }.rar"> 下载</a>
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