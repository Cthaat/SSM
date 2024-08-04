package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: controller
 * @ClassName: UserController
 * @Author: Edge
 * @Date: 2024/8/3 23:33
 * @Version: 1.0
 */

@RestController
@RequestMapping ("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    public boolean save(User user)
    {
        return userService.save(user);
    }

    public boolean update(User user)
    {
        return userService.update(user);
    }

    public boolean delete(int id)
    {
        return userService.delete(id);
    }

    public User getById(int id)
    {
        return userService.getById(id);
    }

    public List<User> getAll()
    {
        return userService.getAll();
    }
}
