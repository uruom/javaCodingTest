package Q5_04_Next_Number;

/**
 * @ClassName:myCodeQ504
 * @Auther: uruom
 * @Description: getTheNearlyNumWithSameNumberOf1s
 * @Date: 2023/1/3 17:09
 * @Version: v1.0
 */
public class myCodeQ504 {
    public static int lowbit(int num){
        return num&(-num);
    }
    public static int getPrevSlow(int num){
        int q = lowbit(num);
        if((q^1)!=0){
            return num^q|(q>>1);
        }else{
            int p=1;
            num-=q;
            while(lowbit(num)==1<<(p)&&num!=0){
                num-=lowbit(num);
                p++;
            }
            if(num==0) {
                return -1;
            }
            int setvalue = lowbit(num);
            p=(1<<(p+1))-1;
            while((p&setvalue)==0) p=p<<1;
            p=p>>1;
            return (num^lowbit((num)))|p;
        }
    }
    public static int getNextSlow(int num){
        int q = lowbit(num);
        num-=q;
        int p=0;
        while(((q<<1)&num)!=0){
            q=q<<1;
            num-=q;
            p++;
        }
        return num|(q<<1)|((1<<p)-1);

    }
    public static void main(String[] args) {
        int i = 13948;
        int p1 = getPrevSlow(i);
        int n1 = getNextSlow(i);
        Tester.binPrint(p1);
        Tester.binPrint(n1);
    }
}
