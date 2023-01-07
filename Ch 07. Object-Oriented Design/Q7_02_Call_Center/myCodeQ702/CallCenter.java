package Q7_02_Call_Center.myCodeQ702;

import java.util.ArrayList;

/**
 * @ClassName:CallCenter
 * @Auther: uruom
 * @Description: CallCenter
 * @Date: 2023/1/6 16:41
 * @Version: v1.0
 */
public class CallCenter {
    ArrayList<Manager> managers = new ArrayList<>();
    ArrayList<Operator> operators = new ArrayList<>();
    ArrayList<Header> headers = new ArrayList<>();
    public Staff getNext(Staff staff){
        switch (staff.getKind()){
            case 0:
                for (Header header:headers){
                    if(!header.isWorking) return header;
                }
                return null;
            case 1:
                for (Manager manager:managers){
                    if(!manager.isWorking) return manager;
                }
                return null;
            case 2:
                return null;
            default:
                throw new RuntimeException("No this Staff");
        }
    }
    public Staff dispatchCall(){
        for(Operator operator :operators){
            if (!operator.isWorking) {
                return operator;
            }
        }
        for (Header header:headers){
            if (!header.isWorking) {
                return header;
            }
        }
        for (Manager manager:managers){
            if (!manager.isWorking) {
                return manager;
            }
        }
        return null;
    }


}
