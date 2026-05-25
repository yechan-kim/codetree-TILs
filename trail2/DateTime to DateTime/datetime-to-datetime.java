import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        LocalDateTime datetime1 = LocalDateTime.of(2011, 11, 11, 11, 11);
        LocalDateTime datetime2 = LocalDateTime.of(2011, 11, a, b, c);

        if (datetime1.isAfter(datetime2)) {
            System.out.println(-1);    
        } else {
            System.out.println(ChronoUnit.MINUTES.between(datetime1, datetime2));
        }
    }
}