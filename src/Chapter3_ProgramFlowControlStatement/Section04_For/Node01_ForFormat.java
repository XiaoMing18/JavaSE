package Chapter3_ProgramFlowControlStatement.Section04_For;

/**
 * 循环体语句的三种格式:for,while,do...while循环
 *
 * for循环格式:
 *     for(初始化语句;判断条件语句;控制条件语句){
 *         循环体语句;
 *     }
 *
 *  执行流程:
 *      A:执行初始化语句
 *      B:执行判断条件语句,看其返回值是true还是false
 *            如果是true就继续执行
 *            如果是false就结束循环
 *      C:执行循环语句
 *      D:执行控制条件语句
 *      E:回到B继续
 *
 *
 * 注意事项:
 *     A:判断条件语句的结果是一个boolean类型
 *     B:循环体语句如果是一条语句,大括号可以省略,若果是多条语句,大括号不能省略,建议不要省略
 */
public class Node01_ForFormat {
    public static void main(String[] args) {
        //输出打印10次HelloWorld
       for (int x = 1;x <= 10;x ++){
           System.out.println("Hello World");
       }
    }
}
