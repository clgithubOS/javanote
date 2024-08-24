package com.itcl.define;

public class MethodTest5MyCode {
    public static void main(String[] args) {

        add(5);
        add(100);
        System.out.println("-----------------------------");
        judge(10);
        judge(987);
    }

    //1. 1-n的求和
    public static int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1-" + n + "的和是：" + sum);
        return sum;
    }

    //2. 判断一个整数是奇数还是偶数
    public static void judge(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "是一个偶数！");
        } else {
            System.out.println(num + "是一个奇数！");
        }
    }

}
