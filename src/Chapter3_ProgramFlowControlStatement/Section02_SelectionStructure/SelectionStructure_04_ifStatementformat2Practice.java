package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement format2 [ractice:if语句体2练习

/**
 * if格式语句2的练习
 * a,获取两个数据中较大的值
 * b,判断一个数据是奇数还是偶数，并输出
 */
import java.util.Scanner;
public class SelectionStructure_04_ifStatementformat2Practice {
    public static void main(String[] args) {
        //获取两个数据中较大的值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int x = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int y = sc.nextInt();

        if (x > y){
            System.out.println("两个数比较数字较大的是x:"+x);
        }else {
            System.out.println("两个数字较大的是y:"+y);

        }
        System.out.println("--------------------------------------------");



        //判断一个数据是奇数还是偶数
        System.out.println("请输入需要判断奇数还是偶数的数字:");
        int a = sc.nextInt();

        if (a%2 == 0){
            System.out.println("这个数是偶数");
        }else {
            System.out.println("这个数是奇数");
        }

    }



}
