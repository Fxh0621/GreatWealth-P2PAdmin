package com.igeek.service.impl;

import com.github.pagehelper.PageHelper;
import com.igeek.entity.Investtypes;
import com.igeek.mapper.InvesttypesMapper;
import com.igeek.service.InvestTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description TODO
 * @Author fuxiaohai
 * @Date 2021/3/22 0022 20:27
 */
@Service
@Transactional
public class InvestTypesServiceImpl implements InvestTypesService {

    @Autowired
    private InvesttypesMapper investtypesMapper;

    @Override
    public List<Investtypes> findInvestTypes(int pageNum,int pageSize) {

        PageHelper.startPage(pageNum,pageSize);

        List<Investtypes> investtypes = investtypesMapper.selectAll();
        return investtypes;
    }

    @Override
    public void insertInvestTypes(Investtypes investtypes) {
        investtypesMapper.insert(investtypes);

    }

    //修改投资类型界面
    @Override
    public void updateInvestTypes(Investtypes investtypes) {
      investtypesMapper.updateByPrimaryKey(investtypes);
    }

    @Override
    public void deleteInvestTypes(Integer investtypesid) {
        investtypesMapper.deleteByPrimaryKey(investtypesid);
    }

    @Override
    public Investtypes getInvestTypesById(Integer investtypesid) {
        Investtypes investtypes = investtypesMapper.selectByPrimaryKey(investtypesid);
        return investtypes;
    }
}
 
  