package com.igeek.service;

import com.igeek.entity.Admin;
import com.igeek.utils.PageInfo;

import java.util.List;

public interface AdminPowerService {

    //查询整个admin表中的数据
    public PageInfo<Admin> selectAllAdmins(Integer page, Integer limit);

    //插入数据
    int insertAdmin(Admin admin);

    //更新用户信息
    int updateAdmin(Admin admin);

    //通过id删除用户信息
    int deleteAdmin(Integer id);

}
