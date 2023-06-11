package com.example.re.dto;

import com.example.re.entity.Setmeal;
import com.example.re.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
