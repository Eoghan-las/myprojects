<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="bp" value="<%=basePath%>"></c:set>
<!DOCTYPE html>
<html class="no-js">

<head>
<meta charset="utf-8" />
<title>ZENI</title>


<link rel="stylesheet" media="all" href="css/style.css" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!-- Adding "maximum-scale=1" fixes the Mobile Safari auto-zoom bug: http://filamentgroup.com/examples/iosScaleBug/ -->


<!-- JS -->
<script src="http://apps.bdimg.com/libs/jquery/1.6.4/jquery.min.js"></script>
<script src="js/css3-mediaqueries.js"></script>
<script src="js/custom.js"></script>
<script src="js/tabs.js"></script>
<script src="http://cdn.bootcss.com/echarts/3.2.3/echarts.min.js"></script>
<!-- NOOTSTRAP -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">


<!-- Tweet -->
<link rel="stylesheet" href="css/jquery.tweet.css" media="all" />
<script src="js/tweet/jquery.tweet.js"></script>
<!-- ENDS Tweet -->

<!-- superfish -->
<link rel="stylesheet" media="screen" href="css/superfish.css" />
<script src="js/superfish-1.4.8/js/hoverIntent.js"></script>
<script src="js/superfish-1.4.8/js/superfish.js"></script>
<script src="js/superfish-1.4.8/js/supersubs.js"></script>
<!-- ENDS superfish -->

<!-- prettyPhoto -->
<script src="js/prettyPhoto/js/jquery.prettyPhoto.js"></script>
<link rel="stylesheet" href="js/prettyPhoto/css/prettyPhoto.css"
	media="screen" />
<!-- ENDS prettyPhoto -->

<!-- poshytip -->
<link rel="stylesheet"
	href="js/poshytip-1.1/src/tip-twitter/tip-twitter.css" />
<link rel="stylesheet"
	href="js/poshytip-1.1/src/tip-yellowsimple/tip-yellowsimple.css" />
<script src="js/poshytip-1.1/src/jquery.poshytip.min.js"></script>
<!-- ENDS poshytip -->

<!-- GOOGLE FONTS -->
<link
	href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,300'
	rel='stylesheet' type='text/css'>

<!-- Flex Slider -->
<link rel="stylesheet" href="css/flexslider.css">
<script src="js/jquery.flexslider-min.js"></script>
<!-- ENDS Flex Slider -->

<!-- Less framework -->
<link rel="stylesheet" media="all" href="css/lessframework.css" />

<!-- modernizr -->
<script src="js/modernizr.js"></script>

<!-- SKIN -->
<link rel="stylesheet" media="all" href="css/skin.css" />

<!-- reply move form -->
<script src="js/moveform.js"></script>



</head>

