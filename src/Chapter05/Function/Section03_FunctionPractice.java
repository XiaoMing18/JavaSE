package Chapter05.Function;

/**
 * 键盘录入两个数据,返回两个值中的较大值
 */
import  java.util.Scanner;
class Section03_FunctionPractice {
    public static void main(String[] args) {
        /**
         * 需求:
         * 两个数中的最大值？
         * 两个明确
         * 1,返回值类型：int
         * 2,参数列表:int a,int b
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = sc.nextInt();
        System.out.println("请输入b的值");
        int b = sc.nextInt();
//        System.out.println("两个数中较大的值是:" + result);
        int max = getMax(a,b);
        System.out.println("两个数中较大的数是:" + max);


    }
    public static int getMax(int a,int b){
        //if语句
        /**
         *  if (a > b){
         *             return a;
         *         }else {
         *             return b;
         *         }
         */

        //用三元运算符改进
        int c = (a > b) ? a : b;
        return c;
    }




}
