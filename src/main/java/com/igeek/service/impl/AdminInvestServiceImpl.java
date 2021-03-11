package com.igeek.service.impl;


import com.github.pagehelper.PageHelper;
import com.igeek.entity.Admin;
import com.igeek.entity.User;
import com.igeek.entity.Userinvest;
import com.igeek.mapper.UserMapper;
import com.igeek.service.AdminInvestService;
import com.igeek.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/3/1 0001 10:35
 */
@Service
public class AdminInvestServiceImpl implements AdminInvestService {

    @Autowired
    private UserMapper userMapper;

//    @Override
    public PageInfo<Userinvest> selectInvestTypes(Integer page, Integer limit) {
        PageHelper.startPage(page,9);
        List<Userinvest> userinvests = userMapper.selectInvest();
        com.github.pagehelper.PageInfo<Userinvest> pages = new com.github.pagehelper.PageInfo<>(userinvests);
        PageInfo<Userinvest> info = new PageInfo<>();
        info.setPage(page);
        info.setTotal((int) pages.getTotal());
        info.setData(pages.getList());
        info.setLimit(limit);
        info.setTotalPage(pages.getPages());
        return info;
    }
}
 
  