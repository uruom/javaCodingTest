package Q4_02_Minimal_Tree;


import MyCode.Tree;

import static java.lang.Math.max;

/**
 * @ClassName:MyCodeQ402
 * @Auther: uruom
 * @Description: MinmalTree
 * @Date: 2022/12/21 22:03
 * @Version: v1.0
 */
public class MyCodeQ402 {

    public Tree build(int l, int r, int[] array){
        if(l>r) return null;
        Tree tree = new Tree();
        int mid = (l+r)/2;
        tree.data = array[mid];
        tree.left = build(l,mid-1,array);
        tree.right= build(mid+1,r,array);
        if(tree.left==null&&tree.right==null){
            tree.height=1;
        }else{
            if(tree.left==null) tree.height = tree.right.height+1;
            else{
                if(tree.right==null) tree.height= tree.left.height+1;
                else{
                    tree.height = max(tree.left.height,tree.right.height)+1;
                }
            }
        }
        return tree;
    }
    public Tree createMinmalBST(int[] array){
        int n = array.length;
        Tree tree = new Tree();
        tree.data = n/2;
        tree.left=build(0,n/2-1,array);
        tree.right=build(n/2+1,n-1,array);
        if(tree.left==null&&tree.right==null){
            tree.height=1;
        }else{
            if(tree.left==null) tree.height = tree.right.height+1;
            else{
                if(tree.right==null) tree.height= tree.left.height+1;
                else{
                    tree.height = max(tree.left.height,tree.right.height)+1;
                }
            }
        }
        return tree;
    }



}
