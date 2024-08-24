package com.itcl.test;
/*
1.首先，考虑方法是否需要接收数据处理？
阅读需求我们会发现，不同月份、不同原价、不同舱位类型优惠方案都不一样；
所以，可以将原价、月份、舱位类型写成参数

2.接着，考虑方法是否有返回值？
阅读需求我们发现，最终结果是求当前用户的优惠票价
所以，可以将优惠票价作为方法的返回值。

3.最后，再考虑方法内部的业务逻辑
先使用if判断月份是旺季还是淡季，然后使用switch分支判断是头等舱还是经济舱，计算		票价
*/
public class Test1 {
    public static void main(String[] args) {
        // 目标：完成买飞机票的案例。
        double price = calculate(1000, 11, "头等舱");
        System.out.println("优惠价是：" + price);
    }

    public static double calculate(double price,int month,String type){
        // 1、判断当前月份是淡季还是旺季
        if(month >= 5 && month <= 10) {
            // 旺季
            // 2、判断仓位类型。
            switch (type){
                case "头等舱":
                    price *= 0.9; // price = price * 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else {
            // 淡季
            switch (type){
                case "头等舱":
                    price *= 0.7; // price = price * 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
