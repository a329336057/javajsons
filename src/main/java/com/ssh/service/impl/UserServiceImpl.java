package com.ssh.service.impl;

import com.ssh.entity.Person;
import com.ssh.entity.User;
import com.ssh.repository.PersonRepository;
import com.ssh.repository.UserRepository;
import com.ssh.service.LoginService;
import com.ssh.service.PersonService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by XRom
 * On 11/16/2017.11:58 PM
 */
@Service
public class UserServiceImpl implements LoginService {
    LoginLastCase loginLastCase;
    @Autowired(required = true)
    private UserRepository userRepository; //调用封装好的dao层方法

    List<HashMap<String,Object>> list;
    HashMap<String,Object> hashMap;
    @Override
    public String Userlogin(HashMap map) {
        Query query =userRepository.login(map);

        list=query.list();

        if(list.size()==0){
            loginLastCase=LoginLastCase.shibai;
        }else {
            if(list.size()>1){
               loginLastCase=LoginLastCase.yichang;

            }else{

                loginLastCase=LoginLastCase.chenggong;

            }
        }


         return  loginjson(loginLastCase,list);
    }

    private String loginjson(LoginLastCase last,List<HashMap<String,Object>> map1) {
        JSONObject jsonObject = new JSONObject();



        switch (last) {

            case shibai:
                jsonObject.put("message", "登陆失败 请确认您的账号或密码");
                jsonObject.put("Code", 302);
                jsonObject.put("reslut", "");
                break;
            case chenggong:
                jsonObject.put("message", "登陆成功");
                jsonObject.put("Code", 200);
                JSONObject admin=new JSONObject();
                Map map=list.get(0);
                admin.put("userid", map.get("user_id"));
                admin.put("username", map.get("user_name"));
                admin.put("password", map.get("user_pass"));
                admin.put("user_nickname", map.get("user_nickname"));
                admin.put("user_email", map.get("user_email"));
                jsonObject.put("reslut", admin);
                break;
            case yichang:
                jsonObject.put("message", "账号异常");
                jsonObject.put("Code", 303);
                jsonObject.put("reslut", "");
                break;

//                for (HashMap map1 : l) {
//                    JSONObject ob = new JSONObject();
//
//                    ob.put("userid", map1.get("user_id"));
//                    ob.put("username", map1.get("user_name"));
//                    ob.put("password", map1.get("user_pass"));
//                    ob.put("user_nickname", map1.get("user_nickname"));
//                    ob.put("user_email", map1.get("user_email"));
//                    s.add(ob);
//                }


        }
        return jsonObject.toString();
    }


enum LoginLastCase{
        chenggong,
        shibai,
    yichang,
    }





}
