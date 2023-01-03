package Q5_03_Flip_Bit_to_Win;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * @ClassName:MyCodeQ503
 * @Auther: uruom
 * @Description: ReverseBitToGetTheLongest1s
 * @Date: 2023/1/3 16:32
 * @Version: v1.0
 */
public class MyCodeQ503 {
    public static int lowbit (int num){
        return num&(-num);
    }

    public static int longestSequence(int num){
        int maxlength=0;
        int[] ans = new int[40];
        int[] ansReverse = new int[40];
        if((num&1)==1) ans[0]=1;
        else ans[0]=0;
        ansReverse[0]=1;
//        System.out.println(num);
        num = num>>>1;
        for(int i=1;i<=32; i++){
//            System.out.println(num);
            if((num&1)==1){
                ans[i]=ans[i-1]+1;
                ansReverse[i]=ansReverse[i-1]+1;
            }else{
                if(ansReverse[i-1]>maxlength)
                    maxlength = ansReverse[i-1];
                ansReverse[i]=ans[i-1]+1;
                ans[i]=0;
            }
            num=num>>>1;
            if(num==0) return max(max(ansReverse[i],maxlength),min(ans[i]+1,32));
        }
//        System.out.println(num);
        throw new RuntimeException("Beyond int");
    }
    public static void main(String[] args) {
        int original_number = Integer.MAX_VALUE;
        int new_number = longestSequence(original_number);

        System.out.println(Integer.toBinaryString(original_number));
        System.out.println(new_number);
    }
}
