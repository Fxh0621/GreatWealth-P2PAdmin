package com.igeek.controller;

import com.igeek.entity.Admin;
import com.igeek.service.AdminPowerService;
import com.igeek.utils.PageInfo;
import com.igeek.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/2/27 0027 9:34
 */
@Controller
public class AdminPowerController {

    @Autowired
    private AdminPowerService adminPowerService;

    //分页展示所有的admin对象
    @RequestMapping("/ViewAdmins")
    @ResponseBody
    public Result ViewAdmins(Integer page,Integer limit){
        PageInfo<Admin> pageInfo = adminPowerService.selectAllAdmins(page, limit);
        Result result = new Result();
        result.setData(pageInfo);
        return result;
    }


    //新增用户
    @RequestMapping("/addNewAdmin")
    @ResponseBody
    public Result addNewAdmin(File file,String username,String password){

        String img = file.getName();

        Admin admin = new Admin();
        admin.setImg("/pic/"+img);
        admin.setUsername(username);
        admin.setPassword(password);

        //插入用户
        int i = adminPowerService.insertAdmin(admin);
        if (i>0){
            Result result = new Result();
            return result;
        }
        return null;
    }

    //修改用户
    @RequestMapping("/updateAdmin")
    @ResponseBody
    public Result updateAdmin(File file,String username,String password,String id){
        String img = file.getName();

        Admin admin = new Admin();
        admin.setImg("/pic/"+img);
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setId(Integer.parseInt(id));

        int i = adminPowerService.updateAdmin(admin);
        if (i>0){
            Result result = new Result();
            return result;
        }
        return null;
    }

    //删除用户
    @RequestMapping("/deleteAdmin")
    @ResponseBody
    public Result deleteAdmin(Integer id){

        int i = adminPowerService.deleteAdmin(id);

        if (i>0){
            Result result = new Result();
            return result;
        }
        return null;
    }



    //批量删除用户
    @ResponseBody
    @RequestMapping("/deleteManyAdmin")
    public Result deleteManyAdmin(String ids){

        String[] splits = ids.split("@");

        int i = 0;
        for (String split : splits) {
            i = adminPowerService.deleteAdmin(Integer.parseInt(split));
        }

        if (i>0){
            Result result = new Result();
            return result;
        }

        return null;
    }
}
 
  