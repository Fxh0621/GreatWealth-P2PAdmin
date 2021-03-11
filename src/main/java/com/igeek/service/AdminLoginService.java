package com.igeek.service;

import com.igeek.entity.Admin;

public interface AdminLoginService {

    public Admin selectByNameAndPwd(String username,String password);

}
