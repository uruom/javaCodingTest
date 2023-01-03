package Q1_03_URLify;

import CtCILibrary.AssortedMethods;

/**
 * @ClassName:MyCodeQ103
 * @Auther: uruom
 * @Description: Q103
 * @Date: 2022/12/19 22:15
 * @Version: v1.0
 */
public class MyCodeQ103 {
    private static void replaceSpaces(char[] arr, int length){
        int expand =0;
        for(int i=0;i<length+expand;i++){
            if(arr[i]==' '){
                expand+=2;
                for(int j=length+expand-1;j>i+2;j--){
                    arr[j]= arr[j-2];
                }
                arr[i]= '%';
                arr[i+1]='2';
                arr[i+2]='0';
            }
        }
    }

    private static int findLastCharacter(char[] str){
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        replaceSpaces(arr, trueLength);
        System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
    }
}
