package Chapter05.Function;

/**
 * 键盘录入两个数据,比较两个数值是否相等
 *
 * 需求:比较两个数是否相等,返回的结果boolean
 *
 *
 */


import java.util.Scanner;
class Section04_FunctionPractice2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数:");
     int a = sc.nextInt();
        System.out.println("输入第二个数:");
     int b = sc.nextInt();

     boolean flag = Compare(a,b);
        System.out.println(flag);

    }
    /**
     * 比较两个数是否相等
     * 两个明确:
     * a,返回值类型
     * b,参数列表
     */
    public static boolean Compare(int a,int b){
        if (a ==  b){
            return true;
        }
        return false;
    }

}
