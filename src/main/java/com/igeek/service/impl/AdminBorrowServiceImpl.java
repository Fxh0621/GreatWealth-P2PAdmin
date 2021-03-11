package com.igeek.service.impl;

import com.github.pagehelper.PageHelper;
import com.igeek.entity.Admin;
import com.igeek.entity.Userborrow;
import com.igeek.mapper.UserMapper;
import com.igeek.service.AdminBorrowService;
import com.igeek.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/3/1 0001 18:27
 */
@Service
public class AdminBorrowServiceImpl implements AdminBorrowService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<Userborrow> selectBorrowTypes(Integer page, Integer limit) {
        PageHelper.startPage(page,9);
        List<Userborrow> userborrows = userMapper.selectBorrow();
        com.github.pagehelper.PageInfo<Userborrow> pages = new com.github.pagehelper.PageInfo<>(userborrows);
        PageInfo<Userborrow> info = new PageInfo<>();
        info.setPage(page);
        info.setTotal((int) pages.getTotal());
        info.setData(pages.getList());
        info.setLimit(limit);
        info.setTotalPage(pages.getPages());
        return info;
    }
}
 
  