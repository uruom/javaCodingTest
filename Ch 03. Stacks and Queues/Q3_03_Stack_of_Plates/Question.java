package Q3_03_Stack_of_Plates;

import Q3_02_Stack_Min.MyCodeQ302;

public class Question {
	public static void main(String[] args) {
		int capacity_per_substack = 5;
		SetOfStacks set = new SetOfStacks(capacity_per_substack);
		MyCodeQ303 set2 = new MyCodeQ303(capacity_per_substack);
		for (int i = 0; i < 34; i++) {
			set.push(i);
			set2.push(i);
		}
		for (int i = 0; i < 35; i++) {
//			System.out.println("Popped " + set.pop()+", "+set2.pop());
//			System.out.println("Popped " + ", "+set2.pop());
			System.out.println("Popped " + set.pop()+", ");


		}
	}
}
