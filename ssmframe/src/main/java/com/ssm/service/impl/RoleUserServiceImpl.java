package com.ssm.service.impl;

import com.ssm.dao.RoleUserDao;
import com.ssm.pojo.RoleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.service.RoleUserService;

import java.util.List;

@Service
public class RoleUserServiceImpl implements RoleUserService {

    @Autowired
    RoleUserDao dao;
    @Override
    public List<RoleUser> allQuery() {
        return dao.allQuery();
    }
}
