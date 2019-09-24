package String;
import java.util.Scanner;
/**
 * 遍历字符串
 * 需求:键盘录入一个字符串,使用程序实现在控制台遍历输入的字符串
 *
 * 思路:
 *
 *        1,键盘录入一个字符串,使用Scanner实现
 *
 *        2,遍历键盘输入的字符串，需要获得字符串中每一个字符
 *
 * - public char charAt(int index):返回指定索引处的char值,字符串的索引从0开始
 *
 *
 *
 *       3,遍历字符串,获取到字符串的长度
 *
 * - public int length():返回此字符串的长度
 *
 * - 数组的长度:数组名.length
 * - 字符串长度:字符串对象.length()
 *
 *       4,遍历字符串的通用格式
 *
 *
 */
public class StringTraversing_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要遍历的字符串:");
        String line = sc.nextLine();
          //遍历字符串,首先要获得字符串中的每一个字符
//        System.out.println(line.charAt(0));
//        System.out.println(line.charAt(1));
//        System.out.println(line.charAt(2));

//        for (int i = 0; i <=8;i++){
//            System.out.println(line.charAt(i));
//        }


        //遍历字符串,获取到字符串的长度
//        System.out.println(line.length());


        for (int i = 0;i < line.length();i++){
            System.out.println(line.charAt(i));
        }
    }
}
