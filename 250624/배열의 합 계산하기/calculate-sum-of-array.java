import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] A = new int[]{3, 1, 4, 5, 9};

        bw.write((A[1] + A[3] + A[4]) + "\n");
        
        bw.flush();
        bw.close();
    }
}