package com.ynu.simple_transaction_back.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author xiaobai
 * @create 2022-10-22-
 */
@Entity
//Shop实体类对应的表名
@Table(name = "shop")
//lombok插件实现了getter、setter、有参无参构造、toString等
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    //主键定义
    @Id
    //主键生成策略：每个表单独计算
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //对应的表中的字段名
    @Column(name = "shop_id")
    private Long shopId;
    @Column(name = "shop_name")
    private String shopName;
    @Column(name = "shop_address")
    private String shopAddress;
}
