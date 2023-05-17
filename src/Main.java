import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LocalTime of = LocalTime.of(7, 0);
        LocalTime of1 = LocalTime.of(19, 0);


        System.out.println(Duration.between(of, of1));

    }
}