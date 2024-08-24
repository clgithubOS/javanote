package com.itcl.mycode;

public class Test1My {
    public static void main(String[] args) {

    }

    public static double calculate(int month, double price, String type) {
        if (month >= 5 && month <= 10) {
            switch(type){
                case "头等舱":
                    price *=0.9;
                    break;
                case "经济舱":
                    price *=0.85;
                    break;
            }
        }else{
            switch(type){
                case "头等舱":
                    price *=0.7;
                    break;
                case "经济舱":
                    price *=0.65;
                    break;
            }
        }
        return price;
    }
}
