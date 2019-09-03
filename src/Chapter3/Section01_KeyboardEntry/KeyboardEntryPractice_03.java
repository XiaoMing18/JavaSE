package Chapter3.Section01_KeyboardEntry;

/**
 * 键盘录入练习:
 *
 * 2键盘录入两个数据，求两个数据之中的最大值
 */

import java.util.Scanner;

public class KeyboardEntryPractice_03 {
    public static void main(String[] args) {
        //键盘录入两个数据，求两个数据之中最大值,输出其结果
        //创建键盘录入对象
      Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字");
        int a = sc.nextInt();
        System.out.println("输入第二个数字");
        int b = sc.nextInt();

        int max =  (a>b?a:b);
        System.out.println("输出两个数中的最大值:"+max);
    }
}
