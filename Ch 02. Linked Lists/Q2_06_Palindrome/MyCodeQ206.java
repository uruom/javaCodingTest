package Q2_06_Palindrome;

import CtCILibrary.LinkedListNode;

/**
 * @ClassName:MyCodeQ206
 * @Auther: uruom
 * @Description: Q206
 * @Date: 2022/12/21 10:25
 * @Version: v1.0
 */
public class MyCodeQ206 {
    public static Boolean isPalindrome(LinkedListNode head){
        if(head==null) return true;
        LinkedListNode last = head;
        while(last.next!=null){
            last = last.next;
        }
        while(last!=head&&last.prev!=head){
            if(last.data!=head.data) return false;
            last = last.prev;
            head = head.next;
        }
        if(last.prev==head){
            if(last.data!=head.data) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int length = 9;
        LinkedListNode[] nodes = new LinkedListNode[length];
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i - 1]);
            }
        }
        // nodes[length - 2].data = 9; // Uncomment to ruin palindrome

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());
        System.out.println(isPalindrome(head));
    }
}
