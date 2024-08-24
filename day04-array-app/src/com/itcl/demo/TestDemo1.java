package com.itcl.demo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestDemo1 {
/* 1.数组求最值
       public static void main(String[] args) {
            int[] facescore = new int[]{12, 9000, 10000, 20000, 9500, -5};
            int max = facescore[0];
            for (int i = 1; i < facescore.length; i++) {
                if (facescore[i] > max){
                    max = facescore[i];
                }
            }
            System.out.println("最大值为"+max);
        }
*/

    /**
     * //代码规范化快捷键：Ctrl + Alt + L
     * //执行快捷键：Ctrl + Shift + F10
     */

    // Create local variable 'Array'        创建局部变量“Array”
    // Create field 'Array' in TestDemo1'   在TestDemo1中创建字段“Array”
    // Create parameter 'Array'             创建参数“Array”
    // Rename reference                     重命名引用
/*  2.数组反转
    public static void main(String[] args) {
        int[] num = new int[]{10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(num));

        for (int i = 0, j = num.length - 1; i < j; i++, j--) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
        System.out.println(Arrays.toString(num));
     }
*/
//      for(int i = 0; i<num.length; i++){
//          System.out.print(num[i]+" ");
//      }
//       System.out.println();
    public static void main(String[] arsgs) {
        int[] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第" + i + "个员工的工号：");
            codes[i] = sc.nextInt();
        }
        System.out.println("目前员工的工号顺序是：");
        System.out.println(Arrays.toString(codes));
        // 打乱数组中的元素顺序：每遍历到一个数据，都随机一个索引值出来，让当前数据与该索引位置处的数据进行交换。
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {    //codes.length.fori
            int index = r.nextInt(codes.length);    // 0 - 4
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        System.out.println("打乱后员工的工号顺序是：");
        System.out.println(Arrays.toString(codes));


    }

}
