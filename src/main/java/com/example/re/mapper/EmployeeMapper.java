package com.example.re.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.re.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}

