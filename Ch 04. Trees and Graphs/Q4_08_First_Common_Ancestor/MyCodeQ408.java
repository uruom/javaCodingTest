package Q4_08_First_Common_Ancestor;

/**
 * @ClassName:MyCodeQ408
 * @Auther: uruom
 * @Description: findAncestor
 * @Date: 2022/12/22 16:45
 * @Version: v1.0
 */
public class MyCodeQ408 {
//    见leetcode
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode(int x) { val = x; }
//     * }
//     */
//    class Solution {
//        public Boolean cover(TreeNode node,TreeNode root){
//            if(root==null) return false;
//            if(node==root) return true;
//            return(cover(node,root.left)||cover(node,root.right));
//        }
//        public TreeNode getAncestor(TreeNode root,TreeNode p,TreeNode q){
//            if((root==p)||(root==q)) return root;
//            if(cover(p,root.left)){
//                if(cover(q,root.right)) return root;
//                else return getAncestor(root.left,p,q);
//            }else{
//                if(cover(q,root.left)) return root;
//                return getAncestor(root.right,p,q);
//            }
//        }
//        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            return getAncestor(root,p,q);
//        }
//    }
}
