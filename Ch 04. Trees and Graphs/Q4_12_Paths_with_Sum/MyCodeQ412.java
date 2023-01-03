package Q4_12_Paths_with_Sum;

import CtCILibrary.TreeNode;

/**
 * @ClassName:MyCodeQ412
 * @Auther: uruom
 * @Description: sum
 * @Date: 2022/12/26 11:01
 * @Version: v1.0
 */
public class MyCodeQ412 {
//    public static   int countPathsWithSum(TreeNode root,int target){
//
//    }
    public static void main(String [] args) {
		/*
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(-8);
		root.left.right = new TreeNode(8);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(6);
		System.out.println(countPathsWithSum(root, 0));*/

		/*TreeNode root = new TreeNode(-7);
		root.left = new TreeNode(-7);
		root.left.right = new TreeNode(1);
		root.left.right.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(20);
		root.right.right.left = new TreeNode(0);
		root.right.right.left.left = new TreeNode(-3);
		root.right.right.left.left.right = new TreeNode(2);
		root.right.right.left.left.right.left = new TreeNode(1);
		System.out.println(countPathsWithSum(root, -14));*/

        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.left.right = new TreeNode(0);
        root.right.right = new TreeNode(0);
//        System.out.println(countPathsWithSum(root, 0));
//        System.out.println(countPathsWithSum(root, 4));
    }
}
