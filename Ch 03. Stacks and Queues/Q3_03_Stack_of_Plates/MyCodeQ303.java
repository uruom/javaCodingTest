package Q3_03_Stack_of_Plates;


import Q3_02_Stack_Min.MyCodeQ302;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @ClassName:MyCodeQ303
 * @Auther: uruom
 * @Description: Q303
 * @Date: 2022/12/21 15:45
 * @Version: v1.0
 */
public class MyCodeQ303 {
    int capacity_per_substack = 10;
    public MyCodeQ303(int capacity_per_substack){
        this.capacity_per_substack = capacity_per_substack;
    }
    public class OneNode{
        int val;
        public OneNode(int num){val = num;}

    }
    public class OneStack{
        Stack<OneNode> stacks = new Stack<>();
        OneStack last = null;
        OneStack next = null;
        int num = 0;
    }
    OneStack oneStack = new OneStack();
    public void push(int val){
        if(oneStack.num<capacity_per_substack){
            oneStack.stacks.push(new OneNode(val));
            oneStack.num++;
        }
        else{
            OneStack tempOneStack = new OneStack();
            oneStack.next =  tempOneStack;
            tempOneStack.last = oneStack;
            tempOneStack.stacks.push(new OneNode(val));
            tempOneStack.num++;
            oneStack = tempOneStack;
        }
    }

    public int pop(){
        if(oneStack.num!=0){
            oneStack.num--;
            return oneStack.stacks.pop().val;
        }else{
            if(oneStack.last==null) throw new EmptyStackException();
            else{
                oneStack = oneStack.last;
                oneStack.next = null;
                oneStack.num--;
                return oneStack.stacks.pop().val;
            }

        }
    }
    public boolean isEmpty(){
        if(oneStack.num==0&&oneStack.last==null) return true;
        else return false;
    }
    public int peek(){
        return oneStack.stacks.peek().val;
    }


}
