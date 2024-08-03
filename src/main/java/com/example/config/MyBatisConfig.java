package com.example.config;


import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

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
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource)
    {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.example.domain");
        return sqlSessionFactoryBean;
    }
}
