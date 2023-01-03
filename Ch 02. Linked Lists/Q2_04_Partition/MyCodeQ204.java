package Q2_04_Partition;

import CtCILibrary.LinkedListNode;

/**
 * @ClassName:MyCodeQ204
 * @Auther: uruom
 * @Description: Q04
 * @Date: 2022/12/20 20:42
 * @Version: v1.0
 */
public class MyCodeQ204 {
    public static LinkedListNode partition(LinkedListNode head,int num){
        if(head==null||head.next==null) return head;
        LinkedListNode current = head;
        while (current.next!=null){
            if(current.next.data<num){
                LinkedListNode temp = current.next;
                current.next = current.next.next;
                temp.next = head;
                head = temp;

            }else{
                current = current.next;
            }

        }
        return head;
    }
    public static void main(String[] args) {
        int length = 20;
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

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());

        LinkedListNode h = partition(head, 7);
        System.out.println(h.printForward());
    }
}
