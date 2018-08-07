package com.zy.vehiclerepairer.dynamicsql;

import java.util.Map;

public class CarRegisterProvider {
    public String listCarRegister(Map<String, Object> sqlMap) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT id,mark,type,factory,name,mobile,address,createTime,createBy FROM CarRegister WHERE mobile=");
        sql.append(" WHERE mobile=" + sqlMap.get("mobile"));

        //姓名
        if (sqlMap.get("name") != null) {
            sql.append(String.format("AND name %s", sqlMap.get("name").toString()));
        }
        //车牌号
        if (sqlMap.get("mark") != null) {
            sql.append(String.format("AND mark %s", sqlMap.get("mark").toString()));
        }

        if (sqlMap.get("pageIndex") != null && Integer.valueOf(sqlMap.get("pageIndex").toString()) > 0) {
            int pageIndex = Integer.valueOf(sqlMap.get("pageIndex").toString());
            int pageSize = Integer.valueOf(sqlMap.get("pageSize").toString());
            int rows = (pageIndex - 1) * pageSize;
            sql.append(String.format(" limit %d,%d ", pageSize, rows));
        }

        return sql.toString();
    }
}
