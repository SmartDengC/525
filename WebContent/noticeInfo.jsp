<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*,cn.workshop.dao.noticeInfo,cn.workshop.model.noticeInfoModel" %>
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
                <li><a href="downSourseServlet" target="_self">资源下载</a></li>
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
                        <ul> <li class="mli"><a href="downSourseServlet" target="_self">资源下载</a></li></ul>

        </div>
                     
        <div class="new">
            <div class="jiao"></div>
       <%           
	       List<noticeInfoModel> list=null;
	       noticeInfoModel notice=null;	       	      	     
	       list=(List<noticeInfoModel>)request.getAttribute("noticeInfo");	       
	       if(list!=null)
	       {
	    	   Iterator<noticeInfoModel> iter=list.iterator();
	    	   while(iter.hasNext())
	    	   {
	    		   notice=(noticeInfoModel)iter.next();	    		       	   
       %>
            
            <div class="j1">
                <h4><%=notice.getTitle() %></h4>
                <p><%=notice.getTime() %></p>
                <p><%=notice.getText() %></p>            	
            </div>
            
            
       <%
	    	   }
	       }
       %>     
       <div >       
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
            <li><a href="noticeInfoServlet" target="_self">公共信息</a>
                <ul>
                    <li><a href="downSourseServlet" target="_self">资源下载</a></li>
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