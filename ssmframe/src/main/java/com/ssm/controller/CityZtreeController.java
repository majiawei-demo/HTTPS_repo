package com.ssm.controller;

import com.ssm.pojo.CityZtree;
import com.ssm.service.CityZtreeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/ztree")
public class CityZtreeController {

    @Autowired
    private CityZtreeService cityZtreeService;

    /**
     * 查询
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/getCityZtree")
    public Object getCityZtree(HttpServletRequest request, HttpServletResponse response){
        String parendId = request.getParameter("parentId");
        System.out.println(parendId);
        List<CityZtree> cityZtreeList = new ArrayList<>();
        cityZtreeList = cityZtreeService.findByParentId(parendId);
        return  cityZtreeService.getParent(cityZtreeList,parendId);
    }

    /**
     * 删除
     * @param request
     */
    @RequestMapping("/deleteCityServlet")
    public void DeleteCityServlet(HttpServletRequest request){
        String id = request.getParameter("id");
        cityZtreeService.DeleteCityServlet(id);
    }

    /**
     * 修改
     * @param request
     */
    @RequestMapping("/updateCity")
    public void updateCity(HttpServletRequest request) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int i = cityZtreeService.updateCity(id, name);
        System.out.println(i);
    }
}
