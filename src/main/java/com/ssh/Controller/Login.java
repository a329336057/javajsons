package com.ssh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public  void Logins(@RequestParam String username,@RequestParam String password){
        String d=username;
        String p=password;
        System.out.print(d+"  or  "+p);
    }
}
