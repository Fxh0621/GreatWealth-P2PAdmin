package com.igeek.controller;

import com.igeek.entity.Userborrow;
import com.igeek.service.AdminBorrowService;
import com.igeek.utils.PageInfo;
import com.igeek.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/3/1 0001 18:28
 */
@RestController
public class AdminBorrowController {

    @Autowired
    private AdminBorrowService adminBorrowService;

    @RequestMapping("/viewBorrows")
    public Result viewBorrows(Integer page, Integer limit){
        PageInfo<Userborrow> pageInfo = adminBorrowService.selectBorrowTypes(page, limit);
        Result result = new Result();
        result.setData(pageInfo);
        return result;
    }

}
 
  