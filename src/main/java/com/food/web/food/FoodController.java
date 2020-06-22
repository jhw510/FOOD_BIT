package com.food.web.food;


import com.food.web.mappers.FoodMapper;
import com.food.web.proxy.Box;
import com.food.web.proxy.IFunction;
import com.food.web.proxy.Pager;
import com.food.web.proxy.Proxy;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    Pager pager;
    @Autowired
    FoodMapper foodMapper;
    @Autowired
    Proxy pxy;
    @Autowired
    Box<Object> box;

    @GetMapping("/{searchWord}/{pageNumber}")

    public Map<?, ?> list(@PathVariable("pageNumber") String pageNumber,
                          @PathVariable("searchWord") String searchWord) {
        pxy.println("검색어는 " + searchWord);
        if (searchWord.equals("null")) {
            pxy.println("검색어가 없음");
            pager.setSearchWord("");
        } else {
            pxy.println("검색어가 " + searchWord);
            pager.setSearchWord(searchWord);
        }
        pxy.println("넘어온 페이지 페이지 페이지 번호: " + pageNumber);
        pager.setPageNow(pxy.integer(pageNumber));
        pager.setBlockSize(14);
        pager.setPageSize(10);
        pager.paging();
        IFunction<Pager, List<FoodDTO>> f = p -> foodMapper.selectFoods(p);
        List<FoodDTO> l = f.apply(pager);
        pxy.println("***************************************");
        for (FoodDTO m : l) {
            pxy.println(m.toString());
        }
        box.clear();
        box.put("pager", pager);
        box.put("list", l);
        return box.get();
    }

    @GetMapping("/{searchWord}")
    public FoodDTO foodOne(@PathVariable("searchWord") String searchWord) {
        pxy.println("누른 값은  :" + searchWord);
        return foodMapper.selectFood(searchWord);
    }

}