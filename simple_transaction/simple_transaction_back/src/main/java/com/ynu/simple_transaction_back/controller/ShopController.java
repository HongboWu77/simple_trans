package com.ynu.simple_transaction_back.controller;

import com.ynu.simple_transaction_back.dao.ShopDao;
import com.ynu.simple_transaction_back.entity.CommonResult;
import com.ynu.simple_transaction_back.entity.Shop;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author xiaobai
 * @create 2022-10-22-
 */
@Api(tags = "商家接口")
@RestController
public class ShopController {
    @Resource
    private ShopDao shopDao;
    @Value("${server.port}")
    private String serverPort;

    @ApiOperation(value = "增加商家信息")
    @PostMapping("/shop")
    public CommonResult<Shop> save(@RequestBody Shop shop){
        Shop result = shopDao.save(shop);
        return new CommonResult<Shop>(200,"插入数据成功，serverPort："+serverPort,shop);
    }

    @ApiOperation(value = "修改商家信息")
    @PutMapping("/shop/{id}")
    public CommonResult<Shop> update(@PathVariable("id")Long id,@RequestBody Shop shop){
        Optional<Shop> byId = shopDao.findById(id);
        if(!byId.isPresent()){
            return new CommonResult<Shop>(444,"未查询到该用户，serverPort："+ serverPort);
        }
        shop.setShopId(id);
        Shop result = shopDao.save(shop);
        return new CommonResult<Shop>(200,"修改数据成功，serverPort："+serverPort,result);
    }

    @ApiOperation(value = "根据Id获取商家信息")
    @GetMapping("/shop/{id}")
    public CommonResult<Shop> findById(@PathVariable("id") Long id){
        Optional<Shop> byId = shopDao.findById(id);
        if(!byId.isPresent()){
            return new CommonResult<Shop>(444,"未查询到该用户，serverPort："+serverPort);
        }
        return new CommonResult<Shop>(200,"查询数据成功，serverPort："+serverPort,byId.get());
    }

    @ApiOperation(value = "获取全部商家信息")
    @GetMapping("/shop")
    public CommonResult<List<Shop>> findAll(){
        List<Shop> all = shopDao.findAll();
        return new CommonResult<List<Shop>>(200,"查询数据成功，serverPort："+serverPort,all);
    }

    @ApiOperation(value = "删除商家信息")
    @DeleteMapping("/shop/{id}")
    public CommonResult<Long> delete(@PathVariable("id")Long id){
        Optional<Shop> byId = shopDao.findById(id);
        if(!byId.isPresent()){
            return new CommonResult<Long>(444,"未查询到该用户，serverPort："+serverPort);
        }
        shopDao.deleteById(id);
        return new CommonResult<Long>(200,"删除数据成功，serverPort："+serverPort,id);
    }
}
