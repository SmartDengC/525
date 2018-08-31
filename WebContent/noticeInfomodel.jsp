<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="cn.workshop.model.noticeInfoModel" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="官网">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/adinf.css">
    <title>工作室网站</title>
    <style type="text/css">
    .div{
    display:none;
    }
    
    
    
    </style>
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

</div>

   

</div>
    <div class="inf">
        <div class="list">
                        <ul> <li class="oli"><a  target="_self">公共信息</a></li></ul>
                        <ul> <li class="mli"><a  target="_self">资源下载</a></li></ul>

        </div>
        <div class="new">
            <div class="jiao"></div>
            <div class="j1">
            <%
            noticeInfoModel nim=null;
            nim=(noticeInfoModel)request.getAttribute("noticeInfo");
            
            %>
                    <form action="noticeInfoServlet?action=updata&key=2" method="post" > 
                    		<div class="div">id:<input  readonly="readonly" name="id" value="<%=nim.getId() %>" type="text"/></div>
                            <div>标题:<input name="title" value="<%=nim.getTitle() %>" type="text"/></div>
                            <div>时间:<input name="time" value="<%=nim.getTime() %>" type="text"/></div>
                            <div>内容:<textarea name="text"  rows="10" cols="40"><%=nim.getText() %></textarea></div>
                            <div><button type="submit">提交</button></div>
                     </form> 
            </div>
            
       </div>
      
   </div> 
</body>
</html>