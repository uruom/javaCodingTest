package Q8_04_Power_Set;

import java.util.ArrayList;

/**
 * @ClassName:MyCodeQ804
 * @Auther: uruom
 * @Description: find power set
 * @Date: 2023/1/10 17:08
 * @Version: v1.0
 */
public class MyCodeQ804 {
    static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> list,int num){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(num>=list.size()){
            ArrayList<Integer> temp_ans = new ArrayList<>();
            ans.add(temp_ans);
            return ans;
        }
        ArrayList<ArrayList<Integer>> temp_ans = getSubsets(list,num+1);

        for (ArrayList<Integer> tans:temp_ans){
            ans.add(tans);
            ArrayList<Integer> ttans = (ArrayList<Integer>) tans.clone();
            ttans.add(list.get(num));
            ans.add(ttans);
        }
        //
//        System.out.println("===============================");
//        System.out.println(num);
//        System.out.println(ans.toString());

        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        ArrayList<ArrayList<Integer>> subsets = getSubsets(list, 0);
        System.out.println(subsets.toString());
    }
}
