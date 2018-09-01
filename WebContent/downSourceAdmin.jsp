<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.List,cn.workshop.model.downSourceModel,java.util.Iterator" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="官网">
    <link rel="stylesheet" href="./css/ziyuan.css">
    <link rel="stylesheet" href="./css/style.css">
    <title>工作室网站</title>
</head>
<body>

        <div class="header">
        <div class="rowl">
        <h1>
            <img src="./img/01.jpg" alt="">
            <span>智能信息系统工作室:后台系统</span>
        </h1>
       </div>
       <form class="search"  method="get" >
        <input class="sinput" type="text" name="s" /> 
        <input class="sbtn" type="submit" value=""/>
        
    </form>    
		<a class="dlq" href="loginOrQuitServlet?action=quit">退出</a>
</div>

   

</div>

    <div class="nav">
        <div class="buttom">点击展开菜单</div>
       <ul id="nav">
           <li><a href="indexServlet" target="_self">首页</a></li>
           <li><a >新闻与媒体</a>
                <ul>
                <li><a href="noticeInfoServlet" target="_self" >公共信息</a></li>
                <li><a href="downSourseServlet" target="_self">资源下载</a></li>
                </ul>
           </li>
           <li><a >师资队伍</a>
                <ul>
                <li><a href="introduceMemberServlet" target="_self">人员介绍</a></li>
                </ul>
            </li>
           <li><a >联系我们</a>
                <ul>
                <li><a  href="contactServlet" target="_self">办事咨询</a></li>
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
        <div class="j1">
            <h1>面试比赛</h1>
            <div class="nk" >
                <img src="./img/logo8.png" ><p >牛客网<a href="https://www.nowcoder.com/login" target="_blank"  class="nk1">https://www.nowcoder.com/login</a></p>
            </div>
            <div class="tc">
                <img src="./img/logo10.png" ><p >天池<a href="https://tianchi.aliyun.com/" target="_blank" class="tc1" >https://tianchi.aliyun.com/</a></p>
            </div>
        </div>
            <div >
             
                <h1>优质网站</h1>
                <form action="downSourseServlet?action=insert" method="post"> 
                <div>资源标题:<input type="text" name="name"></div>
                <div>资源上传时间:<input type="text" name="time"></div>
                <div>资源介绍:<textarea rows="10" cols="60" name="introduce"></textarea></div>
                <div>资源地址:<input type="text" name="url"></div>
                <div><button type="submit">提交</button></div>
         		</form>
				<%               
                List<downSourceModel> list=(List<downSourceModel>)request.getAttribute("dowmSourse");
                downSourceModel dsm=null;
                Iterator it = list.iterator();
                String temp=null;
                while(it.hasNext())
                {
                	dsm=(downSourceModel)it.next();
                	//temp=dsm.getIntroduce().substring(0, 8);
                
                
                %>
                <div class="gi"> 
                     <ul class="ogi">
                        <li  class="biaoti"><%=dsm.getName() %><span class="time"><%=dsm.getTime() %></span></li>
                        <li class="jieshao"><%=dsm.getIntroduce() %><a href="<%=dsm.getUrl() %>" target="_blank" class="dizhi"><%=dsm.getUrl() %></a></li>                 
                    	<li class="biaoti">&nbsp;&nbsp;<a href="downSourseServlet?action=delect&id=<%=dsm.getId()%>">删除</a>&nbsp;&nbsp;<a href="downSourseServlet?action=updata&id=<%=dsm.getId()%>&key=1">修改</a></li>
                    </ul>                                 
                </div>
                <%
                }
				%>
                



				
                
        </div>         
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
            <li><a href="introduceMemberServlet" target="_self">人员介绍</a></li>
            <li><a href="contactServlet" target="_self">办事咨询</a></li>
        </ul>
     </div>
    </div>

    
</body>
</html>