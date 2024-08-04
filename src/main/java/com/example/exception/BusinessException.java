package com.example.exception;

/**
 * @Description: business
 * @ClassName: BusinessException
 * @Author: Edge
 * @Date: 2024/8/4 15:18
 * @Version: 1.0
 */
public class BusinessException extends RuntimeException
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

    public BusinessException(Integer code , String message , Throwable cause)
    {
        super(message , cause);
        this.code = code;
    }

    public BusinessException(Integer code , Throwable cause)
    {
        super(cause);
        this.code = code;
    }
}
