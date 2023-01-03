package Q5_07_Pairwise_Swap;

import CtCILibrary.AssortedMethods;

public class Question {

	public static int swapOddEvenBits(int x) { 
		return ( ((x & 0xaaaaaaaa) >>> 1) | ((x & 0x55555555) << 1) ); 
	}

	public static int mySwapOdd(int x){
		int y = x&0xaaaaaaaa;//1010
		int z = x&0x55555555;//0101
		return ((y>>>1)|(z<<1));
	}

	public static void main(String[] args) {
		int a = 234321;
		System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
		int b = swapOddEvenBits(a);
		int c = mySwapOdd(a);
		System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
		System.out.println(c + ": " + AssortedMethods.toFullBinaryString(c));
	}

}
