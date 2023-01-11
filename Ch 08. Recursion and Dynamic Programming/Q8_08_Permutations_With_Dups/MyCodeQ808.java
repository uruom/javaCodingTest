package Q8_08_Permutations_With_Dups;

import java.util.ArrayList;

/**
 * @ClassName:MyCodeQ808
 * @Auther: uruom
 * @Description: String Sort
 * @Date: 2023/1/11 16:47
 * @Version: v1.0
 */
public class MyCodeQ808 {
    //test sort all then delete equal
    public static ArrayList<String> printPerms(String s){
        ArrayList<String> returnAns = new ArrayList<>();
        char[] temp_ans = s.toCharArray();
        int n= s.length();
        if(n<=1){
            returnAns.add(s);
            return returnAns;
        }
        String tans="";
        for(int i=1;i<n;i++){
            tans+=temp_ans[i];
        }
        ArrayList<String> lastPerm = printPerms(tans);
        for(String s1:lastPerm){
            temp_ans = s1.toCharArray();
            for(int j=0;j<s.length();j++){
                String s2 = "";
                for (int k=0;k<j;k++){
                    s2+=temp_ans[k];
                }
                s2+=s.charAt(0);
                for(int k=j+1;k<s.length();k++){
                    s2+=temp_ans[k-1];
                }
                returnAns.add(s2);
            }
        }
        for(int i=0;i<returnAns.size();i++){
            for(int j=i+1;j<returnAns.size();j++){
                if(returnAns.get(i).equals(returnAns.get(j))){
                    returnAns.remove(j);
                }
            }
        }
        return returnAns;
    }
    public static void main(String[] args) {
        String s = "aabbccc";
        ArrayList<String> result = printPerms(s);
        System.out.println("Count: " + result.size());
        for (String r : result) {
            System.out.println(r);
        }
    }
}
