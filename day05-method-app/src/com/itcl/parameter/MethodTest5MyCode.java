package com.itcl.parameter;

import java.sql.SQLOutput;

public class MethodTest5MyCode {
    public static void main(String[] args) {
        int[] a = new int[]{11, 22, 33, 44, 55};
        printArray(a);

        int[] b = null;
        int[] b1 = null;

        int[] b2 = new int[]{10,20,30};
        int[] b3 = new int[]{10,20,30};
        int[] b4 = new int[]{10,20,30,40};
        System.out.println(arrayequal(b, b1));
        System.out.println(arrayequal(b1, b2));
        System.out.println(arrayequal(b2, b3));
        System.out.println(arrayequal(b3, b4));

    }

    public static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i == array.length - 1 ? array[i] + "]" : array[i] + ",");
/*
            if(array[i] == array[array.length-1]){
                System.out.print(array[i]+"]");
            }else{
                System.out.print(array[i]+",");
            }
*/
        }
    }

    public static boolean arrayequal(int[] a1, int[] a2) {
        if (a1 == null && a2 == null) {
            return true;
        }
        if (a1 == null || a2 == null) {
            return false;
        }
        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
}
