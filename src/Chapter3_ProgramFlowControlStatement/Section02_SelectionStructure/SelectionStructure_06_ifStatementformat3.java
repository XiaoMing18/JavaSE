package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement format3:if语句体3

/**
 * if语句的格式3:
 * if(关系表达式1){
 *     语句体1;
 * }else if(关系表达式2){
 *     语句体2;
 * }else if(关系表达式3){
 *     语句体3;
 * }....
 * else{
 *     语句体n+1;
 * }
 *
 * 执行流程:
 *     首先计算比较表达式1看其返回值是true还是false
 *     如果是true,就执行语句体1,if语句结束
 *     如果是false,计算比较表达式2看其返回的值是true还是false
 *     如果是true，就执行语句体2,if语句结束
 *     如果是false,计算比较表达式3看其返回值是true还是false
 *     。。。。
 *     如果都是false,就执行语句体n+1
 */
import java.util.Scanner;
public class SelectionStructure_06_ifStatementformat3 {
    public static void main(String[] args) {
        //键盘输入一个数字，并判断数字的高低
       Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数字并判断其高低");
       int x = sc.nextInt();

        if (x>75 && x <100){
            System.out.println("这个数偏大");

        }else if (x < 75 && x > 50){
            System.out.println("这个数正好");
        }else if(x > 25 && x <50){
            System.out.println("这个数偏小");
        }else {
            System.out.println("这个数太小");
        }

    }
}
