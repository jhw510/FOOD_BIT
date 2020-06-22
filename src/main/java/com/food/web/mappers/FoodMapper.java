package com.food.web.mappers;

import com.food.web.food.FoodDTO;
import com.food.web.proxy.Pager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodMapper {
        public void  insertFood(FoodDTO food);
        public void updateFood(FoodDTO food);
        public void deleteFood(FoodDTO food);

        public int count();
        public List<FoodDTO> selectFoods(Pager pager);
        public FoodDTO selectFood(String seq);

}
