package Chapter3_ProgramFlowControlStatement.Section03_Switch;

/**
 * 用switch语句实现键盘录入月份
 *
 * 分析:
 *     1,键盘录入一个月份用Scanner实现
 *     2,用switch语句实现即可
 */
import java.util.Scanner;
public class Node05_SwitchPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = sc.nextInt();
//        switch (month){
//            case 1:
//                System.out.println("冬季");
//                break;
//            case 2:
//                System.out.println("冬季");
//                break;
//            case 3:
//                System.out.println("春季");
//                break;
//            case 4:
//                System.out.println("春季");
//                break;
//            case 5:
//                System.out.println("春季");
//                break;
//            case 6:
//                System.out.println("夏季");
//                break;
//            case 7:
//                System.out.println("夏季");
//                break;
//            case 8:
//                System.out.println("夏季");
//                break;
//            case 9:
//                System.out.println("秋季");
//                break;
//            case 10:
//                System.out.println("秋季");
//                break;
//            case 11:
//                System.out.println("秋季");
//                break;
//            case 12:
//                System.out.println("冬季");
//                break;
//                default:
//                    System.out.println("这种月份没有季节");
//                    break;
//        }
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("这个月份不在四季之中");
                break;

        }

    }
}
