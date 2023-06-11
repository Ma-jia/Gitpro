package com.example.re.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.re.dto.DishDto;
import com.example.re.entity.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);
    public DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);

    void removeWithFlavor(List<Long> ids);
}
