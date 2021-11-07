package A3Inheritance.A1Lab.A5RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {


    public Object getRandomElement(){
        Random random = new Random();
        return remove(random.nextInt(super.size()));
    }
}
