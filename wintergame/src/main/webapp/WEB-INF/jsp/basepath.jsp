<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="bp" value="<%=basePath%>"></c:set>

<link href="${bp}/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="${bp}/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="${bp}/js/bootstrap.min.js"></script>
<link rel="stylesheet" media="all" href="${bp}/css/lessframework.css" />
<link rel="stylesheet" media="all" href="${bp}/css/style.css" />
<!-- JS -->
<script src="http://apps.bdimg.com/libs/jquery/1.6.4/jquery.min.js"></script>
<script src="${bp}/js/css3-mediaqueries.js"></script>
<script src="${bp}/js/custom.js"></script>
<script src="${bp}/js/tabs.js"></script>
<!-- Tweet -->
<link rel="stylesheet" href="${bp}/css/jquery.tweet.css" media="all" />
<script src="${bp}/js/tweet/jquery.tweet.js"></script>

<!-- superfish -->
<link rel="stylesheet" media="screen" href="${bp}/css/superfish.css" />
<script src="${bp}/js/superfish-1.4.8/js/hoverIntent.js"></script>
<script src="${bp}/js/superfish-1.4.8/js/superfish.js"></script>
<script src="${bp}/js/superfish-1.4.8/js/supersubs.js"></script>

<!-- prettyPhoto -->
<script src="${bp}/js/prettyPhoto/js/jquery.prettyPhoto.js"></script>
<link rel="stylesheet" href="${bp}/js/prettyPhoto/css/prettyPhoto.css"
	media="screen" />

<!-- poshytip -->
<link rel="stylesheet"
	href="${bp}/js/poshytip-1.1/src/tip-twitter/tip-twitter.css" />
<link rel="stylesheet"
	href="${bp}/js/poshytip-1.1/src/tip-yellowsimple/tip-yellowsimple.css" />
<script src="${bp}/js/poshytip-1.1/src/jquery.poshytip.min.js"></script>
<!-- ENDS poshytip -->

<!-- GOOGLE FONTS -->
<link
	href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,300'
	rel='stylesheet' type='text/css'>

<!-- Flex Slider -->
<link rel="stylesheet" href="${bp}/css/flexslider.css">
<link rel="stylesheet" href="${bp}/css/bootstrap.min.css">
<script src="${bp}/js/jquery.flexslider-min.js"></script>
<!-- ENDS Flex Slider -->

<!-- Less framework -->
<link rel="stylesheet" media="all" href="${bp}/css/lessframework.css" />

<!-- modernizr -->
<script src="${bp}/js/modernizr.js"></script>

<!-- SKIN -->
<link rel="stylesheet" media="all" href="${bp}/css/skin.css" />

