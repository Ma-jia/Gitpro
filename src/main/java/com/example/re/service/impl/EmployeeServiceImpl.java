package com.example.re.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.re.entity.Employee;
import com.example.re.mapper.EmployeeMapper;
import com.example.re.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
