package Chapter08_ObjectOrientedTop;

/**
 * 一,理解"万事万物皆对象"
 *    1,在java语言范畴中,我们都将功能,结构等封装到类中,
 *      通过类的实例化,调用具体的功能结构
 *
 *    2,涉及到Java语言与前端html,后端的数据库交互时,前后端的结构在
 *      Java层面交互时,都体现为类,对象
 *
 * 三,匿名对象的使用
 *    1,理解:我们创建的对象,没有显式的赋给一个变量名,即为匿名对象
 *    2,理解:匿名对象只能调用一次
 *    3,匿名对象的使用
 *
 */
public class InstanceExplain_01 {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);
        p.watch();
        p.call();

        //匿名对象
        new Phone().call();
        new Phone().price = 1999;
        new Phone().showPrice();


        //-------------------
        //匿名对象的使用
        System.out.println(new Phone());





    }
}

class PhoneFactory{
    public void show(Phone phone){
        phone.call();
        phone.watch();
    }
}

class Phone{
    //价格
    double price;
    public void call(){
        System.out.println("打电话");
    }
    public void watch(){
        System.out.println("看电影");
    }
    public void showPrice(){
        System.out.println("手机价格为:" + price );
    }
}
