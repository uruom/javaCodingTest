package Q8_11_Coins;

/**
 * @ClassName:MyCodeQ811
 * @Auther: uruom
 * @Description: Coin
 * @Date: 2023/1/16 16:34
 * @Version: v1.0
 */
public class MyCodeQ811 {
//    public static int makeChange(int num,int[] denoms){
//        int[] ans=new int[num+1];
//        ans[0]=1;
//        for(int i=1;i<=num;i++){
//            ans[i]=0;
//            for(int tempNum:denoms){
//                if(tempNum<=i){
//                    ans[i]+=ans[i-tempNum];
//                }
//            }
//        }
//        for(int i=0;i<=num;i++)
//            System.out.println(ans[i]);
//        return ans[num];
//
//
//
//    }
    public static int makeChange(int num,int[] denoms) {
//        System.out.println(num);
        int m = denoms.length;
        if(m<=0) return 0;
        if(num<=0) return 1;
        int[][] ans= new int[num+1][m];
        ans[0][0]=1;
        int po = denoms[0];
        while(po<=num){
            ans[po][0] = ans[po-denoms[0]][0];
            po+=denoms[0];
//            System.out.println(po);
        }
//        System.out.println("A");
        ans[0][0]=0;
        for(int i=1;i<m;i++){
            int op = denoms[i];
            ans[0][i]=1;
            for(int j=1;j<op&&j<num;j++){
                ans[j][i]=ans[j][i-1];
            }
            for(int j=op;j<=num;j++){
                ans[j][i]=ans[j-op][i]+ans[j][i-1];
            }
            ans[0][i]=0;
        }
//        System.out.println("B");
//        for(int i=0;i<=num;i++){
//            for(int j=0;j<m;j++)
//            System.out.print(ans[i][j]);
//            System.out.println();
//        }
        return ans[num][m-1];
    }
    public static void main(String[] args) {
        int[] denoms = {25, 10, 5, 1};
        int ways = makeChange(10, denoms);
        System.out.println(ways);
    }
}
