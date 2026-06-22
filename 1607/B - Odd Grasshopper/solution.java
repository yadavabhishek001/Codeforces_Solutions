import java.io.*;
 
public class BOddGrasshopper{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = Integer.parseInt(br.readLine());
 
        while(t-- > 0){
            String parts[] = br.readLine().split(" ");
            long start = Long.parseLong(parts[0]);
            long n = Long.parseLong(parts[1]);
 
            long multiple = (n / 4);
            int remainder =(int) (n % 4);
 
            if(start % 2 == 0){
                if(remainder == 0) bw.write(String.valueOf(start));
                else if(remainder == 1){
                    long val = start - (multiple * 4) - 1;
                    bw.write(String.valueOf(val));
                }
                else if(remainder == 2) bw.write(String.valueOf(start+1));
                else{
                    bw.write(String.valueOf(start + (multiple+1) * 4) );
                }
            }
            else{
                if(remainder == 0) bw.write(String.valueOf(start));
                else if(remainder == 1){
                    long val = start + (multiple * 4) + 1;
                    bw.write(String.valueOf(val));
                }
                else if(remainder == 2) bw.write(String.valueOf(start-1));
                else{
                    bw.write(String.valueOf(start - (multiple+1) * 4) );
                }
            }
            bw.newLine();
            bw.flush();
        }
    }
}