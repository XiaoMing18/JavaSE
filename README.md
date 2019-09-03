# &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;JavaSE
## Chapter3:流程控制语句
#### ProgramFlowControlStatement:流程控制语句
##### 概述:控制程序的执行流程
##### 分类:
 + 顺序结构<br/>
 + 选择结构<br/>
 + 循环结构<br/> 
### Section01：顺序结构语句
#### Sequential structure statement:顺序结构语句
##### 顺序结构语句:从上往下,依次执行



### Section02:选择结构

SelectionStructure:选择结构

```java
if语句:
  switch语句:
 
  if语句:
  格式1:
  格式2:
  格式3:
 
 
  if语句的格式：
      if(比较表达式){
          语句体;
      }
     
```

 执行流程:先计算比较表达式的值,看其返回值是true还是false,
 如果是true就执行语句体,
 如果是false就不执行语句体







### if statement matters need attention:if语句注意事项

a,比较表达式无论是简单还是复杂,结果必须是boolean类型

b,if语句控制的语句体如果只是一条语句,大括号可以省略,不过建议不要提高代码的可读性

c,一般来说,有左大括号就没有分号,有分号就没有左大括号





```java
if statement format:if语句体2


      if(比较表达式){
           语句体1;
       }else{
           语句体2;
       }
  
```

执行流程:首先看比较表达式的值,看其返回值是true还是false
                如果是true就执行语句体1,
                如果是false就执行语句体2;

注意:else后面是没有条件表达式的，只有if后面有条件表达式







#### if格式语句2的练习

a,获取两个数据中较大的值
b,判断一个数据是奇数还是偶数，并输出

```java
package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement format:if语句体2

/**
 *       if(比较表达式){
 *           语句体1;
 *       }else{
 *           语句体2;
 *       }
 *  执行流程:首先看比较表达式的值,看其返回值是true还是false
 *           如果是true就执行语句体1,
 *           如果是false就执行语句体2;
 *
 *  注意:else后面是没有条件表达式的，只有if后面有条件表达式
 */
public class SelectionStructure_03_ifStatementformat2 {
    public static void main(String[] args) {
        //判断两个数是否相等
        int a = 10;
        int b = 20;
        if (a == b){
            System.out.println("a与b是相等的");
        }else {
            System.out.println("a与b是不等的");
        }
    }
}

```






#### if格式语句2与三元相互转换

区别:
1,三元运算符实现的都可以采用if语句实现,反之不成立

2,什么时候if语句实现不能用三元改进呢?
当if语句控制的操作是一个输出语句的时候

3为什么?
因为三元运算符是一个运算符,运算符操作完毕就应该有一个结果,而不是一个输出









#### if语句的格式3:

```java
if(关系表达式1){     
语句体1;
}else if(关系表达式2){
语句体2; 
}else if(关系表达式3){
语句体3;* }....
else{    
语句体n+1; } 
```
执行流程:    
首先计算比较表达式1看其返回值是true还是false     
如果是true,就执行语句体1,if语句结束   
如果是false,计算比较表达式2看其返回的值是true还是false     
如果是true，就执行语句体2,if语句结束     
如果是false,计算比较表达式3看其返回值是true还是false     。。。。   
如果都是false,就执行语句体n+1

```java
package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement format3:if语句体3

/**
 * if语句的格式3:
 * if(关系表达式1){
 *     语句体1;
 * }else if(关系表达式2){
 *     语句体2;
 * }else if(关系表达式3){
 *     语句体3;
 * }....
 * else{
 *     语句体n+1;
 * }
 *
 * 执行流程:
 *     首先计算比较表达式1看其返回值是true还是false
 *     如果是true,就执行语句体1,if语句结束
 *     如果是false,计算比较表达式2看其返回的值是true还是false
 *     如果是true，就执行语句体2,if语句结束
 *     如果是false,计算比较表达式3看其返回值是true还是false
 *     。。。。
 *     如果都是false,就执行语句体n+1
 */
import java.util.Scanner;
public class SelectionStructure_06_ifStatementformat3 {
    public static void main(String[] args) {
        //键盘输入一个数字，并判断数字的高低
       Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数字并判断其高低");
       int x = sc.nextInt();

        if (x>75 && x <100){
            System.out.println("这个数偏大");

        }else if (x < 75 && x > 50){
            System.out.println("这个数正好");
        }else if(x > 25 && x <50){
            System.out.println("这个数偏小");
        }else {
            System.out.println("这个数太小");
        }

    }
}

```







#### if statement format3:if语句体3的练习

```
 三种if语句分别适合做什么事情呢? 
 格式1;适合做单个判断 
 格式2;适合做两个判断 
 格式3;适合做多个判断 
 需求:      
 键盘录入x的值,计算出y的并且输出 
 x > 3    y = 2x + 1; 
 -1<=x<3  y = 2x; 
 x<=-1    y = 2x - 1;
```

```java
package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement format3:if语句体3的练习
/**
 * 三种if语句分别适合做什么事情呢?
 * 格式1;适合做单个判断
 * 格式2;适合做两个判断
 * 格式3;适合做多个判断
 */

/**
 * 需求:
 *     键盘录入x的值,计算出y的并且输出
 *     x > 3    y = 2x + 1;
 *     -1<=x<3  y = 2x;
 *     x<=-1    y = 2x - 1;
 */

import java.util.Scanner;

public class SelectionStructure_07_ifStatementformat3Pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值:" );
        int y;
        int x = sc.nextInt();

        if (x > 3){
            System.out.println("y=2x+1:"+(2*x+1));
        }else if (-1<=x&&x<3){
            System.out.println("y=2x:"+(2*x));
        }else {
            System.out.println("y=2x-1:"+(2*x-1));
        }

    }
}

```







#### if statement format3:if语句体3的练习

  键盘录入月份的值，输出对应的季节
  春:3-5
  夏:6-8
  秋:9-11
  冬:12-2

```java
package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement format3:if语句体3的练习

/**
 * 键盘录入月份的值，输出对应的季节
 * 春:3-5
 * 夏:6-8
 * 秋:9-11
 * 冬:12-2
 *
 */

import java.util.Scanner;

public class SelectionStructure_08_ifStatementformat3Pratice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份,之后将给你返回季节");
        int x = sc.nextInt();

        if (3<= x && x <= 5){
            System.out.println("现在应该是春天");
        }else if (6<=x && x<=8){
            System.out.println("现在应该是夏天");
        }else if (9 <= x && x <= 11){
            System.out.println("现在应该是秋天");
        }else if (x==12 || x==1){
            System.out.println("现在应该是冬天");
        }else if (x==2){
            System.out.println("现在是冬天");
        }else if (x < 1 || x >12){
            System.out.println("这个月份不存在");
        }


    }
}

```

