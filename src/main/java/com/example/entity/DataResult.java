package com.example.entity;

import com.alibaba.fastjson.JSON;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DataResult {

    public String dataToResult(Object data){
        return dataToResult(data,"获取成功！");
    }

    public String dataToResult(Object data,String msg){
        Map<String,Object> map = new HashMap<>();
        map.put("data",data);
        map.put("code",0);
        map.put("msg",msg);
        return JSON.toJSONString(map);
    }
}
