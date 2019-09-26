package Collection;
//集合的高级功能

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 */
public class CollectionAdvancedFunction_02 {
    public static void main(String[] args) {
        //创建集合1
        Collection c1 = new ArrayList();
        c1.add("abc");
        c1.add("def");
        c1.add("hij");

        //创建集合2
        Collection c2 = new ArrayList();
        c2.add("ufo");
        c2.add("xyz");
        c2.add("wya");

        //boolean addAll(Collection c):添加一个集合的元素
        System.out.println("addAll:"+c1.addAll(c2));

        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);

    }
}
