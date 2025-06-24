import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int budget = Integer.parseInt(br.readLine());

        if(budget >= 3000){
            bw.write("book");
        } else if(budget >= 1000){
            bw.write("mask");
        } else{
            bw.write("no");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}