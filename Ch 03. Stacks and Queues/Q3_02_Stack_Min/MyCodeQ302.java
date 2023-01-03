package Q3_02_Stack_Min;

import java.util.Stack;


/**
 * @ClassName:MyCodeQ302
 * @Auther: uruom
 * @Description: Q302
 * @Date: 2022/12/21 15:28
 * @Version: v1.0
 */
public class MyCodeQ302 {
    static Stack<NodeWithMin> stacks = new Stack<>();
    public  int pop(){
        NodeWithMin nodeWithMin = stacks.pop();
        return nodeWithMin.value;
    }

    public void push(int val){
        NodeWithMin nodeWithMin = null;
        if(stacks.empty()){
            nodeWithMin = new NodeWithMin(val,val);
        }
        else {
            nodeWithMin = new NodeWithMin(val,getmin(val,stacks.peek().min));
        }
        stacks.add(nodeWithMin);
    }

    private  static int getmin(int a,int b){
        if(a<b) return a;
        else return b;
    }

    public  int min(){
        if(stacks.empty()){
            return 0;
        }else {
            return stacks.peek().min;
        }
    }

}
