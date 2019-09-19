
package Collection;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合的由来:
 *         我们学习的是面向对象语言,面向对象语言对事物的描述是通过对象体现的,为了方便对多个对象进行操作,我们必须把这多个对象进行存储
 *         而要想存储多个变量,就不能是一个基本的变量,而应该是一个容器类型的变量，在我们目前所学过的知识里面,有哪些是容器类型的呢?
 *         数组和StringBuffer
 *         但是呢?
 *         StringBuffer的结果是一个字符串，不一定满足我们的要求,所以我们只能选择数组，这就是对象数组
 *         而对象数组又不能适应变化的需求,因为数组的长度是固定的,为了适应变化的需求,java类就提供了集合供我们使用
 *
 *
 * 数组和集合的区别?
 * A：长度区别
 *        数组长度固定,集合长度可变
 *
 * B：内容不同
 *      数组存储的是同一种类型的元素
 *      而集合可以存储不同类型的元素
 *
 * C:元素的数据类型问题?
 *      数组可以存储基本数据类型,也可以存储引用数据类型
 *      集合只能存储引用数据类型
 *
 *
 *
 *
 * 集合是存储多个元素的,存储多个元素的不同需求,例如:多个元素中不能有相同的元素，按照某种规则排序一下
 * 针对不同的需求,java就提供了不同的集合类
 * java集合
 * java就提供了很多个集合类,这多个集合类的数据结构不同,结构不同不重要,重要的是要能存储东西，并且还要能够使用这些东西,比如判断,获取等
 * 多个集合类是有共性内容的,我们把集合类的共性内容不断向上提取,最终能形成集合的继承体系结构
 *
 * 数据结构:数据的存储方式
 *
 *
 * Collection:集合的顶层接口,它的子体系,有重复的,有唯一的，有有序的，有无序的
 * Collection的功能概述
 * 1,添加功能
 *   boolean add(Object obj);添加一个元素
 *   boolean addAll(Collection c):添加一个集合的元素
 *
 * 2,删除功能
 *      void clear():移除所有元素
 *      boolean remove(Object o):移除一个元素
 *
 * 3,判断功能
 *       boolean contains(Object o):判断集合中是否包含指定元素
 *       boolean containAll(Collection c):判断集合中是否包含指定的集合元素
 *       boolean isEmpty:判断集合是否为空
 *
 *
 * 4,获取功能
 *       Iterator<E> iterator()(重点)
 *
 * 5,长度功能
 *      int size():元素个数
 * 6,交集功能
 *       boolean retainAll(Collection c):两个交集的关系
 *
 */
public class CollectionDemo_01 {
    public static void main(String[] args) {
        //测试不带all的方法

        //创建集合对象
        //Collection c = new Collection();//错误,因为接口不能实例化
        Collection c = new ArrayList();
        //boolean add(Object obj);添加一个元素
        //System.out.println("c:"+c.add("World"));
        c.add("this");
        c.add("is");
        c.add("a");
        c.add("add");
        //void clear();移除所有元素
       //c.clear();

        //boolean remove(Object o):移除一个元素
        System.out.println("remove:"+c.remove("is"));
        System.out.println("c:"+c);
        //boolean contains(Object o):判断集合中是否包含指定元素
       //System.out.println("contains:"+c.contains("a"));
        //boolean isEmpty:判断集合是否为空
        //System.out.println("isEmpty:"+c.isEmpty());
        //int size():元素个数
        System.out.println("size:"+c.size());
    }

}
