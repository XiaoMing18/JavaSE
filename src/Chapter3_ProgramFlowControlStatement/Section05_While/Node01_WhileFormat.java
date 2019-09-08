package Chapter3_ProgramFlowControlStatement.Section05_While;
//while循环基本格式
/**
 * 初始化语句;
 * while(判断条件语句){
 *     循环语句;
 *     控制条件语句;
 * }
 *
 */
public class Node01_WhileFormat {
    public static void main(String[] args) {
    //输出10次helloworld
        int i = 1;
        while (i <= 10){
            System.out.println("输出helloworld语句10次");
            i++;
        }
    }
}
