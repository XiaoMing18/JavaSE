package Chapter05.Function;
//返回值为void类型的方法练习

/**
 * 需求
 * 1,键盘录入行数和列数输出对应的星型
 */



import java.util.Scanner;
public class Section07_VoidPratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数");
        int m = sc.nextInt();
        System.out.println("请输入列数");
        int n = sc.nextInt();
//单独调用
star(m,n);
    }
public static void star(int m,int n){
        for (int x = 0;x < m;x++){
            for (int y = 0;y < n;y++){
                System.out.print("*");
            }
            System.out.println("");
        }
}
    }

