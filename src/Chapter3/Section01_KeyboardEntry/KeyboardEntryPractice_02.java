package Chapter3.Section01_KeyboardEntry;

/**
 * 键盘录入练习:
 * 1键盘录入两个数据，求两个数据之和,输出其结果
 * 2键盘录入两个数据，求两个数据之中的最大值
 */

import java.util.Scanner;
public class KeyboardEntryPractice_02 {
    public static void main(String[] args) {
        //键盘录入两个数据，求两个数据之和,输出其结果
        //创建键盘录入对象
       Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
       int x = sc.nextInt();
        System.out.println("请输入第二个数:");
        int y = sc.nextInt();
        //把键盘录入对象进行相加即可
        int sum = (x + y);
        System.out.println("计算前两个数的总和:"+sum);
    }
}
