package com.ssh.Controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ssh.entity.User;

import com.ssh.tool.Signature;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class MainController {

    @Autowired(required=true)

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
        System.out.print("sadadada");
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        return "test";

    }


    @RequestMapping(value = "/savePerson", method = RequestMethod.GET)
    @ResponseBody
    public String savePerson() {

        return "success!";
    }
    @RequestMapping(value ="/maps",method = RequestMethod.GET)
    public void dag(HttpServletRequest request, HttpServletResponse response) throws IOException {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code","1");
        jsonObject.put("message","成功");
        ArrayList<HashMap<String,String>> hashMaps=new ArrayList<HashMap<String, String>>();
        HashMap<String,String> ad=new HashMap<String, String>();
        ad.put("id","12313");
        ad.put("name","wanzhenyuan");
        jsonObject.put("data",ad);

        response.getWriter().write(jsonObject.toString());
    }
}
