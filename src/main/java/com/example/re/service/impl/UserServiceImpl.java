package com.example.re.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.re.entity.User;
import com.example.re.mapper.UserMapper;
import com.example.re.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
