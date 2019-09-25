package Collection.ArrayList;
//案例:存储字符串并遍历

import java.util.ArrayList;

/**
 * 需求:创建一个存储字符串的集合,存储3个字符串元素,使用程序实现控制台遍历该集合
 * 思路:
 * 第一步:创建集合对象
 * 第二步:往集合中添加字符串对象
 * 第三步:遍历集合,首先要能够获取到集合中的每一个元素，通过get(int index)方法实现
 * 第四步:遍历集合,获取到集合的长度，通过size（）方法实现
 * 第五步:遍历集合的通用格式
 *           for(int i = 0;i < 集合对象.size();i++){
 *                      集合对象.get(i)  就是指定索引处的元素
 *           }
 */

public class Case_03 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList <String> array = new ArrayList<>();
        //往集合中添加字符串对象
        array.add("java");
        array.add("javase");
        array.add("javaee");

        //遍历集合,首先要能够获取到集合中的每一个元素，通过get(int index)方法实现
//        System.out.println(array.get(0));
//        System.out.println(array.get(1));
//        System.out.println(array.get(2));
        //遍历集合
//        for (int i = 0;i < 3;i++){
//            System.out.println(array.get(i));
//        }
        //遍历集合,获取到集合的长度，通过size（）方法实现
        //System.out.println(array.size());

        //遍历集合的通用格式
        for (int i = 0;i < array.size();i++){
            String s = array.get(i);
            System.out.println(s);

        }

    }

}
