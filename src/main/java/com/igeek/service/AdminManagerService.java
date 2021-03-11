package com.igeek.service;

import com.igeek.entity.Admin;

public interface AdminManagerService {

    public Admin selectAdmin(String username,String password);

}
