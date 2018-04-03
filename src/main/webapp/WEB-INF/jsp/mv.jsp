<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="static/css/head.css" />
<style type="text/css">
ul li ul {
display: none;
border: 1px solid black;
position: absolute;
width: auto;
list-style:none;
text-align: center;
}

}
ul li ul>li {
margin: 0px;
display: inline;
line-height:30px;
font-size: 16px;
}
</style>
</head>
<body>
	<div>
		<ul id="menu">
			<li id="logo"><img src="static/image/logo.png"></li>
			<li><a id="first" onclick="sdnClick1()">首页</a></li>
			<li><a href="">MV</a>
				<ul id="list">
					<li><a href="">MV广场</a></li>
					<li><a href="">MV榜单</a></li>
				</ul></li>
			<li><a href="" onclick="logClick()">点歌广场<span></span></a></li>
			<li><a href="" onclick="sdnClick2()">榜单<span></span></a></li>
			<li><a href="" onclick="sdnClick3()">公会</a>
				<ul id="list">
					<li><a href="" onclick="sdnClick4()">我的公会</a></li>
					<li><a href="" onclick="sdnClick5()">公会列表</a></li>
					<li><a href="" onclick="sdnClick6()">公会排行</a></li>
					<li><a href="" onclick="sdnClick7()">公会活动</a></li>
				</ul></li>
			<li><a href="" onclick="sdnClick8()">商城</a></li>
			<li class="singGirl"><a href="#">女团<i></i></a>
				<ul id="list">
					<li><a onclick="logClick10()" href="#">SING官网</a></li>
					<li><a onclick="logClick11()" href="#">SING招募</a></li>
				</ul></li>
			<li><a href="#">酷狗LIVE</a></li>
			<li><a href="#">下载<i></i></a>
				<ul id="list">
					<li><a href="#">酷狗直播PC端</a></li>
					<li><a href="#">酷狗直播手机端</a></li>
					<li><a href="#">酷狗直播伴侣</a></li>
				</ul></li>
		</ul>
	</div>
</body>
</html>