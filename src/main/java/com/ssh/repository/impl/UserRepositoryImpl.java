package com.ssh.repository.impl;

import com.ssh.entity.User;
import com.ssh.repository.UserRepository;
import com.sun.javafx.util.Logging;
import org.hibernate.*;
import org.hibernate.transform.Transformers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.dsig.Transform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by XRom
 * On 11/16/2017.11:55 PM
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private SessionFactory sessionFactory;
    private  Session getCurrentSession(){return this.sessionFactory.openSession();}


    @Override
    public Query login(HashMap map) {
        String g="";
        String username= (String) map.get("username");
        String password= (String) map.get("password");
        String sql="SELECT * FROM user WHERE user_name='"+username+"' AND user_pass='"+password+"'";
        Query query= getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        return query;
    }
}
