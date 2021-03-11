package com.igeek.controller;

import com.igeek.entity.Userinvest;
import com.igeek.service.AdminInvestService;
import com.igeek.utils.PageInfo;
import com.igeek.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/3/1 0001 17:47
 */
@RestController
public class AdminInvestController {

    @Autowired
    private AdminInvestService adminInvestService;

    @RequestMapping("/viewInvests")
    public Result viewInvests(Integer page,Integer limit){
        PageInfo<Userinvest> pageInfo = adminInvestService.selectInvestTypes(page, limit);
        Result result = new Result();
        result.setData(pageInfo);
        return result;
    }

}
 
  