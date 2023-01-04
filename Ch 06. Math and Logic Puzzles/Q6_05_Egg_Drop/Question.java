package Q6_05_Egg_Drop;

import static Big_O.Q_06.sqrt;

public class Question {
	public static int breakingPoint = 89;
	public static int countDrops = 0;
	public static int mycountDrops;

	public static boolean willBreak(int floor) {
		countDrops++;
		return floor >= breakingPoint;
	}
	public static boolean mywillBreak(int floor) {
		mycountDrops++;
		return floor >= breakingPoint;
	}


	public static int findBreakingPoint(int floors) {
		int interval = 14;
		int previousFloor = 0;
		int egg1 = interval;
		
		/* Drop egg1 at decreasing intervals. */
		while (!willBreak(egg1) && egg1 <= floors) {
			interval -= 1;
			previousFloor = egg1;
			egg1 += interval;
		}
		
		/* Drop egg2 at 1 unit increments. */
		int egg2 = previousFloor + 1;
		while (egg2 < egg1 && egg2 <= floors && !willBreak(egg2)) {
			egg2 += 1;
		}
		
		/* If it didn’t break, return -1. */
		return egg2 > floors ? -1 : egg2;
	}


	public static int myfindBreaking(int num){
//		int l=0,r=num;
//		int mid;
//		while(l<r){
//			mid = (l+r)/2;
//			mycountDrops+=1;
//			if(willBreak(mid)){
//				r=mid;
//			}else{
//				l=mid+1;
//			}
//		}
//		return l;
		int p=14;
		int q =p;
		while(!mywillBreak(p)){
			p+=q;
			q-=1;
		}
		int myegg1 =p;
		p-=q;
		p++;
		while(!mywillBreak(p)){
			p++;
			if(p==myegg1) return p;
		}
		return p;
	}

	public static void main(String[] args) {
//		egg是哪道题？没理解没看懂是做什么，如说是水壶的话，那么先3入5，再3入5剩1，就都可以了
//		5.8,扔鸡蛋，二分个屁，只有两个蛋，没法分
		int max = 0;
		int mymax= 0;

		for (int i = 1; i <= 100; i++) {
			countDrops = 0;
			mycountDrops=0;
			breakingPoint = i;
			int bp = findBreakingPoint(100);
			int mybp =myfindBreaking(100);
			
			if (bp == breakingPoint ) {
				System.out.println("SUCCESS: " + i + " -> " + bp + " -> " + countDrops +" vs "+ mycountDrops);
			} else {
				System.out.println("ERROR: " + i + " -> " + bp + " vs " +mybp +" vs "+ breakingPoint);
				break;
			}
			max = countDrops > max ? countDrops : max;
			mymax = mycountDrops >mymax?mycountDrops:mymax;
		}
		System.out.println(max);
		System.out.println(mymax);
	}
}