<body lang="en">

	<c:import url="header.jsp"></c:import>

	<input id="gameid" type="hidden" value="${game.gid }">

	<!-- MAIN -->
	<div id="main">
		<div class="wrapper clearfix">


			<h2 class="page-heading">
				<span>${game.gname }</span>
			</h2>




			<!-- project content -->
			<div id="project-content" class="clearfix">



				<!-- slider -->
				<div class="project-slider">
					<div class="flexslider">
						<ul class="slides">
							<li><img src="${bp}/img/bg/${game.gid }.jpg" alt="alt text" /></li>
							<li><img src="${bp}/img/bg/${game.gid }.jpg" alt="alt text" /></li>
							<li><img src="${bp}/img/bg/${game.gid }.jpg" alt="alt text" /></li>
						</ul>
					</div>
				</div>
				<!-- ENDS slider -->

				<!-- heading -->
				<div style="margin: 0 auto; margin-left: 12%;">
					<div class="project-heading">
						<div style="width: 250px; float: left;">
							<h5 style="line-height: 24px;">平台：${game.gamespace }</h5>
							<h5 style="line-height: 24px;">厂商：${game.saler}</h5>
							<h5 style="line-height: 24px;">上市时间：${game.commingtime}</h5>
						</div>
						<div style="width: 250px; float: left; margin-left: 35%;">
							<c:if test="${curuser!=null }">
								<a href="tocopys.action?gid=${game.gid}"><button
										class="btn btn-primary btn-lg active">购买该游戏</button></a>
							</c:if>
							<c:if test="${curuser==null }">
								请先<a href="index.action">登录</a>
							</c:if>
						</div>
						<div class="clearfix"></div>
					</div>
					<!-- ENDS heading -->


					<div class="project-description">${game.content }</div>
				</div>


				<div style="clear: both;text-align: center;">
					<h3>月销量趋势图</h3>
				</div>
				
				<!-- ç»å¸ -->
				<canvas width="1000" height="600" style="border: 1px solid #eeeeee;"></canvas>



				<font style="margin-left: 7%;">2019-01</font> <font
					style="margin-left: 2%;">2019-02</font> <font
					style="margin-left: 2%;">2019-03</font> <font
					style="margin-left: 2%;">2019-04</font> <font
					style="margin-left: 2%;">2019-05</font> <font
					style="margin-left: 2%;">2019-06</font> <font
					style="margin-left: 2%;">2019-07</font> <font
					style="margin-left: 2%;">2019-08</font> <font
					style="margin-left: 2%;">2019-09</font> <font
					style="margin-left: 2%;">2019-10</font> <font
					style="margin-left: 2%;">2019-11</font> <font
					style="margin-left: 2%;">2019-12</font>




				<div class="project-info">
					<p>
						<strong>Date</strong><br /> March 12, 2011
					</p>
					<p>
						<strong>Skills</strong><br /> Photoshop, Illustrator
					</p>
				</div>
				<div class="clearfix"></div>

				<div class="project-pager">
					<a class="previous-project"
						href="project.action?gid=${game.gid-1 }">&#8592; Previous
						project</a> <a class="next-project"
						href="project.action?gid=${game.gid+1 }">Next project &#8594;</a>
				</div>


				<!-- related -->
				<div class="related-projects">
					<div class="related-heading">Related projects</div>
					<div class="related-list">
						<figure>
							<a href="#" class="thumb"><img src="${bp}/img/bg/3.jpg"
								alt="Alt text" style="height: 140px; width: 220px" /></a>
							<a href="single.html" class="heading">Pellentesque habitant
								morbi</a>
						</figure>

						<figure>
							<a href="#" class="thumb"><img src="${bp}/img/bg/3.jpg"
								alt="Alt text" style="height: 140px; width: 220px" /></a>
							<a href="single.html" class="heading">Pellentesque habitant
								morbi</a>
						</figure>

						<figure>
							<a href="#" class="thumb"><img src="${bp}/img/bg/3.jpg"
								alt="Alt text" style="height: 140px; width: 220px" /></a>
							<a href="single.html" class="heading">Pellentesque habitant
								morbi</a>
						</figure>

						<figure class="last">
							<a href="#" class="thumb"><img src="${bp}/img/bg/3.jpg"
								alt="Alt text" style="height: 140px; width: 220px" /></a>
							<a href="single.html" class="heading">Pellentesque habitant
								morbi</a>
						</figure>

					</div>
					<div class="clearfix"></div>
				</div>
				<!-- ENDS related -->

			</div>
			<!--  ENDS project content-->


		</div>
	</div>
	<!-- ENDS MAIN -->





	<footer style="text-align: center;">
		<c:import url="foot.jsp"></c:import>
	</footer>

