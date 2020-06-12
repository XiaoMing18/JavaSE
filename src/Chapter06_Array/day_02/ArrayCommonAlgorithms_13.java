package Chapter06_Array.day_02;

/**
 * 数组中涉及的常见算法考察
 *
 * 数组的复制,反转,查找(线性查找,二分法查找)
 *

 *
 *
 */
public class ArrayCommonAlgorithms_13 {
    public static void main(String[] args) {
        String[] arr = new String[]{"GG","HH","MM","DD"};

        //数组的复制(区别于数组变量的赋值:arr1 = arr)
        String[] arr1 = new String[arr.length];
        for (int i = 0;i < arr.length;i++){
            arr1[i] = arr[i];
            System.out.print(arr1[i] + "\t");
        }
        System.out.println("------------------");

        //数组的反转
//        for (int i =0;i < arr.length;i++)
//        {
//          String temp = arr[i];
//          arr[i] = arr[arr.length -i -1];
//          arr[arr.length - i - 1] = temp;
//        }



        //遍历
//        for (int i = 0;i < arr.length;i++){
//            System.out.print(arr[i] + "\t");
//        }


        //查找(或搜索)
        //线性查找
         String dest = "BB";
         boolean isFlag = true;
         for (int i =0;i < arr.length;i++){
             if (dest.equals(arr[i])){
                 System.out.println("找到了,角标为:" + i);
                 isFlag = false;
                 break;
             }
         }
         if (isFlag){
             System.out.println("不好意思,没有找到");
         }
    }

}
