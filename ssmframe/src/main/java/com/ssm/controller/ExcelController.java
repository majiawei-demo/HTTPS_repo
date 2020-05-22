package com.ssm.controller;

import com.ssm.pojo.ExcelData;
import com.ssm.utils.ExportExcelUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ExcelController {

    @RequestMapping("/excel")
    public void excel(HttpServletResponse response) throws Exception {
        ExcelData data = new ExcelData();
        data.setName("hello");
        List<String> titles = new ArrayList();
        titles.add("姓名");
        titles.add("性别");
        titles.add("年龄");
        titles.add("手机号");
        data.setTitles(titles);
        List<List<Object>> rows = new ArrayList();
        List<Object> row1 = new ArrayList();
        row1.add("张三");
        row1.add("男");
        row1.add("23");
        row1.add("18612341234");
        List<Object> row2 = new ArrayList();
        row2.add("李四");
        row2.add("女");
        row2.add("24");
        row2.add("15312341234");
        rows.add(row1);
        rows.add(row2);
        data.setRows(rows);
        ExportExcelUtils.exportExcel(response,"联系人表.xlsx",data);
        System.out.println(data);
    }
}
