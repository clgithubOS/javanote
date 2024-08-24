package com.itcl.overload;

public class MethodOverloadDemo3Mycode {
    public static void main(String[] args){
        test();
        test(100);

        fire();
        fire("米国");
        fire(999,"米国");
    }
    public static void fire(){
//        System.out.println("默认向岛国发射一枚武器");
        fire("岛国");
    }
    public static void fire(String country){
//        System.out.println("发射一枚武器给"+country);
        fire(1,country);
    }
    public static void fire(int num,String country){
        System.out.println("发射"+num+"枚武器给"+country);
    }
    public static void test(){
        System.out.println("test");
    }

    public static void test(int a ){
        System.out.println("test"+a);
    }
    int test(int a ,int b){
        return a + b;
    }
    double test(double a){
        return a;
    }
    double test(int a ,double b){
        return a + b;
    }
}
