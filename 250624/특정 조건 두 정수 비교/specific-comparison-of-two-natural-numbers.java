import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        if(A < B) {
            bw.write(1 + " " + 0);
        } else {
            if(A == B){
                bw.write(0 + " " + 1);
            } else {
                bw.write(0 + " " + 0);
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}