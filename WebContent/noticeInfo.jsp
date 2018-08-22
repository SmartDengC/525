<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*,cn.workshop.dao.noticeInfo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="官网">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/xinwen.css">
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
           <li><a href="index.jsp" target="_self">首页</a></li>
           <li><a href="">新闻与媒体</a>
                <ul>
                <li><a href="noticeInfoServlet" target="_self">公共信息</a></li>
                <li><a href="downSource.jsp" target="_self">资源下载</a></li>
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
    <div class="inf">
        <div class="list">
                        <ul> <li class="oli"><a href="noticeInfoServlet" target="_self">公共信息</a></li></ul>
                        <ul> <li class="mli"><a href="downSource.jsp" target="_self">资源下载</a></li></ul>

        </div>
        <div class="new">
            <div class="jiao"></div>
            <div class="j1">
                <h4>[重要事的标题]</h4>
                <p>&nbsp;&nbsp;xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            </div>
            <div class="j2">
                    <h4>[新闻之类的标题]</h4>
                </p>&nbsp;&nbsp;xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
                <img src="./img/q1.png" ><img src="./img/q2.png" >
            </div>
            <div class="j3">
                    <h4>这个就是可看可不看不重要的</h4>
                    <p>&nbsp;&nbsp;xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>

            </div>
       </div>
       <div class="fenye">
            <ul>
                    <li class="page_li">
                        <button class="page_btn" style="width:100px" id="prePage">上一页</button>
                    </li>
                    <li class="page_li">
                        <button class="page_btn" id="page_btn1">1</button>
                    </li>
                    <li class="page_li">
                        <span class="pages_span" id="prePoint">...</span>
                    </li>
                    <li class="page_li">
                        <button class="page_btn" id="page_btn2"></button>
                    </li>
                    <li class="page_li">
                        <button class="page_btn" id="page_btn3"></button>
                    </li>
                    <li class="page_li">
                        <button class="page_btn" id="page_btn4"></button>
                    </li>
                    <li class="page_li">
                        <button class="page_btn" id="page_btn5"></button>
                    </li>
                    <li class="page_li">
                        <button class="page_btn" id="page_btn6"></button>
                    </li>
                    <li class="page_li">
                        <span class="pages_span" id="sufPoint">...</span>
                    </li>
                    <li class="page_li">
                        <button class="page_btn" id="page_btn7"></button>
                    </li>
                    <li class="page_li">
                        <button class="page_btn" style="width:100px" id="sufPage">下一页</button>
                    </li>
                </ul>
       </div>
   </div>
    <div >
       这里是公共信息的页面 <br/>
       <%
       List<noticeInfo> list=null;
       list=(List<noticeInfo>)request.getAttribute("noticeInfo");
       if(list==null)
       		out.write("<strong>list中没有数据</strong>");
       else
    	    out.write("<strong>list中有数据</strong>");
       %>
       <%
       for(int i=0;i<20;i++){
    	   out.write("<br>");
       }
       
       %>
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
            <li><a href="noticeInfo.jsp" target="_self">公共信息</a>
                <ul>
                    <li><a href="downSource.jsp" target="_self">资源下载</a></li>
                    </ul>
            </li>
            <li><a href="introduceMember.jsp">人员介绍</a></li>
            <li><a href="contactUs.jsp">办事咨询</a></li>
        </ul>
    </div>
    </div>

    <script src="./js/fenye.js"></script>
</body>
</html>