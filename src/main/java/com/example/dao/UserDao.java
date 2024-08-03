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

    @Insert ("update test set workno = #{workno}, name = #{name} where id = #{id}")
    public void update(User user);

    @Insert ("delete from test where id = #{id}")
    public void delete(int id);

    @Insert ("select * from test where id = #{id}")
    public User getById(int id);

    @Insert ("select * from test")
    public List<User> getAll();
}
