import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TwoStringsIntoOneTest {

    twoStringsIntoOne testObject;

    @BeforeEach
    void init() {
        testObject = new twoStringsIntoOne();
    }

    @Test
    void mergeTwoStringsTDD() {

        String a = "Happy";
        String b = " Birthday";
        String actual = testObject.mergeTwoStrings(a, b);

        assertEquals(a + b, actual);

    }
}
