package Q4_11_Random_Node;

public class Question {

	public static void main(String[] args) {
		int[] counts = new int[10];
		int[] countf = new int[10];

		for (int i = 0; i < 1000000; i++) {
			Tree tree = new Tree();
			MyCodeQ411 myCodeQ411 = new MyCodeQ411();
			int[] array = {1, 0, 6, 2, 3, 9, 4, 5, 8, 7};
			for (int x : array) {
				myCodeQ411.insertInorder(x);
				tree.insertInOrder(x);
			}
			int d = tree.getRandomNode().data;
			int f = myCodeQ411.randomFind();
			counts[d]++;
			countf[f]++;
		}

		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + ": " + counts[i]+", "+ countf[i]);
		}
//		MyCodeQ411 myCodeQ411 = new MyCodeQ411();
//		int[] array = {1, 0, 6, 2, 3, 9, 4, 5, 8, 7};
//		for (int x : array) {
//			myCodeQ411.insertInorder(x);
//			System.out.println("---------------------------------");
//			System.out.println("---------------------------------");
//		}
	}

}
