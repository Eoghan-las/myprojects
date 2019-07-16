<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="bp" value="<%=basePath%>"></c:set>
<!doctype html>
<html class="no-js">

<head>
<meta charset="utf-8" />
<title>首页</title>


<c:import url="basepath.jsp"></c:import>
<script type="text/javascript">
	function tomy(uid){
		if (uid!=null) {
			window.location.href="collect.action?uid="+uid;
		}else{
			alert("请先登录！");
		}
	}
</script>
</head>
<body lang="en" onload="setBGimg(true)">
	<!-- 头部导航栏 -->
	<c:import url="header.jsp"></c:import>
	<div id="swfid"></div>
	<script type="text/javascript" src="swfobject.js"></script>
	<script type="text/javascript">
		swfobject.embedSWF("../../img/flash4748.swf", "swfid", "300", "120", "9.0.0",
				"../../img/flash4748.swf");
	</script>
	<!-- MAIN -->
	<div id="main" class="facts-content">
		<section></section>
		<div class="wrapper">

			<!-- slider holder -->

			<div id="slider-holder" class="clearfix">

				<!-- slider -->
				<div class="flexslider home-slider">
					<ul class="slides">
						<li><img id="bg" width="100%" height="400"
							src="img/bg/header.jpg" /></li>
					</ul>
					<ul class="flex-direction-nav">
						<li><a onclick="next()" class="prev" href="#">Previous</a></li>
						<li><a onclick="prev()" class="next" href="#">Next</a></li>
					</ul>
				</div>
				<!-- ENDS slider -->

				<div class="home-slider-clearfix "></div>

				<!-- Headline -->
				<div id="headline">
					<h2>WINTERGAME , OPEN GAME PLATFORM</h2>

					<!-- 获取用户的id 给uid进行赋值 -->
					<p>
						Visit my <a style="cursor: pointer;" onclick="tomy(${curuser.uid })">wintergame</a> for more
						info
					</p>
					<em id="corner"></em>
				</div>
				<!-- ENDS headline -->

			</div>

			<!-- ENDS slider holder -->

			<!-- home-block -->
			<div class="home-block">
				<h2 class="home-block-heading">
					<span>热门游戏</span>
				</h2>
				<div class="one-third-thumbs clearfix">
					<c:forEach items="${list }" var="list" varStatus="vs">
						<c:if test="${vs.count%3==0&&vs.count<10 }">
							<figure class="last">
								<figcaption>
									<strong>${list.gname }</strong> <span>${list.content }</span> <em>${list.commingtime }</em>
									<a href="single.action" class="opener"></a>
								</figcaption>

								<a href="project.action?gid=${list.gid }" class="thumb"><img
									src="${bp}/img/bg/${list.gid }.jpg" wid alt="Alt text"
									style="height: 187px; width: 300px; background-size: cover;" /></a>
							</figure>
						</c:if>
						<c:if test="${vs.count%3!=0&&vs.count<10 }">
							<figure>
								<figcaption>
									<strong>${list.gname }</strong> <span>${list.content }</span> <em>${list.commingtime }</em>
									<a href="single.action" class="opener"></a>
								</figcaption>

								<a href="project.action?gid=${list.gid }" class="thumb"><img
									src="${bp}/img/bg/${list.gid }.jpg" alt="Alt text"
									style="height: 187px; width: 300px; background-size: cover;" /></a>
							</figure>
						</c:if>
					</c:forEach>

				</div>
			</div>
			<!-- ENDS home-block -->

			<!-- home-block -->
			<div class="home-block">
				<h2 class="home-block-heading">
					<span>热门资讯</span>
				</h2>
				<div class="one-fourth-thumbs clearfix"
					style="width: 1100px; overflow: auto;">
					<c:forEach items="${list2 }" var="list" varStatus="vs">
						<c:if test="${vs.count<13 }">
							<figure style="height: 230px; width: 300px">
								<figcaption style="background: #8a6d3b">
									<strong>${list.ztitle }</strong> <span
										style="display: -webkit-box; -webkit-box-orient: vertical; -webkit-line-clamp: 10; overflow: hidden;">
										<a  style="background: #8a6d3b" href="single.action?gid=${list.zid }">${list.zcontent }</a>
									</span> <br> <br> <em>${list.messagetime }</em>
								</figcaption>
							</figure>
						</c:if>

					</c:forEach>

					<a href="#" class="more-link right">More message &#8594;</a>
				</div>

			</div>
			<!-- ENDS home-block -->

		</div>
	</div>
	<!-- ENDS MAIN -->

	<footer style="text-align: center;">
		<c:import url="foot.jsp"></c:import>
	</footer>

	<script>
		var timeset
		// 定义图片路径 {num} 为 可变的图片序号
		var bgImgUrl = 'img/bg/{num}.jpg', bgNum = 0, bgImgArr = [];
		var bgDiv = document.getElementById("main");
		var bgimg = document.getElementById("bg");
		// 组合数组 此处 200 为 图开始序号 结束 210
		for (var i = 1; i <= 20; i++) {
			bgImgArr.push(bgImgUrl.replace('{num}', i));
		}
		setInterval(function() {
			bgDiv.style.backgroundImage = 'url(' + bgimg.src + ')';
		}, 1000);

		function setBGimg(d) {
			if (bgNum >= bgImgArr.length) {
				bgNum = 0;
			}
			if (bgNum < 0) {
				bgNum = bgImgArr.length;
			}
			setTimeout(function() {
				bgimg.src = bgImgArr[bgNum];
				bgNum++;
				bgDiv.style.opacity = 0.6;
			}, 3000);
			if (d) {
				timeset = setInterval(function() {
					setBGimg(false);
				}, 6000);
			}
			// 上一行的 6000 是背景图片自动切换时间(单位 毫秒)
		}
		function prev() {
			clearInterval(timeset);
			bgNum--;
			if (bgNum >= bgImgArr.length) {
				bgNum = 0;
			}
			if (bgNum < 0) {
				bgNum = bgImgArr.length - 1;
			}
			bgimg.src = bgImgArr[bgNum];
			timeset = setInterval(function() {
				setBGimg(false);
			}, 3000);
		}
		function next() {
			clearInterval(timeset);
			bgNum++;
			if (bgNum >= bgImgArr.length) {
				bgNum = 0;
			}
			if (bgNum < 0) {
				bgNum = bgImgArr.length - 1;
			}
			bgimg.src = bgImgArr[bgNum];
			timeset = setInterval(function() {
				setBGimg(false);
			}, 3000);
		}
	</script>

</body>

</html>