package Q4_02_Minimal_Tree;

import CtCILibrary.TreeNode;
import MyCode.Tree;

public class Question {	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// We needed this code for other files, so check out the code in the library
//		TreeNode root = TreeNode.createMinimalBST(array);
		MyCodeQ402 myCodeQ402 = new MyCodeQ402();
		Tree root = myCodeQ402.createMinmalBST(array);
		System.out.println("Root? " + root.data);
//		System.out.println("Created BST? " + root.isBST());
//		System.out.println("Height: " + root.height());
		System.out.println("Height: " + root.height);

	}

}
