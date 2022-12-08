package com.ynu.springboot_demo.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author xiaobai
 * @create 2022-10-22-
 */
@Entity
//Order实体类对应的表名
@Table(name = "order2")
//lombok插件实现了getter、setter、有参无参构造、toString等
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    //主键定义
    @Id
    //主键生成策略：每个表单独计算
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //对应的表中的字段名
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "order_name")
    private String orderName;
    @Column(name = "order_time")
    private String orderTime;
    @Column(name = "shop_id")
    private Long shopId;
}
