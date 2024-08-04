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
    public Result save(User user)
    {
        boolean flag = userService.save(user);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR , flag);
    }

    @PutMapping
    public Result update(User user)
    {
        boolean flag = userService.update(user);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR , flag);
    }

    @DeleteMapping
    public Result delete(int id)
    {
        boolean flag = userService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR , flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable int id)
    {
        User user = userService.getById(id);
        Integer code = user == null ? Code.GET_ERR : Code.GET_OK;
        String msg = user == null ? "User not found" : "User found";
        return new Result(code, user, msg);
    }

    @GetMapping
    public Result getAll()
    {
        List<User> users = userService.getAll();
        Integer code = users == null || users.isEmpty() ? Code.GET_ERR : Code.GET_OK;
        String msg = users == null || users.isEmpty() ? "User not found" : "User found";
        return new Result(code, users, msg);
    }
}
