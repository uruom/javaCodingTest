package Q8_05_Recursive_Multiply;

/**
 * @ClassName:MyCodeQ805
 * @Auther: uruom
 * @Description: mul without use *
 * @Date: 2023/1/11 09:55
 * @Version: v1.0
 */
public class MyCodeQ805 {
    static int counter = 0;
    public static int minProduct(int a,int b){
        int ans = 0;
        while(a!=0){
            if((a&1)==1){
                ans+=b;
                counter++;
            }
            a=a>>>1;
            b=b<<1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a = 13494;
        int b = 22323;
        b=0;
        a=801;
        int product = a * b;
        int minProduct = minProduct(a, b);
        if (product == minProduct) {
            System.out.println("Success: " + a + " * " + b + " = " + product);
        } else {
            System.out.println("Failure: " + a + " * " + b + " = " + product + " instead of " + minProduct);
        }
        System.out.println("Adds: " + counter);
    }
}
