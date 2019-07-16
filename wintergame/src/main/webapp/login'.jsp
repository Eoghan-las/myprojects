<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link>
<!--导入头部  -->
<c:import url=""></c:import>
</head>
<body>
	<div style="text-align: center; width: 100%">
		<div style="width: 50% ;margin: 10% auto;">
			<form action="index.action">
				<input type="text" name="name" id="name" placeholder="请输入您的用户名"> 
				
				<input	type="password" name="pass" id="pass" placeholder="请输入您的密码">
				<button type="button" onclick="submit">提交</button>
			</form>
		</div>

	</div>
	<!--导入尾部 -->
<c:import url=""></c:import>
</body>
</html>