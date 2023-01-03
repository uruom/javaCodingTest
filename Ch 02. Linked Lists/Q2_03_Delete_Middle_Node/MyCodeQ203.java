package Q2_03_Delete_Middle_Node;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

/**
 * @ClassName:MyCodeQ203
 * @Auther: uruom
 * @Description: Q203
 * @Date: 2022/12/20 20:20
 * @Version: v1.0
 */
public class MyCodeQ203 {
    public static void deleteNode(LinkedListNode linkedListNode){
        if(linkedListNode==null) return;
        if(linkedListNode.next==null) linkedListNode = null;
        linkedListNode.data = linkedListNode.next.data;
        linkedListNode.next = linkedListNode.next.next;
    }
    public static void main(String[] args) {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        deleteNode(head.next.next.next.next); // delete node 4
        System.out.println(head.printForward());
    }
}
