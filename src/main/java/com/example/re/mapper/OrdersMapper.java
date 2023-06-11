package com.example.re.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.re.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
}
