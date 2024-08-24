# javanote
个人的java笔记

# 代码片段加强
## 3.day06-ex03：评委打分

```java
1.动态初始化数组
int[] scores = new int[n];
Scanner sc = new Scanner(System.in);

for(int i = 0; i < scores.length; i++){
    System.out.println("请输入"+(n+1)"个数组元素：")
    int score = sc.nextInt();
    scores[i] = score;
}

2.求和、求最大值、求最小值
int sum = 0;
int max = scores[0];
int min = scores[0];

for(int i=0;i<scores.length;i++){
    int score = scores[i];
    sum += socre;	// 求和
    if(score > max){// 求最大值
        max = score;
    }
    if(score < min){// 求最小值
        min = score;
    }
}
```



## 4.day06_ex04：加密

```java
1.取需要加密的四位数的每一位
public static int[] split(int number){
    int[] numbers = new int[4];
    numbers[0] = number / 1000;
    numbers[1] = (number / 100) % 10;
    numbers[2] = (number / 10) % 10;
    numbers[3] = number % 10;
}

2.反转数组
public static int[] reverse(int[] numbers){
    for(int i = 0; i < numbers.length; i++){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    return numbers;
}

3.把数组中的数拼成一个字符串
public static String A(int[] numbers){
    String data = "";
    for(int i = 0; i < numbers.length; i++){
        data += numbers[i];
    }
    return data;
}
```

## 5.day06_ex05：数组拷贝

```java
1.数组拷贝是什么意思？
    创建出一个与原数组一模一样的数组出来。
    而不是把数组变量赋值给另一个数组变量。
    
2.拷贝数组
    public static int[] arrCopy(int[] arr1){
    int arr2 = new int[arr1.length];//创建一个与arr1长度相同的数组
    for(int i = 0; i < arr1.length; i++){
        arr2[i] = arr1[i];
    }
}

3.打印数组
    public static void arrPrint(int[] arr){
    System.out.print("[");
    for(int i = 0; i < arr.length; i++){
        System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");//打印 ","+空格
    }
    System.out.println("]");
}

等同于：
import java.util.Arrays;    
System.out.println(Arrays.toString(arr));
```

datetime:24-08-22-22：00



## 6.day06_ex06：抽红包

```java
1.随机生成一个数组索引范围内的值。
int[] moneys = new int[]{1,2,3,4,5}
int index = r.nextInt(moneys.length);
//数组长度为5，产生0-4的随机数，正好是数组所有的索引

2.打乱数组中的元素顺序。
public static void shuffle(int[] moneys){
    Random r = new Random();
    for(int i = 0; i < moneys.length; i++){
        // 每遍历到一个数据，都随机一个数组索引范围内的值。
        // 然后让当前遍历的数据与该索引位置处的值交换。
        int index = r.nextInt(moneys.length);
        int temp = moneys[i];
        moneys[i] = moneys[index];
        moneys[i] = temp;
    }
}


3.//等待用户输入任意内容，按回车之后才向下执行
Scanner sc = new Scanner(System.in);
System.out.println("请输入任意内容来发起抽奖：");//提示输入
sc.next();//等待用户输入任意内容，按回车之后才向下执行

4.抽奖//等待用户输入任意内容，按回车之后才向下执行
public static void raffle(int[] moneys){
    shuffle(moneys);
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < moneys.length; i++){
        System.out.println("请输入任意内容来发起抽奖：");
        sc.next();//等待用户输入任意内容，按回车之后才向下执行
        System.out.println("恭喜您抽到了红包：" +moneys[i]);
    }
    System.out.println("红包抽完了！活动结束了！");
}

```

