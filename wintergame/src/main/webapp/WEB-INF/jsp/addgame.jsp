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


<body lang="en">
	<!-- 头部导航栏 -->
	<c:import url="header.jsp"></c:import>

	<!-- 内容 -->
	
	<div style="width: 100%;">
		<div style="margin: 100px 400px; width: 600px;">
			<form action="addgame.action" method="post">
				<div class="form-group">
					<label for="exampleInputEmail1">游戏名称</label>
					<input name="gname" type="text"class="form-control">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">类型</label> <select
						name="kid" style="width: 150px" class="form-control">
						<c:forEach items="${kinds }" var="kind">
							<option value="${kind.kid }">${kind.kname }</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">简述</label>
					<textarea name="content" class="form-control"></textarea>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">平台</label> <select
						name="gamespace" style="width: 150px" class="form-control">
						<option value="Windows">Windows</option>
						<option value="PS4">PS4</option>
					</select>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">厂商</label> <select name="saler"
						style="width: 150px" class="form-control">
						<option value="ElectronicArts">ElectronicArts</option>
						<option value="MGS">MGS</option>
						<option value="动视暴雪">动视暴雪</option>
						<option value="Vivendi">Vivendi</option>
						<option value="UBISOFT">UBISOFT</option>
						<option value="任天堂">任天堂</option>
						<option value="索尼娱乐">索尼娱乐</option>
						<option value="KONAMI">KONAMI</option>
						<option value="CAPCOM">CAPCOM</option>
					</select>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">状态</label> <select
						name="comming" style="width: 150px" class="form-control">
						<option value="1">已发布</option>
						<option value="0">未发布</option>
					</select>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">发布日期</label>
					<input name="commingtime2" type="date" class="form-control">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</div>
</body>

</html>