package com.itcl.variable;

public class VariableDemo2 {
    public static void main (String [] args ){
        // 目标掌握i基本数据类型的使用。
        //1.byte short int long
        byte a = 127; // -128 - 127
        // byte a2 = 128; //越界了

        short s = 13244;
        // short s2 = 93244 //越界了

        int i = 422424; //默认

        //注意：随便写一个整数型字面量默认是int类型的，424242242224虽然没有超过long的范围，但是超过了本身int的范围
        //如果希望随便写一个整数型字面量默认是long类型的，需要在后面加上L/l
        long l = 424242242224L;

        //2.float couble
        //注意：随便写小数字面量，默认是double，如果希望小鼠的float，后面加上F/f
        float f = 3.14f;

        double d = 56.45;

        //3.char 字符型
        char ch = 'a';
        char ch2 = '中';
        char ch3 = ' ';

        //4.boolean
        boolean flag = true;
        boolean flag2 = false;


        // 拓展一种引用数据类型，后面要用
        // String 称之为字符串类型，定义的变量可以用于记住一个字符串数据
        String name = "张三";
        System.out.println(name);
    }
}
