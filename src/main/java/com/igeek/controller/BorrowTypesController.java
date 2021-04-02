package com.igeek.controller;

import com.github.pagehelper.PageInfo;
import com.igeek.entity.Borrowtypes;
import com.igeek.service.BorrowTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/3/23 0023 18:50
 */
@Controller
public class BorrowTypesController {

    @Autowired
    private BorrowTypesService borrowTypesService;

    //展示所有的借款类型
    @RequestMapping("/viewAllBorrowTypes")
    public String viewAllBorrowTypes(@RequestParam(value = "pageNum",required = true,defaultValue = "1") int pageNum,
                                     @RequestParam(value = "pageSize",required = true,defaultValue = "9")int pageSize,
                                     Model model){

        List<Borrowtypes> allBorrowTypes = borrowTypesService.findAllBorrowTypes(pageNum, pageSize);

        PageInfo<Borrowtypes> pageInfo = new PageInfo<>(allBorrowTypes);

        model.addAttribute("pageInfo",pageInfo);

        return "borrowTypes";
    }

    //插入借款类型
    @RequestMapping("/addBorrowTypes")
    public String addBorrowTypes(Borrowtypes borrowtypes){

        borrowTypesService.insertBorrowTypes(borrowtypes);

        return "redirect:viewAllBorrowTypes";

    }

    //查找borrow类型
    @RequestMapping("/viewBorrrowTypesById")
    public String viewBorrrowTypesById(Integer borrowtypesid,Model model){

        Borrowtypes borrowTypes = borrowTypesService.getBorrow(borrowtypesid);

        model.addAttribute("borrowTypes",borrowTypes);

        return "borrowTypesUpdate";
    }

    //更新借款类型
    @RequestMapping("/updateBorrowTypes")
    public String updateBorrowTypes(Borrowtypes borrowtypes){

        borrowTypesService.updateBorrowTypes(borrowtypes);

        return "redirect:viewAllBorrowTypes";
    }

    //删除借款类型
    @RequestMapping("/deleteBorrowTypes")
    public String deleteBorrowTypes(Integer id){

        borrowTypesService.deleteBorrowTypes(id);

        return "redirect:viewAllBorrowTypes";
    }

}
 
  