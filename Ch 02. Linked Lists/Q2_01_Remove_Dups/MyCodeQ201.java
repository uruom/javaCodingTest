package Q2_01_Remove_Dups;

import CtCILibrary.LinkedListNode;

/**
 * @ClassName:MyCodeQ201
 * @Auther: uruom
 * @Description: Q201
 * @Date: 2022/12/20 14:39
 * @Version: v1.0
 */
public class MyCodeQ201 {
    public static void deleteDups(LinkedListNode head) {
        int val = 0;
        if (head == null) return;
        if (head.prev == null && head.next == null) return;
//        System.out.println("A");
        LinkedListNode linkedListNode = head;
        while (linkedListNode != null) {
            if (((1 << linkedListNode.data) & val) > 0) {
                if (linkedListNode.next != null) {
                    linkedListNode.next.prev = linkedListNode.prev;
                }
                if (linkedListNode.prev != null) {
                    linkedListNode.prev.next = linkedListNode.next;
                }
            }
            val|=(1 << linkedListNode.data);
            linkedListNode = linkedListNode.next;
        }
    }
    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.printForward());
        deleteDups(head);
        System.out.println(head.printForward());
    }
}
