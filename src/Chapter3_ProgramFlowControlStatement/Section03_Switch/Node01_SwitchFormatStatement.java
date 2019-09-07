package Chapter3_ProgramFlowControlStatement.Section03_Switch;
//switch format Statement:Switch格式语句

/**
 * switch语句格式:
 *       switch(表达式):
 *           case 值1:
 *           语句体1;
 *           break;
 *           case 值2:
 *          语句体2;
 *          break;
 *          .....
 *          default :
 *             语句体n+1;
 *             break;
 *
 * 格式的解释:
 *     switch:表示这是switch的选择结构
 *     表达式:这个地方的取值是有限定的
 *     byte,short,int,char
 *     case:后面跟的是要和表达式进行比较的值
 *     语句体:要执行的代码
 *     break:表示中断,结束的意思,可以控制switch语句的结束
 *     default:当所有的值都和表达式不匹配的时候,就执行default控制的语句,相当于if语句的else
 * 题目:byte可以作为switch的表达式么
 *
 */
import java.util.Scanner;
public class Node01_SwitchFormatStatement {
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
