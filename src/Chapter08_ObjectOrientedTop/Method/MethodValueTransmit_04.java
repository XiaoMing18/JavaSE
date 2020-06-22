package Chapter08_ObjectOrientedTop.Method;

/**
 * 关于变量的赋值
 */
public class MethodValueTransmit_04 {
    public static void main(String[] args) {
        int m = 10;
        int n = m;
        System.out.println("m=" + m + ",n=" + n);
        n = 20;
        System.out.println("m=" + m + ",n=" + n);

    }
}
