package com.itcl.test;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int[] moneys = {100,999,50,520,1314};
        start(moneys);
    }
    //开始抽奖
    public static void start(int[] moneys){
        //1)首先，写一个循环，循环次数为数组的长度
        for (int i = 0; i < moneys.length; i++) {
            //2)每次循环，键盘录入，提示"用户录入任意键抽奖："
            Scanner sc = new Scanner(System.in);
            System.out.print("用户录入任意键抽奖：");
            String msg = sc.next();
            //3)随机从数组中产生一个索引，获取索引位置的元素，这个元素就表示抽的红包
            Random r = new Random();
            while (true){
                int index = r.nextInt(moneys.length);
                int money = moneys[index];
                if(money!=0){
                    //如果值不为0，则打印如："恭喜您，您抽中了520元"
                    System.out.println("恭喜您，您抽中了"+money+"元");
                    moneys[index] = 0;
                    break;
                }
            }
            System.out.println("红包都抽完了！活动结束了！");
        }
    }
}
