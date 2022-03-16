import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class TimeTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(dateTime);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, new Locale("es","ES"));
        System.out.println(dateFormat.format(new Date()));
    }
}
