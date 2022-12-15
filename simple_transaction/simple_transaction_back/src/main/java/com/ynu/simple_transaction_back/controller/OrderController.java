package com.ynu.simple_transaction_back.controller;

import com.ynu.simple_transaction_back.dao.OrderDao;
import com.ynu.simple_transaction_back.entity.CommonResult;
import com.ynu.simple_transaction_back.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Api(tags = "订单接口")
@RestController
public class OrderController {
    @Resource
    private OrderDao orderDao;
    @Value("${server.port}")
    private String serverPort;

    @ApiOperation(value = "增加订单信息")
    @PostMapping("/order")
    public CommonResult<Order> save(@RequestBody Order order){
        Order result = orderDao.save(order);
        return new CommonResult<Order>(200,"插入数据成功，serverPort："+serverPort,order);
    }

    @ApiOperation(value = "修改订单信息")
    @PutMapping("/order/{id}")
    public CommonResult<Order> update(@PathVariable("id")Long id,@RequestBody Order order){
        Optional<Order> byId = orderDao.findById(id);
        if(!byId.isPresent()){
            return new CommonResult<Order>(444,"未查询到该订单，serverPort："+serverPort);
        }
        order.setOrderId(id);
        Order result = orderDao.save(order);
        return new CommonResult<Order>(200,"修改数据成功，serverPort："+serverPort,result);
    }

    @ApiOperation(value = "根据Id获取订单信息")
    @GetMapping("/order/{id}")
    public CommonResult<Order> findById(@PathVariable("id")Long id){
        Optional<Order> byId = orderDao.findById(id);
        if(!byId.isPresent()){
            return new CommonResult<Order>(444,"未查询到该订单，serverPort："+serverPort);
        }
        return new CommonResult<Order>(200,"查询数据成功，serverPort："+serverPort,byId.get());
    }

    @ApiOperation(value = "获取全部订单信息")
    @GetMapping("/order")
    public CommonResult<List<Order>> findAll(){
        List<Order> all = orderDao.findAll();
        return new CommonResult<List<Order>>(200,"查询数据成功，serverPort："+serverPort,all);
    }

    @ApiOperation(value = "删除订单信息")
    @DeleteMapping("/order/{id}")
    public CommonResult<Long> delete(@PathVariable("id")Long id){
        Optional<Order> byId = orderDao.findById(id);
        if(!byId.isPresent()){
            return new CommonResult<Long>(444,"未查询到该订单，serverPort："+serverPort);
        }
        orderDao.deleteById(id);
        return new CommonResult<Long>(200,"删除数据成功，serverPort："+serverPort,id);
    }
}
