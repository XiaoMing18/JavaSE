package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement format3:if语句体3的练习

/**
 * 键盘录入月份的值，输出对应的季节
 * 春:3-5
 * 夏:6-8
 * 秋:9-11
 * 冬:12-2
 *
 */

import java.util.Scanner;

public class SelectionStructure_08_ifStatementformat3Pratice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份,之后将给你返回季节");
        int x = sc.nextInt();

        if (3<= x && x <= 5){
            System.out.println("现在应该是春天");
        }else if (6<=x && x<=8){
            System.out.println("现在应该是夏天");
        }else if (9 <= x && x <= 11){
            System.out.println("现在应该是秋天");
        }else if (x==12 || x==1){
            System.out.println("现在应该是冬天");
        }else if (x==2){
            System.out.println("现在是冬天");
        }else if (x < 1 || x >12){
            System.out.println("这个月份不存在");
        }


    }
}
