package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/helloController")
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "gridTest";
	}


}
