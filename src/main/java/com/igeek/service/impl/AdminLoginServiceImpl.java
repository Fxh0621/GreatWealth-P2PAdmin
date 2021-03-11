package com.igeek.service.impl;

import com.igeek.entity.Admin;
import com.igeek.mapper.AdminMapper;
import com.igeek.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/2/25 0025 15:45
 */
@Service
@Transactional
public class AdminLoginServiceImpl implements AdminLoginService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin selectByNameAndPwd(String username, String password) {
        Admin admin = adminMapper.selectByUsernameAndPassword(username, password);
        return admin;
    }
}
 
  