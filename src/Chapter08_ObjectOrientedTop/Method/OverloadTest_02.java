package Chapter08_ObjectOrientedTop.Method;

/**
 * 1,编写程序,定义三个重载方法并调用,方法名为mOL
 * 三个方法分别接收一个int参数,两个int参数,一个字符串参数
 * 分别执行平方运算并输出结果,相乘并输出结果,输出字符串信息
 * <p>
 * 2,定义三个重载方法max(),
 * 第一个方法求两个int值中的最大值
 * 第二个方法求两个double值中的最大值
 * 第三个方法求三个double值中的最大值
 * 并分别调用三个方法
 */
public class OverloadTest_02 {
    //如下的三个方法构成重载
    public void oML(int i) {
        System.out.println("平方:" + i * i);
    }

    public void oML(int i, int j) {
        System.out.println("i和j相乘:" + i * j);
    }


    public void oML(String s) {
        System.out.println(s);
    }

    //2,如下3个方法构成重载
    public int max(int i, int j) {
        return (i > j) ? i : j;
    }

    public double max(double d1, double d2) {
        return (d1 > d2) ? d1 : d2;
    }

    public double max(double d1, double d2, double d3) {
        double max = (d1 > d2) ? d1 : d2;
        return (max > d3) ? max : d3;
    }

    public static void main(String[] args) {

    }
}
