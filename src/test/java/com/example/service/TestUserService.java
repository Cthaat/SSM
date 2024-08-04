package com.example.service;

import com.example.config.SpringConfig;
import com.example.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description: service
 * @ClassName: UserService
 * @Author: Edge
 * @Date: 2024/8/4 13:08
 * @Version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (classes = SpringConfig.class)
public class TestUserService
{
    @Autowired
    private UserService userService;

    @Test
    public void testGetById()
    {
        User user = userService.getById(1);
        System.out.println(user);
    }
}
