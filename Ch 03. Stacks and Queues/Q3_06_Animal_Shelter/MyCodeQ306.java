package Q3_06_Animal_Shelter;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;

import java.util.LinkedList;

/**
 * @ClassName:MyCodeQ306
 * @Auther: uruom
 * @Description: AnimalQueue
 * @Date: 2022/12/21 16:40
 * @Version: v1.0
 */
public class MyCodeQ306 {
    int age = 9999;
    LinkedList<Cat> linkCat = new LinkedList<>();
    LinkedList<Dog> linkDog = new LinkedList<>();
    public MyCodeQ306(){

    }
    public void enqueue(Animal animal){
        animal.setOrder(age);
        age--;
        if(animal.getType()==1){
            linkCat.add((Cat) animal);
//            System.out.println("cat");
        }else{
            linkDog.add((Dog) animal);
//            System.out.println("dog");
        }
    }
    public Animal dequeueDog(){
        return  linkDog.remove();
    }
    public Animal dequeueCat(){
        return linkCat.remove();
    }
    public Animal dequeueAny(){
        if(linkDog.isEmpty()||linkCat.isEmpty()){
            if(linkCat.isEmpty()){
                return linkDog.remove();
            }else{
                return linkCat.remove();
            }
        }
        if(linkCat.peek().getOrder()>linkDog.peek().getOrder()){
            return linkCat.remove();
        }else{
            return linkDog.remove();
        }
    }

}
