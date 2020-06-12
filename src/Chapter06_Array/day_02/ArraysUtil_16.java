package Chapter06_Array.day_02;

import java.util.Arrays;

/**
 * java.util.Arrays:操作数组的工具类,里面定义了很多操作数组的方法
 *
 */
public class ArraysUtil_16 {
    public static void main(String[] args) {
        //1,boolean equals(int[] a,int[] b):判断两个数组是否相等
        int [] arr1 = new int[]{1,2,3,4};
        int [] arr2 = new int[]{1,3,2,4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //2,String toString(int[] a):输出数组信息
        System.out.println(Arrays.toString(arr1));

        //3,void fill(int[] a,int val):将指定的值填充到数组当中(替换)
        Arrays.fill(arr1,100);
        System.out.println(Arrays.toString(arr1));

        //4,void sort(int[] a):对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5,int binarySearch(int[] a,int key)
        int[] arr3 = new int[]{1,2,3,4,5,6,7,8,9,12,34,56,789};
        int index = Arrays.binarySearch(arr3,34);
        //System.out.println(index);
        if (index >= 0){
            System.out.println(index);
        }else {
            System.out.println("未找到");
        }
    }
}
