package com.ynu.springboot_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaobai
 * @create 2022-10-22-
 */
//lombok插件实现了getter、setter、有参无参构造、toString等
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //成员变量
    private Integer code;
    private String message;
    private T data;

    //构造器
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
