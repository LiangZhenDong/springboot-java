package com.xr.demo2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xr.demo2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User selectUserByUname(String uname);

}
