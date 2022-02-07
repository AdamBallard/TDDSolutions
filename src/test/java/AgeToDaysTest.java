import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgeToDaysTest {

    @Test
    void ageToDaysTest(){
        ageToDays testObject = new ageToDays();
        long days = testObject.returnAgeToDays(2022,02,06);

        assertEquals(1,days);

    }
}
