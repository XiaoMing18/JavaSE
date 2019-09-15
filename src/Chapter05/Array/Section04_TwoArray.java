package Chapter05.Array;
//两个数组内存图解
/**
 * 定义两个数组分别输出,分别输出两个数组各自的数组名及元素值
 * 然后给每个数组的元素重新赋值,再次分别输出两个数组各自的数组名及元素值
 */
public class Section04_TwoArray {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr = new int[2];
        //定义第二个数组
        int [] arr2 = new int[3];


        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("-----------------------------");


        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("----------------------------");

        //给元素重新赋值
        arr[1] = 20;
        arr2[1] = 30;
        arr2[2] = 40;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("-----------------------------");


        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("----------------------------");



    }
}
