package com.itcl.define;

public class ArrayDemo1 {

    public static void define(){
        int [] ages = new int [] {12,24,36};
        int [] ages1 = {12,24,36};
        int[] ages2 = {12,24,36};
        int [] ages3 = {12,24,36};
        int []ages4 = {12,24,36};
    }

    public static void main(String[] args) {
        // 目标：掌握
        // 数组的定义方式一：静态初始化数组。
        // 1、数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3,.....}
        int[] ages = new int[]{12, 24, 36};
        double[] scores = new double[]{89.9, 99.5, 59.5, 88};
        System.out.println(ages);
        System.out.println(scores);
        // 2、简化写法：
        // 数据类型[] 数组名 = {元素1, 元素2, 元素3,.....}
        int[] ages2 = {12, 24, 36};
        double[] scores2 = {89.9, 99.5, 59.5, 88};

        // 3、数据类型[] 数组名 也可以写成 数据类型 数组名[]
        int ages3[] = {12, 24, 36};
        double scores3[] = {89.9, 99.5, 59.5, 88};

        define();
    }
}
