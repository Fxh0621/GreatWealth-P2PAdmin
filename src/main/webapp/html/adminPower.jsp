<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<body style="overflow-x: hidden;margin-left: 150px;margin-top: 50px;">
      <div>
          <table id="managersTable" lay-filter="managersTableFilter"></table>
      </div>

      <script type="text/html" id="headerBtns">
        <button class="layui-btn layui-btn-sm" lay-event="addNewAdmins" id="addBtn">新增管理员</button>
        <button class="layui-btn layui-btn-sm layui-btn-danger" lay-event="delMany" id="delBtn">批量删除</button>
      </script>

      <script type="text/html" id="opBtns">
          <button class="layui-btn layui-btn-sm" lay-event="edit" >编辑</button>
          <button class="layui-btn layui-btn-sm layui-btn-danger" lay-event="delete">删除</button>
      </script>

      <script src="../layui/layui.js" charset="utf-8"></script>
      <script src="../js/jquery-3.5.1.js"></script>

      <!--新增信息模板-->
      <script type="text/html" id="addNew">
          <div>
              <form class="layui-form layui-form-pane">
                  <input type="hidden" name="method" value="addNew"/>
                  <div class="layui-form-item" style="margin-left: 150px">

                      <div class="layui-inline">
                          <div class="layui-input-inline">
                              <input type="file" class="from-control" id="file1" placeholder="file" name="file"
                                     onchange="showPreview(this)" style="width: 200px" required>
                          </div>
                          <img id="uimage1" name="uimage" width="60px" height="auto" src="${admin.uimage}" />
                      </div>

                          <div class="layui-inline">
                              <label class="layui-form-label">用户名：</label>
                              <div class="layui-input-block">
                                  <input type="text" name="username" required lay-verify="required"
                                         id="url2" autocomplete="off" class="layui-input">
                              </div>
                          </div>

                      <div class="layui-inline">
                          <label class="layui-form-label">
                              密码：
                          </label>
                          <div class="layui-input-inline">
                              <input class="layui-input" placeholder="" name="password" id="newGoodsName" required
                                     lay-verify="required"/>
                          </div>
                      </div>

                  </div>
                  <!--添加隐藏的监听事件-->
                  <input type="hidden" lay-submit lay-filter="submitFormFilter" id="submitForm"/>
              </form>
          </div>

      </script>


      <!--修改信息模板-->
      <script type="text/html" id="edit">
          <div>
              <form class="layui-form layui-form-pane" lay-filter="editGoodsForm" method="post" enctype="multipart/form-data">
                  <input type="hidden" name="method" value="edit"/>
                  <div class="layui-form-item" style="margin-left: 150px">

                      <div class="layui-inline">
                          <div class="layui-input-inline">
                              <input type="file" class="from-control" id="file2" placeholder="file" name="file"
                              onchange="showPreview(this)" style="width: 200px">
                          </div>
                          <img id="uimage2" name="uimage" width="60px" height="auto" src="${admin.uimage}" />
                      </div>

                      <div class="layui-inline">
                          <label class="layui-form-label">用户名：</label>
                          <div class="layui-input-block">
                              <input type="text" name="username" required lay-verify="required"
                                      autocomplete="off" class="layui-input">
                          </div>
                      </div>

                      <div class="layui-inline">
                          <label class="layui-form-label">
                              密码：
                          </label>
                          <div class="layui-input-inline">
                              <input class="layui-input" placeholder="" name="password"
                                     lay-verify="required"/>
                          </div>
                      </div>


                  </div>
                  <!--添加隐藏的监听事件-->
                  <input type="hidden" lay-submit lay-filter="submitFormFilter" id="submitForm1"/>
              </form>
          </div>

      </script>

                

      <!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

      <script type="text/javascript">
         <%--   渲染表格上的数据上去   --%>
          layui.use(['form','jquery','table','layer','util','upload'],function () {
              var upload = layui.upload;
              var form = layui.form;
              var $ = layui.jquery;
              var table = layui.table;
              var layer = layui.layer;
              var util = layui.util;

              //渲染数据库中的管理员到页面上去
              var t = table.render({
                  id:"id",
                  elem:'#managersTable',
                  url:'/ViewAdmins',
                  page:true,
                  limit:9,
                  limits:[9],
                  width:"1000",
                  height:"500",
                  toolbar:"#headerBtns",
                  parseData:function (res) {
                      console.log(res.data.data)
                      return{
                          "code":res.code,//解析接口状态
                          "msg":res.msg,//解析提示文本
                          "count":res.data.total,//解析数据长度
                          "data":res.data.data//解析数据列表
                      };
                  },
                  response:{
                      statusCode:200
                  },
                  cols:[[
                      {type:'checkbox',fixed:'left'}
                      ,{filed:'id',title:"ID",width:150,unresize:true,sort:true,align:'center',templet:function (d) {
                              return d.id;
                          }}
                      ,{filed:'img',title:"头像",width:200,unresize:true,align:'center',templet:'<div><img style="width: 30px;height: 30px" src="{{ d.img }}"></div>'}
                      ,{filed:'username',title:"用户名",width:200,unresize:true,align:'center',templet:function (d) {
                              return d.username;
                          }}
                      ,{filed:'password',title:"密码",width:200,unresize:true,align:'center',templet:function (d) {
                              return d.password;
                          }}
                      ,{title:"操作",width:200,toolbar:"#opBtns",align:'center'}
                  ]]
              });


              //为搜索按钮绑定事件
              $("#searchBtn").click(function () {

                  //获取搜索框中的值
                  var id = $("#id").val();
                  var goodsName = $("#goodsName").val();
                  var goodsShop = $("#goodsShop").val();
                  //表格重载
                  t.reload({
                      where: {
                          'id': id,
                          'goodsName': goodsName,
                          'goodsShop': goodsShop
                      }
                  });
                  //表格重载后，重新绑定事件，解决按钮失效问题
                  $("#addBtn").click(function () {
                      addNew();
                  });

                  //批量删除
                  $("#delBtn").click(function () {
                      delMany();
                  });

              });


              //新增
              $("#addBtn").click(function () {
                  addNew();
              });

              //批量删除
              $("#delBtn").click(function () {
                  delMany();
              });


              //批量删除的具体方法
              function delMany() {
                  //获取选中的id
                  var chechStatus = table.checkStatus("id");
                  var data = chechStatus.data;
                  if (data.length == 0) {
                      layer.msg("请先选择要删除的数据");
                      return false;
                  }

                  layer.confirm("确定删除选中的该管理员吗？", function (index) {
                      /* console.log("删除了---------");*/
                      delGoods(data, index);

                  })

              }

              //删除商品的方法
              function delGoods(data, index) {
                  var ids = "";
                  $.each(data, function (index, value) {
                      ids = ids + value.id + "@";  //传回后台的是id = 1&id= 2...
                  });
                  $.post("/deleteManyAdmin?ids=" + ids, function (rs) {
                      if (rs.code == 200) {
                          layer.msg("删除成功");
                          $("#searchBtn").click();
                          layer.close(index);
                          // window.location.reload();
                          form.render();
                          return false;
                      }
                      //删除失败显示失败信息，并关闭弹窗
                      layer.msg(rs.msg);
                      layer.close(index);
                      form.render();
                  });

              }

              //为行工具栏绑定事件
              table.on("tool(managersTableFilter)", function (d) {
                  var event = d.event;
                  var data = d.data;
                  if (event == "edit") {
                      //调用更新方法
                      edit(data)
                  }
                  if (event == "delete") {
                      delById(data)
                  }
              });

              //修改商品信息
              function edit(data) {
                  layer.open({
                      id: "editGoods",
                      type: 1,
                      content: $("#edit").html(),
                      btn: ['提交', '取消'],
                      area: ['600', '770'],
                      yes: function (layero, index) {//点击提交时触发
                          $("#submitForm1").click();
                      },
                      btnAlign: 'c',
                      success: function (layero, index) {//页面弹出成功触发

                          //为form表达赋值
                          form.val("editGoodsForm", {
                              //键值对的形式赋值
                              'id': data.id,
                              'file2': data.img,
                              'username': data.username,
                              'password': data.password
                          });

                          //重新渲染select

                          form.render();
                          form.render('select');

                          //监听表单的提交
                          form.on("submit(submitFormFilter)", function (d) {
                              // console.log(d);
                              // console.log(d.field);
                              //alert(d.field);
                              var id = data.id;   //获取用户id
                              $.post("/updateAdmin?id="+id,d.field,function (rs) {
                                  //业务正常
                                  if (rs.code == 200) {
                                      layer.msg("更新成功");
                                      $("#searchBtn").click();
                                      layer.close(index);
                                      form.render();
                                      return false;
                                  }
                                  layer.msg("更新失败");
                                  layer.close(index);
                                  form.render();
                              })
                          });

                      }
                  });
              }


              //根据id删除信息
              function delById(data) {
                  layer.confirm("确定删除选中的商品吗？", function (index) {
                      delId(data, index);
                  });
              }

              //根据id删除信息的具体方法
              function delId(data, index) {
                  var id = data.id;
                  console.log(id)
                  $.post("/deleteAdmin?id=" + id, function (rs) {
                      //判断业务响应码
                      if (rs.code == 200) {
                          layer.msg("删除成功");
                          $("#searchBtn").click();
                          layer.close(index);
                          form.render();
                          return false;
                      }
                      layer.msg("删除失败");
                      layer.close(index);
                      form.render();
                  });
              }


              //新增的具体方法
              function addNew() {


                  layer.open({
                      id: "addNewGoods",
                      type: 1,
                      content: $("#addNew").html(),
                      btn: ['提交', '取消'],
                      area: ['600', '700'],
                      yes: function (layero, index) {//点击提交时触发
                          $("#submitForm").click();
                      },
                      btnAlign: 'c',
                      success: function (layero, index) {//页面弹出成功触发
                          //重新渲染select
                          form.render('select');


                          //为表单新增监听提交事件
                          form.on("submit(submitFormFilter)", function (d) {
                              //alert(d.field.username);
                              $.post("/addNewAdmin", d.field, function (rs) {
                                  //业务正常

                                  if (rs.code == 200) {
                                      layer.msg("新增成功");
                                      $("#searchBtn").click();
                                      layer.close(index);

                                      form.render();
                                      return false
                                  }
                                  layer.msg("添加失败");
                                  layer.close(index);
                                  form.render();
                              });
                          });

                      }
                  });
              }
          });

      </script>


      <script type="text/javascript"e>
          //上传头像的功能
          function showPreview(source) {
              var file = source.files[0];
              if (window.FileReader){
                  var fr = new FileReader();
                  fr.onloadend = function (e) {
                      document.getElementById("uimage1").src = e.target.result;
                      document.getElementById("uimage2").src = e.target.result;
                  }
                  fr.readAsDataURL(file);
              }
          }
      </script>
</body>
</html>