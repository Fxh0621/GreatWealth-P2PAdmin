package com.igeek.service;

import com.igeek.entity.Userborrow;
import com.igeek.utils.PageInfo;

import java.util.List;

public interface AdminBorrowService {

    public PageInfo<Userborrow> selectBorrowTypes(Integer page, Integer limit);

}
