package Chapter07_ObjectOriented.day_01;

/**
 * 一,设计类,其实就是设计类的成员
 *    属性 = 成员变量 = field = 域，字段
 *    方法 = 成员方法 = 函数 = method
 *
 *    创建类的对象 = 类的实例化 = 实例化类
 *
 *  二,类和对象的使用(面向对象思想落地的实现)
 *     1,创建类:设计类的成员
 *     2,创建类的对象
 *     3,通过"对象.属性"或"对象.方法"调用对象的结构
 *
 *  三,如果创建了一个类的多个对象,则每个对象都独立的拥有一套类的属性(非static)
 *     意味着:如果我们修改一个对象的属性a，则不影响另外一个对象属性a的值
 *
 *  四,对象的内存解析
 *     堆(Heap):存放对象实例
 *     栈(Stack):存储局部变量
 *     方法区(Method Area):类信息，常量，静态变量，
 *                        即时编译后的代码
 *
 *
 */

//测试类
public class PropertyMethod_02 {
    public static void main(String[] args) {
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

    }
}
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
