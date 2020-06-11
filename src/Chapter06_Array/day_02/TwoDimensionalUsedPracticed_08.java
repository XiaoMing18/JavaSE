package Chapter06_Array.day_02;

/**
 * 练习2:
 * 获取arr数组中所有元素的和
 * 提示:使用for嵌套循环即可
 *
 *
 *
 */
public class TwoDimensionalUsedPracticed_08 {
    public static void main(String[] args) {
        //练习2
        int arr[][] =new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i = 0;i < arr .length;i++){
            for (int j = 0;j < arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("总和为:"+sum);
    }
}
