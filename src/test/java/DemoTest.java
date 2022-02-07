import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class DemoTest {

    @Test
    void replaceArrayTest(){
        Demo testObject = new Demo();
        int[] myArray = new int[10];
        myArray = IntStream.range(0, 9).toArray();

        int[] actual = testObject.replaceZerosWithOneArray(myArray);

        for(int i : actual){
            Assertions.assertNotEquals(0,i);
        }
    }
}
