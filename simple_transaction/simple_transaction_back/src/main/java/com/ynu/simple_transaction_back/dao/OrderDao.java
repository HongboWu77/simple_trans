package com.ynu.simple_transaction_back.dao;

import com.ynu.simple_transaction_back.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Order实体类的持久化维护接口
public interface OrderDao extends JpaRepository<Order,Long> {
    //自定义的维护操作：根据订单名字查询订单
    @Query(value = "from Order where orderName = ?1")
    public List<Order> findByOrderName(String orderName);

    //自定义的维护操作：根据商家Id查询订单
    @Query(value = "from Order where shopId = ?1")
    public List<Order> findByShopId(Long shopId);
}
