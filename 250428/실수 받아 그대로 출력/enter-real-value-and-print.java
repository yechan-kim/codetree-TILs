import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double N = Double.parseDouble(br.readLine());

        bw.write(String.format("%.2f", N));

        bw.flush();
        bw.close();
        br.close();
    }
}