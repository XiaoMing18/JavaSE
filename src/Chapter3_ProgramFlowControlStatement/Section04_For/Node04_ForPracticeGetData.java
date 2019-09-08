package Chapter3_ProgramFlowControlStatement.Section04_For;
//获取数据

/**
 * 需求:
 *     求1-100之和
 *     求出1-100之间偶数和
 *     求出1-100之间奇数和
 */
public class Node04_ForPracticeGetData {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 1;x <= 100;x ++){
            sum = sum + x;
        }
        System.out.println("sum:" + sum);
        System.out.println("-----------------------------------------");

        int sum2 = 0;
        for (int i = 1;i <= 100;i++){
            if (i%2 == 0){
                sum2 = sum2 + i;
            }
        }
        System.out.println("sum2:" + sum2);
        System.out.println("-----------------------------------");


        int sum3 = 0;
        for (int i = 1;i <= 100;i++){
            if (i%2 != 0){
                sum3 = sum3 + i;
            }
        }
        System.out.println("sum3:" + sum3);
    }
}
