package com.example.re.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.re.entity.Orders;
import com.example.re.mapper.OrdersMapper;

public interface OrdersService extends IService<Orders> {
    public void submit(Orders orders);
}
