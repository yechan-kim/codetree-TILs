import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int gender = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());

        if(gender == 0) {
            if(age >= 19){
                bw.write("MAN");
            } else {
                bw.write("BOY");
            }
        } else if(gender == 1) {
            if(age >= 19){
                bw.write("WOMAN");
            } else {
                bw.write("GIRL");
            }
        } else{
            bw.write("INVALID");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}