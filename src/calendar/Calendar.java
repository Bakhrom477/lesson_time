package calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendar {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("      \t"+localDate.getYear()+" - "+localDate.getMonth());

        DayOfWeek[] weeks=DayOfWeek.values();

        for (DayOfWeek week : weeks) {
            System.out.print(week.getDisplayName(TextStyle.SHORT, Locale.US)+" ");
        }
        int length = localDate.getMonth().length(localDate.isLeapYear());
        localDate = localDate.minusDays(localDate.getDayOfMonth() - 1);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        System.out.println();
        for (int i = 1; i <=length ; i++) {
            System.out.print(i+" \t");
            if (i%7==0){
                System.out.println();
            }
        }


    }
}
