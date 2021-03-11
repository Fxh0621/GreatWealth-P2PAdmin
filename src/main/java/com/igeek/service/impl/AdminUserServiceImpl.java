package com.igeek.service.impl;

import com.github.pagehelper.PageHelper;
import com.igeek.entity.Admin;
import com.igeek.entity.User;
import com.igeek.mapper.UserMapper;
import com.igeek.service.AdminUserService;
import com.igeek.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/2/27 0027 10:38
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public PageInfo<User> selectAllUser(Integer page, Integer limit) {
        PageHelper.startPage(page,9);
        List<User> users = userMapper.selectAll();
        com.github.pagehelper.PageInfo<User> pages = new com.github.pagehelper.PageInfo<>(users);
        PageInfo<User> info = new PageInfo<>();
        info.setPage(page);
        info.setTotal((int) pages.getTotal());
        info.setData(pages.getList());
        info.setLimit(limit);
        info.setTotalPage(pages.getPages());
        return info;
    }
}
 
  