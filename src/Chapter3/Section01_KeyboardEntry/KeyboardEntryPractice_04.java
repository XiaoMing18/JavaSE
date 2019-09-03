package Chapter3.Section01_KeyboardEntry;

/**
 * 键盘录入练习:
 *
 * 3键盘录入三个数据，比较这三个数据的最大值
 * 4键盘录入两个数据，比较这两个数据是否相等
 */

import java.util.Scanner;

public class KeyboardEntryPractice_04 {
    public static void main(String[] args) {
        //键盘录入三个数据，求三个数据之中最大值,输出其结果
        //创建键盘录入对象
      Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字");
        int a = sc.nextInt();
        System.out.println("输入第二个数字");
        int b = sc.nextInt();
        System.out.println("输入第三个数字");
        int c = sc.nextInt();

        int tem = (a>b?a:b);
        int max =  (tem>c?tem:c);
        System.out.println("输出三个数中的最大值:"+max);


        System.out.println("----------------------------");
        System.out.println("请输出x");
        int x = sc.nextInt();
        System.out.println("请输出y");
        int y = sc.nextInt();

        boolean flag = (x==y);
        System.out.println("x与y是否相等:"+flag);

    }

}
