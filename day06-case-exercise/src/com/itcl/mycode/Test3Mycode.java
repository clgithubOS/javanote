package com.itcl.mycode;

import java.util.Scanner;

public class Test3Mycode {
    public static void main(String[] args) {
        System.out.println("当前选手的最终得分是："+getFinalScore(5));
    }

    public static double getFinalScore(int n) {
        //定义数组，定义扫描器，定义变量，接收扫描器输入的分数，将变量值赋予数组
        int[] scores = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分：");
//            scores[i] = sc.nextInt();
            int score = sc.nextInt();
            scores[i] = score;
        }
        //求和、最大值、最小值
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for(int i = 0; i < scores.length; i++){
            int score = scores[i];
            sum += score;
            if(score > max){
                max = score;
            }
            if(score < min){
                min = score;
            }
        }
        double finalScore = 1.0*(sum - max - min)/(n-2);

        return finalScore;
    }
}
