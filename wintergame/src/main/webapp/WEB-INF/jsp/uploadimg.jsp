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
</head>
<c:import url="header.jsp"></c:import>

<body lang="en">
	<div style="width: 100%;">
		<div style="margin: 100px 400px; width: 600px;">
			<h1>${game.gname }游戏海报上传</h1>
			<form action="uploadimg.action" method="post" enctype="multipart/form-data">
				<input class="form-control" type="hidden" name="gid" value="${game.gid }" />
				<div class="form-group">
					<label for="exampleInputPassword1">游戏海报图片</label>
					<input class="form-control" type="file" name="file"/>
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</div>
</body>

</html>