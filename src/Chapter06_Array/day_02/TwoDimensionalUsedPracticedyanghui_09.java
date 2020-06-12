package Chapter06_Array.day_02;

/**
 * 杨辉三角
 * 使用二维数组打印一个10行的杨辉三角
 *
 * [提示]
 * 1,第一行有1个元素,第n行有n个元素
 * 2,每一行的第一个元素和最后一个元素都是1
 * 3,从第三行开始，对于非第一个元素和最后一个元素
 *
 * yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i-1][j];
 *
 */
public class TwoDimensionalUsedPracticedyanghui_09 {
    public static void main(String[] args) {
        //1,声明并初始化二维数组
        int [] [] yangHui = new int[10][];
        //2,给数组的元素赋值
        for (int i = 0;i < yangHui.length;i++){
            yangHui[i] = new int[ i + 1 ];
        }

        //3,遍历二维数组

    }

}
