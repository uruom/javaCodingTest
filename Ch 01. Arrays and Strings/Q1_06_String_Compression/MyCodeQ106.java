package Q1_06_String_Compression;

import java.util.Locale;

/**
 * @ClassName:MyCodeQ106
 * @Auther: uruom
 * @Description: Q106
 * @Date: 2022/12/20 09:34
 * @Version: v1.0
 */
public class MyCodeQ106 {
    public static String getCompress(String str){
        int num =0;
        char ch = str.toCharArray()[0];
        String newStr = "";
        for(int i=0;i<str.length();i++){
            if(str.toCharArray()[i]!=ch){
                newStr = newStr+ch;
                newStr = newStr+(i-num);
                ch = str.toCharArray()[i];
                num = i;
            }
        }
        newStr = newStr+str.toCharArray()[num];
        newStr = newStr+(str.length()-num);
        return newStr;
    }
    public static String compress(String str){
        if(str.length()<2) return str;
        String newStr = getCompress(str);
        if(str.length()<=newStr.length()) return str;
        return newStr;
    }
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(str);
        System.out.println(compress(str));
    }
}
