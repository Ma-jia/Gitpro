package com.example.re.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.re.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
