<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
function check(){
	var title = $("#title").val();
	var summary = $("#summary").val();
	var author = $("#author").val();
	if (title.trim()=="") {
		alert("标题不能为空！");
		return false;
	};
	if (summary.trim()=="") {
		alert("概要不能为空！");
		return false;
	};
	
	if (author.trim()=="") {
		alert("作者不能为空！");
		return false;
	};
	
	document.getElementById("form1").submit();
}
</script>
</head>
<body>
	<div style="width: 100%">
		<div style="width: 40%; margin: 8% auto;">
			<form id="form1" class="form-horizontal" action="insert.action" method="post">
				<table class="table">
					<tr>
						<td>标题</td>
						<td><input class="form-control" id="title" name="title" type="text"></td>
					</tr>
					<tr>
						<td>概要</td>
						<td><textarea class="form-control" id="summary" rows="8" name="summary"></textarea></td>
					</tr>
					<tr>
						<td>作者</td>
						<td><input style="width: auto;" id="author" class="form-control"
							name="author" type="text"></td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: center;"><input
							class="btn btn-success btn-lg" onclick="check()" value="提交"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>