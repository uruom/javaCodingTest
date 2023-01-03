package Q4_07_Build_Order.MyCodeQ407;

/**
 * @ClassName:Project
 * @Auther: uruom
 * @Description: Node
 * @Date: 2022/12/22 16:08
 * @Version: v1.0
 */
public class Project {
    public String name;
    public int needProject = 0;
    public Boolean isUsed = false;
    public Dependencies head =null;
    public Project(String name){
        this.name = name;
    }
    public Boolean isEqual(String name){
        if(name.equals(this.name)) return true;
        else return false;
    }
    public class Dependencies{
        Dependencies nextDependencies = null;
        Project target;
    }
    public void addDependent(Project project){
        Dependencies dependencies = new Dependencies();
        dependencies.target = project;
        dependencies.nextDependencies = head;
        head = dependencies;
    }
    public void subDependencies(){
        Dependencies current = head;
        while(current!=null){
            current.target.needProject--;
            current = current.nextDependencies;
        }
    }
    public Boolean isUsed(){
        return isUsed;
    }
    public Boolean ready(){
        if(!isUsed()&&needProject==0) return  true;
        else return false;
    }
    public void useProject(){
        isUsed = true;
    }
}
