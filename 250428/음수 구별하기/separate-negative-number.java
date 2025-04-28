import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();

        bw.write(N + "\n");

        if(N.startsWith("-")) bw.write("minus");

        bw.flush();
        bw.close();
        br.close();
    }
}