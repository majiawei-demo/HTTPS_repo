package com.ssm.controller;

import com.ssm.pojo.RoleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ssm.service.RoleUserService;

import java.util.List;

@Controller
public class RoleUserController {

    @Autowired
    RoleUserService service;

    @RequestMapping("/allQuery")
    @ResponseBody
    public List<RoleUser> allQuery(){
        return service.allQuery();
    }
}
