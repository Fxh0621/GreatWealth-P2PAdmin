package com.igeek.service;

import com.igeek.entity.Investtypes;

import java.util.List;

public interface InvestTypesService {

    //查询所有的投资类型
    List<Investtypes> findInvestTypes(int pageNum,int pageSize);

    //添加投资类型
    void insertInvestTypes(Investtypes investtypes);

    //修改投资类型
    void updateInvestTypes(Investtypes investtypes);

    //删除投资类型
    void deleteInvestTypes(Integer investtypesid);

    //通过investtypesid获得对象
    Investtypes getInvestTypesById(Integer investtypesid);
}
