package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement format:if语句体2

/**
 *       if(比较表达式){
 *           语句体1;
 *       }else{
 *           语句体2;
 *       }
 *  执行流程:首先看比较表达式的值,看其返回值是true还是false
 *           如果是true就执行语句体1,
 *           如果是false就执行语句体2;
 *
 *  注意:else后面是没有条件表达式的，只有if后面有条件表达式
 */
public class SelectionStructure_03_ifStatementformat2 {
    public static void main(String[] args) {
        //判断两个数是否相等
        int a = 10;
        int b = 20;
        if (a == b){
            System.out.println("a与b是相等的");
        }else {
            System.out.println("a与b是不等的");
        }
    }
}
