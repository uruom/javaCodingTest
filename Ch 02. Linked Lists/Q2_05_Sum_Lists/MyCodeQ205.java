package Q2_05_Sum_Lists;

import CtCILibrary.LinkedListNode;

/**
 * @ClassName:MyCodeQ205
 * @Auther: uruom
 * @Description: Q205
 * @Date: 2022/12/20 22:49
 * @Version: v1.0
 */
public class MyCodeQ205 {
    public static LinkedListNode addLists1(LinkedListNode lA,LinkedListNode lB){
        int val =0;
        LinkedListNode head = new LinkedListNode();
        LinkedListNode current = head;
        if(lA!=null&&lB!=null){
            val = lA.data+lB.data;
            current.data=val%10;
            val = val/10;
        }else{
            if(lA==null)
            return lB;
            else return lA;
        }
        while(lA.next!=null&&lB.next!=null){
            current.next = new LinkedListNode();
            lA = lA.next;
            lB = lB.next;
            val+= lA.data+lB.data;
            current = current.next;
            current.data = val%10;
            val/=10;
        }
        while(val!=0){
            if(lA.next!=null){
                current.next = new LinkedListNode();
                lA = lA.next;
                val+= lA.data;;
                current = current.next;
                current.data = val%10;
                val = val/10;
            }else{
                if(lB.next!=null){
                    current.next = new LinkedListNode();
                    lB = lB.next;
                    val+=lB.data;
                    current = current.next;
                    current.data = val%10;
                    val = val/10;
                }else{
                    current.next = new LinkedListNode();
                    current = current.next;
                    current.data = val%10;
                    val/=10;
                }
            }
        }
        if(lA.next==null){
            current.next = lB.next;
        }else{
            current.next = lA.next;
        }
        return head;

    }

    public static int LinkToInt(LinkedListNode node){
        int Val=0;
        while(node!=null){
            Val*=10;
            Val+=node.data;
            node=node.next;
        }
        return Val;
    }

    public static LinkedListNode IntToLink(int val){
        LinkedListNode current = new LinkedListNode();
        current.data = val%10;
        val/=10;
        while(val!=0){
            LinkedListNode temp = new LinkedListNode();
            temp.data = val%10;
            val/=10;
            temp.next = current;
            current = temp;
        }
        return current;
    }

    public static LinkedListNode addLists(LinkedListNode lA,LinkedListNode lB){
        int valA=LinkToInt(lA);
        int valB=LinkToInt(lB);
        int val = valA+valB;
        return IntToLink(val);
    }
    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(3, null, null);
        LinkedListNode lA2 = new LinkedListNode(2, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(7, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(4, null, null);
        LinkedListNode lB2 = new LinkedListNode(8, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(8, null, lB2);

        LinkedListNode list3 = addLists(lA1, lB1);

        System.out.println("  " + lA1.printForward());
        System.out.println("+ " + lB1.printForward());
        System.out.println("= " + list3.printForward());

//        int l1 = linkedListToInt(lA1);
//        int l2 = linkedListToInt(lB1);
//        int l3 = linkedListToInt(list3);

//        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
//        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));
    }
}
