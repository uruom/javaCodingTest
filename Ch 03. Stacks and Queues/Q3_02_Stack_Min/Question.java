package Q3_02_Stack_Min;

public class Question {
	public static void main(String[] args) {
		StackWithMin stack = new StackWithMin();
		StackWithMin2 stack2 = new StackWithMin2();
		MyCodeQ302 stack3 = new MyCodeQ302();
		int[] array = {2, 1, 3, 1};
		for (int value : array) {
			stack.push(value);
			stack2.push(value);
			stack3.push(value);
			System.out.print(value + ", ");
		}
		System.out.println('\n');
		for (int i = 0; i < array.length; i++) {
			System.out.println("Popped " + stack.pop().value + ", " + stack2.pop() + ", "+ stack3.pop());
			System.out.println("New min is " + stack.min() + ", " + stack2.min()+", "+stack3.min());
		}
	}

}
