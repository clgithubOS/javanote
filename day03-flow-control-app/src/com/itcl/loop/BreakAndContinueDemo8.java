package com.itcl.loop;

import java.util.Scanner;

public class BreakAndContinueDemo8 {
    public static void main(String[] args) {
        // 目标：掌握break和continue的作用。
        // 1、break:跳出并结束当前所在循环的执行。
        // 场景：假如你又有老婆了，你犯错了，你老婆罚你说：5句我爱你
        // 说到第三句的时候心软了，让你别再说了。
        for (int i = 1; i <= 5; i++) {
            System.out.println("我爱你：" + i);
            if(i == 3){
                // 说明已经说完了第三句了，心软了。
                break; // 跳出并结束当前所在循环的执行。
            }
        }

        // 2、continue:跳出当前循环的当次执行，直接进入循环的下一次执行。
        // 场景: 假如你有老婆，你犯错了，你老婆罚你洗碗5天。
        // 第三天的时候，你表现很好，第三天不用洗碗，但是不解恨，第四天还是要继续的。
        for (int i = 1; i <= 5; i++) {
            if(i == 3) {
                // 已经到了第三天，第三天不用洗的。
                continue;
            }
            System.out.println("洗碗：" + i);
        }

        if(3 < 9){
            //break;
            // continue;
            System.out.println("Hello World");
        }

/*        需求：
        系统密码是520，请用户不断的输入密码验证，验证不对输出：密码错误，验证成功输出：欢迎进入系统，并停止程序。*/
        Scanner sc = new Scanner(System.in);

        int truepassword = 520;//设置省却密码为520
        System.out.println("请您输入您的密码：");
        while(true){
            int password = sc.nextInt();
            if(password == truepassword){
                System.out.println("欢迎进入系统");
                break;
            }else{
                System.out.println("密码错误！");
                System.out.println("----------------------------------");
                System.out.println("请再次您输入您的密码：");
            }
        }




    }
}
