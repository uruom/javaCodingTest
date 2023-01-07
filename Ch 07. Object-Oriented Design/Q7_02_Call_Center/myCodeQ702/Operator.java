package Q7_02_Call_Center.myCodeQ702;

/**
 * @ClassName:Operator
 * @Auther: uruom
 * @Description: theFirstStaffAnswerThePhone
 * @Date: 2023/1/6 10:59
 * @Version: v1.0
 */
public class Operator extends Staff{
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
    public Operator(){
        kind =0;
    }
}
