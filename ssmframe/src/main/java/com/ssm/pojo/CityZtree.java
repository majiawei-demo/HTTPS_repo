package com.ssm.pojo;

import java.io.Serializable;

public class CityZtree implements Serializable {
    private String id;
    private String cityName;
    private String parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "CityZtree{" +
                "id='" + id + '\'' +
                ", cityName='" + cityName + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
