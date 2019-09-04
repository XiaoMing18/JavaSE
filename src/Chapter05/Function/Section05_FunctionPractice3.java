package Chapter05.Function;

/**
 * 键盘录入三个数据,比较三个数中的最大值
 */

import java.util.Scanner;
class Section05_FunctionPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数a:");
        int a = sc.nextInt();
        System.out.println("请输入第一个数b:");
        int b = sc.nextInt();
        System.out.println("请输入第一个数c:");
        int c = sc.nextInt();
        int getMax = max(a,b,c);
        System.out.println(getMax);
    }
    public static int max(int a,int b,int c){
        if (a > b){
            if (a >c){
                return c;
            }
            return a;
        }
        if (b > c){
            return b;
        }
        return c;
    }

}
