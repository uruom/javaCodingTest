package Q8_09_Parens;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName:MyCodeQ809
 * @Auther: uruom
 * @Description: () compose
 * @Date: 2023/1/13 10:20
 * @Version: v1.0
 */
public class MyCodeQ809 {
    public static Set<String> generateParens(int num){
        System.out.println(num);
        Set<String> returnAns = new LinkedHashSet<>();
        if(num==0){
            returnAns.add("");
//            System.out.println("size="+returnAns.size());
            return returnAns;
        }else{
            if(num==1){
                returnAns.add("()");
                return returnAns;
            }
            Set<String> tempAns = generateParens(num-1);
            for(String s:tempAns){
                    String temps = "("+s;
                    char[] tempchar = temps.toCharArray();
//                    System.out.println("tempchar:"+tempchar.length);
                    for(int i=1;i<tempchar.length;i++){
                        String tempAnsS = "";
                        for(int j=0;j<i;j++){
                            tempAnsS+=tempchar[j];
                        }
                        tempAnsS+=")";
                        for(int j=i;j<tempchar.length;j++){
                            tempAnsS+=tempchar[j];
                        }
                        returnAns.add(tempAnsS);
                    }
            }
        }

//        System.out.println("size="+returnAns.size());
        return returnAns;
    }
    public static void main(String[] args) {
        Set<String> list = generateParens(4);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.size());
    }
}
