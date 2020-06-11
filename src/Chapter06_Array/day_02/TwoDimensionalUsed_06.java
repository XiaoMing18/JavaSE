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
        String[] [] arr2 = new String[0][1];
        //二维数组动态初始化2
        String [] [] arr3 = new String[3][];


    }
}
