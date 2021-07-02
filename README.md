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



```java
规定:二维数组分为外层数组的元素,内层数组的元素     int[] arr = new int[4][3];     
外层元素:arr[0],arr[1]等   
内层元素:arr[0][0],arr[1][2]等
```



1. ①数组元素的默认初始化值  

  

  针对初始化方式一:

   比如:int[][] arr = new int[4][3];

  外层元素的初始化值为:地址值

  内层元素的初始化值:与一位数组初始化情况相同



​        初始化方式二:

​        比如:  int [][] arr = new int[4][0];

​        外层元素的初始化值为:null

​        内层元素的初始化值:不能调用,否则报错

  

  ②数组内存解析





# chapter7
### 面向对象

>  一, Java面向对象学习的三条主线   
>>  1. Java类及其类的成员:属性,方法,构造器,代码块，内部类    
>>  2. 面向对象三大特征：封装性,继承性,多态性（抽象性）  
>>  3. 其他关键字：this,super,static,final,interface,package





###### 二,“人把大象装进冰箱”

######  1,面向过程:强调的是功能能行为,以函数为最小单位,考虑怎么做

###### *①把冰箱门打开*

######  ②抬起大象,塞进冰箱

###### ③把冰箱门关闭



###### 2,面向对象:强调具备了功能的对象,以类/对象为最小单位，考虑谁来做  

```java
人{
        打开(冰箱){
            冰箱.打开();
        }
        抬起(大象){
            大象.进入(冰箱);
        }
 
        关闭(冰箱){
            冰箱.闭合();
        }
    }
 
    冰箱{
        打开(){}
        闭合(){}
    }
 
    大象{
        进入(冰箱){
 
        }
    }
```




###### 三，面向对象的两个要素:
###### 类:对一类事物的描述,是抽象的,概念上的定义
###### 对象:是实际存在的该类事物的每个个体,因而也被称为实例(instance)
######  面向对象程序设计的重点是类的设计    

###### 设计类,就是设计类的成员



###### 一,设计类,其实就是设计类的成员
###### 属性 = 成员变量 = field = 域，字段
###### 方法 = 成员方法 = 函数 = method
###### 创建类的对象 = 类的实例化 = 实例化类

```java
//1，创建类:设计类的成员
class Person{
    //属性
    String name;
    int age = 1;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人需要休息");
    }
    public void talk(String language){
        System.out.println("人与人之间可以友好沟通,使用的是" + language);
    }
}
```




###### 二,类和对象的使用(面向对象思想落地的实现)
###### 1,创建类:设计类的成员
###### 2,创建类的对象
###### 3,通过"对象.属性"或"对象.方法"调用对象的结构

```java
//2，创建类的对象
        // 创建personal对象
        Person p = new Person();
        //调用对象的结构:属性，方法
        //调用属性"对象.属性"
        p.name = "HuangChen";
        p.isMale = true;
        System.out.println(p.name);

        //调用方法:"对象.方法"
        p.eat();
        p.sleep();
        p.talk("Chinese");

        System.out.println("---------------------------");
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.isMale);
        System.out.println("---------------------------");
        //将p变量保存的对象地址值赋值给p2，
        // 导致p和p2指向了堆空间中的同一个对象实体
         Person p2 = p;
        System.out.println(p2.name);

        p2.age = 10;
        System.out.println(p2.age);
```



###### 三,如果创建了一个类的多个对象,则每个对象都独立的拥有一套类的属性(非static)     

###### 意味着:如果我们修改一个对象的属性a，则不影响另外一个对象属性a的值



###### 四,对象的内存解析
###### 堆(Heap):存放对象实例
###### 栈(Stack):存储局部变量
###### 方法区(Method Area):类信息，常量，静态变量， 即时编译后的代码






###### PropertyUsed:属性的使用
###### 类中属性的使用


属性(成员变量) vs 局部变量
1,相同点
* 1.1 定义变量的格式:数据类型 变量名 = 变量值   
* 1.2 先声明后使用
* 1.3 变量都有其对应的作用域



2,不同点
* 2.1,在类中声明的位置不同
   属性:直接定义在类的一对{}内
   局部变量:声明在方法内,方法形参，代码块内，构造器形参，构造器内部的变量
* 2.2 关于权限修饰符的不同
   属性:可以在声明属性时指明其权限,使用权限修饰符
   常用的权限修饰符有哪些:   private,public,缺省(不写,默认就是缺省),protected
   局部变量:不可以使用权限修饰符
* 2.3 默认初始化值的情况:
   属性:类的属性,根据其类型,都有默认初始化值
   整型(byte,short,int,long),0
   浮点型(float,double):0.0
   字符型(char):0(或'\u0000')
   布尔类型(boolean):false
   引用数据类型(类,数组,接口):null



局部变量:没有默认初始化值
意味着,我们再调用局部变量之前,一定要显式赋值。
特别的，形参在调用时赋值即可




* 2.4 在内存中加载的位置
   属性:加载到堆空间(非static)
   局部变量:

```java
class User{
    //属性(或成员变量)
    String name;
    int age;
    boolean isMale;
    public void talk(String language){//language:形参,也是局部变量
        System.out.println("我们使用" + language + "进行交流");

    }
    public void eat(){
        String food = "烙饼";//局部变量
        System.out.println("北方人喜欢吃:"+food);
    }

}
```


































