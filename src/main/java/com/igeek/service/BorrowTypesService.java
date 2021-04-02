package com.igeek.service;

import com.igeek.entity.Borrowtypes;

import java.util.List;

public interface BorrowTypesService {

    //查询所有的借款类型
    List<Borrowtypes> findAllBorrowTypes(int pageNum,int pageSize);

    //插入借款类型
    void insertBorrowTypes(Borrowtypes borrowtypes);

    //更新借款类型
    void updateBorrowTypes(Borrowtypes borrowtypes);

    //删除借款类型
    void deleteBorrowTypes(int id);

    //通过id查找borrow类型
    Borrowtypes getBorrow(Integer borrowid);

}
