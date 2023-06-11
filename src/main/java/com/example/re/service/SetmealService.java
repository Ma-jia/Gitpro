package com.example.re.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.re.dto.SetmealDto;
import com.example.re.entity.Setmeal;
import com.example.re.mapper.SetmealMapper;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);

    public  void removeWithDish(List<Long> ids);
}
