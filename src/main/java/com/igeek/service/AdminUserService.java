package com.igeek.service;

import com.igeek.entity.User;
import com.igeek.utils.PageInfo;

import java.util.List;

public interface AdminUserService {

    //查询所有的用户
    public PageInfo<User> selectAllUser(Integer page, Integer limit);

}
