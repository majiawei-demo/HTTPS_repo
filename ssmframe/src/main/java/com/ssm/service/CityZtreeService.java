package com.ssm.service;

import com.ssm.pojo.CityZtree;

import java.util.List;
import java.util.Map;

public interface CityZtreeService {

    List<CityZtree> findByParentId(String parentId);

    List<Map<String,Object>> getParent(List<CityZtree> list,String parentId);

    boolean hasChild(String id);

    void DeleteCityServlet(String id);

    int updateCity(String id,String name);
}
