package com.example.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: in
 * @ClassName: ProjectInterceptor
 * @Author: Edge
 * @Date: 2024/8/4 21:37
 * @Version: 1.0
 */

@Component
public class ProjectInterceptor implements HandlerInterceptor
{
    @Override
    public boolean preHandle(HttpServletRequest request , HttpServletResponse response , Object handler) throws Exception
    {
        System.out.println("ProjectInterceptor preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request , HttpServletResponse response , Object handler , ModelAndView modelAndView) throws Exception
    {
        System.out.println("ProjectInterceptor postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request , HttpServletResponse response , Object handler , Exception ex) throws Exception
    {
        System.out.println("ProjectInterceptor afterCompletion");
    }
}
