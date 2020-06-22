package com.food.web.proxy;
import com.food.web.food.Food;
import com.food.web.food.FoodRepository;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

@Component("crawler")@Lazy
public class Crawler extends Proxy {
    @Autowired
    Inventory<Food> inventory;
    @Autowired
    Box<String> box;
    @Autowired
    FoodRepository foodRepository;


    public void price() {
        try {
            String url = "http://www.kamis.co.kr/service/price/xml.do?action=dailySalesList&p_cert_key=c74820f1-aa54-46b0-b187-a69dae1b1950&p_cert_id=zhs510&p_returntype=xml";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
            Elements productClsCode  = d.select("property.productClsCode, ");
            Elements productClsName   = d.select("property.productClsName,  ");


            Food food = null;
            for (int i = 0; i < productClsCode.size(); i++) {
                food = new Food();
                food.setProductClsCode(string(i + 1));
                food.setProductClsName(productClsName.get(i).text());

                foodRepository.save(food);
            }
        } catch (Exception e) {
            println("에러발생");
        }
        println("*************크롤링 결과*************");
        //  inventory.get().forEach(System.out::print);
        //  print(inventory.get().get(0).toString());


    }
}