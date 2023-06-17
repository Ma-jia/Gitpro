package com.example.re.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.re.common.R;
import com.example.re.entity.Orders;
import com.example.re.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping("/submit")
    public R<String> submit(@RequestBody Orders orders){
        ordersService.submit(orders);
        return R.success("订单完成");
    }

    @GetMapping("/page")
    public  R<Page> page(int page,int pageSize,String number){
        Page pageInfo=new Page<>(page,pageSize);
        LambdaQueryWrapper<Orders> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotEmpty(number),Orders::getNumber,number);
        queryWrapper.orderByDesc(Orders::getOrderTime);
        ordersService.page(pageInfo,queryWrapper);
        return R.success(pageInfo);
    }

    @PutMapping
    public R<String> status(@RequestBody Orders orders){
        LambdaUpdateWrapper<Orders> updateWrapper=new LambdaUpdateWrapper<>();
        updateWrapper.set(Orders::getStatus,orders.getStatus());
        updateWrapper.in(Orders::getId,orders.getId());
        ordersService.update(null,updateWrapper);
        return R.success("修改成功");

    }
}
