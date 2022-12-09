package com.ynu.simple_transaction_back.dao;

import com.ynu.simple_transaction_back.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author xiaobai
 * @create 2022-10-22-
 */
//Shop实体类的持久化维护接口
public interface ShopDao extends JpaRepository<Shop,Long> {
    //自定义的维护操作：根据商家名字查询商家
    @Query(value = "from Shop where shopName = ?1")
    public List<Shop> findByShopName(String shopName);

    //自定义的维护操作：根据商家地址查询商家
    @Query(value = "from Shop where shopAddress = ?1")
    public List<Shop> findByShopAddress(String shopAddress);
}
