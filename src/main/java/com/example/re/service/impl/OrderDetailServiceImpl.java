package com.example.re.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.re.entity.OrderDetail;
import com.example.re.mapper.OrderDetailMapper;
import com.example.re.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
