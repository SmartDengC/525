<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="cn.workshop.model.downSourceModel" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="官网">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/xiugaitianjia.css">

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

    <div class="nav">


    </div>
  <div class="xiugaitianjia">
	  <%
	  downSourceModel dsm=(downSourceModel)request.getAttribute("dowmSourse");
	  
	  
	  %>
        <form action="downSourseServlet?action=updata&key=2" method="post" > 
        		<div class="div">id:<input  readonly="readonly" name="id" value="<%=dsm.getId() %>" type="text"/></div>
                <div>资源标题:<input type="text" name="name" value="<%=dsm.getName() %>"></div>
                <div>资源上传时间:<input type="text" name="time" value="<%=dsm.getTime() %>"></div>
                <div>资源介绍:<textarea rows="10" cols="60" name="introduce"><%=dsm.getIntroduce() %></textarea></div>
                <div>资源地址:<input type="text" name="url" value="<%=dsm.getUrl() %>"></div>
                <div><button type="submit">提交</button></div>
         </form> 
  </div>       
</body>
</html>