package com.example.controller;

/**
 * @Description: result
 * @ClassName: Result
 * @Author: Edge
 * @Date: 2024/8/4 14:01
 * @Version: 1.0
 */
public class Result
{
    private Integer code;
    private String message;
    private Object data;

    public Result()
    {
    }

    public Result(Integer code, Object data)
    {
        this.data = data;
        this.code = code;
    }

    public Result(Integer code , Object data , String message)
    {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }


}
