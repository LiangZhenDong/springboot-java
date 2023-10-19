package com.xr.demo2.service;

import com.xr.demo2.entity.User;

public interface UserService {

    String loginService(String uname, String password);

    String registerService(User user);

}
