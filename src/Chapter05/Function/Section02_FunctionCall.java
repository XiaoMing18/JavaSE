package Chapter05.Function;

/**
 * 方法的特点?
 * 不调用,不执行
 *
 * 如何调用呢?(有明确返回值调用)
 * a,单独调用，一般来说没有意义所以不推荐
 * b,输出调用,不够好。因为我们可能需要针对结果进行进一步的操作
 * c,赋值调用,推荐方案
 *
 */
public class Section02_FunctionCall {
    public static void main(String[] args) {
        //方式1:单独调用
        int a = 10000;
        int b = 291829;
        //sum(a,b);
        //方式2:输出调用
        //System.out.println(sum(a,b));
        //方式3:赋值调用
        int result = sum(a,b);

    }
    public static int sum(int a,int b){
        int sum = a + b;
        return  sum;
    }
}
