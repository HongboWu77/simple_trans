package com.ynu.springboot_demo;

import com.ynu.springboot_demo.dao.OrderDao;
import com.ynu.springboot_demo.dao.ShopDao;
import com.ynu.springboot_demo.dao.UserDao;
import com.ynu.springboot_demo.entity.Order;
import com.ynu.springboot_demo.entity.Shop;
import com.ynu.springboot_demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

//测试类
@SpringBootTest
class SpringbootDemoApplicationTests {
    //从容器中获取dao
    @Resource
    private UserDao userDao;
    @Resource
    private ShopDao shopDao;
    @Resource
    private OrderDao orderDao;


    @Test
    void contextLoads() {
    }

    //User实体类的持久维护接口的测试操作
    //测试增加操作
    @Test
    public void testUserSave(){
        User user = new User();
        user.setUserName("吴洪波");
        user.setUserSex("男");
        user.setUserPassword("201118");
        user.setOrderId("3,6,9");
        userDao.save(user);
    }
    //测试更新操作
    @Test
    public void testUserUpdate(){
        User user = new User();
        user.setUserId(308L);
        user.setUserName("吴小白");
        user.setUserSex("男");
        user.setUserPassword("201118");
        user.setOrderId("3,6,9");
        userDao.save(user);
    }
    //测试根据Id查询操作
    @Test
    public void testUserFindById(){
        System.out.println(userDao.findById(26L));
    }
    //测试全部查询操作
    @Test
    public void testUserFindAll(){
        System.out.println(userDao.findAll());
    }
    //测试删除操作
    @Test
    public void testUserDelete(){
        userDao.deleteById(28L);
    }
    //测试自定义操作：根据姓名查询用户
    @Test
    public void testUserFindByUserName(){
        System.out.println(userDao.findByUserName("吴洪波"));
    }
    //测试自定义操作：根据性别查询用户
    @Test
    public void testUserFindByUserSex(){
        System.out.println(userDao.findByUserSex("男"));
    }

    //Order实体类的持久维护接口的测试操作
    //测试增加操作
    @Test
    public void testOrderSave(){
        Order order = new Order();
        order.setOrderTime("2022-10-10");
        order.setOrderName("大盘鸡");
        order.setShopId(1L);
        orderDao.save(order);
    }
    //测试更新操作
    @Test
    public void testOrderUpdate(){
        Order order = new Order();
        order.setOrderId(1L);
        order.setOrderTime("2022-10-10");
        order.setOrderName("大盘鸡双份");
        order.setShopId(1L);
        orderDao.save(order);
    }
    //测试根据Id查询操作
    @Test
    public void testOrderFindById(){
        System.out.println(orderDao.findById(1L));
    }
    //测试全部查询操作
    @Test
    public void testOrderFindAll(){
        System.out.println(orderDao.findAll());
    }
    //测试删除操作
    @Test
    public void testOrderDelete(){
        orderDao.deleteById(1L);
    }
    //测试自定义操作：根据订单名字查询订单
    @Test
    public void testOrderFindByOrderName(){
        System.out.println(orderDao.findByOrderName("大盘鸡"));
    }
    //测试自定义操作：根据商家Id查询订单
    @Test
    public void testOrderFindByShopId(){
        System.out.println(orderDao.findByShopId(1L));
    }

    //Shop实体类的持久维护接口的测试操作
    //测试增加操作
    @Test
    public void testShopSave(){
        Shop shop = new Shop();
        shop.setShopName("康泉");
        shop.setShopAddress("山东省济南市");
        shopDao.save(shop);
    }
    //测试更新操作
    @Test
    public void testShopUpdate(){
        Shop shop = new Shop();
        shop.setShopId(1L);
        shop.setShopName("康泉食品");
        shop.setShopAddress("山东省济南市");
        shopDao.save(shop);
    }
    //测试根据Id查询操作
    @Test
    public void testShopFindById(){
        System.out.println(shopDao.findById(1L));
    }
    //测试全部查询操作
    @Test
    public void testShopFindAll(){
        System.out.println(shopDao.findAll());
    }
    //测试删除操作
    @Test
    public void testShopDelete(){
        shopDao.deleteById(1L);
    }
    //测试自定义操作：根据商家名字查询商家
    @Test
    public void testShopFindByShopName(){
        System.out.println(shopDao.findByShopName("哈哈"));
    }
    //测试自定义操作：根据商家地址查询商家
    @Test
    public void testShopFindByShopAddress(){
        System.out.println(shopDao.findByShopAddress("山东省济宁市"));
    }
}
