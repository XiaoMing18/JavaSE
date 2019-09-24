package String;
import java.util.Scanner;
/**
 * 遍历字符串
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
