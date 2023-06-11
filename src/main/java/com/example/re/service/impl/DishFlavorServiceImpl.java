package com.example.re.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.re.entity.DishFlavor;
import com.example.re.mapper.DishFlavorMapper;
import com.example.re.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
