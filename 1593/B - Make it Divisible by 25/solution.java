import java.io.*;
 
public class BMakeItDivisibleBy25{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = Integer.parseInt(br.readLine());
 
        while(t-- > 0){
            long n = Long.parseLong(br.readLine());
 
            long num = n;
 
            int count = 0;
 
            boolean found0 = false;
            boolean found5 = false;
 
            while(num != 0){
                int rem = (int) (num % 10);
 
                if(found0 == true && (rem == 5 || rem == 0)){
                    break;
                }
                else if(found5 == true && (rem == 2 || rem == 7)){
                    break;
                }
                else{
                    if(!found0 && rem == 0) found0 = true;
                    else if(!found5 && rem == 5) found5 = true;
                    else count++;
                    
                }
                num /= 10;
 
            }
            if(found0 && found5) count++;
            bw.write(String.valueOf(count) );
            bw.newLine();
            bw.flush();
 
        }
    }
}