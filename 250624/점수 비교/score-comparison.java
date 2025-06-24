import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputA = br.readLine().split(" ");
        String[] inputB = br.readLine().split(" ");

        int mathA = Integer.parseInt(inputA[0]);
        int englishA = Integer.parseInt(inputA[1]);

        int mathB = Integer.parseInt(inputB[0]);
        int englishB = Integer.parseInt(inputB[1]);

        if(mathA > mathB && englishA > englishB){
            bw.write("1");
        } else {
            bw.write("0");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}