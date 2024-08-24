package com.itcl.variable;

public class ASCIIDemo1 {
    public static void main(String[] args) {
        // 目标：掌握ASCII编码表的编码特点。
        System.out.println('a' + 10); // 97 + 10 = 107
        System.out.println('A' + 10); // 65 + 10 = 75
        System.out.println('0' + 10); // 48 + 10 = 58

        // 二进制 八进制 十六进制在程序中的写法。
        int a1 = 0B01100001; //0B 0b表示二进制   64+32+1=97
        System.out.println(a1);

        int a2 = 0141;  // 0开头的数据当成八进制看待！1*8^0 + 4*8^1 + 1*8^2=97
        System.out.println(a2);

        int a3 = 0XFA;  // 0X开头的数据是十六进制
        System.out.println(a3);

        
        int a4 = 01100001; //  0开头 八进制// 1+8^5+8^6=294913
        System.out.println(a4);
    }
}
