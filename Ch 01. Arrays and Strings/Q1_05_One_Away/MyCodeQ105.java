package Q1_05_One_Away;

/**
 * @ClassName:MyCodeQ105
 * @Auther: uruom
 * @Description: Q105
 * @Date: 2022/12/19 22:40
 * @Version: v1.0
 */
public class MyCodeQ105 {
    static public int getChange(String a, String b){
        int change =0;
        for(int i=0;i<a.length();i++){
            if(a.toCharArray()[i]!=b.toCharArray()[i+change]){
                change++;
                if(change>1) return 2;
                i--;
            }
        }
        return change;
    }
    static public Boolean oneEditAway(String a, String b){
//        System.out.println("a");
        int change =0;
        if(a.length()==b.length()){
//            System.out.println("b");
            for(int i=0;i<a.length();i++){
                if(a.toCharArray()[i]!=b.toCharArray()[i]){
                    change++;
                }
            }


        }else{
//            System.out.println("a");
            if(a.length()<b.length()){
                if(a.length()+1==b.length()){
                    change = getChange(a,b);
                }else{
                    return false;
                }
            }else{
                if(a.length()-1==b.length()){
                    change = getChange(b,a);
                }else {
                    return false;
                }
            }
//            System.out.println("a");

        }
//        System.out.println("a");

        if(change>1) return false;
        return true;
    }
    public static void main(String[] args) {
        String a = "pse";
        String b = "pale";
        boolean isOneEdit = oneEditAway(a, b);
        System.out.println(a + ", " + b + ": " + isOneEdit);
    }
}
