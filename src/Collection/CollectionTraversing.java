package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合的遍历,其实就是依次获取集合中每个元素
 */
public class CollectionTraversing {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        //添加元素
        c.add("this");
        c.add("is");
        c.add("question");
        //遍历
        Object[] objs = c.toArray();
        for (int x = 0;x < objs.length;x++){
            System.out.println(objs[x]);
        }
    }
}
