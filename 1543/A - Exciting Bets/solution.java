import java.io.*;
 
public class AExcitingBets{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = Integer.parseInt(br.readLine());
 
        while(t-- > 0){
            String input[] = br.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);
 
            if(a == b){
                System.out.println(0 + " " + 0);
                continue;
            }
            else if(2*a == b || 2*b == a){
                System.out.println(Math.abs(a-b) +" " + 0);
                continue;
            }
 
            long maxExcitement = Math.abs(a-b);
            long minOps1 = maxExcitement - ( Math.min(a,b) % maxExcitement );
            long minOps2 = Math.min(a,b) % maxExcitement;
            long minOps = Math.min(minOps1, minOps2);
 
            bw.write(maxExcitement + " " + minOps);
            bw.newLine();
            bw.flush();
        }
    }
}