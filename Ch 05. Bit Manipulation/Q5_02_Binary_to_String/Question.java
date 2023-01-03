package Q5_02_Binary_to_String;

public class Question {
	public static String printBinary(double num) {
		if (num >= 1 || num <= 0) {
			return "ERROR";
		}
	
		StringBuilder binary = new StringBuilder();
		binary.append(".");
		while (num > 0) {
			/* Setting a limit on length: 32 characters */
			if (binary.length() > 32) {
				return "ERROR";
			}
			double r = num * 2;
			if (r >= 1) {
				binary.append(1);
				num = r - 1;
			} else {
				binary.append(0);
				num = r;
			}
		}
		return binary.toString();
	}
	
	public static String printBinary2(double num) {
		if (num >= 1 || num <= 0) {
			return "ERROR";
		}
	
		StringBuilder binary = new StringBuilder();
		double frac = 0.5;
		binary.append(".");
		while (num > 0) {
			/* Setting a limit on length: 32 characters */
			if (binary.length() >= 32) {
				return "ERROR";
			}
			if (num >= frac) {
				binary.append(1);
				num -= frac;
			} else {
				binary.append(0);
			}
			frac /= 2;
		}
		return binary.toString();
	}	

	public static String myPrintBinary(double num){
		if(num>1||num<0) return "ERROR";
		String ans = ".";
		int length = 0;
		while(num>0&&length<32){
			//为什么这里可以>0呢？理论上应该是！=0，换句话说应该是abs(num-0)<0.0000001，也就是时候，精度不够的话，按理来说永远不会减到0才对？
			num*=2;
			length++;
			if(num>=1){
				ans=ans+"1";
				num-=1;
			}else{
				ans=ans+"0";
			}
		}
		if(length>32) return "ERROR";
		else return ans;
	}
	public static void main(String[] args) {
		String bs = printBinary(.125);
		System.out.println(bs);
		
		for (int i = 0; i < 1000; i++) {
			double num = i / 1000.0;
			String binary = printBinary(num);
			String binary2 = printBinary2(num);
			String binary3 = myPrintBinary(num);
			if (!binary.equals("ERROR") || !binary2.equals("ERROR")) {
				System.out.println(num + " : " + binary + " " + binary2 + " "+ binary3);
			}
		}
	}
}
