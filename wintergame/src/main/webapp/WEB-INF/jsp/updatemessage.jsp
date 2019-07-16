<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:import url="basepath.jsp"></c:import>
<title>修改个人咨询页面</title>
</head>
<body>
	<!-- 头部导航栏 -->
	<c:import url="header.jsp"></c:import>
	<!-- 内容 -->

	<div style="width: 100%; text-align: center;padding-top: 10%;padding-bottom: 10%" >
		<form action="updatemessage.action" method="post" class="form-horizontal" role="form">
			<p class .form-control-static>
				<input type="hidden" name="zid" value="${message.zid }">
			</p>
			<p>
				咨讯标题：<input type="text" name="ztitle" value="${message.ztitle }">
			</p>
			<p>
				咨讯内容：
				<textarea name="zcontent">${message.zcontent}</textarea>
			</p>
			<p>
				用户名：<input type="text" name="uname" value="${ message.user.uname}">
			</p>
			<p>
				游戏名称:<input type="text" name="games" value="${message.games }">
			</p>
			<p>
				<input type="submit" value="提交">
			</p>
		</form>
		
		<!-- <form class="form-horizontal" role="form" style="text-align: center;">
	
			  <div class="form-group" style="width: 40%">
			    <label for="inputPassword" class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control" id="inputPassword" placeholder="请输入密码">
			    </div>
			  </div>
			  
			   <div class="form-group">
			    <label for="inputPassword" class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control" id="inputPassword" placeholder="请输入密码">
			    </div>
			  </div>
		</form> -->
	</div>

	<!-- 尾部 -->
	<footer style="text-align: center;">
		<c:import url="foot.jsp"></c:import>
	</footer>
</body>
</html>
