package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.exception.BusinessException;
import com.example.exception.SystemException;
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
        userDao.save(user);
        return true;
    }

    @Override
    public boolean update(User user)
    {
        userDao.update(user);
        return true;
    }

    @Override
    public boolean delete(int id)
    {
        userDao.delete(id);
        return true;
    }

    @Override
    public User getById(int id)
    {
        if (id == 0)
        {
            throw new BusinessException(666 , "id不能为0" , null);
        }
        try
        {
            int i = 1 / 0;
        }
        catch (ArithmeticException e)
        {
            throw new SystemException(666 , "除数不能为0" , e);
        }

        return userDao.getById(id);
    }

    @Override
    public List<User> getAll()
    {
        return userDao.getAll();
    }
}
