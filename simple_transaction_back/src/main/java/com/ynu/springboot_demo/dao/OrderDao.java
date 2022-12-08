package com.ynu.springboot_demo.dao;

import com.ynu.springboot_demo.entity.Order;
import com.ynu.springboot_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author xiaobai
 * @create 2022-10-22-
 */
//Order实体类的持久化维护接口
public interface OrderDao extends JpaRepository<Order,Long> {
    //自定义的维护操作：根据订单名字查询订单
    @Query(value = "from Order where orderName = ?1")
    public List<Order> findByOrderName(String orderName);

    //自定义的维护操作：根据商家Id查询订单
    @Query(value = "from Order where shopId = ?1")
    public List<Order> findByShopId(Long shopId);
}
