<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- 引入 Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/font-awesome.min.css" />
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="js/bootstrap.min.js"></script>

<script type="text/javascript" src="js/bootstrap.js"></script>
<c:import url="basepath.jsp"></c:import>
</head>

<body>
	
	<!-- 头部导航栏 -->
	<c:import url="header.jsp"></c:import>

	<form class="form-horizontal" action="regists.action" method="post" style="width: 100%; margin-top: 10%;">
		<div style="margin: 0 auto; width: 500px;">
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
				<div class="col-sm-10" style="width: 83%;">
					<input type="text" class="form-control" id="name"
						name="uname" placeholder="Name">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
				<div class="col-sm-10" style="width: 83%;">
					<input type="password" class="form-control" id="pass"
						name="upass" placeholder="Password">
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">生日</label>
				<div class="col-sm-10" style="width: 83%;">
					<input type="date" class="form-control" id="birthday" name="ubirthday">
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">邮件</label>
				<div class="col-sm-10" style="width: 83%;">
					<input type="email" class="form-control" id="email"
						name="uemail" placeholder="Email">
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">电话</label>
				<div class="col-sm-10" style="width: 83%;">
					<input type="text" class="form-control" id="tel"
						name="utel" placeholder="Tel">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<div class="checkbox">
						<label> <input type="checkbox"> Remember me
						</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">注册</button>
					<button type="reset" class="btn btn-default">重置</button>
				</div>
			</div>
		</div>
	</form>

	<!-- 尾部 -->
	<footer style="text-align: center;">
		<c:import url="foot.jsp"></c:import>
	</footer>

</body>

</html>