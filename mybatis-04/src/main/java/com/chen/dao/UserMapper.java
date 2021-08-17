package com.chen.dao;

import com.chen.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    User getUserById(int id);

    @Select("select * from user")
    List<User> getUsers();

}
