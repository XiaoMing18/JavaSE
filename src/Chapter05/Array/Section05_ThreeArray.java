package Chapter05.Array;
//三个数组内存图解

/**
 * 定义第一个数组,定义完毕,给数组元素赋值,赋值完毕后,再输出数组名和元素
 * 定义第二个数组,定义完毕,给数组元素赋值,赋值完毕后,再输出数组名和元素
 * 定义第三个数组,把第一个元素的地址值给它(注意类型一致),通过第三个数组的名称去把元素重复赋值
 * 最后,再次输出数组名称和元素
 */
public class Section05_ThreeArray {
    public static void main(String[] args) {
        //定义第一个数组
        int [] arr = new int[3];
        arr[0] = 88;
        arr[1] = 33;
        arr[2] = 66;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("-----------------------");
        //定义第二个数组
        int [] arr2 = new int[3];
        arr2[0] = 22;
        arr2[1] = 44;
        arr2[2] = 55;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("-----------------------");
        //定义第三个数组
        int [] arr3 = new int[3];
        arr3[0] = 88;
        arr3[1] = 33;
        arr3[2] = 66;
        System.out.println(arr3);
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println("-----------------------");



    }
}
