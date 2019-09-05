package Chapter05.Function.Section02_Override;
//Function Overview:方法重载
/**
 * 方法重载:方法的方法名和功能相同，名字一样,方法的参数个数不同
 *         参数列表不同:
 *                a,参数个数不同
 *                b,参数类型不同
 */

/**
 * 需求:
 * 我要求数的和
 */

public class Section01_Overview {
    public static void main(String[] args) {
        //jvm会根据不同的参数去调用不同的功能
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10.5f,20));

    }

    //求两个数的和
    public static int sum(int a, int b) {

        return a + b;
    }

    //求三个数的和
//    public static int sum1(int a, int b, int c) {
//
//        return a + b + c;
//    }
    public static int sum(int a, int b, int c) {

        return a + b + c;
    }
    //求三个数的和

//    public static int sum2(int a, int b, int c, int d) {
//
//        return a + b + c + d;
//    }
    public static int sum(int a, int b, int c, int d) {

        return a + b + c + d;
    }
    public static   float  sum(float a,float b){

        return a + b;

    }
}
