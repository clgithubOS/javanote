package com.itcl.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 目标：掌握关系运算符的基本使用。
        int a = 10;
        int b = 5;
        boolean rs = a > b;
        System.out.println(rs);

        System.out.println(a >= b); //  a大于b 或者 a等于b
        System.out.println(2 >= 2); // true
        System.out.println(a < b);  // false
        System.out.println(a <= b); // false
        System.out.println(2 <= 2); // true
        System.out.println(a == b); // false
        System.out.println(5 == 5); // true
        //System.out.println(a = b);// 5 a=5 b=5 注意了：判断是否相等一定是用 == ，=是用来赋值的。
        System.out.println(a != b); // true
        System.out.println(10 != 10); // false

        System.out.println(false ^ true ^ false);
        // ^ 异或 前后条件的结果相同，就直接返回false;前后条件的结果不同，才返回true

    }
}
