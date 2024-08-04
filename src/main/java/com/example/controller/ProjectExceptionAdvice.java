package com.example.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description: excet
 * @ClassName: ProjectExceptionAdvice
 * @Author: Edge
 * @Date: 2024/8/4 15:05
 * @Version: 1.0
 */

@RestControllerAdvice
public class ProjectExceptionAdvice
{
    @ExceptionHandler(Exception.class)
    public void doException(Exception e)
    {
        System.out.println("Exception occurred: " + e.getMessage());
    }
}
