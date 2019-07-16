<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header class="clearfix">
	<!-- top widget -->
	<div id="top-widget-holder">
		<div class="wrapper">
			<div id="top-widget">
				<div class="padding">
					<form action="login.action" class="form-horizontal" style="width: 100%;" >
						<div style="margin: 0 auto; width: 500px;">
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-2 control-label">账号</label>
								<div class="col-sm-10" style="width: 83%;">
									<input name="uname" type="text" class="form-control" id="inputEmail3"
										placeholder="Name">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-10" style="width: 83%;">
									<input name="upass" type="password" class="form-control" id="inputPassword3"
										placeholder="Password">
								</div>
							</div>

							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<div class="checkbox">
										<label> <input type="checkbox"> Remember me
										</label>
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<a href="regist.action" class="btn btn-default" style="color: black;">注册</a>
									<button type="submit" class="btn btn-default">登录</button>
									<a href="exits.action">退出</a>
								</div>
							</div>
						</div>
					</form>
				</div>
				
			</div>
		</div>
		<a href="#" id="top-open">Menu</a>
	</div>
	<!-- ENDS top-widget -->

	<div class="wrapper clearfix">

		<a href="index.action" id="logo"><img src="img/logo.png"
			alt="Zeni"></a>

		<nav>
			<ul id="nav" class="sf-menu">
				<li class="current-menu-item"><a href="index.action">主页</a></li>
				<li><a href="blog.action">游戏资讯</a></li>
				<li><a href="page.action">简介</a></li>
				<li><a href="portfolio.action?nid=0" nid="0">游戏类别 </a>
					<ul>

						<c:forEach items="${kindlist}" var="kind">
							<li><a href="portfolio1.action?kid=${kind.kid }">${kind.kname }</a></li>
						</c:forEach>


					</ul></li>
				<c:if test="${curuser.uloa==1 }">
					<li><a href="showgames.action">游戏库</a></li>
					<li><a href="tousers.action">用户管理</a></li>
					<li><a href="tomessages.action">资讯管理</a></li>
				</c:if>
				<li><a
					href="http://www.mojo-themes.com/item/zeni-wordpress-theme/?r=ansimuz">版本</a>
				</li>
			
					
				

				<c:if test="${curuser.uloa==3}">
					<li><a href="showmessage.action">个人资讯管理</a></li>
				</c:if>
				
				<c:if test="${curuser!=null}">
					<li><a href="collect.action?uid=${curuser.uid }">${curuser.uname }</a></li>
				</c:if>
			</ul>
			<div id="combo-holder"></div>
		</nav>
	</div>
	<div style="float: right;margin-top: -10px;"><a href="index.action">返回主页</a></div>
</header>