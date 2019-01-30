package com.ssh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
        System.out.print("sadadada");
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        return "test";
    }
}
