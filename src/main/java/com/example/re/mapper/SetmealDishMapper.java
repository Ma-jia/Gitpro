package com.example.re.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.re.entity.SetmealDish;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SetmealDishMapper extends BaseMapper<SetmealDish> {
}
