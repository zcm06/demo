package com.example.controller;
import com.alibaba.fastjson.JSON;
import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/userController")
public class UserController {

    @ResponseBody
    @RequestMapping("/getUserList")
    public String getUserList(){
        List<User> list = new ArrayList<User>();
        for(int i=0;i<10;i++){
            User user = new User();
            user.setUserName("name"+i);
            user.setPassword("password"+i);
            list.add(user);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("data",list);
        map.put("code",0);
        map.put("msg","获取成功！");
        map.put("count",list.size());
        String listStr = JSON.toJSONString(map);
        return listStr;
    }
}
