package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description: except
 * @ClassName: ProjectExceptionAdvice
 * @Author: Edge
 * @Date: 2024/8/4 15:05
 * @Version: 1.0
 */

@RestControllerAdvice
public class ProjectExceptionAdvice
{
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result doException(Exception e)
    {
        System.out.println("Exception occurred: " + e.getMessage());
        return new Result(500,null , "Exception occurred: " + e.getMessage());
    }
}
