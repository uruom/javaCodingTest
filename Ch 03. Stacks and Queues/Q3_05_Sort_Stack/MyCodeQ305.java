package Q3_05_Sort_Stack;

import CtCILibrary.AssortedMethods;

import java.util.Stack;

/**
 * @ClassName:MyCodeQ305
 * @Auther: uruom
 * @Description: maxStackNode
 * @Date: 2022/12/21 16:27
 * @Version: v1.0
 */
public class MyCodeQ305 {
    public static void sort(Stack<Integer> stack){
        if(stack.size()<2) return;
        Stack<Integer> tempStack = new Stack<>();
        int maxVal =stack.pop();
        while(!stack.isEmpty()){
            if(stack.peek()>maxVal){
                tempStack.push(maxVal);
                maxVal = stack.pop();
            }else{
                tempStack.push(stack.pop());
            }
        }
        tempStack.push(maxVal);
        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }

    }

    public static void main(String [] args) {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            int r = AssortedMethods.randomIntInRange(0,  1000);
            s.push(r);
        }

        sort(s);

        while(!s.isEmpty()) {
            sort(s);
            System.out.println(s.pop());
        }
    }
}
