package Chapter05.Function.Section02_Override;
//Function Overview Pratice:方法重载案例

/**
 * 1，比较两个数据是否相等,
 * 参数类型分别为两个byte类型,
 * 两个short类型,
 * 两个int类型,
 * 两个long类型,
 * 并在方法里面测试
 */

public class Section02_OverviewPratice {
    public static void main(String[] args) {
        //测试byte
        byte a1 = 10;
        byte a2 = 20;
        System.out.println("这是一个测试byte的输出:"+Compare(a1,a2));

        //测试short
        short a3 = 10;
        short a4 = 10;
        System.out.println("这是一个测试short的输出:"+Compare(a3,a4));

        //测试int
        int a5 = 10;
        int a6 = 20;
        System.out.println("这是一个测试int的输出:"+Compare(a5,a6));

        //测试long
        long a7 = 10;
        long a8 = 20;
        System.out.println("这是一个测试long的输出:" + Compare(a7,a8));
    }


    //byte类型
    public static boolean Compare(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    //short类型
    public static boolean Compare(short a,short b){
        System.out.println("sort");
        return a == b;
    }
    //int类型
    public static boolean Compare(int a,int b){
        System.out.println("int");
        return a == b;
    }
    //long类型
    public static boolean Compare(long a,long b){
        System.out.println("long");
        return a == b;
    }

}
