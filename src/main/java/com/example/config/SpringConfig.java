package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description: config
 * @ClassName: SpringConfig
 * @Author: Edge
 * @Date: 2024/8/3 23:01
 * @Version: 1.0
 */

@Configuration
@ComponentScan ({"com.example.service" , "com.example.dao"})
@PropertySource ("classpath:jdbc.properties")
@Import({JdbcConfig.class, MyBatisConfig.class})
public class SpringConfig
{
}
