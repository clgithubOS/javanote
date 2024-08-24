package com.itcl.mycode;

public class Test4Mycode {
    public static void main(String[] args) {
        System.out.println("加密后的密码是：" + encrypt(1983));
    }

    public static String encrypt(int number) {
        int[] numbers = split(number);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }

        reverse(numbers);

        String encryptednumber = "";
        for (int i = 0; i < numbers.length; i++) {
            encryptednumber += numbers[i];
        }
        return encryptednumber;
    }
/*
    public static int encrypt(int number) {
        int[] numbers = split(number);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }

        reverse(numbers);

        int encryptednumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            encryptednumber += numbers[i] * Math.pow(10,(numbers.length - 1 - i));
        }
        return encryptednumber;
    }
*/

    public static int[] split(int number) {
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;
        return numbers;
    }

    public static int[] reverse(int[] numbers) {
        for(int i = 0,j = numbers.length -1;i < j; i++,j--){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        return numbers;
    }

}
