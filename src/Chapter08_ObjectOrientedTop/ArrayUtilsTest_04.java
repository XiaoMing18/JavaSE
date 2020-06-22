package Chapter08_ObjectOrientedTop;

public class ArrayUtilsTest_04 {
    public static void main(String[] args) {
        ArrayUtils_03 a = new ArrayUtils_03();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int getMax = a.getMax(arr);
        System.out.println("最大值为:" + getMax);

    }
}
