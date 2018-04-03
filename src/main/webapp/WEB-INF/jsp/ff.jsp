<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">  
    .menu ul,.menu li{margin:0; padding:0;list-style:none outside;}
    .menu a:hover,.menu span:hover,.menu li:hover>a,.menu li:hover>span{color:HighlightText;}
    .menu li:hover{background-color:Highlight;}
    .menu li:hover>ul{display:block;}
    .menu>ul>li{float:left;}
    .menu>ul>li ul{display:none;
    float:left; 
    background-color:#fff;
     border:1px solid Highlight; 
     position:absolute;}
</style>  
</head>
<body>
<div id="mainnav" class="menu">
    <ul>
      <li><a href="#">Link</a></li>
      <li><a href="#">Link</a></li>
      <li class="expand"><a href="#">Link</a>
        <ul>
          <li><a href="#">Link</a></li>
          <li><a href="#">Link</a></li>
          <li class="expand"><a href="#">很长很长很长很长很长很长很长很长很长很长</a>
            <ul>
              <li><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
              <li class="expand"><a href="#">LinkLink</a>
                <ul>
                  <li class="expand"><a href="#">Link</a>
                    <ul>
                      <li><a href="#">Link</a></li>
                      <li><a href="#">Link</a></li>
                      <li><a href="#">Link</a></li>
                      <li><a href="#">Link</a></li>
                      <li><a href="#">Link</a></li>
                    </ul>
                  </li>
                  <li><a href="#">Link</a></li>
                  <li class="expand"><span>span 菜单项</span>
                    <ul>
                      <li><span>span 菜单项</span></li>
                      <li><a href="#">Link</a></li>
                      <li><a href="#">Link</a></li>
                      <li><a href="#">Link</a></li>
                      <li><a href="#">Link</a></li>
                    </ul>
                  </li>
                  <li><a href="#">Link</a></li>
                  <li><a href="#">Link</a></li>
                </ul>
              </li>
              <li><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
            </ul>
          </li>
          <li><a href="#">Link</a></li>
          <li><a href="#">Link</a></li>
        </ul>
      </li>
      <li><a href="#">Link</a></li>
      <li><a href="#">Link</a></li>
    </ul>
  </div>
</body>  
</body>
</html>