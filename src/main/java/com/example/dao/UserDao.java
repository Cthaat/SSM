package com.example.dao;

import com.example.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: user
 * @ClassName: UserDao
 * @Author: Edge
 * @Date: 2024/8/3 23:30
 * @Version: 1.0
 */

@Repository
public interface UserDao
{
    @Insert ("insert into test (workno, name) values (#{workno} , #{name})")
    void save(User user);

    @Update ("update test set workno = #{workno}, name = #{name} where id = #{id}")
    void update(User user);

    @Delete ("delete from test where id = #{id}")
    void delete(int id);

    @Select ("select * from test where id = #{id}")
    User getById(int id);

    @Select ("select * from test")
    List<User> getAll();
}
