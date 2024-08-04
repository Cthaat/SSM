package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public boolean save(User user)
    {
        return userService.save(user);
    }

    @PutMapping
    public boolean update(User user)
    {
        return userService.update(user);
    }

    @DeleteMapping
    public boolean delete(int id)
    {
        return userService.delete(id);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id)
    {
        return userService.getById(id);
    }

    @GetMapping
    public List<User> getAll()
    {
        return userService.getAll();
    }
}
