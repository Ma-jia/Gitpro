package com.example.re.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.re.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
