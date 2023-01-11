package Q8_07_Permutations_Without_Dups;

import java.util.ArrayList;

/**
 * @ClassName:MyCodeQ807
 * @Auther: uruom
 * @Description: find string
 * @Date: 2023/1/11 10:57
 * @Version: v1.0
 */
public class MyCodeQ807 {
    public static ArrayList<String> getPerms(String s){
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
        ArrayList<String> lastPerm = getPerms(tans);
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
        return returnAns;
    }
    public static void main(String[] args) {
        ArrayList<String> list = getPerms("abcde");
        System.out.println("There are " + list.size() + " permutations.");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
