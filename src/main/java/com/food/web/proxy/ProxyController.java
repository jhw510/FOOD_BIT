package com.food.web.proxy;

import com.food.web.food.Food;
import com.food.web.food.FoodRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
public class ProxyController  {
    @Autowired Box<Object> box;
    @Autowired Crawler crawler;

    @Autowired Proxy pxy;
    @Autowired
  FoodRepository foodRepository;

//    @Autowired FileUploader loader;

    @PostMapping("/searchPage")
    public HashMap<String,Object> food(@RequestBody String searchWord){
        pxy.println("넘어온 키워드 : "+searchWord);
        box.clear();

        if(foodRepository.count() == 0)
            crawler.price();
        List<Food> list= foodRepository.findAll();
        box.put("list",list);
        box.put("count",String.valueOf(list.size()));
        pxy.println("박스에 담긴 카운트: "+box.get("count"));
        return box.get();
    }

    @GetMapping("/food")
    public HashMap<String,Object> food2(@RequestBody String searchWord){
         pxy.println("넘어온 키워드 : "+searchWord);
        pxy.println("11111");
        box.clear();

        if(foodRepository.count() == 0)
            crawler.price();
        List<Food> list= foodRepository.findAll();
        box.put("list",list);
        box.put("count",String.valueOf(list.size()));
        pxy.println("박스에 담긴 카운트: "+box.get("count"));
        return box.get();
    }

//    @GetMapping("/soccer/{searchWord}")
//    public HashMap<String,String> soccer(@PathVariable String searchWord){
//        pxy.print("넘어온 키워드:"+ searchWord);
//        uploader.upload();
//        return null;
    }
//  @GetMapping("/movie/{searchWord}")
//    public void movieNaver(@PathVariable String searchWord){
//        pxy.print("넘어온 값" +searchWord);
//        crawler.movieNaver();
//
//  }



   /* @GetMapping("/movie/{searchWord}")
        public HashMap<String,Object> movie(@PathVariable String searchWord){
        pxy.print("넘어온 키워드 : "+searchWord);
        box.clear();

        if(movieRepository.count() == 0)crawler.movie();
        List<Movie> list= movieRepository.findAll();
        box.put("list",list);
//        box.put("count",String.valueOf(list.size()));

            return box.get();
    }*/

