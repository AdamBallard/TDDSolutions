
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ageToDays {

    public long returnAgeToDays(int yr, int mnth, int dayOfMnth){
        LocalDate now = LocalDate.now();
        LocalDate birthDate = LocalDate.of(yr, mnth, dayOfMnth);

        long days = ChronoUnit.DAYS.between(birthDate, now);
        return days;
    }


}
