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

        String target = sc.next();

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int targetIndex = 0;

        for (int i = 0; i < 7; i++) {
            if (days[i].equals(target)) {
                targetIndex = i;
                break;
            }
        }

        LocalDate start = LocalDate.of(2024, m1, d1);
        LocalDate end = LocalDate.of(2024, m2, d2);

        long diff = ChronoUnit.DAYS.between(start, end);

        long totalDays = diff + 1;

        long count = totalDays / 7;

        if (totalDays % 7 > targetIndex) {
            count++;
        }

        System.out.println(count);
    }
}