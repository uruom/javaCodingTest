package Q5_06_Conversion;

import CtCILibrary.AssortedMethods;

/**
 * @ClassName:myCodeQ506
 * @Auther: uruom
 * @Description: changeBitMakeOneIntToAnother
 * @Date: 2023/1/3 18:05
 * @Version: v1.0
 */
public class myCodeQ506 {
    public static int lowbit(int num){
        return num&(-num);
    }
    public static int bitSwapRequired(int a,int b){
        int temp_D = a^b;
        int ans =0;
        while(temp_D!=0){
            temp_D-=lowbit(temp_D);
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a = -23432;
        int b = 512132;
        System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
        System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
        System.out.println("Required number of bits: " + bitSwapRequired(a, b));
    }
}
