package com.itcl.mycode;

public class Test07M {
    public static void main(String[] args ){
        searchPrimeNumber(101, 200);
    }

    //
    public static void searchPrimeNumber(int start , int end){
        int count = 0;
        for(int i = start; i < end; i++){
            // 信号位思想
            boolean flag = true; // 假设的意思：默认当前i记住的数据是素数。
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){//是素数
                System.out.println(i);
                count++;
            }
        }
        System.out.println(start + "-" + end +"之间素数的个数是：" + count);
    }
}


/*
    public static boolean judge(int num){
        for(int i = 2; i < num / 2; i++){
            if(num % i == 0){

            }
        }
        reuturn
    }
*/