</body>
<script type="text/javascript">
	$(function() {
		var gameid = $("#gameid").val();
		var n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0, n11 = 0, n12 = 0;
		$.ajax({
			type : "post",
			url : "tjxl.action",
			contentType : 'application/json;charset=utf-8',
			data : gameid,
			success : function(data) {
				$(data).each(function(i, order) {
					var myDate = new Date(order.time);
					if (myDate.getMonth() + 1 == 1) {
						n1++;
					}
					if (myDate.getMonth() + 1 == 2) {
						n2++;
					}
					if (myDate.getMonth() + 1 == 3) {
						n3++;
					}
					if (myDate.getMonth() + 1 == 4) {
						n4++;
					}
					if (myDate.getMonth() + 1 == 5) {
						n5++;
					}
					if (myDate.getMonth() + 1 == 6) {
						n6++;
					}
					if (myDate.getMonth() + 1 == 7) {
						n7++;
					}
					if (myDate.getMonth() + 1 == 8) {
						n8++;
					}
					if (myDate.getMonth() + 1 == 9) {
						n9++;
					}
					if (myDate.getMonth() + 1 == 10) {
						n10++;
					}
					if (myDate.getMonth() + 1 == 11) {
						n11++;
					}
					if (myDate.getMonth() + 1 == 12) {
						n12++;
					}
				});
				n1 = n1 * 40;
				n2 = n2 * 40;
				n3 = n3 * 40;
				n4 = n4 * 40;
				n5 = n5 * 40;
				n6 = n6 * 40;
				n7 = n7 * 40;
				n8 = n8 * 40;
				n9 = n9 * 40;
				n10 = n10 * 40;
				n11 = n11 * 40;
				n12 = n12 * 40;
				var LChart = function() {
					this.con = document.querySelector("canvas")
							.getContext("2d");
					this.canW = this.con.canvas.width;
					this.canH = this.con.canvas.height;
					this.size = 10;
					this.space = 20;
					this.x0 = this.space;
					this.y0 = this.canH - this.space;
					this.pointSize = 6;
				};
				LChart.prototype.init = function() {
					this.huaGeZi();
					this.zb();
					this.point(data);
				};
				LChart.prototype.huaGeZi = function() {
					var lineX = Math.floor(this.canH / this.size);
					for (var i = 1; i < lineX; i++) {
						this.con.beginPath();
						this.con.strokeStyle = "#eee";
						this.con.moveTo(0, i * this.size + 0.5);
						this.con.lineTo(this.canW, i * this.size + 0.5);
						this.con.stroke();
					}
					var lineY = Math.floor(this.canW / this.size);
					for (var j = 1; j < lineY; j++) {
						this.con.beginPath();
						this.con.strokeStyle = "#eee";
						this.con.moveTo(j * this.size + 0.5, 0);
						this.con.lineTo(j * this.size + 0.5, this.canH);
						this.con.stroke();
					}
				};
				LChart.prototype.zb = function() {
					this.con.beginPath();
					//X
					this.con.moveTo(this.x0, this.y0);
					this.con.lineTo(this.canW - this.space, this.y0);
					this.con.lineTo(this.canW - this.space - this.size, this.y0
							+ this.size / 2);
					this.con.lineTo(this.canW - this.space - this.size, this.y0
							- this.size / 2);
					this.con.lineTo(this.canW - this.space, this.y0);
					this.con.fill();
					this.con.strokeStyle = "black";
					this.con.stroke();
					//Y
					this.con.moveTo(this.x0, this.y0);
					this.con.lineTo(this.x0, this.space);
					this.con.lineTo(this.x0 + this.size / 2, this.space
							+ this.size);
					this.con.lineTo(this.x0 - this.size / 2, this.space
							+ this.size);
					this.con.lineTo(this.x0, this.space);
					this.con.fill();
					this.con.strokeStyle = "black";
					this.con.stroke();
				};
				LChart.prototype.point = function(data) {

					var that = this;
					var prevX = 0;
					var prevY = 0;
					data.forEach(function(item, i) {
						var canvasX = that.x0 + item.x;
						var canvasY = that.y0 - item.y;
						that.con.fillRect(canvasX - that.pointSize / 2, canvasY
								- that.pointSize / 2, that.pointSize,
								that.pointSize);
						if (i == 0) {
							that.con.moveTo(that.x0, that.y0);
							that.con.lineTo(canvasX, canvasY);
							that.con.stroke();
						} else {
							that.con.moveTo(prevX, prevY);
							that.con.lineTo(canvasX, canvasY);
							that.con.stroke();
						}
						prevX = canvasX;
						prevY = canvasY;
					})
				};
				var num = 75;

				var data = [ {
					x : 75,
					y : n1
				}, {
					x : 150,
					y : n2
				}, {
					x : 225,
					y : n3
				}, {
					x : 300,
					y : n4
				}, {
					x : 375,
					y : n5
				}, {
					x : 450,
					y : n6
				}, {
					x : 525,
					y : n7
				}, {
					x : 600,
					y : n8
				}, {
					x : 675,
					y : n9
				}, {
					x : 750,
					y : n10
				}, {
					x : 825,
					y : n11
				}, {
					x : 900,
					y : n12
				} ];

				var lc = new LChart();
				lc.init();
			}
		});
	})
</script>
</html>
