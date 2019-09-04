package Chapter05.Function;
//Function Overview and format description:方法的概述和格式说明

/**
 * 方法:完成特定功能的代码块
 *
 * 方法格式:
 *     修饰符 返回值类型 方法名 (参数类型 参数1,参数类型 参数2....){
 *         方法体语句;
 *         return 返回值;
 *     }
 *  详细解释:
 *      修饰符:public static
 *      返回值类型:功能结果的数据类型
 *      方法名:符合命名规则,方便调用
 *      参数:
 *      实际参数:实际参与运算的
 *      形式参数:方法定义上的，用于接收实际参数的
 *      参数类型:参数的数据类型
 *      参数名:变量名
 *      方法体语句:完成功能的代码
 *      return:结束方法
 *      返回值:就是功能的结果,由return带给调用者
 *
 *
 *      写好一个方法有两个明确
 *      1返回值类型
 *           结果的数据类型
 *      2参数列表
 *           要传递的参数有几个，数据类型分别是什么
 *
 */


//案例:求两个数据之和
public class Section01_FunctionOverviewAndFormatsDescription {
    public static void main(String[] args) {

    }
    /**
     * 需求:求两个数据之和
     *
     * 两个明确
     *     返回值类型:int
     *     参数列表:2个,都是int类型
     *
     * 方法的特点?
     * 不调用,不执行
     *
     *
     *
     */
    public static int sum(int a,int b){
       int sum = a + b;
       return sum;
    }

}
