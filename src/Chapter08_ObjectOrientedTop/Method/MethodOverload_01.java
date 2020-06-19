package Chapter08_ObjectOrientedTop.Method;

import Chapter07_ObjectOriented.day_01.MethodPracticed_05.MethodStatement_05;

/**
 * 方法重载
 * 1,在同一个类中,允许存在一个以上的同名方法,
 * 只要他们的参数个数或者参数类型不同即可
 *
 * 两同一不同:同一个类,相同方法名,
 *          参数列表不同,参数个数不同,参数类型不同,
 *
 * 2,举例:
 *    Arrays类中重载的sort()/binarySearch()
 *
 * 3,判断是否是重载
 *      跟方法的权限修饰符,返回值类型,形参变量名,方法体都没有关系
 *
 *  4,在通过对象调用方法时,如何确定某一个指定的方法
 *         方法名-->参数列表-->
 *
 *
 */
public class MethodOverload_01 {
    public static void main(String[] args) {
        MethodOverload_01 m = new MethodOverload_01();
        m.getSum("这是一个字符串",9);
    }
    //如下的四个方法构成了重载
    public void getSum(int i,int j){
        System.out.println("i + j 为:"+ i + j);
    }
    public void getSum(double d1,double d2){
        System.out.println("浮点数相加:"+d1 + d2);

    }
    public void getSum(String s,int i){
        System.out.println("字符串与整数:" + s + i);

    }
    public void getSum(int i,String s){
        System.out.println("字符串加数字:"+ s + i );
    }
    //参数名无所谓，主要是参数类型和个数
    //下面一个不行
    //public void getSum(int m,int n){
    //}
    private void getSum(){}
}
