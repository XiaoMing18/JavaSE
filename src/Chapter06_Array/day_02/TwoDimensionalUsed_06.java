package Chapter06_Array.day_02;

/**
 * 二维数组的使用
 *
 * 1,理解
 * 对于二维数组的理解,我们可以看成是一维数组array1又作为另一个一位数组array2的元素而存在,
 * 其实,从数组底层的运行机制来看,其实没有多维数组
 *
 * 2,二维数组的使用
 * 二维数组的声明和初始化
 *
 */
public class TwoDimensionalUsed_06 {
    public static void main(String[] args) {
    //1,二维数组的声明和初始化
        int[] arr = new int[]{1,2,3};//一维数组
        //二维数组静态初始化
        int[] [] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        //二维数组动态初始化1
        String[] [] arr2 = new String[3][2];
        //二维数组动态初始化2
        String [] [] arr3 = new String[3][];


    //2,如何调用数组的指定元素
        System.out.println(arr1[0][1]);//第一个数组的第二个元素:2
        System.out.println(arr2[1][1]);//null
        System.out.println("---------------------------------------");


    //3,获取数组长度
        System.out.println(arr1.length);//3
        System.out.println(arr1[1].length);//2
        System.out.println("----------------------");

    //4,遍历二维数组
        for (int i = 0; i < arr1.length;i++){
            for (int j = 0;j < arr1[i].length;j++){
                System.out.print(arr1[i][j] + "    ");
            }
            System.out.println();
        }


    }
}
