package Chapter3_ProgramFlowControlStatement.Section06_dowhile;
//do..while循环语句基本格式

/**基本格式:
 * 初始化语句;
 * do{
 *     循环体语句;
 *     控制条件语句;
 * }while(判断条件语句);
 *
 */
public class Node01_DoWhileFormat {
    public static void main(String[] args) {
        //输出10次helloworld
        int i = 1;
        do {
            System.out.println("输出10次helloworld");
            i ++;
        }while (i <= 10);

    }
}
