package com.itcl.branch;

/**
   目标：掌握switch的写法，理解其执行流程
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        //周一：埋头苦干，解决bug
        //周二：请求大牛程序员帮忙
        //周三：今晚啤酒、龙虾、小烧烤
        //周四：主动帮助新来的女程序解决bug
        //周五：今晚吃鸡
        // 周六：与王婆介绍的小芳相亲
        // 周日：郁郁寡欢、准备上班。

        String week = "周三";
        switch (week){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "周四":
                System.out.println("主动帮助新来的女程序解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
            case "周六":
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case "周日":
                System.out.println("郁郁寡欢、准备上班");
                break;
            default:
                System.out.println("您输入的星期信息不存在~~~");
        }

        int choice = 3;
        switch (choice) {
            case 1 :
                System.out.println("C语言");
                break;
            case 2 :
                System.out.println("C++");
                break;
            case 3 :
                System.out.println("java");
                break;
            case 4 :
                System.out.println("long");
                break;
            default :
                System.out.println("您输入的高级语言不正确！");
        }


    }
}
