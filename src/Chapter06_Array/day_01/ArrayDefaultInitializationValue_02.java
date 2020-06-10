package Chapter06_Array.day_01;

/**
 * ArrayDefaultInitializationValue:数组的默认初始化值
 *
 *
 * 数组的默认初始化值:
 *      数组元素是整型:0
 *      数组元素是浮点型:0.0
 *      数组元素是浮点型:0或'/u000'
 *      数组元素是布尔型:false
 *      数组元素类型是引用数据类型:null
 *
 *
 */
public class ArrayDefaultInitializationValue_02 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("---------------------------");

        short[] arr1 = new short[4];
        for (short i = 0;i < arr.length;i++){
            System.out.println(arr1[i]);
        }

        System.out.println("---------------------------");
        float[] arr2 = new float[4];
        for (int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }

        System.out.println("---------------------------");
        char[] arr3 = new char[4];
        for (int i = 0;i < arr2.length;i++){
            System.out.println("--"+arr3[i]+"--");
        }

        System.out.println("---------------------------");
        boolean[] arr4 = new boolean[4];
        for (int i = 0;i < arr4.length;i++){
            System.out.println(arr4[i]);
        }

        System.out.println("---------------------------");
        String[] arr5 = new String[4];
        for (int i = 0;i < arr5.length;i++){
            System.out.println(arr5[i]);
        }

    }
}
