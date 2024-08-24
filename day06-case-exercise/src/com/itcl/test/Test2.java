package com.itcl.test;

import java.util.Random;

/*
1.首先，考虑方法是否需要接收数据处理？
    要求生成指定位数的验证码，到底多少位呢？让调用者传递即可
    所以，需要一个参数，用来表示验证码的位数

2.接着，考虑方法是否需要有返回值？
    该方法的结果，就是为了得到验证码
    所以，返回值就是验证码；

3.最后，再考虑方法内部的业务逻辑
    1)先按照方法接收的验证码位数n,循环n次
    2)每次循环，产生一个字符，可以是数字字符、或者大小写字母字符
    3)定义一个String类型的变量用于记住产生的每位随机字符
*/
public class Test2 {
    public static void main(String[] args) {
        // 目标：完成生成随机验证码。
        System.out.println(createCode(8));
    }

    public static String createCode(int n){
        //1)先按照方法接收的验证码位数n,循环n次
        Random r = new Random();
        //3)定义一个String类型的变量用于记住产生的每位随机字符
        String code = "";
        for (int i = 1; i <= n; i++) {
            // i = 1 2 3 4 5
            //2)每次循环，产生一个字符，可以是数字字符、或者大小写字母字符
            // 思路：随机一个0 1 2之间的数字出来，0代表随机一个数字字符，1、2代表随机大写字母，小写字母。
            int type = r.nextInt(3); // 0 1 2
            switch (type) {
                case 0:
                    // 随机一个数字字符
                    code += r.nextInt(10); // 0 - 9  code = code + 8
                    break;
                case 1:
                    // 随机一个大写字符 A 65   Z 65+25    (0 - 25) + 65
                    char ch1 = (char) (r.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 2:
                    // 随机一个小写字符 a 97   z 97+25    (0 - 25) + 97
                    char ch2 = (char) (r.nextInt(26) + 97);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
