import java.io.*;
 
public class ASystemOfEquations{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
 
        int count = 0;
        for(int a = 0; a*a<=n ; a++){
            int b = n - a*a;
            
            if(a + b*b == m) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}