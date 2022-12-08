package com.ynu.springboot_demo.dao;

import com.ynu.springboot_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author xiaobai
 * @create 2022-10-22-
 */
//User实体类的持久化维护接口
public interface UserDao extends JpaRepository<User,Long> {
    //自定义的维护操作：根据姓名查询用户
    @Query(value = "from User where userName = ?1")
    public List<User> findByUserName(String userName);

    //自定义的维护操作：根据性别查询用户
    @Query(value = "from User where userSex = ?1")
    public List<User> findByUserSex(String userSex);
}
