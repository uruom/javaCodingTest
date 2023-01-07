package Q7_02_Call_Center.myCodeQ702;

/**
 * @ClassName:Staff
 * @Auther: uruom
 * @Description: TheWorkPersonSuperClass
 * @Date: 2023/1/6 10:05
 * @Version: v1.0
 */
public abstract class Staff {
    public Boolean isWorking;
    public int kind;
    /**
     * 接到了电话
      */
    public void getPhone(Phone phone){

    }

    /**
     * 进行通话
     */
    public void phoning(Phone phone){
        isWorking=true;
    }
    /**
     * 给到下一个
     */
    public void handOver(Phone phone){
        isWorking = false;
    }
    /**
     * 是否正在工作（能不能接新电话）
     */
    public Boolean getIsWorking(){
        return isWorking;
    }

    public int getKind() {
        return kind;
    }
}
