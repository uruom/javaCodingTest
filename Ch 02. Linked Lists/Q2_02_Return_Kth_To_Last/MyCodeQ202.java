package Q2_02_Return_Kth_To_Last;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

/**
 * @ClassName:MyCodeQ202
 * @Auther: uruom
 * @Description: Q202
 * @Date: 2022/12/20 15:58
 * @Version: v1.0
 */
public class MyCodeQ202 {
    public static LinkedListNode nthToLast(LinkedListNode head,int n){
        if(n==0) return null;
        int i=1;
        LinkedListNode current = head;
        while(i<n&&current!=null){
            if(current.next!=null){
                i++;
                current = current.next;
            }else{
                return null;
            }
        }
        LinkedListNode ans = head;
        while(current.next!=null){
            ans = ans.next;
            current = current.next;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
        for (int i = 0; i <= array.length + 1; i++) {
            LinkedListNode node = nthToLast(head, i);
            String nodeValue = node == null ? "null" : "" + node.data;
            System.out.println(i + ": " + nodeValue);
        }
    }
}
