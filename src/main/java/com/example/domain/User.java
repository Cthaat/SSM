package com.example.domain;

/**
 * @Description: user
 * @ClassName: User
 * @Author: Edge
 * @Date: 2024/8/3 23:28
 * @Version: 1.0
 */
public class User
{
    private int id;
    private String workno;
    private String name;

    public User(int id , String workno , String name)
    {
        this.id = id;
        this.workno = workno;
        this.name = name;
    }

    public User()
    {
    }

    @Override
    public String toString()
    {
        return "User{" +
               "id=" + id +
               ", workno='" + workno + '\'' +
               ", name='" + name + '\'' +
               '}';
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getWorkno()
    {
        return workno;
    }

    public void setWorkno(String workno)
    {
        this.workno = workno;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
