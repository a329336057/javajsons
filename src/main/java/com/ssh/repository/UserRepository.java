package com.ssh.repository;

import com.ssh.entity.Person;
import com.ssh.entity.User;
import org.hibernate.Query;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by XRom
 * On 11/16/2017.11:54 PM
 */
public interface UserRepository  {
   Query login(HashMap map);
   void adduser(HashMap map);
   Query zhuce(HashMap map);
   void xiugai(HashMap map);
}

