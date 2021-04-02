package com.igeek.controller;

import com.github.pagehelper.PageInfo;
import com.igeek.entity.Investtypes;
import com.igeek.service.InvestTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/3/22 0022 20:33
 */
@Controller
public class InvestTypesController {

    @Autowired
    private InvestTypesService investTypesService;

    //展示投资类型的数据
    @RequestMapping("/viewInvestTypes")
    public String viewInvestTypes(@RequestParam(value = "pageNum",required = true,defaultValue = "1") int pageNum,
                                  @RequestParam(value = "pageSize",required = true,defaultValue = "9")int pageSize,
                                  Model model){
        List<Investtypes> investTypes = investTypesService.findInvestTypes(pageNum, pageSize);

        PageInfo<Investtypes> pageInfo = new PageInfo<>(investTypes);
        model.addAttribute("pageInfo",pageInfo);
        return "investTypes";
    }

    //添加投资类型
    @RequestMapping("/addInvestTypes")
    public String addInvestTypes(Investtypes investtypes){
        investTypesService.insertInvestTypes(investtypes);
        return "redirect:viewInvestTypes";
    }

    //通过id获得修改对象
    @RequestMapping("/viewInvestTypesById")
    public String viewInvestTypesById(Integer investtypesid,Model model){

        Investtypes investtypes = investTypesService.getInvestTypesById(investtypesid);

        model.addAttribute("investtypes",investtypes);

        return "investTypesUpdate";
    }

    //修改投资类型
    @RequestMapping("/updateInvestTypes")
    public String updateInvestTypes(Investtypes investtypes){
        investTypesService.updateInvestTypes(investtypes);
        return "redirect:viewInvestTypes";
    }

    //删除投资类型
    @RequestMapping("/deleteInvestTypes")
    public String deleteInvestTypes(int id){
        investTypesService.deleteInvestTypes(id);
        return "redirect:viewInvestTypes";
    }

}
 
  