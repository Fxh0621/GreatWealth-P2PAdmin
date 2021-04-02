package com.igeek.service.impl;

import com.github.pagehelper.PageHelper;
import com.igeek.entity.Borrowtypes;
import com.igeek.mapper.BorrowtypesMapper;
import com.igeek.service.BorrowTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/3/23 0023 18:47
 */
@Service
@Transactional
public class BorrowTypesServiceImpl implements BorrowTypesService {

    @Autowired
    private BorrowtypesMapper borrowtypesMapper;

    @Override
    public List<Borrowtypes> findAllBorrowTypes(int pageNum,int pageSize) {

        PageHelper.startPage(pageNum, pageSize);

        List<Borrowtypes> borrowtypes = borrowtypesMapper.selectAll();
        return borrowtypes;
    }

    @Override
    public void insertBorrowTypes(Borrowtypes borrowtypes) {

        borrowtypesMapper.insert(borrowtypes);

    }

    @Override
    public void updateBorrowTypes(Borrowtypes borrowtypes) {

        borrowtypesMapper.updateByPrimaryKey(borrowtypes);
    }

    @Override
    public void deleteBorrowTypes(int id) {
       borrowtypesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Borrowtypes getBorrow(Integer borrowid) {

        Borrowtypes borrowtypes = borrowtypesMapper.selectByPrimaryKey(borrowid);
        return borrowtypes;
    }
}
 
  