package Collection;

import Chapter_APIgenerallyused.Object.Student;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 练习；用集合存储5个学生对象,并把学生对象进行遍历
 * 分析:
 * A:创建学生类
 * B:创建集合对象
 * C:创建学生对象
 * D:把学生添加到集合中
 * E:把集合转成数组
 * F:遍历数组
 *
 *
 *
 */
public class StudentDemo  {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        //创建学生对象
        Student s1 = new Student("this",28);
        Student s2 = new Student("is",30);
        Student s3 = new Student("a",40);
        Student s4 = new Student("example",50);
        Student s5 = new Student("pl",90);
        //把学生添加到集合
        c.add(s1);
        c.add(s2);




    }
}
