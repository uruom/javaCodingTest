package Q4_04_Check_Balanced;

import MyCode.Tree;

import static java.lang.Math.abs;

/**
 * @ClassName:MyCodeQ404
 * @Auther: uruom
 * @Description: isBalance
 * @Date: 2022/12/22 09:32
 * @Version: v1.0
 */
public class MyCodeQ404 {
    public Boolean isBalance(Tree root){
        if(root==null) return true;
//        System.out.println(root.data);
        if(root.left==null){
            if(root.right==null||root.right.height==1){
                return true;
            }else{
                return false;
            }
        }else{
            if(root.right==null){
                if(root.left.height==1) return true;
                else return false;
            }else{
                if((abs(root.left.height-root.right.height)<=1)&&isBalance(root.left)&&isBalance(root.right)){
                    return  true;
                }else{
                    return false;
                }
            }
        }
    }

}
