package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: impl
 * @ClassName: UserServiceImpl
 * @Author: Edge
 * @Date: 2024/8/3 23:32
 * @Version: 1.0
 */

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    @Override
    public boolean save(User user)
    {
        return false;
    }

    @Override
    public boolean update(User user)
    {
        return false;
    }

    @Override
    public boolean delete(int id)
    {
        return false;
    }

    @Override
    public User getById(int id)
    {
        return null;
    }

    @Override
    public List<User> getAll()
    {
        return null;
    }
}
