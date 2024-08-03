package com.example.dao;

import com.example.domain.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @Description: user
 * @ClassName: UserDao
 * @Author: Edge
 * @Date: 2024/8/3 23:30
 * @Version: 1.0
 */
public interface UserDao
{
    @Insert ("insert into test (workno, name) values (#{workno} , #{name})")
    public void save(User user);

    public void update(User user);

    public void delete(int id);

    public User getById(int id);

    public List<User> getAll();
}
