import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        List<Integer> list = new ArrayList<>();

        list.add(A);
        list.add(B);
        list.add(C);

        Collections.sort(list);

        bw.write(list.get(1) + "\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}