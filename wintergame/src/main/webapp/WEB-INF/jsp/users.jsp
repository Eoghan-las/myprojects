<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		$("#urole").change(function() {
			var urole = $("#urole").val();
			$.ajax({
				type:"post",
				url:"urole.action",
				contentType:'application/json;charset=utf-8',
				data:urole,
				success : function(data){
					$("#tb").html("");
					var html = "";
					$(data).each(function(i,user){
						html+="<tr><td><input type='checkbox' class='ids' name='ids'value='"+user.uid+"'></td><td>"+user.uid+"</td><td>"+user.uname+"</td><td>"+user.upass+"</td><td>"+new Date(user.ubirthday)+"</td><td>"+user.uemail+"</td><td>"+user.utel+"</td><td>"+user.inputtime+"</td><td><a href='toedituser.action?uid="+user.uid+" }'>修改</a></td></tr>";
					}); 
					$("#tb").html(html);
				}
			});
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
				
				<div style="float: left;">
				
					<form action="search.action">
						<span>角色：</span><select name="urole" id="urole"
							style="display: inline-block;" class="form-control">
							<option value="0">- -</option>
								<option value="1">管理员</option>
								<option value="2">用户</option>
								<option value="3">媒体</option>
						</select> 
						
						
					</form>
				</div>
				
			</div>
			<h1>WINTERGAME用户员工详情表</h1>
			
		</div>
		
		<div style="width: 100% ">
			<form action="findrageinputtime.action" method="post">
			<input type="date" name="inputtime1" placeholder="请输入起始时间">
			<input type="date" name="inputtime2" placeholder="请输入截止时间">
			<input  type="submit" value="查询">
		</form>
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
							<td>用户编号</td>
							<td>用户名</td>
							<td>密码</td>
							<td>生日</td>
							<td>email</td>
							<td>电话</td>
							<td>注册时间</td>
							<td>操作</td>
						</tr>
					</thead>
					<tbody id="tb" style="overflow: auto; height: 800px;">
						<c:forEach items="${users }" var="user">
							<tr>
								<td><input type="checkbox" class="ids" name="ids"
									value="${user.uid }"></td>
								<td>${user.uid }</td>
								<td>${user.uname }</td>
								<td>${user.upass }</td>
								<td>${user.ubirthday }</td>
								<td>${user.uemail }</td>
								<td>${user.utel }</td>
								<td>${user.inputtime }</td>
								<td><a href="toedituser.action?uid=${user.uid }">修改</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</form>
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