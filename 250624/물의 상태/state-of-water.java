import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int temp = Integer.parseInt(br.readLine());

        if(temp < 0){
            bw.write("ice");
        } else if(temp >= 100){
            bw.write("vapor");
        } else {
            bw.write("water");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}