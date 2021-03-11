package com.igeek.controller;

import com.igeek.entity.Admin;
import com.igeek.service.AdminLoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.awt.datatransfer.Clipboard;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/2/25 0025 15:01
 */
@Controller
public class AdminLoginController {

 @Autowired
 private AdminLoginService adminLoginService;

 @RequestMapping("/login")
 public String login(HttpServletRequest request,String username, String password){
     Admin admin = adminLoginService.selectByNameAndPwd(username, password);
     if (admin!=null){
         request.setAttribute("admin",admin);
         return "adminManager";
     }
     request.setAttribute("message","用户名或密码错误，请重新登录!");
     return "adminLogin";
 }

}
 
  