package com.igeek.mapper;

import com.igeek.entity.Invest;
import java.util.List;

public interface InvestMapper {
    int deleteByPrimaryKey(Integer investid);

    int insert(Invest record);

    Invest selectByPrimaryKey(Integer investid);

    List<Invest> selectAll();

    int updateByPrimaryKey(Invest record);
}