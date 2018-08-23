<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="官网">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/MT.css">
    <title>工作室网站</title>
</head>
<body>

        <div class="header">
        <div class="rowl">
        <h1>
            <img src="./img/01.jpg" alt="">
            <span>智能信息系统工作室</span>
        </h1>
       </div>
       <form class="search"  method="get" style="position:absolute;right:10em;top:2em;">
        <input class="sinput" type="text" name="s" /> 
        <input class="sbtn" type="submit" value=""/>
        <img src="./img/06.png" id="sou"/>
        
    </form></div>
   

</div>

    <div class="nav">
        <div class="buttom">点击展开菜单</div>
       <ul id="nav">
           <li><a href="index.jsp">首页</a></li>
           <li><a href="">新闻与媒体</a>
                <ul>
                <li><a href="noticeInfoServlet">公共信息</a></li>
                <li><a href="downSourseServlet">资源下载</a></li>
                <!--  <li><a href="">信息通知</a></li> -->
                </ul>
           </li>
           <li><a href="">师资队伍</a>
                <ul>
                <li><a href="introduceMember.jsp">人员介绍</a></li>
                </ul>
            </li>
           <li><a href="">联系我们</a>
                <ul>
                <li><a href="contactUs.jsp">办事咨询</a></li>
                </ul>
           </li>
           </ul>
    </div>
    <div class="banner">
       
        <div class="mySlides fade">
        <img src="./img/03.jpg" alt="" width="100%">
        </div>
        <div class="mySlides fade">
        <img src="./img/04.jpg" alt="" width="100%">
        </div>
         <div class="mySlides fade">
        <img src="./img/2_1.jpg" alt="" width="100%" >
        </div>
        <div class="buttomer">
        <span class="dot" onclick="currentSlide(1)"></span> 
        <span class="dot" onclick="currentSlide(2)"></span> 
        <span class="dot" onclick="currentSlide(3)"></span> 
        </div>
    </div>
    <div class="onfooter">
        <ul>
            <li>新闻媒体</li>
            <li>师资队伍</li>
            <li>联系我们</li>
        </ul>
    </div>
    <div class="footer">
        <div class="ffooter">
        <ul>
            <li><a href="noticeInfoServlet">公共信息</a>
                <ul>
                    <li><a href="downSourseServlet">资源下载</a></li>
                    
                    <!--<li><a href="">信息通知</a></li>
                    -->
                    </ul>
            </li>
            <li><a href="introduceMember.jsp">人员介绍</a></li>
            <li><a href="contactUs.jsp">办事咨询</a></li>
        </ul>
    </div>
    </div>
    <script src="./js/buttom.js"></script>
</body>
</html>