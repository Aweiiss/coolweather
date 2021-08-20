package com.coolweather.android.db;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

/**
 * @author: Administrator
 * @date: 2021/8/20
 */
public class Province extends LitePalSupport {
    //运用注解来为字段添加index标签

    private int id;
    //name是唯一的，且默认值为unknown
    @Column(unique = true, defaultValue = "unknown")
    private String provinceName;
    private int provinceCode;

    //记得添加所有字段的getter和setter方法
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }





}
