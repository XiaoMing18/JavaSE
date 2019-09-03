package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement format3:if语句体3的练习
//if语句的嵌套使用
/**
 * 获取三个数中的最大值
 */



public class SelectionStructure_09_ifStatementformat3Pratice2 {
    public static void main(String[] args) {
        int a = 60;
        int b = 100;
        int c = 30;
        int max;
        if (a > b){
            if (a > c){
                max = a;
                System.out.println(max);
            }else {
                max = c;
                System.out.println(max);
            }
        }else {
            if (b > c){
                max = b;
                System.out.println(max);
            }else {
                max = c;
                System.out.println(max);
            }
        }


    }
}
