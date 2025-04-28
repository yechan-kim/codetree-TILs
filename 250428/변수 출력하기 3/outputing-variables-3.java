import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        String a = "1";
        String b = "2";
        String c = "C";

        StringJoiner sj = new StringJoiner("->");
        sj.add(a);
        sj.add(b);
        sj.add(c);

        System.out.println(sj);
    }
}