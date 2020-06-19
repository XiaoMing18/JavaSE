package Chapter08_ObjectOrientedTop.Method;

/**
 * 可变个数形参方法
 * Varargs(variable number of arguments)机制,
 * 允许直接定义能多个实参相匹配的形参,因而,
 * 可以用一种更简单的方式,来传递个数可变的形参
 * 具体使用
 * 1可变个数形参的格式:数据类型...变量名
 * 2当调用可变个数形参的方法时,传入的参数个数可以是:0个，1个，2个.....
 * 3可变个数形参的方法与本类中方法名相同,形参不同的方法之间构成重载
 * 4可变个数形参的方法与本类中方法名相同,形参不同的方法构成重载
 * 5可变个数形参的方法与本类中方法名相同,形参类型也相同的数组之间不构成重载,二者不能共存
 * 6可变个数形参在方法的形参中,必须声明在末尾
 */
public class VariableNumberOfArguments_03 {
    public static void main(String[] args) {
        VariableNumberOfArguments_03 v = new VariableNumberOfArguments_03();
        v.show(12);
        v.show("这是String类型");
        v.show("hello  ", "world  ");
        v.show("AA  ", "BB  ", "cc  ", "dD");
    }

    public void show(int i) {
        System.out.println("int:" + i);

    }

    public void show(String s) {
        System.out.println("String:" + s);

    }

    public void show(String... strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i]);
        }

    }

}
