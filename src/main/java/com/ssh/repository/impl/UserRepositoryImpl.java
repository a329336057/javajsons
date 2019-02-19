package com.ssh.repository.impl;

import com.ssh.entity.Admin;
import com.ssh.entity.User;
import com.ssh.repository.UserRepository;
import org.hibernate.*;
import org.hibernate.transform.Transformers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

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
    public Query zhuce(HashMap map){

        String username= (String) map.get("username");
        String password= (String) map.get("password");
        String sql="SELECT * FROM admin WHERE username='"+username+"'";
        Query query= getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        return query;
    }

    @Override
    public void xiugai(HashMap map) {
//
//        List<HashMap<String,Object>> list;
//        String username= (String) map.get("username");
//        String sql="SELECT * FROM admin WHERE username='"+username+"'";
//        Query query= getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//        list=query.list();
//        Transaction transaction = getCurrentSession().beginTransaction();
//        Integer id=(Integer) list.get(0).get("id");
//
//        Admin admin=(Admin)getCurrentSession().get(Admin.class,id);
//        admin.setEamll((String) map.get("emall"));
//        admin.setNickname("sba");
//        getCurrentSession().update(admin);
//      //  getCurrentSession().saveOrUpdate(admin);
//        getCurrentSession().flush();
//        transaction.commit();
//
//        getCurrentSession().close();


        Transaction transaction = getCurrentSession().beginTransaction();
        //创建 HQL
        String hqlString = "update Admin p set p.eamll=?, p.nickname=? where p.id=?";
        //构建 Query
        Query query = getCurrentSession().createQuery(hqlString);
        //设置参数
        query.setParameter(0, "肖东");
        query.setParameter(1, "asdadada");
        query.setParameter(2, 2);
        //更新
        query.executeUpdate();
        transaction.commit();
        getCurrentSession().close();

    }

    @Override
    public void adduser(HashMap map) {

        Transaction tx=getCurrentSession().beginTransaction();
        Admin user=new Admin();

        user.setUsername((String)map.get("username"));
        user.setNickname((String)map.get("nickname"));
        user.setPassword((String)map.get("password"));
        user.setEamll((String)map.get("emall"));
        getCurrentSession().save(user);
        tx.commit();
        getCurrentSession().close();
//        user.setUserName((String) map.get("nickname"));
//        user.setUserName((String) map.get("emall"));
//        user.setUserName((String) map.get("password"));
//        getCurrentSession().save(user);
    }

}
