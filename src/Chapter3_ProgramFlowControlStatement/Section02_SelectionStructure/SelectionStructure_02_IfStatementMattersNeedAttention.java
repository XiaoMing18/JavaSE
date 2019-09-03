package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if statement matters need attention:if语句注意事项

/**
 * a,比较表达式无论是简单还是复杂,结果必须是boolean类型
 * b,if语句控制的语句体如果只是一条语句,大括号可以省略,不过建议不要提高代码的可读性
 * c,一般来说,有左大括号就没有分号,有分号就没有左大括号
 */

public class SelectionStructure_02_IfStatementMattersNeedAttention {
    public static void main(String[] args) {
           int x = 10;
           if (x > 5){
               System.out.println("x是大于5的值");
           }
           if (x < 5 || x == 10){
               System.out.println("x为小于5或等于10的数字");
           }
        System.out.println("-----------------------------------------");

           int b = 100;
           if (b != 100);//这里是有语句体的,只不过是空语句体
        //代码块
           {
               System.out.println("b的值是100");
               System.out.println("over");
           }

    }
}
