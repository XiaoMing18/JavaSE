package Chapter3_ProgramFlowControlStatement.Section04_For;
//获取数据
/**
 * for循环练习:
 * 2求出1-10的数据和
 *      分析:
 *          0+1=1
 *              1+2=3
 *                  3+3=6
 *                      6+4=10
 *                           10+5=15
 *                           ......
 *       需要定义两个变量:
 *           一个变量用于存储第一个加数,第一个加数其实保存的是以前的所有数据和,默认初始化值应该是0
 *           一个变量用于存储第二个加数,第二个加数其实就是每次的数据变化的值
 *
 */
public class Node03_ForPracticeGetData {
    public static void main(String[] args) {
       //定义第一个加数
        int sum = 0;
        for (int x = 1;x <= 10;x++){
             sum = sum + x;
            /**
             * 0 + 1  = 1
             * 1 + 2 = 3
             *
             */
        }
        System.out.println("1-10的数据之和为:" + sum);
    }
}
