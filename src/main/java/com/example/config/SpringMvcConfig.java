package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Description: MVC
 * @ClassName: SpringMvcConfig
 * @Author: Edge
 * @Date: 2024/8/3 23:21
 * @Version: 1.0
 */

@Configuration
@ComponentScan({"com.example.controller" , "com.example.config"})
@EnableWebMvc
public class SpringMvcConfig
{
}