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
    ,url:'/viewInvests'
      ,limit:9
      ,parseData:function (res) {
        console.log(res);
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
      {field:'userid', width:80, title: 'ID', sort: true,align:'center'}
      ,{field:'headerpic', width:80, title: '头像',templet:'<div><img style="width: 30px;height: 30px" src="{{ d.headerpic }}"></div>',align:'center'}
      ,{field:'username', width:80, title: '用户名',align:'center'}
      ,{field:'phonenum', width:130, title: '电话号码',align:'center'}
      ,{field:'personid', width:170, title: '身份证号码',align:'center'}
      ,{field:'investtime', width:130, title: '投资时间', sort:true ,templet:'<div>{{ layui.util.toDateString(d.investtime, "yyyy-MM-dd") }}</div>',align:'center'}
      ,{field:'investproject', width:130, title: '投资项目',align:'center'}
      ,{field:'investtype', width:130, title: '投资类型',align:'center'}
      ,{field:'investmoney', width:135, title: '投资金额', sort: true,align:'center'}
    ]]
    ,page: true
  });
});
</script>
</body>
</html>