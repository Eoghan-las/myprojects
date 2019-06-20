var current_uid;
$(function(){
	current_uid = $("#current_uid").val();
	select_comment();
});


//查询所有评论
function select_comment(){
	var bid_param = $("#bid").val();
	$.getJSON("comment.action",{type:1, bid:bid_param},function(res){
		var html = "";
        if(res.list.length==0){
        	html += "<div class='comment_author'>还没有人</div>";
            html +=	"<div class='comment_text'>快来抢沙发！</div>";
        }else{
        	$.each(res.list,function(i,comment){
    			html += "<div class='comment_author'><span>"+(i+1)+"楼</span><span>"+comment.authorName+"</span><span>"+comment.datetimestr+"</span>";
    			var uid = comment.uid;
    			if(uid==current_uid&&current_uid!=null){
    				html +="<span class='comment_delete' onClick='comment_delete("+comment.id+","+comment.bid+")'>删除</span>";
    			}
    			html += "</div>";	
    	        html += "<div class='comment_text'>"+comment.content+"</div>";
    		});
    		$("#comment").html(html);
        }
	});
}

//评论前检查
function chick(){
	var content = $("#newcomment").val();
	if (content.trim()=="") {
		return false;
	}
	document.getElementById("form1").submit();
}