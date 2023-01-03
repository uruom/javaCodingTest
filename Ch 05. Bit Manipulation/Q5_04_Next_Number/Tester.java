package Q5_04_Next_Number;

public class Tester {
	public static void binPrint(int i) {
		System.out.println(i + ": " + Integer.toBinaryString(i));		
	}
	
	public static void main(String[] args) {
//		给定正整数啊emm
		for (int i = 1; i < 200; i++) {
			//System.out.println(i);
			int p1 = QuestionA.getPrevSlow(i);
			//System.out.println(p1);
			//if(p1!=48)
			//throw new RuntimeException("A");
			int p2 = QuestionB.getPrev(i);
			int p3 = QuestionC.getPrevArith(i);
			int myp = myCodeQ504.getPrevSlow(i);

			int n1 = QuestionA.getNextSlow(i);
			int n2 = QuestionB.getNext(i);
			int n3 = QuestionC.getNextArith(i);
			int myn = myCodeQ504.getNextSlow(i);
			
			if (p1 != p2 || p2 != p3 || myp != p3 || n1 != n2 || n2 != n3 || myn != n3) {
				binPrint(i);
				binPrint(p1);
				binPrint(p2);
				binPrint(p3);
				binPrint(myp);
				binPrint(n1);
				binPrint(n2);
				binPrint(n3);
				binPrint(myn);
				System.out.println("");
				break;
			}			
		}
		System.out.println("Done!");
	}

}
