package Q7_02_Call_Center.myCodeQ702;

/**
 * @ClassName:Phone
 * @Auther: uruom
 * @Description: RecordWhatInthePhone
 * @Date: 2023/1/6 10:12
 * @Version: v1.0
 */
public class Phone {
    public String phoneNumber ;
    public int importantNumber;
    public Phone(String phoneNumber){
        this.phoneNumber = phoneNumber;
        importantNumber=0;
    }
    public void toNext(){
        importantNumber++;
    }
}
