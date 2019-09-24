package String;
/**
 *

 案例:统计字符次数

 需求:键盘录入一个字符串,统计该字符串大写字母字符出现的次数,小写字母字符出现的次数和数字字符出现的此时

 思路:

 1,键盘录入一个字符串,用Scanner实现

 2,要统计三种类型的字符个数,需定义三个统计变量,初始值都为0

 3,遍历字符串,得到每一个字符

 4,判断该字符属于哪种类型,然后对应类型的统计变量+1

 假如ch是一个字符,要判断它属于大写字母,小写字母,还是数字,直接判断所属范围即可

 - 大写字母:ch>="A"&&ch<="Z"
 - 小写字母:ch>'a'&&ch<'z'
 - 数字:ch>='0'&&ch<='9'

 5,输出三种类型的字符个数

 */

import java.util.Scanner;
public class StringzifuType05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串,字符类型会自动判断");
        String line = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i =0;i < line.length();i++){
            char chr = line.charAt(i);
            if (chr>='A' && chr<='Z' ){
                bigCount++;
            }else if (chr>'a'&&chr<'z'){
                smallCount++;

            }else if (chr>='0'&&chr<='9'){
                numberCount++;
            }

        }

        System.out.println("bigCount:"+bigCount);
        System.out.println("smallCount:"+smallCount);
        System.out.println("numberCount:"+numberCount);
    }
}
