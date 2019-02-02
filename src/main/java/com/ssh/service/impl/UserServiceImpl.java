package com.ssh.service.impl;

import com.ssh.entity.Person;
import com.ssh.entity.User;
import com.ssh.repository.PersonRepository;
import com.ssh.repository.UserRepository;
import com.ssh.service.LoginService;
import com.ssh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by XRom
 * On 11/16/2017.11:58 PM
 */
@Service
public class UserServiceImpl implements LoginService {

    @Autowired(required = true)
    private UserRepository userRepository; //调用封装好的dao层方法


    @Override
    public String Userlogin(HashMap map) {


         return  userRepository.login(map);
    }
}
