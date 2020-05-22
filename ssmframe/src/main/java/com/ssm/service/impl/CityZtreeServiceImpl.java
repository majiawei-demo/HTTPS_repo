package com.ssm.service.impl;


import com.ssm.dao.CityZtreeDao;
import com.ssm.pojo.CityZtree;
import com.ssm.service.CityZtreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CityZtreeServiceImpl implements CityZtreeService {
    @Autowired
    private CityZtreeDao cityZtreeDao;
    @Override
    public List<CityZtree> findByParentId(String parentId) {
/*        System.out.println(parentId);*/
        if (parentId!=null && parentId.length() != 0){
            parentId = parentId;
        }else {
            parentId = "0";
        }
        return cityZtreeDao.cityZtreeByParentIdQuery(parentId);
    }

    @Override
    public boolean hasChild(String id) {
        Integer count = cityZtreeDao.hasChild(id);
        if (count>0){
            return true;
        }
        return false;
    }

    @Override
    public List<Map<String, Object>> getParent(List<CityZtree> list, String parentId) {
        List<Map<String,Object>> rootList = new ArrayList<>();
        for (CityZtree cityZtree:list){
            Map<String,Object> cityMap = new HashMap<>();
            cityMap.put("id",cityZtree.getId());
            cityMap.put("name",cityZtree.getCityName());
            if (parentId != null && parentId.length()!= 0){
                cityMap.put("pId",parentId);
            }else {
                cityMap.put("pId","0");
            }
            if (hasChild(cityZtree.getId())){
                cityMap.put("isParent",true);
            }
            rootList.add(cityMap);
        }
        return rootList;
    }
    @Override
    public void DeleteCityServlet(String id) {
        cityZtreeDao.DeleteCityServlet(id);
    }
    @Override
    public int updateCity(String id, String name) {
        System.out.println(id+name);
        return cityZtreeDao.updateCity(id,name);
    }
}
