package Chapter06_Array.day_02;

/**
 * 二维数组的使用
 * 规定:二维数组分为外层数组的元素,内层数组的元素
 *     int[] arr = new int[4][3];
 *     外层元素:arr[0],arr[1]等
 *     内层元素:arr[0][0],arr[1][2]等
 *
 * ①数组元素的默认初始化值
 *  针对初始化方式一:
 *  比如:
 *  int[][] arr = new int[4][3];
 *  外层元素的初始化值为:地址值
 *  内层元素的初始化值:与一位数组初始化情况相同
 *
 *  初始化方式二:
 *  比如:
 *  int [][] arr = new int[4][0];
 *  外层元素的初始化值为:null
 *  内层元素的初始化值:不能调用,否则报错
 *
 *
 * ②数组内存解析
 *
 */
public class TwoDimensionalUsed_07 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//地址值
        System.out.println(arr[0][0]);//整数默认是0

        System.out.println("-------------------");

        //方式二:
         int [][] arr2 = new int[4][];
        System.out.println(arr2[1]);//null
        System.out.println(arr2[1][0]);//空指针异常


    }
}
