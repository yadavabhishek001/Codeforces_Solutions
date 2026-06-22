import java.io.*;
public class AStrangePartition{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = Integer.parseInt(br.readLine());
 
        while(t-- > 0){
            String input1[] = br.readLine().split(" ");
            long n = Long.parseLong(input1[0]);
            long x = Long.parseLong(input1[1]);
            String input2[] = br.readLine().split(" ");
            long arr[] = new long[(int)(n)];
 
            double max = 0;
            long sum = 0;
 
            for(int i = 0; i<n ; i++){
                arr[i] = Long.parseLong(input2[i]);
                max += Math.ceilDiv(arr[i], x);
                sum += arr[i];
            }
            long min = (Math.ceilDiv(sum , x));
 
            bw.write(min + " "+ (long)(max) );
            bw.newLine();
            bw.flush();
        }
    }
}