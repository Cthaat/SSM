package com.example.config;


import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;

/**
 * @Description: batis
 * @ClassName: MyBatisConfig
 * @Author: Edge
 * @Date: 2024/8/3 23:03
 * @Version: 1.0
 */
public class MyBatisConfig
{
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory()
    {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    }
}
