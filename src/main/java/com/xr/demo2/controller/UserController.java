package com.xr.demo2.controller;


import com.xr.demo2.service.UserServiceImpl;
import com.xr.demo2.utils.Result;
import com.xr.demo2.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/login")
    public Result<String> login(String uname, String password) {

        String msg = userService.loginService(uname, password);
        if ("SUCCESS".equals(msg)) {
            return ResultUtil.success("登录成功");
        } else {
            return ResultUtil.error(msg);
        }


    }


}
