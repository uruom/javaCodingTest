package Q6_10_Test_Strips;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName:myCodeQ610
 * @Auther: uruom
 * @Description: findPosionedBottole
 * @Date: 2023/1/4 16:02
 * @Version: v1.0
 */
public class myCodeQ610 {
    public static ArrayList<Bottle> createBottles(int nBottles, int poisoned) {
        ArrayList<Bottle> bottles = new ArrayList<Bottle>();
        for (int i = 0; i < nBottles; i++) {
            bottles.add(new Bottle(i));
        }

        if (poisoned == -1) {
            Random random = new Random();
            poisoned = random.nextInt(nBottles);
        }
        bottles.get(poisoned).setAsPoisoned();

        System.out.println("Added poison to bottle " + poisoned);

        return bottles;
    }

    public static ArrayList<TestStrip> createTestStrips(int nTestStrips) {
        ArrayList<TestStrip> testStrips = new ArrayList<TestStrip>();
        for (int i = 0; i < nTestStrips; i++) {
            testStrips.add(new TestStrip(i));
        }
        return testStrips;
    }
    public static int findPoisonedBottle(ArrayList<Bottle> bottles,ArrayList<TestStrip> testStrips){
        //不知道他bottle和srips怎么定义的
//        真的是优秀，没想到可以通过二进制的方式，到时候通过二进制来看，就可了，厉害
        return 0;
    }
    public static void main(String[] args) {
        int nBottles = 1000;
        int nTestStrips = 10;
        for (int poisoned = 0; poisoned < nBottles; poisoned++) {
            ArrayList<Bottle> bottles = createBottles(nBottles, poisoned);
            ArrayList<TestStrip> testStrips = createTestStrips(nTestStrips);
            int poisonedId = findPoisonedBottle(bottles, testStrips);
            System.out.println("Suspected Bottle: " + poisonedId);
            if (poisonedId != poisoned) {
                System.out.println("ERROR");
                break;
            }
        }
    }
}
