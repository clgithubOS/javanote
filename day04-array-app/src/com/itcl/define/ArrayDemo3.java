package com.itcl.define;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 目标：掌握数组的遍历。
        int[] ages = {12, 24, 36};
        //            0   1    2

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);

        for (int i = 0; i < ages.length; i++) {
            // i = 0 1 2
            System.out.println(ages[i]);
        }

        for (int i = 0; i < ages.length; i++) { //ages.fori
            System.out.println(ages[i]);        //ages[i].sout
        }

    }
}
