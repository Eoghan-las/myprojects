<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:import url="basepath.jsp"></c:import>
<title>添加用户咨询页面</title>
</head>
<body>
	<!-- 头部导航栏 -->
	<c:import url="header.jsp"></c:import>
 
	<div style="width: 100%; text-align: center; margin-top: 5%;margin-bottom: 7%">

		<form action="addmessage.action" method="post">
			<div style="width: 100%; text-align: center;">
				<p >
					<input type="hidden" name="uid">
				</p>
				<p>
					游戏名称：<input type="text" name="games">
				</p>
				<p>
					资讯内容：
					<textarea name="zcontent"></textarea>
				</p>
				<p>
					资讯标题:<input type="text" name="ztitle">
				</p>
				<p>
					<input type="submit" value="提交">
				</p>
			</div>

		</form>
	</div> 

	
</body>
<!-- 尾部 -->
	<footer style="text-align: center;">
		<c:import url="foot.jsp"></c:import>
	</footer>
</html>
