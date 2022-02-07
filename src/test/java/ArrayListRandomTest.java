import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ArrayListRandomTest {

    @Test
    void returnedArrayListTest() {
        ArrayListRandom testObject = new ArrayListRandom();
        List<Integer> list = testObject.returnListWithRandomInts();
        assertAll(
                () -> list.forEach(value -> assertTrue(value > 0 && value < 100)),
                () -> assertTrue(list.size() == 100)
        );


    }
}
