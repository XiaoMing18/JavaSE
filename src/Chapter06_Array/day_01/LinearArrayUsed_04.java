package Chapter06_Array.day_01;

/**
 * LinearArrayUsed:一维数组的使用
 *
 * 练习1:
 * 单间短期出租4个月，550元/月（水电煤公摊，网费35元/月）空调，卫生间，厨房齐全。
 *
 */
public class LinearArrayUsed_04 {
    public static void main(String[] args) {
        int[] arr = new int[]{8,2,1,0,3};
        int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel = "";
        //i=11
        for (int i = 0;i < index.length;i++){
            /**
             * index[11]  arr[3] =0
             *
             * index[0]=2 arr[2]=1
             * index[1]=0 arr[0]=8
             * index[2]=3 arr[3]=0
             * index[3]=2 arr[2]=1
             * index[4]=4 arr[4]=3
             * index[5]=0 arr[0]=8
             * index[6]=1 arr[1]=2
             * index[7]=3 arr[3]=0
             * index[8]=2 arr[2]=1
             * index[9]=3 arr[3]=0
             * index[10]=3 arr[3]=0
             *
             */

            // tel= tel + arr[0]
            tel += arr[index[i]];
        }
        System.out.print("联系方式:"+tel);
    }
}
