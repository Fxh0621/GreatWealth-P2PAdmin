package com.igeek.service.impl;

import com.igeek.entity.Admin;
import com.igeek.mapper.AdminMapper;
import com.igeek.service.AdminManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/2/26 0026 10:57
 */
@Service
public class AdminManagerServiceImpl implements AdminManagerService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin selectAdmin(String username, String password) {
        Admin admin = adminMapper.selectByUsernameAndPassword(username, password);
        return null;
    }
}
 
  