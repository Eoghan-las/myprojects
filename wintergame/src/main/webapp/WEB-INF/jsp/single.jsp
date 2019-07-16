<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html class="no-js">

<head>
<meta charset="utf-8" />
<title>ZENI</title>

<!--[if lt IE 9]>
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
<link rel="stylesheet" media="all" href="css/style.css" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!-- Adding "maximum-scale=1" fixes the Mobile Safari auto-zoom bug: http://filamentgroup.com/examples/iosScaleBug/ -->


<!-- JS -->
<script src="http://apps.bdimg.com/libs/jquery/1.6.4/jquery.min.js"></script>
<script src="js/css3-mediaqueries.js"></script>
<script src="js/custom.js"></script>
<script src="js/tabs.js"></script>
<script src="../../js/bootstrap.min.js"></script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

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


	<!-- MAIN -->
	<div id="main">
		<div class="wrapper clearfix">




			<!-- posts list -->
			<div id="posts-list" class="single-post">

				<h2 class="page-heading">
					<span>BLOG</span>

				</h2>

				<article class="format-standard">
					<div class="entry-date">
						<div class="number">23</div>
						<div class="year">Sep, 2011</div>
					</div>
					<h2 class="post-heading">
						<a href="single.html">${messages.ztitle }</a>
					</h2>
					<div class="post-content">${messages.zcontent }</div>

					<div class="meta">
						<div class="categories">
							In <a href="#">Category 1</a>, <a href="#">Category 2</a>
						</div>
						<div class="comments">
							<a href="#">${list.size() } comments </a>
						</div>
						<div class="user">
							<a href="#">${messages.user.uname }</a>
						</div>
					</div>

					<c:forEach items="${ list2 }" var="list2">
						<div style="width: 20%;background-color: pink;display: block;float: left; margin-left: 5%;text-align: center; " class="btn btn-primary btn-large"><a href="project.action?gid=${list2.gid }">${list2.gname }</a></div>
					</c:forEach>

					<!-- comments list -->
					<%-- ${messages.user.collect.game.gprice } --%>
					<div id="comments-wrap">
						<h3 class="heading">${list.size() }COMMENTS</h3>
						<ol class="commentlist">
							<c:forEach items="${list }" var="list">
								<li class="comment odd thread-even depth-1" id="li-comment-3">
									<div id="comment-4" class="comment-body clearfix">
										<img alt=''
											src='http://0.gravatar.com/avatar/4f64c9f81bb0d4ee969aaf7b4a5a6f40?s=35&amp;d=&amp;r=G'
											class='avatar avatar-35 photo' height='35' width='35' />
										<div class="comment-author vcard">${list.user.uname }</div>
										<div class="comment-meta commentmetadata">
											<span class="comment-date">${list.inputdate } </span> <span
												class="comment-reply-link-wrap"><a
												class='comment-reply-link' href='replytocom=23#respond'
												onclick='return addComment.moveForm("comment-4", "1", "respond", "432")'>Reply</a></span>

										</div>
										<div class="comment-inner">
											<p>${list.content }</p>
										</div>
									</div>
								</li>
							</c:forEach>
						</ol>
					</div>
					<!-- ENDS comments list -->
					
					

					<!-- Respond -->
					<div id="respond">

						<div class="cancel-comment-reply">
							<a rel="nofollow" id="cancel-comment-reply-link" href="#respond"
								style="display: none;">Cancel reply</a>
						</div>
						<form action="refer.action" method="post" id="commentform">
							<h3 class="heading">发表评论</h3>
							<c:if test="${curuser != null }">
								<textarea name="content" id="content" tabindex="4"></textarea>
								<p>
									<input name="submit" type="submit" id="submit" tabindex="5"
										value="Post" />
								</p>
							</c:if>
							<c:if test="${curuser == null }">
								<div
									style="text-align: center; margin-top: 100px; border-color: black;">
									<p value="请登录">
										请<a href="index.action" values="登录">登录</a>
									</p>
								</div>
							</c:if>



							<input type='hidden' name='uid' value='${messages.uid }'
								id='comment_post_ID' /> <input type='hidden' name='zid'
								id='comment_parent' value='${messages.zid }' />
						</form>
					</div>
					<div class="clearfix"></div>
					<!-- ENDS Respond -->

				</article>

			</div>
			<!-- ENDS posts list -->

			<!-- sidebar -->
			<!-- ENDS sidebar -->

		</div>
	</div>
	<!-- ENDS MAIN -->


	<footer style="text-align: center;">
		<c:import url="foot.jsp"></c:import>
	</footer>

</body>

</html>