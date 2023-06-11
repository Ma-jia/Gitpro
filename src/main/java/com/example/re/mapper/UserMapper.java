package com.example.re.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.re.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
