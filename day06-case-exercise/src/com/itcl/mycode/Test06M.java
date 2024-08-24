package com.itcl.mycode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test06M {
    public static void main(String[] args){
        int[] moneys = {100,999,50,520,1314};
        System.out.println(Arrays.toString(moneys));
        raffle1(moneys);
        System.out.println(Arrays.toString(moneys));
        raffle(moneys);
        System.out.println(Arrays.toString(moneys));


    }

    public static void raffle1(int[] moneys){
        //1.打乱数组的元素顺序
        Random r =  new Random();
        for (int i = 0; i < moneys.length; i++) {
            // moneys[i]
            // 每遍历到一个数据，都随机一个数组索引范围内的值。然后让当前遍历的数据与该索引位置处的值交换。
            int index = r.nextInt(moneys.length); // 0 - 4
            // 定义一个临时变量记住index位置处的值
            int temp = moneys[index];
            // 把i位置处的值赋值给index位置处
            moneys[index] = moneys[i];
            // 把index位置原来的值赋值给i位置处
            moneys[i] = temp;
        }
        //2.遍历数组的元素
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < moneys.length; i++){
            System.out.println("请输入任意内容来发起抽奖：");
            sc.next();//等待用户输入任意内容，按回车之后才向下执行
            System.out.println("恭喜您抽到了红包：" + moneys[i]);
        }
        System.out.println("红包抽完了！活动结束了！");
    }
    public static void raffle(int[] moneys){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for(int i = 0; i < moneys.length; i++){
            System.out.println("请输入任意内容进行抽奖：");
            sc.next();//等待用户输入任意内容，按回车之后才向下执行
            while (true) {
                int index = r.nextInt(moneys.length);
                int money = moneys[index];
                if(money != 0){
                    System.out.println("恭喜您抽中了红包"+money);
                    moneys[index] = 0;
                    break;
                }
            }
        }
        System.out.println("红包都抽完了！活动结束了！");
    }




}
