import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AmountOfThreesTest {

    @Test
    void amountOfThreesTest() {
        AmountOfThrees testObject = new AmountOfThrees();

        int [] arr = testObject.createArrayWithThrees(10);
        int actual = testObject.returnAmountOfThrees(arr);

        assertEquals(10, actual);

    }
}
