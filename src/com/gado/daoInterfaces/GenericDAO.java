/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gado.daoInterfaces;

import java.util.List;

/**
 *
 * @author User
 */
public interface GenericDAO<T> {
    public void save(T t);
    public void update(T t);
    public void remove(Class<T> clazz, Integer id);
    public List<T> FindALL(String clazz);
    public T findByID(Class<T> clazz, Integer id);    
}
