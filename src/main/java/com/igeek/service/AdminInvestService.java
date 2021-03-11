package com.igeek.service;



import com.igeek.entity.User;
import com.igeek.entity.Userinvest;
import com.igeek.utils.PageInfo;

import java.util.List;

public interface AdminInvestService {

    //获取投资页面的值
    public PageInfo<Userinvest> selectInvestTypes(Integer page, Integer limit);

}
