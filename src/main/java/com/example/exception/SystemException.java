package com.example.exception;

/**
 * @Description: system
 * @ClassName: SystemException
 * @Author: Edge
 * @Date: 2024/8/4 15:15
 * @Version: 1.0
 */
public class SystemException extends RuntimeException
{
    private Integer code;

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public SystemException(Integer code , String message)
    {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code , String message , Throwable cause)
    {
        super(message , cause);
        this.code = code;
    }
}
