package Q4_03_List_of_Depths;



import CtCILibrary.TreeNode;
import MyCode.Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName:MyCodeQ403
 * @Auther: uruom
 * @Description: Link
 * @Date: 2022/12/21 22:38
 * @Version: v1.0
 */
public class MyCodeQ403 {
//    public  class MyCode.Tree{
//        MyCode.Tree left = null;
//        MyCode.Tree right = null;
//        int data = 0;
//        int height;
//    }
    public ArrayList<LinkedList<Tree>> getList(Tree tree){
        ArrayList<LinkedList<Tree>> arrayList = new ArrayList<>();
        LinkedList<Tree> first = new LinkedList<>();
        first.add(tree);
        arrayList.add(first);
        LinkedList<Tree> tempLink= arrayList.get(arrayList.size()-1);
        while(tempLink!=null){
            LinkedList<Tree> nextLink = new LinkedList<>();
            for(Tree tree1:tempLink){
//                System.out.println("-"+tree1.data);
                if(tree1.left==null){
//                    System.out.println("null:"+tree1.data);
                }else{
//                    System.out.println("nonull"+tree1.left.data);
                }
                if(tree1.left!=null){
//                    System.out.println("+"+tree1.left.data);
                    nextLink.add(tree1.left);
                }
                if(tree1.right!=null){
//                    System.out.println("+"+tree1.right.data);
                    nextLink.add(tree1.right);
                }
            }
            if(nextLink.size()!=0){
                arrayList.add(nextLink);
            }else nextLink = null;
            tempLink = nextLink;
        }
        return arrayList;
    }
    public void printResult(ArrayList<LinkedList<Tree>> result){
        int depth = 0;
        for(LinkedList<Tree> entry : result) {
            Iterator<Tree> i = entry.listIterator();
            System.out.print("Link list at depth " + depth + ":");
            while(i.hasNext()){
                System.out.print(" " + ((Tree)i.next()).data);
            }
            System.out.println();
            depth++;
        }
    }
}
