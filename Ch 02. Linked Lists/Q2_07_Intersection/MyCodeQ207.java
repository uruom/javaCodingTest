package Q2_07_Intersection;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

import java.util.ArrayList;

/**
 * @ClassName:MyCodeQ207
 * @Auther: uruom
 * @Description: Q207
 * @Date: 2022/12/21 10:38
 * @Version: v1.0
 */
public class MyCodeQ207 {
    public static LinkedListNode findIntersection(LinkedListNode l1,LinkedListNode l2){
        ArrayList<LinkedListNode> lin1 = new ArrayList<>();
        while(l1!=null){
            lin1.add(l1);
            l1 = l1.next;
        }
        ArrayList<LinkedListNode> lin2 = new ArrayList<>();
        while(l2!=null){
            lin2.add(l2);
            l2 = l2.next;
        }
        if(lin1.isEmpty()||lin2.isEmpty()) return null;
        if(lin1.get(lin1.size()-1)!=lin2.get(lin2.size()-1)) return null;
        for(int i=lin1.size()-1,j=lin2.size()-1;i>0&&j>0;i--,j--){
            if(lin1.get(i)!=lin2.get(j)) return lin1.get(i+1);
        }
        if(lin1.size()<lin2.size())
        return lin1.get(0);
        else return lin2.get(0);
    }
    public static void main(String[] args) {
        /* Create linked list */
        int[] vals = {-1, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        LinkedListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

        int[] vals2 = {12, 14, 15};
        LinkedListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);

        list2.next.next = list1.next.next.next.next;

        System.out.println(list1.printForward());
        System.out.println(list2.printForward());


        LinkedListNode intersection = findIntersection(list1, list2);

        System.out.println(intersection.printForward());
    }
}
