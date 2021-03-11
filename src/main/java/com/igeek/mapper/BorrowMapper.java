package com.igeek.mapper;

import com.igeek.entity.Borrow;
import java.util.List;

public interface BorrowMapper {
    int deleteByPrimaryKey(Integer borrowid);

    int insert(Borrow record);

    Borrow selectByPrimaryKey(Integer borrowid);

    List<Borrow> selectAll();

    int updateByPrimaryKey(Borrow record);
}