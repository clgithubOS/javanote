package com.itcl.mycode;

import java.util.Random;

public class Test2Mycode {
    public static void main(String[] args){
        System.out.println(createCode(8

        ));
    }

    public static String createCode(int n){
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type){
                case 0:     //数字 0-9
                    code += r.nextInt(10);
                    break;
                case 1:     //大写字母 A 65
                    char ch1 = (char)(r.nextInt(26)+65);//65-90
                    code += ch1;
                    break;
                case 2:     //小写字母 a 97
                    char ch2 = (char)(r.nextInt(26)+97);//97-122
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
