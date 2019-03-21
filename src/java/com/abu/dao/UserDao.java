/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abu.dao;

import com.abu.model.User;
import java.util.List;

/**
 *
 * @author khoerulAbu
 */
public interface UserDao {
    
    public void addUser(User user);
    public List<User> getAllUsers();
}
