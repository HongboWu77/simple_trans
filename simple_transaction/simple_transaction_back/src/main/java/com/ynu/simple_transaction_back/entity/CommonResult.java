package com.ynu.simple_transaction_back.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
