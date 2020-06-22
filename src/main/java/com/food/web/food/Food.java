package com.food.web.food;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long seq;
    @Column(length = 100)
    private String productClsCode;
    @Column(length = 100)
    private String productClsName;
    @Column(length = 100)
    private String categoryCode;
    @Column(length = 100)
    private String categoryName;
    @Column(length = 100)
    private String productno;
    @Column(length = 100)
    private String lastestDay;
    @Column(length = 100)
    private String productName;
    @Column(length = 100)
    private String itemName;
    @Column(length = 100)
    private String unit;
    @Column(length = 100)
    private String day1;
    @Column(length = 100)
    private String dpr1;
    @Column(length = 100)
    private String day2;
    @Column(length = 100)
    private String dpr2;
    @Column(length = 100)
    private String day3;
    @Column(length = 100)
    private String dpr3;
    @Column(length = 100)
    private String day4;
    @Column(length = 100)
    private String dpr4;
    @Column(length = 100)
    private String direction;
    @Column(length = 50)
    private String price;



    @Builder
    public Food( String productClsCode,String productClsName,String  categoryCode,String categoryName,String productno,
                 String lastestDay,String productName,String itemName ,String  unit,String day1,
                 String dpr1,String day2,String dpr2,String day3,String dpr3,String day4,String dpr4,String direction,String price){
        this.productClsCode =productClsCode;
        this.productClsName=productClsName;
        this.categoryCode=categoryCode;
        this.categoryName=categoryName;
        this.productno=productno;
        this.lastestDay=lastestDay;
        this.productName=productName;
        this.itemName=itemName ;
        this.unit=unit;
        this.day1=day1;
        this.dpr1=dpr1;
        this.day2=day2;
        this.dpr2=dpr2;
        this.day3=day3;
        this.dpr3=dpr3;
        this.day4=day4;
        this.dpr4=dpr4;
        this.direction=direction;
        this.price=price;

    }



}