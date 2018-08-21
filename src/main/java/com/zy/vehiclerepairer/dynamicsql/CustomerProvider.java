package com.zy.vehiclerepairer.dynamicsql;

import java.util.Map;

public class CustomerProvider {
    public String listCarRegister(Map<String, Object> sqlMap) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT id,mark,type,factory,name,mobile,address,createTime,createBy FROM CarRegister WHERE mobile=");
        sql.append(" WHERE mobile=" + sqlMap.get("mobile"));

        //姓名
        if (sqlMap.get("name") != null) {
            sql.append(String.format("AND name %s", sqlMap.get("name").toString()));
        }
        //车牌号
        if (sqlMap.get("plateNumber") != null) {
            sql.append(String.format("AND plateNumber %s", sqlMap.get("plateNumber").toString()));
        }

        return sql.toString();
    }
}
