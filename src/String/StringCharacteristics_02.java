package String;

/**
 * String对象的特点
 */
public class StringCharacteristics_02 {
    public static void main(String[] args) {
    char [] chs = {'a','b','c','d','e'};
    String s1 = new String(chs);
    String s2 = new String(chs);
    //比较地址值是否相同
        System.out.println(s1 == s2);
        System.out.println("---------------------");
        String s3 = "abcde";
        String s4 = "abcde";
        //比较内容是否相同
        System.out.println(s3==s4);
        System.out.println("------------------");
        //比较地址值是否相同
        System.out.println(s1== s3);
    }
}
