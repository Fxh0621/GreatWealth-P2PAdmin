package com.igeek.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.igeek.entity.Admin;
import com.igeek.mapper.AdminMapper;
import com.igeek.service.AdminPowerService;
import com.igeek.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/2/27 0027 9:32
 */
@Service
public class AdminPowerServiceImpl implements AdminPowerService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public PageInfo<Admin> selectAllAdmins(Integer page, Integer limit) {
       PageHelper.startPage(page,9);
       List<Admin> admins =  adminMapper.selectAll();
       com.github.pagehelper.PageInfo<Admin> pages = new com.github.pagehelper.PageInfo<>(admins);
       PageInfo<Admin> info = new PageInfo<>();
       info.setPage(page);
       info.setTotal((int) pages.getTotal());
       info.setData(pages.getList());
       info.setLimit(limit);
       info.setTotalPage(pages.getPages());
       return info;
    }

    @Override
    @Transactional
    public int insertAdmin(Admin admin) {
        int i = adminMapper.insert(admin);
        return i;
    }

    @Override
    @Transactional
    public int updateAdmin(Admin admin) {
        int i = adminMapper.updateByPrimaryKey(admin);
        return i;
    }

    @Override
    @Transactional
    public int deleteAdmin(Integer id) {
        int i = adminMapper.deleteByPrimaryKey(id);
        return i;
    }
}
 
  