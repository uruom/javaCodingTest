package Q4_09_BST_Sequences;

import java.util.ArrayList;
import java.util.LinkedList;

import CtCILibrary.TreeNode;

public class Question {
	
	public static void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second, ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix) {
		/* One list is empty. Add the remainder to [a cloned] prefix and
		 * store result. */
		if (first.size() == 0 || second.size() == 0) {
			LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
			result.addAll(first);
			result.addAll(second);
			results.add(result);
			return;
		}
		
		/* Recurse with head of first added to the prefix. Removing the
		 * head will damage first, so we’ll need to put it back where we
		 * found it afterwards. */
		int headFirst = first.removeFirst();
		prefix.addLast(headFirst);
		weaveLists(first, second, results, prefix);
		prefix.removeLast();
		first.addFirst(headFirst);
		
		/* Do the same thing with second, damaging and then restoring
		 * the list.*/
		int headSecond = second.removeFirst();
		prefix.addLast(headSecond);
		weaveLists(first, second, results, prefix);
		prefix.removeLast();	
		second.addFirst(headSecond);
	}
	
	public static ArrayList<LinkedList<Integer>> allSequences(TreeNode node) {
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
		
		if (node == null) {
			result.add(new LinkedList<Integer>());
			return result;
		} 
		
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(node.data);
		
		/* Recurse on left and right subtrees. */
		ArrayList<LinkedList<Integer>> leftSeq = allSequences(node.left);
		ArrayList<LinkedList<Integer>> rightSeq = allSequences(node.right);
		
		/* Weave together each list from the left and right sides. */
		for (LinkedList<Integer> left : leftSeq) {
			for (LinkedList<Integer> right : rightSeq) {
				ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
				weaveLists(left, right, weaved, prefix);
				result.addAll(weaved);
			}
		}
		return result;
	}



	public static void getLink(LinkedList<Integer> left,LinkedList<Integer> right,ArrayList<LinkedList<Integer>> ans,LinkedList<Integer> tempAns){
		if(left.size()==0&&right.size()==0){
			ans.add(tempAns);
			return ;
		}else{
			if(left.size()!=0){
				LinkedList<Integer> tempLeftAns = (LinkedList<Integer>) tempAns.clone();
				LinkedList<Integer> tempLeftLeft = (LinkedList<Integer>) left.clone();
				LinkedList<Integer> tempLefiRight = (LinkedList<Integer>) right.clone();
				tempLeftAns.add(tempLeftLeft.remove());
				getLink(tempLeftLeft,tempLefiRight,ans,tempLeftAns);
			}
			if(right.size()!=0){
				LinkedList<Integer> tempRightAns = (LinkedList<Integer>) tempAns.clone();
				LinkedList<Integer> tempRightLeft = (LinkedList<Integer>) left.clone();
				LinkedList<Integer> tempRightRight = (LinkedList<Integer>) right.clone();
				tempRightAns.add(tempRightRight.remove());
				getLink(tempRightLeft,tempRightRight,ans,tempRightAns);
			}
		}

	}
	public static ArrayList<LinkedList<Integer>> myAllSequences(TreeNode node){
		ArrayList<LinkedList<Integer>> arrayList = new ArrayList<>();
		if(node==null){
			arrayList.add(new LinkedList<Integer>());
			return arrayList;
		}else{
//			System.out.println(node.data);
//			if(node.left!=null) System.out.println(node.left.data);
//			System.out.println("-------------------------");
			ArrayList<LinkedList<Integer>> left = myAllSequences(node.left);
			ArrayList<LinkedList<Integer>> right = myAllSequences(node.right);
			for(LinkedList<Integer> leftlink:left){
				for(LinkedList<Integer> rightlink:right){
					ArrayList<LinkedList<Integer>> tempAns = new ArrayList<>();
					LinkedList<Integer> tempLink = new LinkedList<>();
					tempLink.add(node.data);
					getLink(leftlink,rightlink,tempAns,tempLink);
					arrayList.addAll(tempAns);
//					LinkedList<Integer> linkedList = new LinkedList<>();
//					linkedList.add(node.data);
//					linkedList.addAll(leftlink);
//					linkedList.addAll(rightlink);
//					arrayList.add(linkedList);
//					if(node.left!=null&&node.right!=null){
//						LinkedList<Integer> linkedList2 = new LinkedList<>();
//						linkedList2.add(node.data);
//						linkedList2.addAll(rightlink);
//						linkedList2.addAll(leftlink);
//						arrayList.add(linkedList2);
//					}

				}
			}

			System.out.println(node.data);
			for(LinkedList<Integer> list:arrayList){
				System.out.println(list);
			}
			System.out.println("----------------------------------------");
		}

		return arrayList;
	}
	public static void main(String[] args) {
		TreeNode node = new TreeNode(100);
//		int[] array = {100, 50, 20, 75, 150, 120, 170};
		int[] array = {100,50, 20, 75, 150, 120, 170};
		for (int a : array) {
			node.insertInOrder(a);
		}
		ArrayList<LinkedList<Integer>> allSeq = allSequences(node);
//		ArrayList<LinkedList<Integer>> allSeq = myAllSequences(node);

		for (LinkedList<Integer> list : allSeq) {
			System.out.println(list);
		}
		System.out.println(allSeq.size());
	}

}
