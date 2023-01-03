package Q4_11_Random_Node;

import MyCode.Tree;

import static java.lang.Math.random;
import static java.lang.Math.sqrt;

/**
 * @ClassName:MyCodeQ411
 * @Auther: uruom
 * @Description: Tree
 * @Date: 2022/12/22 21:21
 * @Version: v1.0
 */
public class MyCodeQ411 {
    Tree root = null;
    public  void insert(int num, Tree current){
        if(current==null){
            current = new Tree();
            current.data = num;
            current.size=1;
        }else{

//            System.out.println(current.data);
            current.size++;
            if(current.data<num){
//                System.out.println(current.data);
                if(current.right==null){
                    current.right = new Tree();
                    current.right.data = num;
                    current.right.size=1;
                    return;
                }

                insert(num,current.right);
            }else{
                if(current.left==null){
                    current.left = new Tree();
                    current.left.data=num;
                    current.left.size=1;
                    return;
                }

                insert(num,current.left);
            }
        }
    }
    public void insertInorder(int num){
//        System.out.println("---------------------------------");
//        System.out.println("---------------------------------");
//        System.out.println(num);
//        System.out.println("----------------------------");
        if(root==null){
            root = new Tree();
            root.data = num;
            root.size=1;
        }else{
            root.size++;
            if(root.data<num) {
                if(root.right==null) {
                    root.right = new Tree();
                    root.right.data = num;
                    root.right.size = 1;
                    return;
                }
                insert(num, root.right);

            }else{
                if(root.left==null){
                    root.left = new Tree();
                    root.left.data = num;
                    root.left.size =1;
                    return;
                }
                insert(num,root.left);

            }
        }

    }
    public Tree findWithTree(int num, Tree current){
        if(current==null) return null;
        else{
            if(current.data==num) return current;
            else{
                if(current.data<num){
                    return findWithTree(num,current.right);
                }else{
                    return findWithTree(num,current.left);
                }
            }
        }
    }
    public Tree find(int num){
        if(root!=null){
            if(root.data==num) return root;
            else{
                if(root.data<num) return findWithTree(num,root.right);
                else return findWithTree(num,root.left);
            }
        }else{
            return null;
        }
    }
//    0-left.size-1,left.size,current.size-1
    public int randomFind(){
        if(root==null) throw new RuntimeException("random error1");
        else{
            int rand = (int)(random()*(root.size));
            if(root.left==null){
                if(root.right==null){
                    throw new RuntimeException("random error2");
                }else{
                    throw new RuntimeException("Error");
//                    if(rand==0) return root.data;
//                    else return randomFindWithTree(root.right).data;

                }
            }else{
                if(root.right==null){
                    throw new RuntimeException("Error");
//                    if(rand==root.size-1) return root.data;
//                    else return randomFindWithTree(root.right).data;
                }else{
                    if(rand==root.left.size) return root.data;
                    else{
                        if(rand<root.left.size)
//                            throw new RuntimeException("Test1");
                            return randomFindWithTree(root.left).data;
//                        else throw new RuntimeException("TEST2");
                            return randomFindWithTree(root.right).data;
                    }
                }
            }
        }
    }
    //    0-left.size-1,left.size,current.size-1
    public Tree randomFindWithTree(Tree current){
        int rand = (int) (random()*(current.size));
        if(current.left==null){
            if(rand==0) return current;
            else return randomFindWithTree(current.right);
        }else{
            if(current.right==null){
                if(rand==current.size-1) return current;
                else return randomFindWithTree(current.left);
            }else{
                if(rand==current.left.size) return current;
                else{
                    if(rand<current.left.size) return randomFindWithTree(current.left);
                    else return randomFindWithTree(current.right);
                }
            }
        }
    }

}
