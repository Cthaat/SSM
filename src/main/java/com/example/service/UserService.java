package com.example.service;

import com.example.domain.User;

import java.util.List;

/**
 * @Description: service
 * @ClassName: UserService
 * @Author: Edge
 * @Date: 2024/8/3 23:32
 * @Version: 1.0
 */
public interface UserService
{
    public boolean save(User user);

    public boolean update(User user);

    public boolean delete(int id);

    public User getById(int id);

    public List<User> getAll();
}
