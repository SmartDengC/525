<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="官网">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/lianxi.css">
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
       <form class="search"  method="get" >
        <input class="sinput" type="text" name="s" /> 
        <input class="sbtn" type="submit" value=""/>
        
    </form>
    <a class="dlq" href="login.jsp">登录</a>

</div>
   

</div>

    <div class="nav">
        <div class="buttom">点击展开菜单</div>
       <ul id="nav">
           <li><a href="indexServlet" target="_self">首页</a></li>
           <li><a href="">新闻与媒体</a>
                <ul>
                <li><a href="noticeInfoServlet" target="_self">公共信息</a></li>
                <li><a href="downSourseServlet" target="_self">资源下载</a></li>
                </ul>
           </li>
           <li><a href="">师资队伍</a>
                <ul>
                <li><a href="introduceMemberServlet" target="_self">人员介绍</a></li>
                </ul>
            </li>
           <li><a href="">联系我们</a>
                <ul>
                <li><a href="contact.jsp" target="_self">办事咨询</a></li>
                </ul>
           </li>
           </ul>
    </div>
    <div class="back" >    
         <div class="bback">
              <div class="zikuai">
                  <div class="sanjiao"></div>
                  <div class="xuxian"></div>
                  <ul><li class="bangong">办公地点</li></ul>
            </div>

            <div class="bjs">
                <div class="bjs1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;成都大学信息科学与工程学院第10栋教学楼5楼525智能信息系统工作室。</div><img src="./img/l2.png"></p>
            </div>

            <div class="zikuai2">
                <div class="sanjiao2"></div>
            </div>
            <div class="zikuai3">
                    <div class="sanjiao3"></div>
                    <div class="xuxiant"></div>
                    <ul><li class="guanli">管理人员</li></ul>
                </div>
         </div>
    </div>
    <div class="fback"  >
            <p class="teacher">指导老师：<span>于曦老师</span></br>（成都大学信息工学与工程学院副院长）</p>
            <ul class="fz">
                <li>技术顾问：张梓潼</li>
                <li>日常管理：熊红</li>
                <li>技术顾问：朱洪超</li>
            </ul>
            <ul class="call">
                  <li>邮箱：2389208027@qq.com</li>
                  <li>电话 ：13540823418</li>
                  <li>邮箱：2192154237@qq.com</li>
                  <li>电话：</li>
                  <li>邮箱：zhuerchaochaol@qq.com</li>
                  <li>电话：</li>
              </ul>
              <div class="zikuai4">
                    <div class="sanjiao4"></div>
                </div>

    </div >  
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
            <li><a href="noticeInfoServlet" target="_self">公共信息</a>
                <ul>
                    <li><a href="downSourseServlet" target="_self">资源下载</a></li>
                    </ul>
            </li>
            <li><a href="introduceMemberServlet" target="_self">人员介绍</a></li>
            <li><a href="contact.jsp" target="_self">办事咨询</a></li>
        </ul>
    </div>
    </div>
</body>
</html>