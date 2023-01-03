package Q1_04_Palindrome_Permutation;

/**
 * @ClassName:MyCodeQ104
 * @Auther: uruom
 * @Description: Q104
 * @Date: 2022/12/19 22:27
 * @Version: v1.0
 */
public class MyCodeQ104 {
    private static int lowbit(int bitnum){
        return bitnum&(-bitnum);
    }
    private static Boolean isPermutationOfPalindrome(String args){
        int isPer = 0;
        for(char c:args.toCharArray()){
            int val = c-'a';
            isPer^= (1<<val);
        }
        if(isPer==0||(isPer-lowbit(isPer)==0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String pali = "Rats live on no evil star";
        System.out.println(isPermutationOfPalindrome(pali));
    }
}
