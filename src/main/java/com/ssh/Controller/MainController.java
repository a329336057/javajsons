package com.ssh.Controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired(required=true)
    private PersonService personService;
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
        System.out.print("sadadada");
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        return "test";

    }


    @RequestMapping(value = "/savePerson", method = RequestMethod.GET)
    @ResponseBody
    public String savePerson() {
        personService.savePerson();
        return "success!";
    }
}
