package Q1_09_String_Rotation;

/**
 * @ClassName:MyCodeQ109
 * @Auther: uruom
 * @Description: Q109
 * @Date: 2022/12/20 12:02
 * @Version: v1.0
 */
public class MyCodeQ109 {
    public static boolean isSubstring(String big, String small) {
        if (big.indexOf(small) >= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isRotation(String str1,String str2){
        if(str1.length()!=str2.length()||str1.length()==0) return false;
        String string = str1+str1;
//        System.out.println(string);
        return isSubstring(string,str2);
    }
    public static void main(String[] args) {
        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean is_rotation = isRotation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + is_rotation);
        }
    }
}
