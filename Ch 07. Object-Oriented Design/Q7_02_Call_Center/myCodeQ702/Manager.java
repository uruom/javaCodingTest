package Q7_02_Call_Center.myCodeQ702;

/**
 * @ClassName:Manager
 * @Auther: uruom
 * @Description: theThirdPeopleAnsweringThePhone
 * @Date: 2023/1/6 16:05
 * @Version: v1.0
 */
public class Manager extends Staff{
    @Override
    public void handOver(Phone phone) {
        return;
        //已经是最高级了，没有往上的可能了
    }

    @Override
    public void phoning(Phone phone) {
        super.phoning(phone);
    }

    @Override
    public void getPhone(Phone phone) {
        super.getPhone(phone);
    }

    @Override
    public Boolean getIsWorking() {
        return super.getIsWorking();
    }
    public Manager(){
        kind = 2;
    }
}
