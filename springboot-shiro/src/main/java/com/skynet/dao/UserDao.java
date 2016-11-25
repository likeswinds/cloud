package com.skynet.dao;

import com.skynet.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2016-11-22.
 */
@Mapper
public interface UserDao {
    @Select("select *from t_user")
     List<User> findAll();

    @Select("select *from t_user where username=#{username}")
     User findByName(String username);


}
