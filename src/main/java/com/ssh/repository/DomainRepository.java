package com.ssh.repository;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * 这个接口定义一些十分通用的方法
 * Created by XRom
 * On 11/16/2017.11:52 PM
 */
public interface DomainRepository<T, s> {
    T load(s id);
    T get(s id);

    List<T> findAll();

    void persist(T entity);

    s save(T entity); //添加

    void saveOrUpdate(T entity); //添加更新

    void delete(s id);//删除某个ID

    void flush(); //清空

    s login(HashMap map);

}
