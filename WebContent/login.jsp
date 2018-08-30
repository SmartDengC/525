<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="官网">
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/denglu.css">
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
</div>
   

</div>  
    <div class="back" >    
            <div class="bback">
                   <div class="denglu">
                    <form class="m-t" role="form" action="loginOrQuitServlet?action=login" method="post">                                                         
                            <div class="form-group">
                            账号:<input type="text" class="form-control" name="name" placeholder="请输入账号" required="">
                            </div>
                            <div class="form-group">
                             密码:<input type="password" class="form-control" name="password" placeholder="请输入密码" required="">
                            </div>
                            <button type="submit" class="btns">登 录</button>
            
            
                            <p class="forz"> <a href="#"><small>忘记密码了？</small></a> | <a href="zhuce.html" target="_self">注册一个新账号</a>
                            </p>
            
                        </form>
                    </div>
                    
                            <img src="./img/d2.png" class="lu1">
                          
            </div>
     </div>  
</body>
</html>