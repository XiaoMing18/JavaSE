package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement format3:if语句体3的练习
/**
 * 三种if语句分别适合做什么事情呢?
 * 格式1;适合做单个判断
 * 格式2;适合做两个判断
 * 格式3;适合做多个判断
 */

/**
 * 需求:
 *     键盘录入x的值,计算出y的并且输出
 *     x > 3    y = 2x + 1;
 *     -1<=x<3  y = 2x;
 *     x<=-1    y = 2x - 1;
 */

import java.util.Scanner;

public class SelectionStructure_07_ifStatementformat3Pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值:" );
        int y;
        int x = sc.nextInt();

        if (x > 3){
            System.out.println("y=2x+1:"+(2*x+1));
        }else if (-1<=x&&x<3){
            System.out.println("y=2x:"+(2*x));
        }else {
            System.out.println("y=2x-1:"+(2*x-1));
        }

    }
}
