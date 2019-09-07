package Chapter3_ProgramFlowControlStatement.Section03_Switch;

import java.util.Scanner;

/**
 * Switch语句的注意事项
 * case后面只能是常量不能是变量,而且多个case后面的值不能出现相同的
 * default可以省略么"
 *    可以省略但是不建议,因为它的作用是对于不正常的情况给出提示
 */
public class Node02_SwitchAttention {
    public static void main(String[] args) {
        //案例:键盘录入一个数据,根据数据我们输出星期几?
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你想要查询的数字?");
        int week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case  2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case  5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("不能存在这样的星期");
        }

    }
}
