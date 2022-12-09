package com.ynu.simple_transaction_back.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author xiaobai
 * @create 2022-10-22-
 */
@Entity
//User实体类对应的表名
@Table(name = "user")
//lombok插件实现了getter、setter、有参无参构造、toString等
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    //主键定义
    @Id
    //主键生成策略：每个表单独计算
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //对应的表中的字段名
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_sex")
    private String userSex;
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "user_password")
    private String userPassword;
}
