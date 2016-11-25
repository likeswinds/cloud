package com.skynet.dao;

import com.skynet.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2016-11-23.
 */
@Mapper
public interface RoleDao {
    @Select("select *from t_role")
    List<Role> findAll();

    @Select("select *from t_role where id=#{id}")
    Role findByName(String id);

    @Select("select s.* from t_role s where  id in (select  role_id from t_user t ,t_user_role r where t.id=r.user_id and   t.username=#{username})")
    List<Role> findRoleByUserName(String username);
}
