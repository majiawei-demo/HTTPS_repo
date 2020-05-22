package com.ssm.controller;

import com.ssm.pojo.RoleUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
@Controller
@ResponseBody
@RequestMapping("/returnEntity")
public class ReturnEntityController {

    @RequestMapping("/getList")
    public List<RoleUser> getList(){
        RoleUser user1 = new RoleUser();
        user1.setAge("11");
        user1.setId(1);
        user1.setPhone("1111111");
        user1.setSex("111");
        RoleUser user2 = new RoleUser();
        user2.setAge("22");
        user2.setId(2);
        user2.setPhone("2222222");
        user2.setSex("22");
        RoleUser user3 = new RoleUser();
        user3.setAge("33");
        user3.setId(3);
        user3.setPhone("3333333");
        user3.setSex("33");
        List<RoleUser> roleUserList = new ArrayList<>();
        roleUserList.add(user1);
        roleUserList.add(user2);
        roleUserList.add(user3);
        return roleUserList;
    }
}
