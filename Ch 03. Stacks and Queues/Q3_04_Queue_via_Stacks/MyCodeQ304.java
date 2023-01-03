package Q3_04_Queue_via_Stacks;


import java.util.Stack;

/**
 * @ClassName:MyCodeQ304
 * @Auther: uruom
 * @Description: Q304
 * @Date: 2022/12/21 16:07
 * @Version: v1.0
 */
public class MyCodeQ304<T> {
    Stack<T> stackPush = new Stack<>();
    Stack<T> stackPop = new Stack<>();

    public void add(T t){
        stackPush.push(t);
    }
    public T remove(){
        if(stackPop.isEmpty()){
            while(!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
            if(stackPop.isEmpty()){ throw new RuntimeException("ERROR");}
            return stackPop.pop();
        }
        return stackPop.pop();
    }

    public Boolean isEmpty(){
        if(stackPop.isEmpty()&&stackPush.isEmpty()) return true;
        else return false;
    }

    public T peek(){
        if(stackPop.isEmpty()){
            while(!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
            if(stackPop.isEmpty()) throw new RuntimeException("ERROR peek");
            return stackPop.peek();
        }else{
            return stackPop.peek();
        }
    }

    public int size(){
        return stackPush.size()+stackPop.size();
    }


}
