/**
 * 
 */
function nameBlur(){
	var n = $("#name").val();
	$.ajax({
		type:"post",
		url:"checkname.action",
		data:{name:n},
		dataType:"text",
		success:function(res){
			if (res=="true") {
				$("#name_exit").html("name is already exist");
			}else{
				$("#name_exit").html("");
			}
		}
	});
}
/*省*/
$(function(){
	$.ajax({
		type:"post",
		url:"pca.action",
		data:{type:1},
		dataType:"json",
		success:function(res){
			var html = "<option value='0'>-prov-</option>";
			$.each(res.list,function(i,data){
				html+="<option value='"+data.provinceID+"'>-"+data.province+"-</option>";
			});
			$("#provincedId").html(html);
		}
	});
})
/*市*/
function showCity(pid){
	var html = "<option value='0'>-city-</option>";
	if (pid!=0) {
		$.post("pca.action",{type:2,provinceId:pid},function(res){
			$.each(res.list,function(i,data){
				html+="<option value='"+data.cityID+"'>-"+data.city+"-</option>";
			});
			$("#cityId").html(html);
		},"json")
	}
	$("#cityId").html(html);
	$("#areaId").html("<option value='0'>-area-</option>");
}
/*区*/
function showArea(cid){
	$.getJSON("pca.action",{type:3,cityId:cid},function(res){
		var html = "<option value='0'>-area-</option>";
		$.each(res.list,function(i,data){
			html+="<option value='"+data.areaID+"'>-"+data.areas+"-</option>";
		});
		$("#areaId").html(html);
	})
}
/*提交及非空验证*/
function check(){
	var pass1 = document.getElementById("pass1").value;
	var pass2 = document.getElementById("pass2").value;
	var name = document.getElementById("name").value;
	var age = document.getElementById("age").value;
	var tel = document.getElementById("tel").value;
	
	if (name.trim()=="") {
		alert("姓名不能为空！");
		return false;
	};
	if (pass1.trim()=="") {
		alert("密码不能为空！");
		return false;
	};
	
	if (age.trim()=="") {
		alert("年龄不能为空！");
		return false;
	};
	if (tel.trim()=="") {
		alert("电话号码不能为空！");
		return false;
	};
	if (pass1 == pass2) {
		document.getElementById("form1").submit();
	}else{
		alert("两次输入的密码不一致！");
	}
}