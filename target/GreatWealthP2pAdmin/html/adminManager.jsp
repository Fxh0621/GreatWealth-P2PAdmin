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
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
      <div class="layui-header">
        <div class="layui-logo" style="font-size: 24px;">宏量财富后台</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <!-- <ul class="layui-nav layui-layout-left">
          <li class="layui-nav-item"><a href="">控制台</a></li>
          <li class="layui-nav-item"><a href="">商品管理</a></li>
          <li class="layui-nav-item"><a href="">用户</a></li>
          <li class="layui-nav-item">
            <a href="javascript:;">其它系统</a>
            <dl class="layui-nav-child">
              <dd><a href="">邮件管理</a></dd>
              <dd><a href="">消息管理</a></dd>
              <dd><a href="">授权管理</a></dd>
            </dl>
          </li>
        </ul> -->
        <ul class="layui-nav layui-layout-right">
          <li class="layui-nav-item">
            <a href="javascript:;">
              <img src="${admin.img}" class="layui-nav-img">
              ${admin.username}
            </a>
            <!-- <dl class="layui-nav-child">
              <dd><a href="">基本资料</a></dd>
              <dd><a href="">安全设置</a></dd>
            </dl> -->
          </li>
          <li class="layui-nav-item"><a href="html/adminLogin.jsp">退出</a></li>
        </ul>
      </div>
      
      <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
          <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
          <ul class="layui-nav layui-nav-tree"  lay-filter="test">
            <li class="layui-nav-item layui-this"><a class="layui-this" href="html/adminIndex.jsp" target="zhuti">首页</a></li>
            <li class="layui-nav-item"><a href="html/adminBorrow.jsp" target="zhuti">借款详情</a></li>
            <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/viewAllBorrowTypes" target="zhuti">借款类型</a></li>
            <li class="layui-nav-item"><a href="html/adminInvest.jsp" target="zhuti">投资详情</a></li>
            <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/viewInvestTypes" target="zhuti">投资类型</a></li>
            <li class="layui-nav-item"><a href="html/adminUser.jsp" target="zhuti">用户详情</a></li>
            <li class="layui-nav-item"><a href="html/adminPower.jsp" target="zhuti">权限管理</a></li>
          </ul>
        </div>
      </div>
      
      <div class="layui-body">
        <!-- 内容主体区域 -->
        <iframe id="iframeMain" name="zhuti" style="width: 100%;height: 98%;" src="html/adminIndex.jsp"></iframe>
      </div>
      
      <div class="layui-footer">
        <!-- 底部固定区域 -->
        © hongLiangWealth.com - 投资有风险 借贷需谨慎
      </div>
    </div>
    <script src="../layui/layui.js"></script>
    <script src="../js/jquery-3.5.1.js"></script>
    <script>
    //JavaScript代码区域
    layui.use('element', function(){
      var element = layui.element;
      
    });

    $("#iframeMain").attr("src",$(this).attr("../html/adminIndex.html"));
    </script>
    </body>
</html>