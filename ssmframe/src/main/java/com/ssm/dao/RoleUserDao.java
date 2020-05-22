package com.ssm.dao;

import com.ssm.pojo.RoleUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleUserDao {
    List<RoleUser> allQuery();
}
