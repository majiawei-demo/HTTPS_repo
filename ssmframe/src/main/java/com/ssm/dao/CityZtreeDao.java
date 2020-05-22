package com.ssm.dao;

import com.ssm.pojo.CityZtree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CityZtreeDao {

    /**
     * 根据父id查找树
     * @param parentId
     * @return
     */
    List<CityZtree> cityZtreeByParentIdQuery(String parentId);

    /**
     * 判断当前节点是否还有子节点
     * @param id
     * @return
     */
    Integer hasChild(String id);

    /**
     * 更具id删除节点
     * @param id
     * @return
     */
    void DeleteCityServlet(String id);

    int updateCity(@Param(value = "id") String id,@Param(value = "cityName") String name);
}
