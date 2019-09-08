package Chapter3_ProgramFlowControlStatement.Section04_For;
//获取数据

/**
 * 需求:求5的阶乘
 *    n! = n*(n-1)!规则
 *    n! = n*(n-1)*(n-2)*....3*2*1
 *
 *
 *
 */
public class Node05_ForPracticeGetData {
    public static void main(String[] args) {
       int jc = 1;
       for ( int i = 1;i <= 5;i++){
           jc = jc*i;
       }
        System.out.println("jc:"+jc);
    }
}
