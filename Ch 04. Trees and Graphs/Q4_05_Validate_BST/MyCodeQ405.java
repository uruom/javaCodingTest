package Q4_05_Validate_BST;

import MyCode.Tree;

/**
 * @ClassName:MyCodeQ405
 * @Auther: uruom
 * @Description: isMinimal
 * @Date: 2022/12/22 11:39
 * @Version: v1.0
 */
public class MyCodeQ405 {
    public Boolean isNodeBST(Tree tree,int l,int r){
        System.out.println(tree.data+", "+l+", "+r);
        if(tree.data<l||tree.data>r){
            return false;
        }
        if(tree.left!=null){
            if (!isNodeBST(tree.left,l,tree.data)){
                return false;
            }
        }
        if(tree.right!=null){
            if(!isNodeBST(tree.right,tree.data,r)){
                return false;
            }
        }
        return true;
    }
    public Boolean isBST(Tree root){
        if(root.left!=null){
            System.out.println(root.left.data+"!!!!");
            if(!isNodeBST(root.left,-1<<30,root.data)){
                return false;
            }
        }
        if(root.right!=null){
            if(!isNodeBST(root.right,root.data,1<<30)){
                return false;
            }
        }
        return true;

    }

}
