package com.itcl.returndemo;

public class ReturnMycodeDemo2 {
    public static void main(String[] args) {
        chu(2, 1);
    }

    public static void chu(int a, int b) {
        if(b == 0){
            System.out.println("被除数为0不能做除法！");
        }
        int c = a / b;
        System.out.println("除法的结果是：" + c);
    }
}
