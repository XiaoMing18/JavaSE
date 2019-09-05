package Chapter05.Array;
//Dynamic initialization:动态初始化

/**
 * 如何对数组进行初始化呢?
 * A:何谓初始化呢?就是为数组开辟内存空间,并为每个数组元素赋值
 * B:有几种方式呢?
 *       a,动态初始化,只指定长度,由系统给出初始化值
 *       b,静态初始化,给出初始化值,由系统决定长度
 *
 *
 *  动态初始化的格式:
 *       数据类型 []   数组名 = new 数据类型[数组长度];
 *    案例:
 *    int []   arr  =  new int[3];
 *
 *
 *    如何获取数组中的元素呢?
 *    通过数组名[索引]
 *    索引其实就是每个元素的编号,从0开始,最大索引是数组的长度-1
 */
public class Section02_DynamicInitialization {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr = new int[3];
        /**
         * 左边:
         *     int：说明数组中元素类型是int类型
         *     []:说明这是一个数组
         *     arr:数组的名称
         * 右边:
         *     new:为数组分配内存空间
         *     int：说明数组中元素类型是int类型
         *     []:说明这是一个数组
         *     3:数组长度,数组的元素个数
         *
         *
         *
         */
        System.out.println(arr);//地址值:[I@1540e19d
        /**
         * 地址值没有意义,需要数据值。
         *          数组中每个元素都是有编号的,并且都是从0开始,最大编号是数组的长度-1，
         *         用数组名和编号的配合就可以获取数组中指定编号的元素，编号的专业叫法:索引
         */

        //通过数组名访问数据的格式:数组名[索引];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);



    }
}
