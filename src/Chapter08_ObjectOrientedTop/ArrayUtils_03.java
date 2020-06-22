package Chapter08_ObjectOrientedTop;

/**
 * 自定义数组工具类
 */
public class ArrayUtils_03 {
    //1,求数组的最大值
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for (int i = 0;i < arr.length;i++){
            if (maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    };

    //2,求数组的最小值
    public int getMin(int[] arr){
        return  0;
    }
    //3,求数组的总和
    public int getSum(int[] arr){
        return 0;
    }
    //4,求数组的平均值
    public int getAvg(int[] arr){
        return 0;
    }
    //5,反转数组
    public void reverse(int[] arr){

    }
    //6,复制数组
    public int[] copyArray(int[] arr){
        return null;
    }
    //7，数组排序
    public void sort(int[] arr){
        //冒泡排序
        for (int i = 0;i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1 - i;i++){

            }
        }

    }
    //8,遍历数组
    public void print(int[] arr){

    }
    //9,查找指定元素
    public int getIndex(int[] arr,int dest){
        return  0;
    }

}
