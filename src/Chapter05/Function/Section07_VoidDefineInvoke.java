package Chapter05.Function;
//Function void Define and invoke:方法void类型定义和调用
/**
 * void类型的返回值的方法调用
 * 单独调用
 * 输出调用(错误)
 * 赋值调用(错误)
 */



public class Section07_VoidDefineInvoke {
    public static void main(String[] args) {

//        for (int x = 0;x <7;x++){
//             for (int y = 0;y < 6;y++){
//                 System.out.print("*");
//             }
//            System.out.println("");
//        }
//单独调用
star(3,4);
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

