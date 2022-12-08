package com.ynu.springboot_demo.controller;

import com.ynu.springboot_demo.dao.UserDao;
import com.ynu.springboot_demo.entity.CommonResult;
import com.ynu.springboot_demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author xiaobai
 * @create 2022-10-22-
 */
@Api(tags = "用户接口")
@RestController
public class UserController {
    @Resource
    private UserDao userDao;
    @Value("${server.port}")
    private String serverPort;

    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public CommonResult<Long> login(@RequestBody User user){
        Optional<User> temp = userDao.findById(user.getUserId());
        if(!temp.isPresent()){
            return new CommonResult<Long>(444,"未查询到该用户，serverPort"+serverPort,0L);
        }else{
            if(temp.get().getUserPassword().equals(user.getUserPassword())){
                return new CommonResult<Long>(200,"登陆成功，serverPort"+serverPort,1L);
            }else{
                return new CommonResult<Long>(444,"密码错误，serverPort"+serverPort,0L);
            }
        }
    }

    @ApiOperation(value = "添加用户信息")
    @PostMapping("/user")
    public CommonResult<User> save(@RequestBody User user){
        User result = userDao.save(user);
        return new CommonResult<User>(200,"插入数据成功，serverPort"+serverPort,user);
    }

    @ApiOperation(value = "修改用户信息")
    @PutMapping("/user/{id}")
    public CommonResult<User> update(@PathVariable("id")Long id,@RequestBody User user){
        Optional<User> temp = userDao.findById(id);
        if(!temp.isPresent()){
            return new CommonResult<User>(444,"未查询到该用户，serverPort"+serverPort);
        }
        user.setUserId(id);
        User result = userDao.save(user);
        return new CommonResult<User>(200,"修改数据成功，serverPort"+serverPort,result);
    }

    @ApiOperation(value = "根据Id获取用户信息")
    @GetMapping("/user/{id}")
    public CommonResult<User> findById(@PathVariable("id")Long id){
        Optional<User> temp = userDao.findById(id);
        if(!temp.isPresent()){
            return new CommonResult<User>(444,"未查询到该用户，serverPort"+serverPort);
        }
        return new CommonResult<User>(200,"查询数据成功，serverPort"+serverPort,temp.get());
    }

    @ApiOperation(value = "获取全部用户信息")
    @GetMapping("/user")
    public CommonResult<List<User>> findAll(){
        List<User> all = userDao.findAll();
        return new CommonResult<List<User>>(200,"查询数据成功，serverPort"+serverPort,all);
    }

    @ApiOperation(value = "删除用户信息")
    @DeleteMapping("/user/{id}")
    public CommonResult<Long> delete(@PathVariable("id")Long id){
        Optional<User> temp = userDao.findById(id);
        if(!temp.isPresent()){
            return new CommonResult<>(444,"未查询到该用户，serverPort"+serverPort);
        }
        userDao.deleteById(id);
        return new CommonResult<Long>(200,"删除数据成功，serverPort"+serverPort,id);
    }
}
