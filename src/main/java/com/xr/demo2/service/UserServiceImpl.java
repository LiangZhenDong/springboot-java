package com.xr.demo2.service;

import com.xr.demo2.entity.User;
import com.xr.demo2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String loginService(String uname, String password) {
        User user1 = userMapper.selectUserByUname(uname);
        if (user1 != null) {
            if (user1.getPassword().equals(password)) {
                return "SUCCESS";
            } else {
                return "ERROR";
            }
        }

        return "该账号未注册";
    }

    @Override
    public String registerService(User user) {
        User user2 = userMapper.selectUserByUname(user.getUname());
        if (user2 == null) {
            userMapper.insert(user2);
            return "注册成功";
        }

        return "该账号已注册";
    }

}
