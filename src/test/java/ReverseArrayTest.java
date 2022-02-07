import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ReverseArrayTest {

    @Test
    void reverseArrayTDDTest() {
        ReverseArray testObject = new ReverseArray();

        int[] myIntArray = IntStream.range(0, 50).toArray();
        int[] expected = new int[myIntArray.length];

        int j = 0;
        for (int i = 49; i >= 0; i = i - 1) {
            expected[j] = i;
            j++;
        }

        int[] actual = testObject.reverseArray(myIntArray);

        assertArrayEquals(expected, actual);

    }
}
