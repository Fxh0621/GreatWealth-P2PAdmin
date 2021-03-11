package com.igeek.mapper;

import com.igeek.entity.Investtypes;
import com.igeek.entity.User;
import com.igeek.entity.Userborrow;
import com.igeek.entity.Userinvest;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    User selectByPrimaryKey(Integer userid);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    List<Userinvest> selectInvest();

    List<Userborrow> selectBorrow();
}