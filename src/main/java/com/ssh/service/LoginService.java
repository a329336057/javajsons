package com.ssh.service;

import com.ssh.entity.User;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public interface LoginService{

    JSONObject Userlogin(HashMap map);
    JSONObject Register(HashMap map);
}
