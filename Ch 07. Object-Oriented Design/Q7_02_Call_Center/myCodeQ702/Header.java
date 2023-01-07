package Q7_02_Call_Center.myCodeQ702;

/**
 * @ClassName:header
 * @Auther: uruom
 * @Description: theSecondPersonAnswerThePhone
 * @Date: 2023/1/6 16:39
 * @Version: v1.0
 */
public class Header extends Staff{
    @Override
    public void getPhone(Phone phone) {
        super.getPhone(phone);
    }

    @Override
    public void phoning(Phone phone) {
        super.phoning(phone);
    }

    @Override
    public void handOver(Phone phone) {
        super.handOver(phone);
    }

    @Override
    public Boolean getIsWorking() {
        return super.getIsWorking();
    }
    public Header(){
        kind =1;
    }
}
