<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="../layui/css/layui.css"  media="all">
  <link rel="shortcut icon" href="../image/宏量财富小图标.jpg">
  <link rel="stylesheet" href="../css/footer.css">
  <title>P2P宏量财富</title>
</head>
<style>
    body{
        background: url("../image/背景1.jpeg");
    }
    .center{
        width: 590px;
        height: 350px;
        margin-left: auto;
        margin-right: auto;
        margin-top: 200px;
        background-color: white;
        opacity: 0.4;
        border-radius: 5px;
    }
    span{
        display: inline-block;
        width: 100px;
        height: 60px;
        text-align: center;
        color: black;
        font-size: 20px;
        margin-left: 60px;
    }
</style>
<body>
    <div class="center">
       <p style="font-size: 25px;font-weight: bolder;color: black;text-align: center;position: relative;top: 20px;">宏量财富后台管理系统</p>

       <form action="${pageContext.request.contextPath}/login" style="margin-top: 60px;margin-left: auto;margin-right: auto;" method="post">
           <span style="color: red;font-size: 16px;width: 300px;height: 50px;display: inline-block;margin-left: 140px">${message}</span><br>
           <span>用户名：</span>
           <input type="text" style="width: 300px;height: 30px;border-radius: 3px;" name="username"><br>
           <span>密码:</span>
           <input type="password" style="width: 300px;height: 30px;border-radius: 3px;" name="password"><br>
           <input type="submit" value="立即登录" style="width: 140px;height: 40px;margin-left: 220px;background-color: cadetblue;border-radius: 3px;font-size: 18px;font-weight: bold;cursor: pointer;">
       </form>
    </div>
</body>
</html>