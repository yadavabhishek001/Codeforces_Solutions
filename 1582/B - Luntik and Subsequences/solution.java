import java.io.*;
 
public class BLuntikAndSubsequences{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = Integer.parseInt(br.readLine());
 
        while(t-- > 0){
            long n = Long.parseLong(br.readLine());
            String parts[] = br.readLine().split(" ");
            
            long arr[] = new long[(int)n];
 
            for(int i = 0; i<n ; i++){
                arr[i] = Long.parseLong(parts[i]);
            }
 
            long count0 = 0;
            long count1 = 0;
 
            for(int i = 0; i<n ; i++){
                if(arr[i] == 0) count0++;
                else if(arr[i] == 1) count1++;
            }
 
            long ans = (long) ( Math.pow(2 , count0) * count1 );
        
            bw.write(String.valueOf(ans));
            bw.newLine();
            bw.flush();
        }
    }
}