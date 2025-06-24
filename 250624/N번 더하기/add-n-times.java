import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        
        for(int i=0; i<N; i++){
            A+=N;
            bw.write(A + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}