package Q8_01_Triple_Step;

/**
 * @ClassName:MyCodeQ801
 * @Auther: uruom
 * @Description: 1, 2, 3step of  footsteps
 * @Date: 2023/1/10 16:25
 * @Version: v1.0
 */
public class MyCodeQ801 {
    public static int countWays(int n){
        int[] ans = new int[n+1];
        if(n<=3){
            switch (n){
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 4;
            }
        }
        ans[0]=1;
        ans[1]=1;
        ans[2]=2;
        ans[3]=4;
        for(int i=4;i<=n;i++){
            ans[i]=ans[i-1]+ans[i-2]+ans[i-3];
        }
        return ans[n];
    }
    public static void main(String[] args) {
        int n = 20;
        int ways = countWays(n);
        System.out.println(ways);
    }
}
