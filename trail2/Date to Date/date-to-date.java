import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        LocalDate date1 = LocalDate.of(2011, m1, d1);
        LocalDate date2 = LocalDate.of(2011, m2, d2);

        System.out.println(ChronoUnit.DAYS.between(date1, date2) + 1);
    }
}