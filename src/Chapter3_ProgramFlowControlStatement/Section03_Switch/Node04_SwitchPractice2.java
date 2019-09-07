package Chapter3_ProgramFlowControlStatement.Section03_Switch;

/**
 * 根据你键盘录入的字符传，判断是否有满足要求的,如果有,就输出;
 * 否则:提示有误
 */
import java.util.Scanner;
public class Node04_SwitchPractice2 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        System.out.println("请输入用于对比的字符串");
    String s = sc.nextLine();
    switch (s){
        case "Hello":
            System.out.println("你输入的是Hello，正确");
            break;
        case "world":
            System.out.println("你输入的是world");
            break;
            default:
                System.out.println("没有你输入的字符串");
                break;
    }

    }
}
