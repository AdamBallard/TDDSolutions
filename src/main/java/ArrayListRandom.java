import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListRandom {

    public List<Integer> returnListWithRandomInts(){
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i<100; i++){
            list.add(rand.nextInt(99)+1);
        }
        return list;
    }
}
