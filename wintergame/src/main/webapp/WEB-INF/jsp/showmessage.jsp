<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js">

<head>
<meta charset="utf-8" />
<title>咨询详情页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />

<c:import url="basepath.jsp"></c:import>
<style type="text/css">
td a {
	cursor: pointer;
	
}
</style>

</head>
<!-- 头部导航栏 -->
<c:import url="header.jsp"></c:import>

<body lang="en">

	<div style="width: 100%; padding-top: 10px; padding-bottom: 10%">
		<div style="float: right; padding-top: 20px;padding-bottom: 20px;padding-right: 40px" >
				<form action="search2.action" method="post">
					<input type="text" name="ztitle" >
					<button type="submit" value="搜索" class="btn-primary">搜索</button>
				</form>
			</div>
		<div style="width: 100%; text-align: center;float: left;" >
			<div style="margin: 20px auto;overflow: auto;height: 600px">
				
				<table class="table table-hover">
					<thead class="tbhead">
						<tr>
							<td style="width:100px"><span>选项</span></td>
							<td style="width:100px"><span>咨讯编号</span></td>
							<td style="width:100px"><span>资讯标题</span></td>
							<td style="width:100px"><span>用户名</span></td>
							<td><span style="width: 150px">资讯内容</span></td>
							<td style="width:120px"><span>游戏名称</span></td>
							<td style="width:200px"><span>资讯发表时间</span></td>
							<td style="width:100px"><span>操作</span></td>
						
						</tr>
					</thead>
					<tbody id="tb">
						<c:forEach items="${list }" var="message">
							<c:set var="uid" value="${message.uid }"></c:set>
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
			<button class="btn btn-success btn-sm" type="button"
				onclick="javascript:window.location.href='toaddmessage.action'">编写资讯</button>
		</div>

	</div>

	<!-- 尾部 -->
	<footer style="text-align: center;">
		<c:import url="foot.jsp"></c:import>
	</footer>
</body>

</html>