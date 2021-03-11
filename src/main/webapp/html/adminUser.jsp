<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../layui/css/layui.css"  media="all">
</head>
<body style="overflow-x: hidden;width: 78%;margin-left: 160px;margin-top: 50px;">
    <table class="layui-hide" id="test"></table>
<script src="../layui/layui.js" charset="utf-8"></script>

<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>

layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#test'
    ,url:'/viewUsers'
    ,limit:10
    ,parseData:function (res) {
        return{
         "code":res.code,//解析接口状态
         "msg":res.msg,//解析提示文本
         "count":res.data.total,//解析数据长度
         "data":res.data.data//解析数据列表
        };
      },
      response:{
        statusCode:200
      }
    ,cols: [[
      {field:'userid', width:135, title: 'ID', sort: true,align:'center'}
      ,{field:'headerpic', width:150, title: '头像',align:'center',templet:'<div><img style="width: 30px;height: 30px" src="{{ d.headerpic }}"></div>'}
      ,{field:'username', width:130, title: '用户名',align:'center'}
      ,{field:'phonenum', width:130, title: '电话号码',align:'center'}
      ,{field:'personid', width:200, title: '身份证号码',align:'center'}
      ,{field:'registertime', width:150, title: '注册时间', sort: true,align:'center',templet:'<div>{{ layui.util.toDateString(d.registertime, "yyyy-MM-dd") }}</div>'}
      ,{field:'balance', width:150, title: '账户余额', sort: true,align:'center'}
    ]]
    ,page: true
  });
});
</script>
</body>
</html>