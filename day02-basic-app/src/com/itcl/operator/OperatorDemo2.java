package com.itcl.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 目标：掌握自增自减运算符的使用。
        int a = 10;
        // a++; // a = a + 1
        ++a;
        System.out.println(a);

        // a--; // a = a - 1
        --a;
        System.out.println(a);

        // System.out.println(2++); // 自增自减只能操作变量不能操作字面量的，会报错！

        System.out.println("-------------------------------------------------");

        int i = 10;
        int rs = ++i; // 先加后用
        System.out.println(rs); //11
        System.out.println(i);  //11

        int j = 10;
        int rs2 = j++; // 先用后加
        System.out.println(rs2);//10
        System.out.println(j);  //11

        int c = 10;
        int d = 5;
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        //        10  + 12  - 4   - 5   + 1 + 12
        // 运算时  c=10  c=12  d=4   d=5      c=12
        System.out.println(rs3);    //26
        System.out.println(c);      //11
        System.out.println(d);      //5

    }
}
