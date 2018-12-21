package com.example.controller;
import com.alibaba.fastjson.JSON;
import com.example.entity.DataResult;
import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/userController")
public class UserController {

    @ResponseBody
    @RequestMapping("/getUserList")
    public String getUserList(HttpServletRequest request){
        List<User> list = new ArrayList<User>();
        for(int i=0;i<10;i++){
            User user = new User();
            user.setUserName("name"+i+1);
            user.setPassword("password"+i);
            list.add(user);
        }
        DataResult result = new DataResult();
        return result.dataToResult(list);
    }
}
