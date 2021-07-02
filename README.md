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



#### if statement format3:if语句体3的练习

  键盘录入月份的值，输出对应的季节
  春:3-5
  夏:6-8
  秋:9-11
  冬:12-2





# Chapter5

## 方法

方法:完成特定功能的代码块
方法格式:

```
修饰符 返回值类型 方法名 (参数类型 参数1,参数类型 参数2....){
      方法体语句;
      return 返回值;
}  
```
详细解释:

修饰符:public static    


返回值类型:功能结果的数据类型     


方法名:符合命名规则,方便调用      
参数:
实际参数:实际参与运算的
形式参数:方法定义上的，用于接收实际参数的
参数类型:参数的数据类型
参数名:变量名
方法体语句:完成功能的代码
return:结束方法
返回值:就是功能的结果,由return带给调用者
写好一个方法有两个明确
1返回值类型
结果的数据类型
2参数列表
要传递的参数有几个，数据类型分别是什么



### 方法调用

a,单独调用

b,输出调用

c,赋值调用(推荐)



Function void Define and invoke:方法void类型定义和调用
void类型的返回值的方法调用 

+ 单独调用 
+ 输出调用(错误) 
+ 赋值调用(错误) 



### 方法重载

方法重载:方法的方法名和功能相同，名字一样,方法的参数个数不同
参数列表不同:                
a,参数个数不同               
b,参数类型不同





# Chapter6

## 数组

#### 数组概述

###### 一维数组的使用

#### 1. 一维数组的声明和初始化

```java
        int num;//声明
        num = 100;//初始化
        int id = 1000;//声明+初始化


        int [] ids;//声明
        //1.1静态初始化:数组的初始化和数组元素的赋值同时进行
        ids =new int[] {1001,1002,1003,1004,1005};
        //1.2动态初始化:数组的初始化和数组元素的赋值分开进行
        String[] names = new String[5];


        //总结:数组一旦初始化完成,长度就确定了
```

##### 2. 如何调用数组指定位置的元素

```java
        //数组的角标(索引)从0开始,到数组长度-1结束
        names[0] = "一";
        names[1] = "二";
        names[2] = "三";
        names[3] = "四";
        names[4] = "五";
        System.out.println(names[4]);
```



#####  3. 如何获取数组长度

```java
 //属性:length
        System.out.println(names.length);//5
        System.out.println(ids.length);//5
```



###### 数组的默认初始化值

* 数组元素是整型:0    
* 数组元素是浮点型:0.0     
* 数组元素是浮点型:0或'/u000'     
* 数组元素是布尔型:false      
* 数组元素类型是引用数据类型:null



####  二维数组的声明和初始化

#####  1. 理解
 对于二维数组的理解,我们可以看成是一维数组array1又作为另一个一位数组array2的元素而存在,其实,从数组底层的运行机制来看,其实没有多维数组


#####  2.二维数组的使用

1,二维数组的声明和初始化

```java
 //1,二维数组的声明和初始化
        int[] arr = new int[]{1,2,3};//一维数组
        //二维数组静态初始化
        int[] [] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        //二维数组动态初始化1
        String[] [] arr2 = new String[3][2];
        //二维数组动态初始化2
        String [] [] arr3 = new String[3][];
```



2,如何调用数组的指定元素

```java
//2,如何调用数组的指定元素
        System.out.println(arr1[0][1]);//第一个数组的第二个元素:2
        System.out.println(arr2[1][1]);//null
```



3,获取数组长度

```java
//3,获取数组长度
        System.out.println(arr1.length);//3
        System.out.println(arr1[1].length);//2
```



4,遍历二维数组

```java
//4,遍历二维数组
        for (int i = 0; i < arr1.length;i++){
            for (int j = 0;j < arr1[i].length;j++){
                System.out.print(arr1[i][j] + "    ");
            }
            System.out.println();
        }

```




























