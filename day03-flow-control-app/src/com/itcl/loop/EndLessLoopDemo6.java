package com.itcl.loop;

public class EndLessLoopDemo6 {
    public static void main(String[] args) {
        // 目标：掌握死循环的写法。

      /* for (int i = 0; ;i++ ){
            System.out.println("Hello World1");
        }*/
      /*  for ( ; ; ){
            System.out.println("Hello World1");
        }*/

      /*  while (true) {
            System.out.println("Hello World2");
        }*/

        do {
            System.out.println("Hello World3");
        }while (true);
    }
}
