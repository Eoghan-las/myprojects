<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>支付宝电脑网站支付</title>
<style>
* {
	margin: 0;
	padding: 2px;
}

ul, ol {
	list-style: none;
}

body {
	font-family: "Helvetica Neue", Helvetica, Arial, "Lucida Grande",
		sans-serif;
}

.tab-head {
	margin-left: 120px;
	margin-bottom: 10px;
}

.tab-content {
	clear: left;
	display: none;
}

h2 {
	border-bottom: solid #02aaf1 2px;
	width: 200px;
	height: 25px;
	margin: 0;
	float: left;
	text-align: center;
	font-size: 16px;
}

.selected {
	color: #FFFFFF;
	background-color: #02aaf1;
}

.show {
	clear: left;
	display: block;
}

.hidden {
	display: none;
}

.new-btn-login-sp {
	padding: 1px;
	display: inline-block;
	width: 75%;
}

.new-btn-login {
	background-color: #02aaf1;
	color: #FFFFFF;
	font-weight: bold;
	border: none;
	width: 100%;
	height: 30px;
	border-radius: 5px;
	font-size: 16px;
}

#main {
	width: 100%;
	margin: 0 auto;
	font-size: 14px;
}

.red-star {
	color: #f00;
	width: 10px;
	display: inline-block;
}

.null-star {
	color: #fff;
}

.content {
	margin-top: 5px;
}

.content dt {
	/* width: 100px; */
	display: inline-block;
	float: left;
	margin-left: 20px;
	color: #666;
	font-size: 13px;
	margin-top: 8px;
}

.content dd {
	margin-left: 120px;
	margin-bottom: 5px;
}

.content dd input {
	width: 85%;
	height: 28px;
	border: 0;
	-webkit-border-radius: 0;
	-webkit-appearance: none;
}

#foot {
	margin-top: 10px;
	position: absolute;
	bottom: 15px;
	width: 100%;
}

.foot-ul {
	width: 100%;
}

.foot-ul li {
	width: 100%;
	text-align: center;
	color: #666;
}

.note-help {
	color: #999999;
	font-size: 12px;
	line-height: 130%;
	margin-top: 5px;
	width: 100%;
	display: block;
}

#btn-dd {
	margin: 20px;
	text-align: center;
}

.foot-ul {
	width: 100%;
}

.one_line {
	display: block;
	height: 1px;
	border: 0;
	border-top: 1px solid #eeeeee;
	width: 100%;
	margin-left: 20px;
}

.am-header {
	display: -webkit-box;
	display: -ms-flexbox;
	display: box;
	width: 100%;
	position: relative;
	padding: 7px 0;
	-webkit-box-sizing: border-box;
	-ms-box-sizing: border-box;
	box-sizing: border-box;
	background: #1D222D;
	height: 50px;
	text-align: center;
	-webkit-box-pack: center;
	-ms-flex-pack: center;
	box-pack: center;
	-webkit-box-align: center;
	-ms-flex-align: center;
	box-align: center;
}

.am-header h1 {
	-webkit-box-flex: 1;


	color: #fff;
}



</style>
</head>
<body text=#000000 bgColor="#ffffff" leftMargin=0 topMargin=4>
	<header class="am-header">
	<h1 style="text-align: center;">付款页面</h1>
	</header>
	<div style="height:500px; width: 500px; margin:auto;">
		<div id="main">
			
			
			<form  name="alipayment" action="alipay.trade.page.pay.jsp" method="post"
				target="_blank"  style="margin-top: 40%;">
				<div id="body1" class="show" name="divcontent" >
				
					<dl class="content">
						<dt>商户订单号 ：</dt>
						<input id="WIDout_trade_no" name="WIDout_trade_no" value="${log }" type="hidden" />
						<dt> ${log }</dt>
						
						<%-- <dd>
							 ${game.commingtime}
						</dd> --%>
						<hr class="one_line">
						<dt>订单名称     ：</dt>
						<input id="WIDsubject" name="WIDsubject" value="${game.gname}"  type="hidden" />
						<dt>
							${game.gname}
						</dt>
						<hr class="one_line">
						
						<dt>付款金额     ：</dt>
						<input id="WIDtotal_amount" name="WIDtotal_amount" value="${game.gprice}"  type="hidden"/>
						<dt>
							${game.gprice}
						</dt>
						<hr class="one_line" >
						<dt>商品描述     ：</dt>
						<input id="WIDbody" name="WIDbody"  type="hidden" />
						<dt style=" display: -webkit-box;-webkit-box-orient: vertical;-webkit-line-clamp: 5;overflow: hidden; margin-left: 20px;    margin-left: 113px;margin-top: -25px;">
							${game.content}
						</dt>
						<hr class="one_line">
						
						
						<dd id="btn-dd">
							<span class="new-btn-login-sp">
								<button class="new-btn-login" type="submit"
									style="text-align: center;">付 款</button>
							</span> <span class="note-help">如果您点击“付款”按钮，即表示您同意该次的执行操作。</span>
						</dd>
					</dl>
				</div>
			</form>
	

			<div id="foot">
				<ul class="foot-ul">
					<li>支付宝版权所有 2015-2018 ALIPAY.COM</li>
				</ul>
			</div>
		</div>
	</div>
	<script language="javascript">
		var tabs = document.getElementsByName('tab');
		var contents = document.getElementsByName('divcontent');

		(function changeTab(tab) {
			for (var i = 0, len = tabs.length; i < len; i++) {
				tabs[i].onmouseover = showTab;
			}
		})();

		function showTab() {
			for (var i = 0, len = tabs.length; i < len; i++) {
				if (tabs[i] === this) {
					tabs[i].className = 'selected';
					contents[i].className = 'show';
				} else {
					tabs[i].className = '';
					contents[i].className = 'tab-content';
				}
			}
		}

		function GetDateNow() {
			var vNow = new Date();
			var sNow = " ";
			sNow += String(vNow.getFullYear());
			sNow += String(vNow.getMonth() + 1);
			sNow += String(vNow.getDate());
			sNow += String(vNow.getHours());
			sNow += String(vNow.getMinutes());
			sNow += String(vNow.getSeconds());
			sNow += String(vNow.getMilliseconds());
			
			document.getElementById("WIDout_trade_no").value = "sNow";
			document.getElementById("WIDsubject").value = ${game.gname};
			document.getElementById("WIDtotal_amount").value = ${game.gprice};
			document.getElementById("WIDbody").value = ${game.content};
		}
		GetDateNow();
	</script>
</body>


</html>