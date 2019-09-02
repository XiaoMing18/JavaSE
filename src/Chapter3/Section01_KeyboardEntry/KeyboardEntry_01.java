package Chapter3.Section01_KeyboardEntry;
/**Keyboard entry:键盘录入
 * 为了让程序的数据更符合实际应用的参数,加入了键盘录入,让程序更灵活一些
 *
 *    实现键盘录入
 *    a,导包
 *        格式:
 *          import java.util.Scanner;
 *
 *        位置:
 *          在class上面
 *
 *     b,创建键盘录入对象
 *              格式:
 *       Scanner sc = new Scanner(System.in);
 *
 *
 *      c,通过对象获取数据
 *              格式:
 *              int x = sc.nextInt();
 *
 *
 *      语法:
 *           import java.util.Scanner;
 *           Scanner sc = new Scanner(System.in);
 *           int x = sc.nextInt();
 */

import java.util.Scanner;
public class KeyboardEntry_01 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个数据");
        int x = sc.nextInt();
        System.out.println("你输入的数据是:"+x);
    }
}
