package com.itcl.mycode;

import java.util.Arrays;

public class Test05Mycode {
    public static void main(String[] args) {
        int[] arr1 = new int[]{11, 22, 33};
        int[] arr2 = copy(arr1);
        arrPrint(arr2);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] copy(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        return arr2;
    }

    public static void arrPrint(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
