package lifecalculator;

import java.time.LocalDate;
import java.util.Scanner;

public class LifeDayCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year= scanner.nextInt();
        System.out.print("Enter your birth month: ");
        int month= scanner.nextInt();
        System.out.print("Enter your birth day: ");
        int day= scanner.nextInt();

        LocalDate now=LocalDate.now();
        LocalDate of = LocalDate.of(year, month, day);
        int counter=0;
        while (!of.equals(now)){
            of = of.plusDays(1);
            counter++;
        }

        System.out.println("You have lived "+counter+" days.");

    }
}
