package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by TYL on 2017/5/22.
 */

public class Province extends DataSupport {
    private int  id;
    private String  provinceName;
    private int provincecCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvincecCode() {
        return provincecCode;
    }

    public void setProvincecCode(int provincecCode) {
        this.provincecCode = provincecCode;
    }
}
