package Chapter06_Array.day_01;

/**
 * LinearArrayInitialize：一维数组初始化
 *
 * 一维数组的使用
 * 1,一维数组的声明和初始化
 * 2,如何调用数组指定位置的元素
 * 3,如何获取数组长度
 * 4,如何遍历数组
 * 5,数组的默认初始化值
 * 6,数组的内存解析
 *
 */
public class LinearArrayInitialize_01 {
    public static void main(String[] args) {
        //1一维数组的声明和初始化
        int num;//声明
         num = 100;//初始化
        int id = 1000;//声明+初始化


        int [] ids;//声明
        //1.1静态初始化:数组的初始化和数组元素的赋值同时进行
        ids =new int[] {1001,1002,1003,1004,1005};
        //1.2动态初始化:数组的初始化和数组元素的赋值分开进行
        String[] names = new String[5];


        //总结:数组一旦初始化完成,长度就确定了



        //2,如何调用数组指定位置的元素:通过角标的方式调用
        //数组的角标(索引)从0开始,到数组长度-1结束
        names[0] = "一";
        names[1] = "二";
        names[2] = "三";
        names[3] = "四";
        names[4] = "五";
        System.out.println(names[4]);


        //3，如何获取数组长度
        //属性:length
        System.out.println(names.length);//5
        System.out.println(ids.length);//5


        System.out.println("------------------------------");
        //4,如何遍历数组
        for (int i =1 ;i < names.length;i++){
            System.out.println(names[i]);

        }








    }
}
