package com.itcl.random;

import java.util.Random;
import java.util.Scanner;

public class random_MeTest {
    public static void main(String args []){

        Random r = new Random();

        int lucknum = r.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入您猜测的数字：");
            int guessnum = sc.nextInt();
            if(guessnum > lucknum){
                System.out.println("您猜测的数字过大~~");
            }else if(guessnum < lucknum){
                System.out.println("您猜测的数字过小~~");
            }else{
                System.out.println("恭喜您猜对了！");
                System.out.println("游戏结束！");
                break;// 结束死循环
            }
        }
    }
}
