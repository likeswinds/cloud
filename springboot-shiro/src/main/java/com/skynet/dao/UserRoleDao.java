package com.skynet.dao;

import com.skynet.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2016-11-23.
 */
@Mapper
public interface UserRoleDao {
    @Select("select *from t_user_role")
    @Results({
            @Result(id=true,property="userId",column="user_id"),
            @Result(id=true,property="roleId",column="role_id"),
    })
    List<UserRole> findAll();

    @Select("select *from t_user_role where userId=#{userId}")
    @Results({
            @Result(id=true,property="userId",column="user_id"),
            @Result(id=true,property="roleId",column="role_id"),
    })
    List<UserRole> findByUserID(String userId);

    @Select("select *from t_user_role where roleId=#{roleId}")
    @Results({
            @Result(id=true,property="userId",column="user_id"),
            @Result(id=true,property="roleId",column="role_id"),
    })
    List<UserRole> findByRoleID(String roleId);

}
