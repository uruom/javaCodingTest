package Q2_08_Loop_Detection;

import CtCILibrary.LinkedListNode;

/**
 * @ClassName:MyCodeQ208
 * @Auther: uruom
 * @Description: Q208
 * @Date: 2022/12/21 11:12
 * @Version: v1.0
 */
public class MyCodeQ208 {
    public static LinkedListNode FindBeginning(LinkedListNode head){
        if(head == null||head.next==null){
            return null;
        }
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
                return fast;
        }
        return null;
    }
    public static void main(String[] args) {
        int list_length = 100;
        int k = 10;

        // Create linked list
        LinkedListNode[] nodes = new LinkedListNode[list_length];
        for (int i = 0; i < list_length; i++) {
            nodes[i] = new LinkedListNode(i, null, i > 0 ? nodes[i - 1] : null);
        }

        // Create loop;
        nodes[list_length - 1].next = nodes[list_length - k];

        LinkedListNode loop = FindBeginning(nodes[0]);
        if (loop == null) {
            System.out.println("No Cycle.");
        } else {
            System.out.println(loop.data);
        }
    }
}
