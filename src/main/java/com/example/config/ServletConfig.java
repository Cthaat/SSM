package com.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Description: servlet
 * @ClassName: ServletConfig
 * @Author: Edge
 * @Date: 2024/8/3 23:20
 * @Version: 1.0
 */
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{

    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings()
    {
        return new String[0];
    }
}
