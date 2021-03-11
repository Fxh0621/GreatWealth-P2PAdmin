package com.igeek.controller;

import com.igeek.entity.User;
import com.igeek.service.AdminUserService;
import com.igeek.utils.PageInfo;
import com.igeek.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/2/27 0027 10:39
 */
@RestController
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping("/viewUsers")
    public Result viewUsers(Integer page,Integer limit){
        PageInfo<User> pageInfo = adminUserService.selectAllUser(page, limit);
        Result result = new Result();
        result.setData(pageInfo);
        return result;
    }

}
 
  