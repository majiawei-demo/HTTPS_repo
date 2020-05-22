package com.ssm.pojo;

import java.io.Serializable;

public class RoleUser implements Serializable {
    private Integer id;
    private String age;
    private String sex;
    private String phone;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }
    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "RoleUser{" +
                "id=" + id +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
