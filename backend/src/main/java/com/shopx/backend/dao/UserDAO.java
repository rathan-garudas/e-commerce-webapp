package com.shopx.backend.dao;

import com.shopx.backend.entity.User;

public interface UserDAO {
    public User findByName(String name);
    public void add(User user);
}
