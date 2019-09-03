package Chapter3_ProgramFlowControlStatement.Section02_SelectionStructure;
//if格式语句2与三元相互转换
/**
 * 区别:
 *     1,三元运算符实现的都可以采用if语句实现,反之不成立
 *     2,什么时候if语句实现不能用三元改进呢?
 *           当if语句控制的操作是一个输出语句的时候
 *           为什么?
 *           因为三元运算符是一个运算符,运算符操作完毕就应该有一个结果,而不是一个输出
 */


import java.util.Scanner;

public class SelectionStructure_05_ifStatementformat2Practice1 {
    public static void main(String[] args) {
        //获取两个数据中较大的值
      int a = 10;
      int b = 20;
      int max;
      if (a > b){
          max = a;
      }else {
          max = b;
      }
        System.out.println("max:"+max);
        System.out.println("--------------------------------");


      //用三元改进
        int max1 = (a > b)?a:b;
        System.out.println("max1:"+max1);
        System.out.println("-----------------------------------------");

        //判断一个数是奇数还是偶数并把它输出到控制台
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要判断的数字");
        int z = sc.nextInt();
        if (z%2 == 0){
            System.out.println("这个数是偶数");
        }else {
            System.out.println("这个数是奇数");
        }



    }



}
